package praktikPemilihan;

import java.util.Scanner;

class PercobaanPemilihan119a {

    public static void main(String[] args) {
        
        Scanner input19 = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input19.nextInt();
        
        String jenisBilangan = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " bilangan " + jenisBilangan);
    
    

    }
}