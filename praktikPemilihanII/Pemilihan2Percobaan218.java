package praktikPemilihanII;
import java.util.Scanner;

class Pemilihan2Percobaan218 {

    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);
        float sudut1, sudut2, sudut3, totalSudut;

        System.out.println("Masukkan sudut 1");
        sudut1 = input18.nextFloat();

        System.out.println("Masukkan sudut 2");
        sudut2 = input18.nextFloat();

        System.out.println("Masukkan sudut 3");
        sudut3 = input18.nextFloat();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90) {
                System.out.println("Segitiga siku-siku. ");
            } else {
                System.out.println("Bukan segitiga siku-siku.");
            }
        } else {
            System.out.println("Bukan segitiga.");
        }

    }
}