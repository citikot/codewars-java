package other;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
    public static void main(String[] args) {
        List<String> names = List.of("Vasa", "Ola", "Ola", "Dusa");
        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println(uniqueNames);
    }
}
