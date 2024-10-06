package com.PemDas.Praktikum.Modul1;
import java.util.Scanner;

public class listrik {
    public static void main(String[] args) {
        //Deklarasi
        int awal, akhir, beban, pemakaian , tarif, total;
        double ppj, ppjPersen;
        String nama, kelurahan;

        //Input
        Scanner input = new Scanner(System.in);
        System.out.println("Program penghitung pemakaian listrik sederhana");
        System.out.print("Masukkan Nama \t: ");
        nama = input.nextLine();
        System.out.print("Kelurahan \t: ");
        kelurahan = input.nextLine();
        System.out.print("Masukkan posisi awal Kwh Meter \t\t: ");
        awal = input.nextInt();
        System.out.print("Masukkan posisi akhir Kwh Meter \t: ");
        akhir = input.nextInt();
        System.out.print("Masukkan biaya beban saat ini \t: ");
        beban = input.nextInt();
        System.out.print("Masukkan PPJ (dalam persen) \t: ");
        ppj = input.nextDouble();

        //Operasi
        pemakaian = akhir - awal;
        tarif = beban*pemakaian;
        ppjPersen = ppj/100*tarif;
        total = tarif + (int) ppjPersen;

        //Output
        System.out.println("\n===================PLN Java===================");
        System.out.println("Nama \t\t: " + nama);
        System.out.println("Kelurahan \t: " + kelurahan);
        System.out.println("Pemakaian bulan ini \t: " + pemakaian + " Kwh Meter");
        System.out.println("Tarif Listrik \t: Rp " + tarif + ",-");
        System.out.println("PPJ " + (int)ppj + "% \t: Rp " + (int)ppjPersen + ",-");
        System.out.println("Total Bayar \t: Rp " + total + ",-");
        System.out.println("==============================================");
        input.close();
    }
}
