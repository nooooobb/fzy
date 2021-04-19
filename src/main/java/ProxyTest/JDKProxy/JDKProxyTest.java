package ProxyTest.JDKProxy;

import java.lang.reflect.Proxy;
import java.util.concurrent.ThreadPoolExecutor;

public class JDKProxyTest {
    public static void main(String[] args) {
        Target target = new TargetImpl();
        JDKProxy jdkProxy = new JDKProxy(target);
        Target proxySubject =(Target) Proxy.newProxyInstance(ProxyTest.TargetImpl.class.getClassLoader(), TargetImpl.class.getInterfaces(), jdkProxy);
        String res = proxySubject.execute();
        System.out.println(res);
    }
}
