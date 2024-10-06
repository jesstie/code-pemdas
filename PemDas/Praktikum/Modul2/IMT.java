package com.PemDas.Praktikum.Modul2;
import java.util.Scanner;

public class IMT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bb, tb, imt;

        System.out.print("Berat badan (kg) \t: ");
        bb = input.nextDouble();
        System.out.print("Tinggi badan (m) \t: ");
        tb = input.nextDouble();
        imt = bb/(tb*tb);

        if (imt <= 18.5) {
            System.out.printf("IMT = %.2f Termasuk kurus", imt);
        } else if (18.5 < imt && imt <= 25) {
            System.out.printf("IMT = %.2f Termasuk normal", imt);
        } else if (25 < imt && imt <= 30) {
            System.out.printf("IMT = %.2f Termasuk gemuk", imt);
        } else {
            System.out.printf("IMT = %.2f Termasuk kegemukan", imt);
        }
        input.close();
    }
}