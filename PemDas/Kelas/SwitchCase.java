package com.PemDas.Kelas;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int t3, a3, p4, l4, h4;
        double l3, r, l0;
        String menu;
        Scanner input = new Scanner(System.in);

        System.out.println("Menu :");
        System.out.println("1. Luas Segitiga");
        System.out.println("2. Luas Segiempat");
        System.out.println("3. Luas Lingkaran");
        System.out.print("\nPilih menu : ");
        menu = input.nextLine();

        switch (menu) {
            case "1":
                System.out.println("\n=======Menghitung Luas Segitiga=======");
                System.out.print("Masukkan tinggi segitiga \t: ");
                t3 = input.nextInt();
                System.out.print("Masukkan alas segitiga \t\t: ");
                a3 = input.nextInt();
                l3 = a3*t3/2.0;
                System.out.println("Luas segitiga dari alas " + a3 + " dan tinggi " + t3 + " adalah \t: " + l3);
                break;

            case "2":
                System.out.println("=======Menghitung Luas Segiempat=======");
                System.out.print("Masukkan panjang segiempat \t: ");
                p4 = input.nextInt();
                System.out.print("Masukkan lebar segiempat \t: ");
                l4 = input.nextInt();
                h4 = p4*l4;
                System.out.println("Luas segiempat dari panjang " + p4 + " dan lebar " + l4 + " adalah \t: " + h4);
                break;

            case "3":
                System.out.println("=======Menghitung Luas Lingkaran=======");
                System.out.print("Masukkan jari-jari lingkaran \t\t\t: ");
                r = input.nextDouble();
                l0 = 3.14*r*r;
                System.out.println("Luas lingkaran dari jari-jari " + r + " adalah \t: " + l0);
                break;

            default:
                break;
        }
        input.close();
    }
}
