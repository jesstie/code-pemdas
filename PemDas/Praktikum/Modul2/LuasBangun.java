package com.PemDas.Praktikum.Modul2;
import java.util.Scanner;

public class LuasBangun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, jari, alas, tinggi, miring, keliling4, luas4, keliling3;
        double  luas3, keliling0, luas0;
        String menu;

        System.out.println("Menu:");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");
        System.out.print("\nPilih menu : ");
        menu = input.nextLine();

        switch (menu) {
            case "1":
                System.out.printf("\nPilihan anda: %s", menu);
                System.out.print("\nMasukkan panjang \t: ");
                panjang = input.nextInt();
                System.out.print("Masukkan lebar \t\t: ");
                lebar = input.nextInt();

                keliling4 = (panjang+lebar)*2;
                luas4 = panjang*lebar;
                System.out.printf("\nKeliling persegi panjang : %d cm", keliling4);
                System.out.printf("\nLuas pesegi panjang \t : %d cm2", luas4);
                break;
            
            case "2":
                System.out.printf("\nPilihan anda: %s", menu);
                System.out.print("\nMasukkan jari-jari lingkaran \t: ");
                jari = input.nextInt();

                keliling0 = 2*3.14*jari;
                luas0 = 3.14*jari*jari;
                System.out.printf("\nKeliling lingkaran \t: %.2f cm", keliling0);
                System.out.printf("\nLuas lingkaran \t\t: %.2f cm2", luas0);
                break;

            case "3":
                System.out.printf("\nPilihan anda: %s", menu);
                System.out.print("\nMasukkan alas \t\t: ");
                alas = input.nextInt();
                System.out.print("Masukkan tinggi \t: ");
                tinggi = input.nextInt();
                System.out.print("Masukkan sisi miring \t: ");
                miring = input.nextInt();

                keliling3 = alas+tinggi+miring;
                luas3 = alas*tinggi/2.0;
                System.out.printf("\nKeliling segitiga \t: %d cm", keliling3);
                System.out.printf("\nLuas segitiga \t\t: %.2f cm2", luas3);
                break;

            default:
            System.out.printf("\nPilihan anda: %s", menu);
                System.out.println("\nData tak ditemukan, program dihentikan ...");
                break;
        }
        input.close();

    }
}