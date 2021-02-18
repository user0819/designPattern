package com.wang.Pattern.structure.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Mr.Wang on 2019/8/4.
 */
//重点是我们的MyInvocationHandler
//动态代理的Handler类
public class MyInvocationHandler implements InvocationHandler {
    //被代理的对象
    private Object target = null;
    //通过构造函数传递一个对象
    public MyInvocationHandler(Object _obj){
        this.target = _obj;
    }
    //代理方法
    public Object invoke(Object proxy, Method method, Object[] args)  throws Throwable {
        if(method.getName().equals("doSomething")) {
            (new BeforeAdvice()).exec();
        }
        //执行被代理的方法
        return method.invoke(this.target, args);
    }
}