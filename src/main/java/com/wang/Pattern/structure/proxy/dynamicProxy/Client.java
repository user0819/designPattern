package com.wang.Pattern.structure.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;

/**
 * Created by Mr.Wang on 2019/8/4.
 */
// 动态代理的场景类
public class Client {
    public static void main(String[] args) {
        //定义一个主题
        Subject subject = new RealSubject();
        //定义一个Handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        //定义主题的代理
        Subject proxy = DynamicProxy.newProxyInstance(
                subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),handler);

        //可以忽略DynamicProxy，直接创建代理
        //Subject proxy = (Subject)Proxy.newProxyInstance(loader,interfaces, h);

        //代理的行为
        proxy.doSomething("Finish");
    }
}