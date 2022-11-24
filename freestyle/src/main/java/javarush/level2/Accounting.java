package javarush.level2;

import java.util.ArrayList;

public class Accounting {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
        System.out.println(waitingEmployees);
        paySalary("Нифрод");
        System.out.println(alreadyGotSalaryEmployees);
        System.out.println(waitingEmployees);
        paySalary(null);
        System.out.println(alreadyGotSalaryEmployees);
        System.out.println(waitingEmployees);
        paySalary("Нифд");
        System.out.println(alreadyGotSalaryEmployees);
        System.out.println(waitingEmployees);
    }

    public static void paySalary(String name) {
        //напишите тут ваш код
        if (name != null) {
            if (waitingEmployees.contains(name)) {
                alreadyGotSalaryEmployees.add(name);
                waitingEmployees.set(waitingEmployees.indexOf(name), null);
            }
        }
    }
}
