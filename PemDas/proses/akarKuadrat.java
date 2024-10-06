package com.PemDas.proses;
import java.util.Scanner;

public class akarKuadrat {
    public static void main(String[] args) {
        int a, b, c, d;
        double x1, x2;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai a : ");
        a = input.nextInt();
        System.out.print("Masukkan nilai b : ");
        b = input.nextInt();
        System.out.print("Masukkan niali c : ");
        c = input.nextInt();

        d = (b*b) - (4*a*c);
        x1 = (-b + Math.sqrt(d))/(2*a);
        x2 = (-b - Math.sqrt(d))/(2*a);
        System.out.println("========================");
        System.out.println("\nX1 = " + x1);
        System.out.println("X2 = " + x2);
        input.close();
    }
}