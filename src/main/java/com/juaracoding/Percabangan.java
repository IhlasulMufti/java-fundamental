package com.juaracoding;

import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {

        int x = 2;
        if (x > 2){
            System.out.println("Statement");
        }else{
            System.out.println("Next statement");
        }

        int suhu = 39;
        if (suhu <= 36){
            System.out.println("Cuaca Normal");
        }else {
            System.out.println("Cuaca sangat panas");
        }

        int angka = 10;
        if (angka % 2 == 0){
            System.out.println("Bilangan Genap");
        }else{
            System.out.println("Bilangan Ganjil");
        }

        // Challange
        String size = "m";
        int jumlah = 2;
        int harga = 0;

        if (size.equalsIgnoreCase("s")){
            harga = jumlah*50000;
        }else if(size.equalsIgnoreCase("m")){
            harga = jumlah*60000;
        }else if(size.equalsIgnoreCase("l")){
            harga = jumlah*70000;
        }else{
            System.out.println("Tidak ada ukuran baju tersebut");
        }
        System.out.println("Size "+size.toUpperCase()+" berjumlah "+jumlah);
        System.out.println("Jumlah pembayaran anda adalah "+harga);

        // username = admin, password = p4ssw0ord
        String username = "admin";
        String password = "p4ssw0rd";

        if (username.equals("admin")){
            if (password.equals("p4ssw0rd")){
                System.out.println("Login Berhasil");
            }else{
                System.out.println("Login Gagal. Password anda salah");
            }
        }else{
            System.out.println("Login Gagal. Username anda salah");
        }

        // platNomor ganjil, tanggal ganjil
        // platNomor genap, tanggal genap
        int date = 31;
        int platNomor = 2342;

        if (date % 2 == 0 && platNomor % 2 == 1){
            System.out.println("Tidak bisa melewati jalan soekarno hatta, karena plat nomor ganjil tanggal genap");
        }else if (date % 2 == 1 && platNomor % 2 == 0){
            System.out.println("Tidak bisa melewati jalan soekarno hatta, karena plat nomor genap tanggal ganjil");
        }else{
            System.out.println("Bisa melewati jalan soekarno hatta");
        }

        // nested if
        // isMember 10%, isFirstTimeBuyer 5%, hasCoupon 2%
        // totalAmount > 500000 dapat discount
        boolean isMember = true;
        boolean isFirstTimeBuyer = false;
        boolean hasCoupon = false;
        double discount = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan total bayar = ");
        double totalAmount = scanner.nextDouble();

        if (totalAmount > 500000){
            if (isMember){
                discount += 0.1;
            }
            else if (isFirstTimeBuyer){
                discount += 0.05;
            }
            else if (hasCoupon){
                discount += 0.02;
            }
        }

        System.out.println("Total discount = "+discount*100);
        System.out.println("Total bayar = Rp. "+totalAmount*(1-discount));

    }
}
