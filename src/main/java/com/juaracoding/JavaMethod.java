package com.juaracoding;

public class JavaMethod {
    public static void main(String[] args) {

        //reusable
        drawKotak(5);
        drawKotak(10);

        double sisi = 6;
        double luas = luasKotak(sisi);
        System.out.println(luas);
        System.out.println(luasKotak(19));

        System.out.println(setName("JuaraCoding"));
        System.out.println(setText("Coder", "Code"));

        // Login True
        System.out.println(login("admin", "p4ssw0rd"));

        // Login False
        System.out.println(login("admin", "P4ssw0rd"));

        // Testing Positif
        calculateTax(7000, 'P');
        calculateTax(7000, 'L');

        // Testing Negatif
        calculateTax(7000, 'p');
        calculateTax(5000, 'p');

        String[] cities = {"Jakarta", "Bandung", "Balikpapan", "Bali", "Surabaya", "Makassar"};
        findLongestWord(cities);

    }

    static void drawKotak(int sisi){
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static double luasKotak(double sisi){
        return sisi*sisi;
    }

    static String setName(String name){
        return  name;
    }

    // Text1 contain Text2
    static boolean setText(String mainText, String compareText){
        return mainText.contains(compareText);
    }

    // Fungsi login return boolean
    static boolean login(String username, String password){
        return (username.equals("admin")) && (password.equals("p4ssw0rd"));
    }

    // calculateTax()
    // wajib pajak min salary 7000
    // gender L 10%, P 5%
    static void calculateTax(int salary, char gender){
        if (salary >= 7000){
            if (gender == 'L'){
                System.out.println("Jumlah pajak yang dikenakan sebesar Rp. "+(salary*0.1));
            }else if (gender == 'P'){
                System.out.println("Jumlah pajak yang dikenakan sebesar Rp. "+(salary*0.05));
            }else{
                System.out.println("Jenis kelamin tidak tersedia");
            }
        }else {
            System.out.println("Tidak dikenakan pajak");
        }

    }
    static void findLongestWord(String[] words){
        int longestId = 0;
        for (int i = 0; i < words.length-1; i++) {
            if (words[i+1].length() > words[longestId].length()){
                longestId = i+1;
            }
        }

        System.out.println("Kata terpanjang berada pada index ke-"+longestId+" yaitu "+ words[longestId]);
    }
}
