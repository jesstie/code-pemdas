package com.PemDas.Praktikum;
import java.util.Scanner;

public class Lat1 {
    public static void main(String[] args) {
        String nama;
        int nilai1, nilai2, nilai3, nilai4, nilai5;
        double hasil;
        Scanner input = new Scanner(System.in);

        input.useDelimiter("[\\s]+");
        nama = input.nextLine();
        nilai1 = input.nextInt();
        nilai2 = input.nextInt();
        nilai3 = input.nextInt();
        nilai4 = input.nextInt();
        nilai5 = input.nextInt();

        hasil = (nilai1*10/100.0) + (nilai2*20/100.0) + (nilai3*30/100.0) + (nilai4*30/100.0) + (nilai5*10/100.0);
        System.out.printf("Nilai akhir %s adalah %.2f", nama, hasil);
        input.close();
    }
}