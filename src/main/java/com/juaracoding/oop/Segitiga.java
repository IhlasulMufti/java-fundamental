package com.juaracoding.oop;

public class Segitiga {
    int tinggi;

    Segitiga(int tinggi){
        this.tinggi = tinggi;
    }

    void draw(){
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
