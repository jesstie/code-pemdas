package com.PemDas.Kelas;
import java.util.Scanner;

public class Ongkos3 {
    public static void main(String[] args) {
        int member, jarak, harga;
        String namaMember;
        Scanner input = new Scanner(System.in);

        System.out.println("=====MMENU=====");
        System.out.println("1. non Membership");
        System.out.println("2. Gold");
        System.out.println("3. Platinum");
        System.out.print("Masukkan member : ");
        member = input.nextInt();
        harga = 0;

        if (member==1) {
            System.out.println("\n=====non Member=====");
            System.out.print("Masukkan jarak (dalam Kilometer) : ");
            jarak = input.nextInt();

            if (jarak < 5) {
                harga = 8000;
            } else if ((5 <= jarak)&&(jarak <= 10)) {
                harga = 20000;
            } else {
                harga = jarak*2000;
            }
            namaMember = "non Membership";
        } else if (member==2) {
            System.out.println("\n=====Gold=====");
            System.out.print("Masukkan jarak (dalam Kilometer) : ");
            jarak = input.nextInt();

            if (jarak < 5) {
                harga = 6500;
            } else if ((5 <= jarak)&&(jarak <= 10)) {
                harga = 15000;
            } else {
                harga = jarak*1500;
            }
            namaMember = "Gold";
        } else if (member==3) {
            System.out.println("\n=====Platinum=====");
            System.out.print("Masukkan jarak (dalam Kilometer) : ");
            jarak = input.nextInt();

            if (jarak < 5) {
                harga = 5000;
            } else {
                harga = jarak*1000;
            }
            namaMember = "Platinum";
        } else {
            System.out.println("404 not found");
            namaMember = "Error";
        }

        System.out.println("\n==========================================");
        System.out.println("Anda member : " + namaMember);
        System.out.println("Total harga yang harus dibayar : Rp " + harga);
        input.close();
    }
}
