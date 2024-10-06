package com.PemDas.Praktikum;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2, hasil;
        String nama, NIM;
        // System.out.print("masukkan nilai 1: ");
        // nilai1 = input.nextDouble();
        // System.out.print("masukkan nilai 2: ");
        // nilai2 = input.nextInt();
        // hasil = nilai1 + nilai2;
        // System.out.print("maka hasil: " + hasil);
        System.out.print("Masukkan nama \t: ");
        nama = input.nextLine();
        System.out.print("Masukka NIM \t: ");
        NIM = input.nextLine();
        System.out.println("\n=============================");
        System.out.println("Nama \t: " + nama);
        System.out.println("NIM \t: " + NIM);
        input.close();
    }
}