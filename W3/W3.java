package com.company;

import java.util.Scanner;

public class W3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
// 1.   System.out.print("insert radius of circle: ");
//    int r = in.nextInt();
//    double pi = 3.14;
//
//    System.out.println("Area of circle = " + (Math.round(pi * r * r)));
//    System.out.println("Perimeter of circle = " + (Math.round(2 * pi * r)));

// 2.        System.out.println("What is your name? ");
//        String name = in.nextLine();
//        System.out.printf("Where are you live, %s? \n", name);
//        String adress = in.nextLine();
//        System.out.printf("Your name is %s, and you live in %s ", name, adress);

        System.out.println("The first call was from: ");
        String c1 = in.nextLine();
        System.out.println("The second call was from: ");
        String c2 = in.nextLine();
        System.out.println("The third call was from: ");
        String c3 = in.nextLine();

        System.out.println("First call took (in minutes): ");
        double t1 = in.nextDouble();
        System.out.println("Second call took (in minutes): ");
        double t2 = in.nextDouble();
        System.out.println("Third took (in minutes): ");
        double t3 = in.nextDouble();

        double T = (t1 + t2 + t3);
        System.out.println("The sum minutes of three calls is " + T);
        double count = T / 60;

        System.out.println(count + " Hours spent");


    }
}

