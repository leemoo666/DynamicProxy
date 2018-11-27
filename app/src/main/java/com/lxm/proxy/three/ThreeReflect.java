package com.lxm.proxy.three;

import com.lxm.proxy.two.TwoInterface;

import java.lang.reflect.Constructor;

/**
 * 获取构造函数
 */
public class ThreeReflect implements TwoInterface {

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.lxm.proxy.three.Person");
        System.out.println("构造函数：");
        //获取构造函数，包括public，private，protect
//        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        //获取构造函数，只包括public
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("修饰符：" + constructor.getModifiers());
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (Class cla : parameterTypes) {
                System.out.print(cla.getName() + ",");
            }
            System.out.println("------");
        }
    }
}
