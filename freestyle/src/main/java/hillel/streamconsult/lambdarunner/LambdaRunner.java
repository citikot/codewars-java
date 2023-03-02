package hillel.streamconsult.lambdarunner;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaRunner {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
//        Predicate<Integer> predicate = x -> {
//            if ((x > 0) && (x < 100)) {
//                return true;
//            }
//                return false;
//        };

        List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));

        Consumer<String> consumer = y -> list.add(y);

        consumer.accept("sdfgsdfgsffdg");
        consumer.accept("sdfgsdfgsffdg10");

        list.forEach(System.out::println);

        Supplier<LocalDateTime> supplier = LocalDateTime::now;

        System.out.println(supplier.get());

        Supplier<String> supplier1 = () -> dtf.format(LocalDateTime.now());

        System.out.println(supplier1.get());

        //       System.out.println(predicate.test(10));

//        IntStream.range(1, 100).
//                filter(elem -> elem > 50).
//                forEach(System.out::println);
    }

}
