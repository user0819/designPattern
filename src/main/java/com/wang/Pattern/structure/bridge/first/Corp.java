package com.wang.Pattern.structure.bridge.first;

public abstract class Corp {
    protected abstract void produce();

    protected abstract void sell();

    public void makeMoney() {
        this.produce();
        this.sell();
    }
}
