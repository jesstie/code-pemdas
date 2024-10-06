package com.PemDas.Kelas;
import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        int nAngka;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai anda : ");
        nAngka = input.nextInt();

        if ((0<=nAngka)&&(nAngka<40)) {
            System.out.println("Nilai : D");
        } else if ((40<=nAngka)&&(nAngka<50)) {
            System.out.println("Nilai : C");
        } else if ((50<=nAngka)&&(nAngka<70)) {
            System.out.println("Nilai : B");
        } else if ((70<=nAngka)&&(nAngka<80)) {
            System.out.println("Nilai : A");
        } else if ((80<=nAngka)&&(nAngka<100)) {
            System.out.println("Nilai : S");
        } else {
            System.out.println("Tidak ada");
        }
        input.close();
    }
}