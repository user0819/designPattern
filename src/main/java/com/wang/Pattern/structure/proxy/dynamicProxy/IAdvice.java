package com.wang.Pattern.structure.proxy.dynamicProxy;

/**
 * Created by Mr.Wang on 2019/8/4.
 */
//通知接口及实现
public interface IAdvice {
    //通知只有一个方法，执行即可
    void exec();
}