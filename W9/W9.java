package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class W9 {

    public static void main(String[] args) throws Exception {
        try {
            Scanner in = new Scanner(System.in);
            Div div = new Div();
            System.out.print("Input x ");
            div.x = in.nextDouble();
            System.out.print("Input y ");
            div.y = in.nextDouble();
            if (div.y == 0) {
                throw new Exception("/ by 0");
            }
            div.div();
        } catch (InputMismatchException e) {

            throw new Exception(" Input valid value ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Div {
        double x, y;

        void div() {

            System.out.println(x / y);
        }

    }


}


