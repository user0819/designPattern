package com.wang.Pattern.structure.bridge.first;

public class ClothesCorp extends Corp{
    protected void produce() {
        System.out.println("服装公司造衣服...");
    }

    protected void sell() {
        System.out.println("服装公司卖衣服...");
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装公司挣钱啦...");
    }
}
