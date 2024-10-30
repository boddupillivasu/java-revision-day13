package com.examples.arrays;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the operation: add ,sub,div,mul,mod");
        String task = scanner.nextLine();

        System.out.println("enter the first value:");
        double val = scanner.nextDouble();

        System.out.println("enter the second value:");
        double val1 = scanner.nextDouble();

        double res;


        switch (task) {


            case "add":
                res = val + val1;
                System.out.println("the add value:" + res);
                break;

            case "mul":
                res = val * val1;
                System.out.println("the mul value:" + res);
                break;

            case "sub":
                res = val - val1;
                System.out.println("the sub value:" + res);
                break;
            case "div":
                res = val / val1;
                System.out.println("the div value:" + res);
                break;
            case "mod":
                res = val % val1;
                System.out.println("the mod value:" + res);
                break;
            default:
                System.out.println("invalid operation please select:add,mul,div,sub,mod");

        }
        scanner.close();
    }
}
