package com.PemDas.Praktikum;

public interface segitigaBintang {
    public static void main(String[] args) {
        int tinggi = 9;
        for (int i = 1; i < tinggi; i++) {
            for (int j = tinggi; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = tinggi; i >= 1; i--) {
            for (int j = tinggi; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for (int i = 1; i < 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for (int i = 0; i < 5; i++) {
        //     for (int j = 5; j > i; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }   
    }
}
