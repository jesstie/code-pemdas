package com.PemDas.Praktikum;
import java.util.Scanner;

public class Lat4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        if (a<b&&b<c) {
            System.out.println("menaik");
        } else if (a>b&&b>c) {
            System.out.println("menurun");
        } else if (a<b&&b>c) {
            System.out.println("puncak");
        } else if (a>b&&b<c) {
            System.out.println("lembah");
        } else {
            System.out.println("tidak beraturan");
        }
    }
}
