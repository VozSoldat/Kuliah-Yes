package praktikPemilihanII;
import java.util.Scanner;
class Pemilihan2Percobaan318 {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan kategori : ");
        kategori = input18.nextLine();

        System.out.print("Masukkan : ");
        penghasilan = input18.nextInt();

        if (kategori.equals("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else {
                if (penghasilan <= 3000000) {
                    pajak = 0.15;
                } else {
                    pajak = 0.2;
                }
            }
        } else {
            if (kategori.equals("pebisnis")) {
                if (penghasilan <= 2500000) {
                    pajak = 0.15;
                } else {
                    if (penghasilan <= 3500000) {
                        pajak = 0.2;
                    } else {
                        pajak = 0.25;
                    }
                }
            } else {
                System.out.println("Kategori salah.");
            }
        }
        gajiBersih = (int) (penghasilan - (penghasilan*pajak));
        System.out.println("Gaji bersih Anda adalah "+gajiBersih);
    }
    
}