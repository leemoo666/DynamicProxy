package com.lxm.proxy.four;

import com.lxm.proxy.two.TwoInterface;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 获取构造函数
 */
public class FourReflect implements TwoInterface {

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.lxm.proxy.four.Student").getSuperclass();

        System.out.println("构造函数-------------");
        //获取构造函数，包括public，private，protect
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        //获取构造函数，只包括public
//        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.print(
                    Modifier.toString(constructor.getModifiers()) + " "
                            + constructor.getName() + "(");
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (Class cla : parameterTypes) {
                System.out.print(cla.getName() + ",");
            }
            System.out.println(")\n");
        }

        System.out.println("属性--------------");
        //取得本类的全部属性(包括public protect private)
//        Field[] fields = clazz.getDeclaredFields();

        //只能获取本类和父类公共方法
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(
                    Modifier.toString(field.getModifiers())
                            + " " + field.getType()
                            + " " + field.getName());

        }

        System.out.println("方法----------------");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.print(Modifier.toString(method.getModifiers()) + " "
                    + method.getReturnType().getName() + " "
                    + method.getName() + " （");

            for (Class parameterType : method.getParameterTypes()) {
                System.out.print(parameterType.getName());
            }
            System.out.println("）\n");
        }

        Constructor constructor = clazz.getDeclaredConstructor(boolean.class);
        constructor.setAccessible(true);
        Object object = constructor.newInstance(true);
        System.out.println("属性反射----------------");
        Field field = clazz.getDeclaredField("id");
        field.setAccessible(true);
        field.set(object, 2);

        System.out.println("方法反射----------------");
        Method method = clazz.getMethod("setName", String.class);
        method.invoke(object, "大明");

        Method method1 = clazz.getMethod("getName");
        method1.invoke(object);

        Method method2 = clazz.getMethod("toString");
        method2.invoke(object);
    }
}
