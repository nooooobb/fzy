package ThreadTest;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"运行");
            list.add(4);
            System.out.println(list);
        }).start();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+"运行");
            System.out.println(list);
        }).start();
    }
}
