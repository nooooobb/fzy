package ProxyTest;

public class StaticProxyTest {
    public static void main(String[] args) {
        Target target = new TargetImpl();
        ProxyTest proxyTest = new ProxyTest(target);
        String execute = proxyTest.execute();
        System.out.println(execute);

    }
}
