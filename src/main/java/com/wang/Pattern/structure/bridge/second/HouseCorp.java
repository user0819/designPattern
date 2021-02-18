package com.wang.Pattern.structure.bridge.second;

public class HouseCorp extends Corp {
    public HouseCorp(HouseProduct product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚钱啦");
    }
}
