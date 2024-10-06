package com.PemDas.Praktikum;
import java.util.Scanner;

public class LiveCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;

        System.out.print("Masukkan nilai : ");
        nilai = input.nextInt();

        String grade = (nilai >= 90) ? "Grade A" : ((nilai >= 80) && (nilai < 90)) ? "Grade B" : ((nilai >= 70) && (nilai < 80)) ? "Grade C" : "Remidi";
        System.out.println(grade);
        input.close();
    }
}
