package com.PemDas.Kelas;
import java.util.Scanner;

public class AcakAcakan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a2, b2, c2, d2, e2, totalSKS, biaya, biayaAkhir;
        double a1, b1, c1, d1, e1, ipk;

        input.useDelimiter("[\\s]+");

        a1 = input.nextDouble();
        a2 = input.nextInt();
        b1 = input.nextDouble();
        b2 = input.nextInt();
        c1 = input.nextDouble();
        c2 = input.nextInt();
        d1 = input.nextDouble();
        d2 = input.nextInt();
        e1 = input.nextDouble();
        e2 = input.nextInt();

        totalSKS = a2 + b2 + c2 + d2 + e2;
        ipk = ((a1*a2) + (b1*b2) + (c1*c2) + (d1*d2) + (e1*e2))/(totalSKS);

        if (totalSKS > 20) {
            biaya = totalSKS*200000;
        } else {
            biaya = totalSKS*250000;
        }

        if (ipk > 0 && ipk < 4.0) {
            if (ipk > 3.5) {
                System.out.printf("IPK Anda: %.2f\n", ipk);
                System.out.println("Anda mendapatkan Beasiswa Unggulan Plus");
                System.out.printf("Biaya pendidikan awal: Rp %d\n", biaya);
                biayaAkhir = biaya-(biaya*70/100);
                System.out.printf("Biaya pendidikan akhir: Rp %d", biayaAkhir);
            } else if (ipk > 3) {
                System.out.printf("\nIPK Anda: %.2f\n", ipk);
                System.out.println("Anda mendapatkan Beasiswa Pendidikan Bersama");
                System.out.printf("Biaya pendidikan awal: Rp %d\n", biaya);
                biayaAkhir = biaya-(biaya*50/100);
                System.out.printf("Biaya pendidikan akhir: Rp %d", biayaAkhir);
            } else if (ipk > 2.5) {
                System.out.printf("IPK Anda: %.2f\n", ipk);
                System.out.println("Anda mendapatkan Beasiswa Pelajar Teladan");
                System.out.printf("Biaya pendidikan awal: Rp %d\n", biaya);
                biayaAkhir = biaya-(biaya*30/100);
                System.out.printf("Biaya pendidikan akhir: Rp %d", biayaAkhir);
            } else {
                System.out.printf("IPK Anda: %.2f\n", ipk);
                System.out.println("Anda tidak mendapatkan beasiswa");
                System.out.printf("Biaya pendidikan awal: Rp %d\n", biaya);
                System.out.printf("Biaya pendidikan akhir: Rp %d", biaya);
            }
        } else {
            System.out.println("IPK tidak valid");
        }
    }
}