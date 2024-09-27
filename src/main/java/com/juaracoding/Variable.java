package com.juaracoding;

public class Variable {
    public static void main(String[] args) {

        // camelCase, countCart
        // snake_case, count_cart

        // Numeric
        byte countCart = 102;
        short stock = 10000;
        int price = 2000000000;
        long accountBalance = 3000000000L;

        float grade = 95.5f;
        double salary = 10000000.964;

        // char
        char akreditasi = 'A';

        // boolean
        boolean isForget = true;

        // string
        String path = "C:\\Program Files\\Java\\jdk-17\\bin";
        System.out.println(path);

        // Buatkan tampilan user profile pada konsol
        String name = "Ihlasul Mufti Faqih";
        byte age = 21;
        String city = "Makassar";
        short height = 165;
        short weight = 55;
        boolean isMarried = false;

        System.out.println("Profile Pengguna:");
        System.out.println("Nama\t\t\t\t: " + name);
        System.out.println("Umur\t\t\t\t: " + age);
        System.out.println("City\t\t\t\t: " + city);
        System.out.println("Tinggi Badan (cm)\t: " + height);
        System.out.println("Berat Badan (kg)\t: " + weight);

        if (isMarried){
            System.out.println("Status\t\t\t\t: Sudah Menikah");
        }else {
            System.out.println("Status\t\t\t\t: Belum Menikah");
        }

        // automatic casting
        short data1 = 456;
        double dataDouble = data1;
        System.out.println(dataDouble);
        char data2 = 'Z';
        long dataLong = data2;
        System.out.println(dataLong);

        // manual casting
        long data = 923334721398937L;
        int dataInt = (int) data;
        System.out.println(dataInt);
    }
}