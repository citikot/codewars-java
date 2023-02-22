package dmdev.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");
        System.out.println(generateInsert(car));

    }

    private static String generateInsert(Car car) {
        String template = "INSERT INTO %s. %s (%s) VALUES (%s);";
        Table table = car.getClass().getAnnotation(Table.class);
        Field[] fields = car.getClass().getDeclaredFields();

        String fieldNames = Arrays.stream(fields)
                .filter(field -> field.isAnnotationPresent(Column.class))
                .sorted(Comparator.comparing(Field::getName))
                .peek(field -> field.setAccessible(true))
                .map(field -> field.getAnnotation(Column.class))
                .map(Column::name)
                .collect(Collectors.joining(", "));

        String fieldValues = Arrays.stream(fields)
                .filter(field -> field.isAnnotationPresent(Column.class))
                .sorted(Comparator.comparing(Field::getName))
                .map(field -> getMethodName(car, field))
                .map(method -> {
                    try {
                        return method.invoke(car);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                })
                .map(value -> "'" + value + "'")
                .collect(Collectors.joining(", "));
        return String.format(template, table.schema(), table.value(), fieldNames, fieldValues);
                }

                public static Method getMethodName(Car car, Field field){
                    String name = field.getName();
                    try {
                        return car.getClass().getMethod("get" + name.substring(0,1).toUpperCase() + name.substring(1));
                    } catch (NoSuchMethodException e) {
                        throw new RuntimeException(e);
                    }
                }
    }
