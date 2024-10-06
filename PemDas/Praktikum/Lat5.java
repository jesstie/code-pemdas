package com.PemDas.Praktikum;
import java.util.Scanner;

public class Lat5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mobil;
        int durasi, jarak, biaya, selisih;
        
        mobil = input.nextLine();
        durasi = input.nextInt();
        jarak = input.nextInt();

        if (mobil.equals("Ekonomis")) {
            if (jarak-100<0) {
                selisih = 0;
            } else {
                selisih = jarak-100;
            }
            biaya = (durasi*200000) + (selisih*1000);
        } else if (mobil.equals("Sedan")) {
            if (jarak-200<0) {
                selisih = 0;
            } else {
                selisih = jarak-200;
            }
            biaya = (durasi*350000) + (selisih*1500);
        } else if (mobil.equals("SUV")) {
            if (jarak-300<0) {
                selisih = 0;
            } else {
                selisih = jarak-300;
            }
            biaya = (durasi*500000) + (selisih*2000);
        } else {
            if (jarak-500<0) {
                selisih = 0;
            } else {
                selisih = jarak-500;
            }
            biaya = (durasi*1000000) + (selisih*3000);
        }
        System.out.printf("Total biaya sewa sebesar Rp %d", biaya);
    }
}
