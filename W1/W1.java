package com.company;

import java.util.Scanner;

public class W1 {
    public W1() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input a brick size: ");
        System.out.print("a: ");
        double a = in.nextInt();
        System.out.print("b: ");
        double b = in.nextInt();
        System.out.print("c: ");
        double c = in.nextInt();
        System.out.println("input a hole size: ");
        System.out.print("x: ");
        double x = in.nextInt();
        System.out.print("y: ");
        double y = in.nextInt();
        if ((!(x >= a) || !(y >= b)) && (!(x >= b) || !(y >= a)) && (!(x >= a) || !(y >= c)) && (!(x >= c) || !(y >= a)) && (!(x >= c) || !(y >= b)) && (!(x >= b) || !(y >= c))) {
            System.out.println("Bad");
        } else {
            System.out.println("Good");
        }

    }
}