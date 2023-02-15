package hillel.streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static hillel.streams.FruitType.*;
import static hillel.streams.Vitamin.*;

/**
 * @author spasko
 */
public class MainLambdaTemplateStudents {
    public static void main(String[] args) {
        List<Fruit> fruits = fillFruitsList();

        System.out.println("List of fruits:");
        fruits.forEach(System.out::println);
        System.out.println("***");

        fruits.stream()
                .filter(fruit -> PEAR.equals(fruit.getFruitType()))
                .filter(fruit -> fruit.getPrice() > 10)
                .forEach(System.out::println);

        System.out.println("***");

        Fruit fruit = fruits.stream()
                .max((fruit1, fruit2) -> fruit1.getVitamins().size() - fruit2.getVitamins().size())
                .get();

        System.out.println(fruit);

        System.out.println("***");

        System.out.println(fruits.stream()
                .anyMatch(elem -> ORANGE.equals(elem.getFruitType())) ? "Oranges exist" : "Oranges are absent");

        System.out.println("***");

        fruits.stream()
                .flatMap(elem -> elem.getVitamins().stream())
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("***");

        TreeMap<FruitType, Fruit> fruitTypeMap = fruits.stream()
                .filter(fr -> APPLE != fr.getFruitType())
                .collect(Collectors.toMap(Fruit::getFruitType,
                        Function.identity(),
                        mergeFruitsByCountVitamins(),
                        TreeMap::new));

        System.out.println(fruitTypeMap);

        System.out.println("***");

        TreeMap<FruitType, Fruit> fruitTypeMap1 = fruits.stream()
                .filter(fr -> APPLE != fr.getFruitType())
                .sorted(Comparator.comparingInt(fr -> fr.getVitamins().size()))
                .collect(Collectors.toMap(Fruit::getFruitType,
                        Function.identity(),
                        (fr1, fr2) -> fr2,
                        TreeMap::new));


        System.out.println(fruitTypeMap1);

    }

    private static BinaryOperator<Fruit> mergeFruitsByCountVitamins() {
        return (fr1, fr2) -> {
            if (fr1.getVitamins().size() >= fr2.getVitamins().size()) {
                return fr1;
            } else {
                return fr2;
            }
        };
    }

    private static List<Fruit> fillFruitsList() {
        List<Fruit> fruits = new ArrayList<>();

        Fruit fruit = new Fruit(APPLE, 30, LocalDate.of(2019, 1, 4), 12, null);
        fruit.setVitamins(List.of(B, C));
        fruits.add(fruit);

        fruit = new Fruit(STRAWBERRY, 15, LocalDate.of(2019, 1, 2), 50, null);
        fruit.setVitamins(List.of(A, C));
        fruits.add(fruit);

        fruit = new Fruit(PEAR, 30, LocalDate.of(2019, 1, 4), 40, null);
        fruit.setVitamins(List.of(A, B1, B2, C));
        fruits.add(fruit);

        fruit = new Fruit(ORANGE, 60, LocalDate.of(2019, 1, 3), 30, null);
        fruit.setVitamins(List.of(E, B, A));
        fruits.add(fruit);

        fruit = new Fruit(STRAWBERRY, 25, LocalDate.of(2019, 1, 2), 60, null);
        fruit.setVitamins(List.of(A, C, D));
        fruits.add(fruit);

        fruit = new Fruit(PEAR, 15, LocalDate.of(2019, 1, 4), 40, null);
        fruit.setVitamins(List.of(A, B, B1, B2, P));
        fruits.add(fruit);

        fruit = new Fruit(PEAR, 5, LocalDate.of(2019, 1, 6), 10, null);
        fruit.setVitamins(List.of(B1, B2, P));
        fruits.add(fruit);

        fruit = new Fruit(APPLE, 30, LocalDate.of(2019, 1, 4), 12, null);
        fruit.setVitamins(List.of(B, C));
        fruits.add(fruit);

        return fruits;
    }
}