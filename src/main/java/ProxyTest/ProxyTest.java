package ProxyTest;

public class ProxyTest implements Target{
    private Target target;
    public ProxyTest(Target target){
        this.target = target;
    }
    @Override
    public String execute() {
        System.out.println("执行前");
        String res = this.target.execute();
        System.out.println("代理执行后");
        return res;
    }
}
