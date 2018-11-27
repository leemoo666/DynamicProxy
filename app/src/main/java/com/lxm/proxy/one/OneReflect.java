package com.lxm.proxy.one;

public class OneReflect {

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.lxm.proxy.one.OneReflect");
        System.out.println("类名称："+clazz.getName());

    }
}
