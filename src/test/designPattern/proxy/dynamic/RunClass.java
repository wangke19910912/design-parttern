package test.designPattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class RunClass {


    public static void main(String[] args) {

        Subject sub = new RealSubject();
        // 生成处理对象handler
        InvocationHandler handler = new ProxyDynamic(sub);
        ClassLoader loader = RealSubject.class.getClassLoader();
        // 生成代理对象
        Subject p = (Subject) Proxy.newProxyInstance(loader, new Class[]{Subject.class}, handler);
        p.dothing();
    }
}
