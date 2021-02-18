package com.wang.Pattern.structure.bridge.first;

public class HouseCorp extends Corp {
    protected void produce() {
        System.out.println("房地产公司造房子...");
    }

    protected void sell() {
        System.out.println("房地产公司卖房子...");
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司挣钱啦...");
    }
}
