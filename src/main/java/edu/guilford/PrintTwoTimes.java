package edu.guilford;
// Why won't it let me run this? 

public class PrintTwoTimes {
    public static void printTwice(String s) {
        System.out.println(s);
        System.out.println(s);
    }

    public static void main(String[] args) {
        System.out.println("Hi!");
        printTwice("Don't make me say this twice!");
    }
}
