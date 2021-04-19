package Sort;

public class SSSSS {
    private SSSSS(){
    }

    public static MySingle getInstance(){
        return MySingle.Instance;
    }
    public static class MySingle{
        private static final MySingle Instance = new MySingle();
    }


}
