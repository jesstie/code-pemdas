package com.PemDas.proses;
import java.util.Scanner;

public class luasSegitiga {
    public static void main(String[] args) {
        int alas, tinggi;
        double luas;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan lebar alas segitiga \t: ");
        alas = input.nextInt();
        System.out.print("Masukkan tinggi segitiga \t: ");
        tinggi = input.nextInt();
        luas = alas*tinggi/2;
        System.out.println("=======================================");
        System.out.println("\nLuas segitiga dari panjang alas " + alas + " dan tinggi " + tinggi + " adalah : " + luas);
        input.close();
    }
}