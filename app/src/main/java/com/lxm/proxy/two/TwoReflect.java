package com.lxm.proxy.two;

public class TwoReflect implements TwoInterface{

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.lxm.proxy.two.TwoReflect");
        System.out.println("类名称："+clazz.getName());
        System.out.println("父类名称："+clazz.getSuperclass().getName());
        System.out.println("实现的接口：");
        for (int i = 0; i < clazz.getInterfaces().length; i++) {
            System.out.println("接口："+clazz.getInterfaces()[i].getName());
        }

    }
}
