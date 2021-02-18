package com.wang.Pattern.structure.proxy.dynamicProxy;

/**
 * Created by Mr.Wang on 2019/8/4.
 */
//真实主题
public class RealSubject implements Subject {
    //业务操作
    public void doSomething(String str) {
        System.out.println("do something!---->" + str);
    }
}








