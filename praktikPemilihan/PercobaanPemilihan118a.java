package praktikPemilihan;

import java.util.Scanner;

class PercobaanPemilihan118a {

    public static void main(String[] args) {
        
        Scanner input19 = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input19.nextInt();
        String jenisBilangan;

        float mdls = angka % 2;
        jenisBilangan = (mdls % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka tersebut adalah bilangan " + jenisBilangan);
    
    

    }
}