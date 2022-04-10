package com.company;

public class W7 {

    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Eagle eagle = new Eagle();
        Penguin penguin = new Penguin();
        Swallow swallow = new Swallow();
        FlyingBird flyingBird = new FlyingBird();
        NonFlyingBird nonFlyingBird = new NonFlyingBird();

        Object[] Birds = new Object[4];
        Birds[0] = chicken;
        Birds[1] = eagle;
        Birds[2] = penguin;
        Birds[3] = swallow;

        System.out.println("Chicken ");
        chicken.fly(); chicken.layEggs(); chicken.feathers();

        System.out.println("Eagle ");
        eagle.fly(); eagle.layEggs(); eagle.feathers();

        System.out.println("Penguin ");
        penguin.fly(); penguin.layEggs(); penguin.feathers();

        System.out.println("Swallow ");
        swallow.fly(); swallow.layEggs(); swallow.feathers();
    }
}
