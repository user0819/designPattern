package com.wang.Pattern.structure.bridge.zVersion;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    @Override
    public void request() {
        super.request();
        this.getImpl().doAnything();
    }
}
