package com.company;

public class Eagle extends Bird{

    @Override
    public void fly() {
        System.out.println(" Flying ");
    }

    @Override
    public void layEggs() {
        super.layEggs();
    }

    @Override
    public void feathers() {
        super.feathers();
    }
}
