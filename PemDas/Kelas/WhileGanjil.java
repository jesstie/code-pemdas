package com.PemDas.Kelas;

public class WhileGanjil {
    public static void main(String[] args) {
        int bil = 11;
        while (bil <= 188) {
            if (bil%2==1) {
                System.out.println(bil);
            }
            bil++;
        }
    }
}
