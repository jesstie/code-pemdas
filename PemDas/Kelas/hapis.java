package com.PemDas.Kelas;

public class hapis {
    public static void findDate(String date) {
        String dateParts[] = date.split("/");
        String day = dateParts[2];
        String month = dateParts[1];
        String year = dateParts[0];

        switch (month) {
            case "1" :
                month = "Januari";
                break;
        
            case "2" :
                month = "Februari";
                break;
            
            case "3" :
                month = "Maret";
                break;
            
            case "4" :
                month = "April";
                break;

            case "5" :
                month = "Mei";
                break;

            case "6" :
                month = "Juni";
                break;

            case "7" :
                month = "Juli";
                break;

            case "8" :
                month = "Agustus";
                break;

            case "9" :
                month = "September";
                break;

            case "10" :
                month = "Oktober";
                break;

            case "11" :
                month = "November";
                break;

            case "12" :
                month = "Desember";
                break;
            default:
                break;
        }

        System.out.println("Hari : " + day);
        System.out.println("Bulan : " + month);
        System.out.println("Tahun : " + year);
    }

    public static void main(String[] args) {
        String date = "2024/10/02";

        findDate(date);
    }
}
