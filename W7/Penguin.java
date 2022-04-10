package com.company;

public class Penguin extends Bird{
    @Override
    public void fly() {
        System.out.println(" Non flying ");
    }

    @Override
    public void layEggs() {
        super.layEggs();
    }

    @Override
    public void feathers() {
        System.out.println(" With no feathures ");
    }
}
