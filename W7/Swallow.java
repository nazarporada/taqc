package com.company;

public class Swallow extends Bird{
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
