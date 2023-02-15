package other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Gusi {
    public static void main(String[] args) {
        System.out.println(new Duck("McDuck") == new Duck("McDuck"));

        String name = "Donald";
        name.concat("Duck");
        System.out.println(name);

            List<String> list = new ArrayList<>();
            list.add("1");
            addTwo(list);
            System.out.println(list);

        HashMap<Duck, Goose> map = new HashMap<>();
        map.put(new Duck("McDuck"), new Goose("McDuck"));
        Goose goose = map.get(new Duck("McDuck"));
        System.out.println(goose);
    }

    static void addTwo(List<String> list) {
        list.add("2");
    }
}

class Duck {
    String name;
    Duck(String name) { this.name = name; }
    void swim()  { System.out.println("Swim like a duck"); }
    void quack() { System.out.println("Quack like a duck"); }
    void walk()   { System.out.println("Walk like a duck"); }
    @Override
    public boolean equals(Object o) { return name.equals(((Duck) o).name); }
}

class Goose {
    String name;
    Goose(String name) { this.name = name; }
    void swim()  { System.out.println("Swim like a duck"); }
    void quack() { System.out.println("Quack like a duck"); }
    void walk()   { System.out.println("Walk like a duck"); }
    @Override
    public boolean equals(Object o) { return name.equals(((Goose) o).name); }
}
