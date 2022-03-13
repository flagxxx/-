package com.pro;

public class FatherClass implements ImplementationInterface {
    @Override
    public void run() {
        System.out.println("我是真正的对象中的run方法");
    }

    @Override
    public void say() {
        System.out.println("我是真正对象中的say方法");

    }
}
