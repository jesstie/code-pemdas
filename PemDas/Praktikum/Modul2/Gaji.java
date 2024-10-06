package com.PemDas.Praktikum.Modul2;
import java.util.Scanner;

public class Gaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jamKerja, upah, lembur, denda, total;

        System.out.print("Jam kerja\t: ");
        jamKerja = input.nextInt();

        if (jamKerja>60) {
            upah = 5000*60;
            lembur = (jamKerja-60)*6000;
            denda = 0;
            total = upah + lembur - denda;
        } else if (50 <= jamKerja) {
            upah = 5000*jamKerja;
            lembur = 0;
            denda = 0;
            total = upah + lembur - denda;
        } else {
            upah = 5000*jamKerja;
            lembur = 0;
            denda = (50-jamKerja)*1000;
            total = upah + lembur - denda;
        }
        
        System.out.printf("Upah\t= Rp. %d\n", upah);
        System.out.printf("Lembur\t= Rp. %d\n", lembur);
        System.out.printf("Denda\t= Rp. %d\n", denda);
        System.out.println("---------------------");
        System.out.printf("Total\t= Rp. %d", total);
        input.close();
    }
}