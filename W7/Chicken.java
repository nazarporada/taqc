package com.company;

public class Chicken extends Bird {
    @Override
    public void fly() {
        System.out.println(" Flying");
    }

    @Override
    public void feathers() {
        super.feathers();
    }

    @Override
    public void layEggs() {
        super.layEggs();
    }
}
