package com.wang.Pattern.structure.bridge.second;

public abstract class Corp {
    private Product product;
    public Corp(Product product){
        this.product = product;
    }

    public void makeMoney(){
        this.product.beProduced();
        this.product.beSell();
    }
}
