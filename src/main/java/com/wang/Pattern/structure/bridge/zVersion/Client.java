package com.wang.Pattern.structure.bridge.zVersion;

public class Client {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction(new ConcreteImplementor1());
        abstraction.request();
    }
}
