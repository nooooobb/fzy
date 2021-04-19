package Teest;

import jdk.nashorn.internal.runtime.logging.Logger;

import java.io.FileReader;

public class ThreadFZ {
    public static void main(String[] args) {
        Thread t1 = new Thread("t1"){
            @Override
            public void run(){

                System.out.println("rrrr");
            }

        };
        t1.run();
    }
}
