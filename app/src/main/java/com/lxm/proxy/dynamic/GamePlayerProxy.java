package com.lxm.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GamePlayerProxy<T> implements InvocationHandler {
    private T object;

    public T setAgent(T object) {
        this.object = object;
        return (T)Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke");
        Object tmp = method.invoke(object, args);
        System.out.println("after invoke....");
        return tmp;
    }
}
