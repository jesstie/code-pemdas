package com.PemDas.Praktikum.Modul1;
import java.util.Scanner;

public class operatorBilangan {
    public static void main(String[] args) {
        //Deklarasi
        int bil1, bil2;

        //Input
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan operator pertama \t: ");
        bil1 = input.nextInt();
        System.out.print("Masukkan operator kedua \t: ");
        bil2 = input.nextInt();

        //Output
        int jumlah = bil1 + bil2;
        System.out.println("Hasil penjumahan \t: " + jumlah);
        int kurang = bil1 - bil2;
        System.out.println("Hasil pengurangan \t: " + kurang);
        int kali = bil1*bil2;
        System.out.println("Hasil perkalian \t: " + kali);
        double bagi = (double) bil1/bil2;
        System.out.println("Hasil pembagian \t: " + bagi);
        input.close();
    }
}
