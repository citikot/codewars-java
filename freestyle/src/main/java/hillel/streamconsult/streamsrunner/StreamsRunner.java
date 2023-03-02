package hillel.streamconsult.streamsrunner;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamsRunner {
    public static void main(String[] args) {
        OptionalInt reduced = IntStream.range(1, 4).reduce((x, y) -> x * y);

        System.out.println(reduced);

        // x = 5 , y = 1
        // x = 5 , y = 2
        // x = 10 , y = 3
        // (((5 * 1) * 2)) * 3
        int reducedTwoParams = IntStream.range(1, 7).reduce(10, (x, y) -> {
            System.out.println("x " + x + " * y " + y + " = " + (x * y));
            return x * y;}
        );

        System.out.println(reducedTwoParams);

        int reducedThreeParams = Arrays.asList(1, 2, 3, 4,5 ,6).parallelStream().reduce(10, (x, y) -> {
                    System.out.println("x " + x + " * y " + y + " = " + (x * y));
                    return x * y;
                }
                , (a, b) -> {
                    System.out.println("a " + a + " + b " + b);
                    return a + b;
                }
        );

        System.out.println(reducedThreeParams);

    }
}
