package com.PemDas.Kelas;
import java.util.Scanner;

class Ongkos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String member;
        int jarak, harga;
        
        System.out.print("Masukkan member : ");
        member = input.nextLine();
        System.out.print("Masukkan jarak (dalam Kilometer) : ");
        jarak = input.nextInt();
        
        if (member.equalsIgnoreCase("non Member")) {
            if (jarak < 5) {
                harga = 8000;
            } else if ((5 <= jarak)&&(jarak <= 10)) {
                harga = 20000;
            } else {
                harga = jarak*2000;
            }
        } else if (member.equalsIgnoreCase("Gold")) {
            if (jarak < 5) {
                harga = 6500;
            } else if ((5 <= jarak)&&(jarak <= 10)) {
                harga = 15000;
            } else {
                harga = jarak*1500;
            }
        } else {
            if (jarak < 5) {
                harga = 5000;
            } else {
                harga = jarak*1000;
            }
        }
        
        System.out.println("\n==========================================");
        System.out.println("Anda member : " + member);
        System.out.println("Total harga yang harus dibayar : Rp " + harga);
        input.close();
    }
}