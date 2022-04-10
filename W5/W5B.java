package com.company;

import java.util.Scanner;

public class W5B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

         enum breed {
            breed1("Akita"),breed2("Akita"),breed3("Akita");

             public String breed;
            breed(String breed){
                this.breed = breed;
            }

         }
        class Dog {
            public int age;
            public String breed;
            public String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        dog1.setName("Beep");
        dog2.setName("Boop");
        dog3.setName("Baap");
        dog1.setAge(16);
        dog2.setAge(13);
        dog3.setAge(14);
        System.out.println(dog1.name +" " +breed.breed1.breed+" "+ dog1.age);
        System.out.println(dog2.name +" " +breed.breed2.breed+" "+ dog2.age);
        System.out.println(dog3.name +" " +breed.breed3.breed+" "+ dog3.age);
         if(dog1.name == dog2.name || dog1.name == dog3.name || dog2.name == dog3.name){
            System.out.println("There are same names ");
        }
         if (dog1.age > dog2.age && dog1.age > dog3.age){
             System.out.println("The oldest dog is " + dog1.name + " " + breed.breed1.breed + " " + dog1.age + " years");
         }
        if (dog2.age > dog1.age && dog2.age > dog3.age){
            System.out.println("The oldest dog is " + dog2.name + " " + breed.breed2.breed + " " + dog2.age + " years");
        }
        if (dog3.age > dog2.age && dog3.age > dog1.age){
            System.out.println("The oldest dog is " + dog3.name + " " + breed.breed1.breed + " " + dog3.age + " years");
        }


    }
}