package com.wang.Pattern.structure.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Mr.Wang on 2019/8/4.
 */
//所有通过动态代理实现的方法全部通过invoke方法调用
//动态代理类
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces,InvocationHandler h)
    {
        //执行目标，并返回结果
        return (T) Proxy.newProxyInstance(loader,interfaces, h);
    }
}