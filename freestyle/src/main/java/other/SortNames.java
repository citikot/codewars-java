package other;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class SortNames {
    public static void main(String[] args) {
        Names name1 = new Names("John", 1988);
        Names name2 = new Names("Camilla", 2005);
        Names name3 = new Names("Suzi", 2004);
        Names name4 = new Names("Sarah", 2005);
        Names name5 = new Names("Camilla", 2002);
        Names name6 = new Names("Camilla", 2005);


        Set<Names> uniqueNames = new TreeSet<>((n1, n2) -> Integer.compare(n1.getYearOfBirth(), n2.getYearOfBirth()));
        uniqueNames.add(name1);
        uniqueNames.add(name2);
        uniqueNames.add(name3);
        uniqueNames.add(name4);
        uniqueNames.add(name5);
        uniqueNames.add(name6);

        for (Names elem : uniqueNames) {
            if (elem.getYearOfBirth() < 2008 && elem.getYearOfBirth() > 2000) {
                System.out.println(elem);
            }
        }
    }
}
