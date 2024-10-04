package com.juaracoding.oop;

import java.util.Date;

public class MainApp {
    public static void main(String[] args) {

        // instance object
        Fruit apple = new Fruit();
        apple.grams = 2;
        apple.calsPerGrams = 57;
        System.out.println(apple.totalCalories());
        System.out.println(apple);

        Fruit mango = new Fruit();
        mango.grams = 3;
        mango.calsPerGrams = 56;
        System.out.println(mango.totalCalories());
        System.out.println(mango);

        Date date = new Date();
        System.out.println(date);

        Kotak kotakPertama = new Kotak(10);
        kotakPertama.draw();

        Kotak kotakKedua = new Kotak(5);
        kotakKedua.draw();

        Segitiga segitigaSatu = new Segitiga(4);
        segitigaSatu.draw();

        // Car
        Car car = new Car("Pertalite");
        car.warna();
        car.mesin();
        System.out.println(car.getTahunPembuatan());
        System.out.println(car.getBahanBakar());

        // Employee
        Employee employee = new Employee("Budi Raharjo", "SQA", 8500, true);
        employee.displayInfoEmp();
    }
}
