package com.juaracoding;

public class Operator {
    public static void main(String[] args) {

        // aritmatika
        float result = (float) 5/2;
        System.out.println(result);
        int mod = 8 % 3;
        System.out.println(mod);

        int x = 2;
        int hasil1 = 10 * ++x; //prefix
        System.out.println(hasil1);

        int y = 2;
        int hasil2 = 10 * x++; // suffix
        System.out.println(hasil2);

        int hasil3 = (10+2)*5;
        System.out.println(hasil3);

        // assignment
        int a = 25;
        int b = 30;
        a += b;
        System.out.println(a);

        // relational
        boolean isResult = 5 != 5;
        System.out.println(isResult);

        // bitwise
        int bitwise = 10 & 12;
        // 1010 AND 1100 = 1000 = 8
        System.out.println(bitwise);

    }
}
