package com.wang.Pattern.structure.bridge.second;

public class HouseProduct extends Product {
    public void beProduced() {
        System.out.println("房子被造出来啦");
    }

    public void beSell() {
        System.out.println("房子被卖出去啦");
    }
}
