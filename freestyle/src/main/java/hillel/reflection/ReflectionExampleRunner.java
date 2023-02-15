package hillel.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionExampleRunner {
    public static void main(String[] args) {

        ReflectionExample reflectionExample = new ReflectionExample("A1", 100, 100000L, (short) 1);

        Method[] methods = ReflectionExample.class.getDeclaredMethods();
        Arrays.stream(methods)
                .map(Method::getName)
                .filter(method -> method.startsWith("get"))
                        .forEach(System.out::println);

        Arrays.stream(methods)
                .filter(method -> method.getName().startsWith("get"))
                .forEach(elem -> {
                    try {
                        System.out.println(elem.invoke(reflectionExample));
                    } catch (IllegalAccessException | InvocationTargetException ex) {
                        throw new RuntimeException();
                    }
                });
    }
}
