package ProxyTest;

public class TargetImpl implements Target{

    @Override
    public String execute() {
        System.out.println("TargetImpl====");
        return "EXECUTE";
    }
}
