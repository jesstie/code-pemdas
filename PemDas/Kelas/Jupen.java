package com.PemDas.Kelas;
import java.util.Scanner;
public class Jupen {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        String status;
        double Bayar,Diskon;
        int barang, data, totalHarga=0;

        System.out.println("-MARI MENGHITUNG DAFTAR BELANJA-\n");        

        do {
            System.out.print("Masukkan Jumlah Barang Belanjaan : ");
            barang=input.nextInt();

            System.out.printf("\n%27s", "-Daftar Harga Belanja-");
            System.out.printf("\n%s", "===============================\n");

            for (int i=1; i<=barang; i++){
                System.out.printf("Daftar Harga Barang ke-%-3d : Rp",i);
                data=input.nextInt();
                
                totalHarga=totalHarga+data;
            }

            input.nextLine();
            System.out.print("\nMau beli lagi gak? : ");
            status=input.nextLine();
                
        } while (status.equalsIgnoreCase("YES"));

            System.out.printf("Total Belanja\t\t   : Rp%d\n",totalHarga);

            System.out.print("Diskon\t\t\t   : ");
            Diskon=input.nextDouble();
            Diskon=Diskon/100;

            Bayar=totalHarga-(totalHarga*Diskon);
            System.out.printf("Maka anda bayar\t\t   : Rp%.2f",Bayar);
    }
}