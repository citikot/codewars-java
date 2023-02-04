package hillel.streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static hillel.streams.FruitType.APPLE;
import static hillel.streams.FruitType.ORANGE;
import static hillel.streams.FruitType.PEAR;
import static hillel.streams.FruitType.STRAWBERRY;
import static hillel.streams.Vitamin.A;
import static hillel.streams.Vitamin.B;
import static hillel.streams.Vitamin.B1;
import static hillel.streams.Vitamin.B2;
import static hillel.streams.Vitamin.C;
import static hillel.streams.Vitamin.D;
import static hillel.streams.Vitamin.E;
import static hillel.streams.Vitamin.P;

/**
 * @author spasko
 */
public class MainLambdaTemplateStudents {
    public static void main(String[] args) {
        List<Fruit> fruits = fillFruitsList();
//        fruits.forEach(System.out::println);

        fruits.stream()
                .filter(fruit -> PEAR.equals(fruit.getFruitType()))
                .filter(fruit -> fruit.getPrice() > 10)
                .forEach(System.out::println);

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