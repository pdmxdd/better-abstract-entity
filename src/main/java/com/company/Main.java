package com.company;

public class Main {
    public static void main(String[] args) {
        Hammer hammerOne = new Hammer("roofing");
        Hammer hammerTwo = new Hammer("ball-peen");

        Screwdriver screwdriverOne = new Screwdriver("phillips");
        Screwdriver screwdriverTwo = new Screwdriver("flat-head");

        System.out.println(hammerOne.getId());
        System.out.println(hammerTwo.getId());
        System.out.println(screwdriverOne.getId());
        System.out.println(screwdriverTwo.getId());
    }
}
