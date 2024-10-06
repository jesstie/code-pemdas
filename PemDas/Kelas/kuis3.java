package com.PemDas.Kelas;
import java.util.Scanner;

public class kuis3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bil;

        bil = input.nextLine();

        char ratusan = bil.charAt(0);
        char puluhan = bil.charAt(1);
        char satuan = bil.charAt(2);

        System.out.println("Ratusan : " + ratusan);
        System.out.println("Puluhan : " + puluhan);
        System.out.println("Satuan : " + satuan);
    }
}
