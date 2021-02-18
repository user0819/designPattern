package com.wang.Pattern.structure.bridge.second;



public class Client {
    public static void main(String[] args) {
        System.out.println("房地产公司...");
        HouseCorp houseCorp = new HouseCorp(new HouseProduct());
        houseCorp.makeMoney();
        System.out.println("\n");


        System.out.println("山寨公司...");
        FakerCorp fakerCorp = new FakerCorp(new ClothesProduct());
        fakerCorp.makeMoney();
        System.out.println("\n");
    }
}
