package dmdev.concurrentlistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) throws InterruptedException{
        List<Integer> integers = Collections.synchronizedList(new ArrayList<>());

        ListThread listThread1 = new ListThread(integers);
        ListThread listThread2 = new ListThread(integers);
        ListThread listThread3 = new ListThread(integers);
        ListThread listThread4 = new ListThread(integers);
        ListThread listThread5 = new ListThread(integers);
        ListThread listThread6 = new ListThread(integers);
        ListThread listThread7 = new ListThread(integers);
        ListThread listThread8 = new ListThread(integers);
        ListThread listThread9 = new ListThread(integers);
        ListThread listThread10 = new ListThread(integers);
        ListThread listThread11 = new ListThread(integers);
        ListThread listThread12 = new ListThread(integers);

        listThread1.start();
        listThread2.start();
        listThread3.start();
        listThread4.start();
        listThread5.start();
        listThread6.start();
        listThread7.start();
        listThread8.start();
        listThread9.start();
        listThread10.start();
        listThread11.start();
        listThread12.start();

        listThread1.join();
        listThread2.join();
        listThread3.join();
        listThread4.join();
        listThread5.join();
        listThread6.join();
        listThread7.join();
        listThread8.join();
        listThread9.join();
        listThread10.join();
        listThread11.join();
        listThread12.join();

        System.out.println(integers);
    }
}
