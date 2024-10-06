package com.PemDas.Praktikum;
import java.util.Scanner;

public class Lat3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if ((a>=1)&&(b>=1)&&(c>=1)&&(b<=1000)&&(a<=1000)&&(c<=1000)) {
            if ((a==b)&&(a==c)) {
                System.out.print("Segitiga Sama Sisi");
            } else if ((a==b)||(b==c)||(c==a)) {
                System.out.print("Segitigas Sama Kaki");
            } else if (c*c == (a*a + b*b) || b*b == (a*a + c*c) || a*a == (c*c + b*b)) {
                System.out.print("Segitiga Siku-Siku");
            } else {
                System.out.print("Segitiga Sembarang");
            }
        } else {
            System.out.print("Segitiga tidak valid!");
        }
    }
}