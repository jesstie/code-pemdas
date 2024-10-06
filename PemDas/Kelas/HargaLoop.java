package com.PemDas.Kelas;
import java.util.Scanner;

public class HargaLoop {
    public static void main(String[] args) {
        int jumlah, harga, total=0, diskon;
        double diskonHarga;
        String status;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Masukkan jumlah belanja : ");
            jumlah = input.nextInt();

            System.out.printf("\n%24s", "-Harga Belanja-");
            System.out.println("\n=================================");
            for (int i = 1; i <= jumlah; i++) {
                System.out.printf("Masukkan harga belanja ke-%d : Rp.", i);
                harga = input.nextInt();
                total = total + harga;
            }
            System.out.print("\nApakah ada yang ingin dibeli lagi ? ");
            status = input.next();
            System.out.println("");

        } while (status.equalsIgnoreCase("Ya"));

        System.out.printf("\n%25s", "-Diskon Belanja-");
        System.out.println("\n=================================");
        System.out.printf("Total harga belanja anda : Rp.%d\n", total);
        System.out.print("Masukkan diskon (dalam persen) : ");
        diskon = input.nextInt();
        diskonHarga = total*(diskon/100.0);

        System.out.printf("\n%27s", "-Total Harga Belanja-");
        System.out.println("\n=================================");
        System.out.printf("Diskon anda : Rp.%.1f", diskonHarga);
        System.out.printf("\nHarga yang harus anda bayar : Rp." + (total-diskonHarga));

        input.close();
    }
}