package com.juaracoding;

import java.util.Scanner;

public class JavaArray {
    public static void main(String[] args) {

        // cara 1
        int[] angka = {1,2,3,4,5}; // Index 0 - 4
        System.out.println(angka[2]); // Panggil index ke-2

        // cara 2
        int[] grades = new int[5];
        grades[0] = 89;
        grades[1] = 87;
        grades[2] = 82;
        grades[3] = 80;
        grades[4] = 85;
        grades[2] = 75; // menimpa grades 82 jadi 75
        System.out.println(grades[2]); // Panggil index ke-2
        System.out.println(grades.length); // melihat jumlah data array

        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }

        System.out.println("For Each");
        for (int grade : grades) {
            System.out.println(grade);
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car.toUpperCase());
        }

        // array multidimensi
        int[][] myNumbers = {{1,2,3,4},{5,6,7}};
        System.out.println(myNumbers[1][2]);

        System.out.println("Jumlah baris : "+myNumbers.length);
        System.out.println("Jumlah kolom baris ke-1 : "+myNumbers[0].length);
        System.out.println("Jumlah kolom baris ke-2 : "+myNumbers[1].length);

        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }

        // buatkan scanner input data city: Jakarta, Bandung, Surabaya, Bali, Makassar
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Masukkan jumlah data yang diinput:");
//        int count = scanner.nextInt();
//        String[] cities = new String[count];
//
//        for (int i = 0; i < cities.length; i++) {
//            System.out.println("Masukkan nama kota:");
//            cities[i] = scanner.next();
//        }
//
//        System.out.println("Data kota yang dimiliki:");
//        for (String city : cities){
//            System.out.println(city);
//        }
        
        // menjumlahkan list daftar harga
        double[] prices = {10000,50000,70000,90000,100000};
        double total = 0;
        
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }

        System.out.println("Total jumlah harga: "+total);

        // mencari sebuah data
        System.out.println("Masukkan data mobil yang dicari:");
        String search = scanner.next();
        boolean isFound = false;
        int id = 0;

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equalsIgnoreCase(search)){
                isFound = true;
                id = i;
            }
        }

        if (isFound) {
            System.out.println("Data ditemukan pada index ke-"+id);
        }else {
            System.out.println("Data tidak ditemukan");
        }

        // ternary
        System.out.println((isFound ? "Data ditemukan pada index ke-"+id : "Data tidak ditemukan"));
    }
}
