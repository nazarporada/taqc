package com.company;

import java.util.Scanner;

public class W5A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//   1.     System.out.print("First: ");
//        double x = in.nextDouble();
//        System.out.print("Second: ");
//        double y = in.nextDouble();
//        System.out.print("Third: ");
//        double z = in.nextDouble();
//
//        x = Math.round(x * 1000);
//        x = x / 1000;
//        y = Math.round(y * 1000);
//        y = y / 1000;
//        z = Math.round(z * 1000);
//        z = z / 1000;
//
//        int[] numbers = new int[11];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = i - 5;
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            if (x == numbers[i]) {
//                System.out.println(x + " is in massive ");
//            }
//            if (y == numbers[i]) {
//                System.out.println(y + " is in massive ");
//            }
//            if (z == numbers[i]) {
//                System.out.println(z + " is in massive ");
//            }

//  2.      System.out.print("First: ");
//        int x = in.nextInt();
//        System.out.print("Second: ");
//        int y = in.nextInt();
//        System.out.print("Third: ");
//        int z = in.nextInt();
//
//        if ( x > y && x > z ){
//            System.out.println(x + " maximum");
//        }
//        if ( x < y && x < z ){
//            System.out.println(x + " minimum");
//        }
//        if ( y > x && y > z ){
//            System.out.println(y + " maximum");
//        }
//        if ( y < x && y < z ){
//            System.out.println(y + " minimum");
//        }
//        if ( z > x && z > y ){
//            System.out.println(z + " maximum");
//        }
//        if ( z < x && z < y ){
//            System.out.println(z + " minimum");
//        }

  3.      enum HTTPError {
            error400(400,"Bad Request"), error401(401,"Unauthorized"), error402(402,"Payment Required"), error403(403,"Forbidden"),
            error404(404,"Not Found"), error405(405,"Method Not Allowed"), error406(406,"Not Acceptable"),
            error407(407,"Proxy Authentication Required"), error408(408,"Request Timeout"),
            error409(409,"Conflict"), error410(410,"Gone"), error411(411,"Length Required"), error412(412,"Precondition Failed"),
            error413(413,"Request Entity Too Large"), error414(414,"Request-URI Too Long"), error415(415,"Unsupported Media Type"),
            error416(416,"Requested Range Not Satisfiable"), error417(417,"Expectation Failed");

            private final int num;
            private final String name;

            HTTPError(int num,String name) {
                this.num = num;
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public int getNum() {
                return num;
            }
        }
        System.out.print("Choose Error(400-417): ");
        int x = in.nextInt();

        if (x == HTTPError.error400.num) {System.out.println(HTTPError.error400.name);}
        if (x == HTTPError.error401.num) {System.out.println(HTTPError.error401.name);}
        if (x == HTTPError.error402.num) {System.out.println(HTTPError.error402.name);}
        if (x == HTTPError.error403.num) {System.out.println(HTTPError.error403.name);}
        if (x == HTTPError.error404.num) {System.out.println(HTTPError.error404.name);}
        if (x == HTTPError.error405.num) {System.out.println(HTTPError.error405.name);}
        if (x == HTTPError.error406.num) {System.out.println(HTTPError.error406.name);}
        if (x == HTTPError.error407.num) {System.out.println(HTTPError.error407.name);}
        if (x == HTTPError.error408.num) {System.out.println(HTTPError.error408.name);}
        if (x == HTTPError.error409.num) {System.out.println(HTTPError.error409.name);}
        if (x == HTTPError.error410.num) {System.out.println(HTTPError.error410.name);}
        if (x == HTTPError.error411.num) {System.out.println(HTTPError.error411.name);}
        if (x == HTTPError.error412.num) {System.out.println(HTTPError.error412.name);}
        if (x == HTTPError.error413.num) {System.out.println(HTTPError.error413.name);}
        if (x == HTTPError.error414.num) {System.out.println(HTTPError.error414.name);}
        if (x == HTTPError.error415.num) {System.out.println(HTTPError.error415.name);}
        if (x == HTTPError.error416.num) {System.out.println(HTTPError.error416.name);}
        if (x == HTTPError.error417.num) {System.out.println(HTTPError.error417.name);}
    }
}

