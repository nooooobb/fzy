package ProxyTest.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKProxy implements InvocationHandler {
    private Target target;
    public JDKProxy(Target target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before=====");
        Object res = method.invoke(target, args);
        System.out.println("after=======");
        return res;
    }
}
