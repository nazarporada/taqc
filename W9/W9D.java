package com.company;

import java.util.Scanner;

public class W9D extends Exception {

    public static void main(String[] args) throws Exception {
        try {
        main1 main1 = new main1();
        Scanner in = new Scanner(System.in);
        System.out.println("insert a1-a10(): ");
        main1.a1 = in.nextInt();
        main1.a2 = in.nextInt();
        main1.a3 = in.nextInt();
        main1.a4 = in.nextInt();
        main1.a5 = in.nextInt();
        main1.a6 = in.nextInt();
        main1.a7 = in.nextInt();
        main1.a8 = in.nextInt();
        main1.a9 = in.nextInt();
        main1.a10 = in.nextInt();
        if (main1.a1 > main1.a2 || main1.a2 > main1.a3 || main1.a3 > main1.a4 || main1.a4 > main1.a5 || main1.a5 > main1.a6 ||
                main1.a6 > main1.a7 || main1.a7 > main1.a8 || main1.a8 > main1.a9 || main1.a9 > main1.a10) {
            throw new Exception(" Insert correct value ");
        } else {
        main1.main1();
        }
    } catch(
    Exception e)
    {
        e.printStackTrace();
    }
}


    }

class main1 extends Exception {
    Scanner in = new Scanner(System.in);
    int a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;

    static void main1() throws Exception {
        System.out.println("Good");
    }
}



