package com.PemDas.Kelas;
import java.util.Scanner;

public class Ongkos2 {
    public static void main(String[] args) {
        int jarak, harga;
        String member;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan member : ");
        member = input.nextLine().toLowerCase();
        harga = 0;

        switch (member) {
            case "non member":
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
                break;

            case "gold":
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
                break;

            case "platinum":
            System.out.println("\n=====Platinum=====");
            System.out.print("Masukkan jarak (dalam Kilometer) : ");
            jarak = input.nextInt();

                if (jarak < 5) {
                    harga = 5000;
                } else {
                    harga = jarak*1000;
                }
                break;
                
            default:
                break;
        }

        System.out.println("\n==========================================");
        System.out.println("Anda member : " + member);
        System.out.println("Total harga yang harus dibayar : Rp " + harga);
        input.close();
    }
}
