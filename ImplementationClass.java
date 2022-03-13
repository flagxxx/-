package com.pro;

public class ImplementationClass {
    public static void main(String[] args) {
        FatherClass re = new FatherClass();//真实对象
        ProxyClass pro = new ProxyClass(re);//代理对象
        ImplementationInterface gets =(ImplementationInterface) pro.getProxyInstance();//代理对象中的方法
        gets.run();//真实对象中的方法

    }
}
