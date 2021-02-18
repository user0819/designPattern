package com.wang.Pattern.structure.bridge.second;

public class ClothesProduct extends Product {
    public void beProduced() {
        System.out.println("衣服被造出来啦");
    }

    public void beSell() {
        System.out.println("衣服被卖出去啦");
    }
}
