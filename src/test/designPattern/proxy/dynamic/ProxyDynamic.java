package test.designPattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyDynamic implements InvocationHandler {

    Class clazz;
    Object obj;

    public ProxyDynamic(Object object) {
        this.obj = object;
    }
    // 动态代理需要实现invoke方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 生成的代理对象会在调用每个方法时调用这个对象

        System.out.println("the method is" + method.getName());
        Object result = method.invoke(obj, args);
        return result;
    }

}
