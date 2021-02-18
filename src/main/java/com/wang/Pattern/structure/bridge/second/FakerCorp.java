package com.wang.Pattern.structure.bridge.second;

public class FakerCorp extends Corp{
    public FakerCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("山寨公司也赚钱");
    }
}
