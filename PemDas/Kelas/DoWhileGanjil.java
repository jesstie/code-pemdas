package com.PemDas.Kelas;

public class DoWhileGanjil {
    public static void main(String[] args) {
        int bil = 11;
        do {
            if (bil%2==1) {
                System.out.println(bil);
            }
            bil++;
        }
        while (bil <= 188);
    }
}
