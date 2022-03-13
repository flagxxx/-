package com.pro;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyClass implements InvocationHandler {
    private FatherClass a;

    public ProxyClass(FatherClass a) {
        super();
        this.a = a;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object in = method.invoke(a,args);
        return a;
    }
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(a.getClass().getClassLoader(),a.getClass().getInterfaces(),this);//this代表InvocationHandler
    }
}
