package ThreadTest;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(5);
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1111);
                        System.out.println(Thread.currentThread().getName() + "达到栅栏");
                        barrier.await();
                        System.out.println(Thread.currentThread().getName() + "冲破栅栏");
                    } catch (InterruptedException | BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

        }
        System.out.println("主线程");
    }
}
