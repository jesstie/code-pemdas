package com.PemDas.Praktikum;
import java.util.Scanner;

public class constAss{
    public static void main(String[] args){
        String s = "filkom";
        String val = (s=="filkom")?"Brawijaya": "null";
        System.out.println(s+" "+val);
        Scanner input = new Scanner(System.in);

        // String nama = "Ahmad Hilalul Fadli";
        // String nim = "245150201111045";
        // System.out.print("Nama : ");
        // String namaIn= input.nextLine();
        // System.out.print("NIM : ");
        // String nimIn = input.nextLine();
        
        // String cekNama = (namaIn.equalsIgnoreCase(nama)) ? namaIn : "input nama salah";
        // String cekNim = (nimIn.equalsIgnoreCase(nim)) ? nimIn : "input nim salah";

        // System.out.println(cekNama);
        // System.out.println(cekNim);

        System.out.print("Nama : ");
        String nama1 = input.nextLine();
        System.out.print("Password : ");
        String password1 = input.nextLine();

        System.out.print("Nama : ");
        String nama2 = input.nextLine();
        System.out.print("Password : ");
        String password2 = input.nextLine();

        String bio = "\nNama : Ahmad Hilalul Fadli\nNIM : 245150201111045\nFakultas : Ilmu Komputer\nProdi : Teknik Informatika";

        String bioCek = (nama2.equalsIgnoreCase(nama1) && (password2.equalsIgnoreCase(password1))) ? bio : "\nData tak ditemukan";

        System.out.println(bioCek);
    }
}