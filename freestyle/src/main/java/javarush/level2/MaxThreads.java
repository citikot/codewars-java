package javarush.level2;


import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

public class MaxThreads {
    public static void main(String[] args) {
        var counter = new AtomicInteger();
        while (true) {
            new Thread(() -> {
                int count = counter.incrementAndGet();
                System.out.println("thread count = " + count);
                LockSupport.park();
            }).start();
        }
    }
}

