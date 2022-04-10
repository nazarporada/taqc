package com.company;

import java.util.Scanner;

import static java.lang.System.*;

public class W4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Person person1 = new Person();
        out.println(person1.input());

        Person person2 = new Person();
        out.println(person2.input());

        Person person3 = new Person();
        out.println(person3.input());

    }

    static class Person {
        Scanner in = new Scanner(System.in);

        private String name;
        private int birthyear;

        public Person() {

        }

        public void setName(String name) {
            this.name = name;
        }

        public void setBirthyear(int birthyear) {
            this.birthyear = birthyear;
        }

        void age() {
            out.println(2022 - birthyear);
        }

        public Person(int birthyear, String name) {
            this.birthyear = birthyear;
            this.name = name;
        }

        int input() {
            out.println("Input information about person(Name and birthday year): ");
            String name = in.nextLine();
            int birthyear = in.nextInt();
            this.birthyear = birthyear;
            this.name = name;

            return output();
        }

       private int output() {
            out.print(name + " is ");
            age();
            return 0;
        }
    }
}
