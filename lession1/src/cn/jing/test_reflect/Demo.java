package cn.jing.test_reflect;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Created by JING on 2017/8/15.
 */
public class Demo {

    //测试反射机制获取类的三种方法
    @Test
    public void test1() {
        Class c1 = null;
        try {
            //第一种方式，需要填写类的完全限定名
            c1 = Class.forName("cn.jing.test_reflect.Employee");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("未找到Employee");
        }
        //第二种方式，Java中的每个类都有class属性
        Class c2 = Employee.class;
        Employee e = new Employee();
        //第三种方式，Java中任何一个Java对象都有getClass方法
        Class c3 = e.getClass();
        System.out.println(c1 == c2);
        System.out.println(c2 == c3);
    }

    //获得类以后可以用来创建对象
    @Test
    public void test2() {
        try {
            Class c1 = Class.forName("cn.jing.test_reflect.Employee");
            Object o = c1.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    //获取所有属性
    @Test
    public void test3() {
        try {
            Class c = Class.forName("java.lang.Integer");
            Field[] declaredFields = c.getDeclaredFields();
            for(Field tmp : declaredFields) {
                System.out.println(tmp);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //获取特定属性
    @Test
    public void test4() {
        try {
            Class c = Class.forName("cn.jing.test_reflect.Employee");
            Field f = c.getDeclaredField("id"); //获取id属性
            Object o = c.newInstance(); //实例化这个类给o
            f.setAccessible(true);  //使用反射机制可以打破封装性，导致Java对象的守护星不安全
            f.set(o, "110");    //给o对象的id属性赋值"110"
            System.out.println(f.get(o));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
