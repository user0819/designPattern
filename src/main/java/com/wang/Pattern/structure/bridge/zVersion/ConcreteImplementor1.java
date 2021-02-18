package com.wang.Pattern.structure.bridge.zVersion;

public class ConcreteImplementor1 implements Implementor{
    public void doSomething() {
        System.out.println("ConcreteImplementor1.doSomething");
    }

    public void doAnything() {
        System.out.println("ConcreteImplementor1.doAnything");
    }
}
