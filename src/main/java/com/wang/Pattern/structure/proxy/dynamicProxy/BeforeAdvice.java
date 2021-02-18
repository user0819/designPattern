package com.wang.Pattern.structure.proxy.dynamicProxy;

/**
 * Created by Mr.Wang on 2019/8/4.
 */
public class BeforeAdvice implements IAdvice{
    public void exec(){
        System.out.println("我是前置通知，我被执行了！");
    }
}