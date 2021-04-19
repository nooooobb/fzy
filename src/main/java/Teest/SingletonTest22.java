package Teest;

public class SingletonTest22 {

    private SingletonTest22(){}
    private static class mySingleton{
        private static final mySingleton Instance = new mySingleton();
    }

    public static mySingleton getInstance(){
        return mySingleton.Instance;
    }

}
