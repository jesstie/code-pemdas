package com.PemDas.Kelas;
import java.util.Scanner;

public class kuis1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  bilangan, jumlahBilangan=0;
        System.out.print("Masukkan n bilangan : ");
        double n = input.nextDouble();

        // double max = Double.NEGATIVE_INFINITY;
        // double min = Double.POSITIVE_INFINITY;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 1; i <= n; i++) {
            System.out.printf("Masukkan bilangan ke-%d : ", i);
            bilangan = input.nextInt();
            jumlahBilangan += bilangan;
            if (bilangan > max) {
                max = bilangan;
            } else {
                max = max;
            }
            if (bilangan < min) {
                min = bilangan;
            } else {
                min = min;
            }
        }
        double mean = jumlahBilangan/n;
        System.out.println(jumlahBilangan);
        System.out.println(mean);
        System.out.println(max);
        System.out.println(min);
    }
}
