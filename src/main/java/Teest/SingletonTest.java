package Teest;

public class SingletonTest {
    private SingletonTest(){}

    private static volatile SingletonTest singletonTest;

    public static SingletonTest getSingletonTestInstance(){
        if(singletonTest == null){
            synchronized (SingletonTest.class){
                if(singletonTest == null){
                    singletonTest = new SingletonTest();
                }
            }
        }
        return singletonTest;
    }
}
