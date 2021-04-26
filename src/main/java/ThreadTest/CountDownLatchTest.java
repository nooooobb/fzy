package ThreadTest;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReadWriteLock;

public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        //计数器初始化为线程数量，当线程完成自己任务后，计数器值 -1 当值为0时，表示所有线程完成任务
        CountDownLatch latch = new CountDownLatch(5);

//        latch.await();
        for (int i = 0; i < 5; i++) {
            new Thread(() ->{
                System.out.println(Thread.currentThread().getName() + "yunxing");
                System.out.println(latch.getCount());
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    latch.countDown();
                }
            }).start();
        }

        System.out.println("等待5个子线程运行完毕");
        latch.await();
        System.out.println("5个子线程运行完毕");
    }

}
