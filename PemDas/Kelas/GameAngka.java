package com.PemDas.Kelas;
import java.util.Scanner;

public class GameAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angkaRand, tebakan, total=0;

        int max = 100;
        int min = 1;
        int range = (max - min) + 1;
        angkaRand = (int)(Math.random()* range) + min;

        System.out.println("==========GAME DIMULAI!==========");
        do {
            System.out.print("Masukkan tebakan anda : ");
            tebakan = input.nextInt();

            if (tebakan < angkaRand) {
                System.out.println("Bilangan yang anda masukkan terlalu kecil\n");
            } else if (tebakan > angkaRand) {
                System.out.println("Bilangan yang anda masukkan terlalu besar\n");
            } else {
                System.out.println("Selamat tebakan anda benar!\n");
            }
            total++;
        } while (tebakan != angkaRand);
        System.out.printf("Total tebakan anda : %d",total);
        input.close();
    }
}
