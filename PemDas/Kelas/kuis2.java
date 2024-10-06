package com.PemDas.Kelas;
import java.util.Scanner;

public class kuis2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, aFaktorial, selisih, selisihFaktorial;

        a = input.nextInt();
        b = input.nextInt();
        aFaktorial = a;
        selisih = a-b;
        selisihFaktorial = selisih;

        for (int i = 1; i < a; i++) {
            aFaktorial = aFaktorial*i;
        }
        for (int j = 1; j < selisih; j++) {
            selisihFaktorial = selisihFaktorial*j;
        }

        int permutasi = aFaktorial/selisihFaktorial;
        System.out.printf("Permutasi dari %d,%d adalah %d",a, b, permutasi);
    }
}
