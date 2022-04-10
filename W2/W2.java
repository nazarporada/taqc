package com.company;

import java.util.Scanner;

public class W2 {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("input n: ");
    int n = scan.nextInt();
    int m = n*n;
    int a = n;

    System.out.println(n + "*" + n + "=" + m );

        int count =0;
        while(m>0){
            if(m % 10 == 3){
                count++;
            }
            m = m / 10;

        }
        System.out.println("count '3'= " + count);

        n = Integer.parseInt(new StringBuffer(String.valueOf(n)).reverse().toString());
        System.out.println("reverse = " + n);

        String text = String.valueOf(a);
        text = text.substring(text.length()-1)+text.substring(1, text.length()-1)+text.charAt(0);
        a = Integer.parseInt(text);
        System.out.println("first/last reverse = " + a);

        System.out.println("1+n+1 = " + "1" + n + "1");









    }
}



