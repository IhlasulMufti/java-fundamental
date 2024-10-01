package com.juaracoding;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        // for
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//
//        System.out.println("Next statement");
//
//        for (int i = 1; i <= 10; i += 2) {
//            System.out.print(i + " ");
//        }
//
//        System.out.println("\nCara 2");
//        for (int i = 0; i <= 10; i++) {
//            if (i%2 == 1){
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();

        // decreament
//        for (int i = 10; i > 0; i--) {
//            System.out.print(i + " ");
//        }

        // nested for
        // *****
        // *****
        // *****
        // *****
        // *****
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // *
        // **
        // ***
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // ***
        // **
        // *
//        int n = 5;
//        for (int i = n; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // while
        int x = 0;
        System.out.println("Print X");
        while (x < 0){
            System.out.print(x);
            x++;
        }

        // while-do
        int y = 0;
        System.out.println("\nPrint Y");
        do {
            System.out.print(y);
            y++;
        }while (y < 0);
        System.out.println();

        // break/continue
        x = 0;
        System.out.println("Ini Break");
        while (x < 5){
            if (x == 3) break;
            System.out.println("looping-"+x);
            x++;
        }

        y = 0;
        System.out.println("Ini Continue");
        while (y < 5){
            if (y == 3) {
                y++;
                continue;
            }
            System.out.println("looping-"+y);
            y++;
        }
        Scanner scanner = new Scanner(System.in);

        while (true){
            int angka = scanner.nextInt();
            if (angka == 0) break;
            System.out.println("Ini input "+angka);
        }
    }
}
