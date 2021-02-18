package com.wang.Pattern.structure.bridge.first;

public class Client {
    public static void main(String[] args) {
        System.out.println("房地产公司...");
        HouseCorp houseCorp = new HouseCorp();
        houseCorp.makeMoney();
        System.out.println("\n");


        System.out.println("服装公司...");
        ClothesCorp clothesCorp = new ClothesCorp();
        clothesCorp.makeMoney();
        System.out.println("\n");
    }
}
