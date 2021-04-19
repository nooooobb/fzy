package ThreadTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CrossPrint {
    public static int i = 1;
//    public volatile static int j = 1;
    public volatile static boolean flag = false;
//    public static int count = 0;

    private static byte[] block = new byte[0];


    public static Lock lock = new ReentrantLock();
    public static Condition conditionA = lock.newCondition();
    public static Condition conditionB = lock.newCondition();



    public static void main(String[] args) {
        test2();
    }


    //synchronized
    public static void test1(){
        new Thread(()->{
            while (i<=10){
                synchronized (block){
                    if(flag){
                        try {
                            block.wait();
                        }catch (Exception e){
                            e.printStackTrace();
                        }

                    }else {
                        System.out.println(Thread.currentThread().getName()+"---"+(i++));
                        flag = true;
                        block.notifyAll();
                    }
                }
            }
        }).start();

        new Thread(()->{
            while (i<=10){
                synchronized (block){
                    if(!flag){
                        try {
                            block.wait();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }else {
                        System.out.println(Thread.currentThread().getName()+"---"+(i++));
                        flag = false;
                        block.notifyAll();
                    }
                }
            }
        }).start();
    }


    public static void test2(){
        new Thread(()->{
            try {

                while (i<=10){
                    lock.lock();
                    //flag控制该不该当前线程打印
                    if(flag){
                        conditionA.await();
                    }else {
                        flag = true;
                        System.out.println(Thread.currentThread().getName()+"----"+(i++));
                        conditionB.signal();
                    }
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }).start();

        new Thread(() -> {
            try {

                while (i<=10){
                    lock.lock();
                    if(!flag){
                        conditionB.await();
                    }else {
                        flag = false;
                        System.out.println(Thread.currentThread().getName()+"----"+(i++));
                        conditionA.signal();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }


        }).start();


    }
}
