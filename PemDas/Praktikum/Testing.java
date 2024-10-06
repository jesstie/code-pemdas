package com.PemDas.Praktikum;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        double suhuAwal, suhuC1, suhuR1, suhuC2, suhuR2, suhuK;
        Scanner input = new Scanner(System.in);
        suhuAwal = input.nextDouble();
        suhuC1 = ((suhuAwal-32) * (5.0/9)) + 5;
        suhuR1 = ((suhuAwal-32)*(4.0/9)) + (5*(4.0/5));
        suhuC2 = ((suhuAwal-32) * (5.0/9)) + 13;
        suhuR2 = ((suhuAwal-32)*(4.0/9)) + (13*(4.0/5));
        suhuK = (((suhuAwal-32)*(5.0/9))+375.15) - (suhuC2+375.15);

        System.out.println("===== Suhu Anda Sekarang =====");
        System.out.println("== Suhu di Pos 1");
        System.out.printf("Satuan Celcius \t: %.2f C\n", suhuC1);
        System.out.printf("Satuan Reamur \t: %.2f R\n", suhuR1);
        System.out.println("== Suhu di Pos 2");
        System.out.printf("Satuan Celsius \t: %.2f C\n", suhuC2);
        System.out.printf("Satuan Reamur \t: %.2f R\n", suhuR2);
        System.out.println("== Selisih Suhu Awal ke Pos 2");
        System.out.printf("Selisih Suhu \t: %.2f K\n", suhuK);
        System.out.println("==============================");
        input.close();
    }
}
