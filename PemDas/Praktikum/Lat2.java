package com.PemDas.Praktikum;
import java.util.Scanner;

public class Lat2 {
    public static void main(String[] args) {
        int p, l, keliling, jumlahBB, luasPlafon;
        double hargaBB, hargaPlafon, hargaTotal;
        Scanner input = new Scanner(System.in);

        p = input.nextInt();
        l = input.nextInt();

        keliling = (2*p)+(2*l);
        jumlahBB = (143*keliling)+(37*(keliling/10));
        hargaBB = jumlahBB*5000;
        luasPlafon = p*l;
        hargaPlafon = luasPlafon*3000;
        hargaTotal = hargaBB+hargaPlafon;

        System.out.printf("Jumlah Batu Bata         : %d buah\n", jumlahBB);
        System.out.printf("Total Harga Batu Bata    : Rp%.2f\n", hargaBB);
        System.out.printf("Luas Plafon              : %d m2\n", luasPlafon);
        System.out.printf("Total Harga Plafon       : Rp%.2f\n", hargaPlafon);
        System.out.printf("Total Harga Keseluruhan  : Rp%.2f\n", hargaTotal);
    }
}
