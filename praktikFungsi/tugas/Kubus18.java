package tugas;

import java.util.Scanner;

public class Kubus18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan sisi kubus.");
        int sisi = sc.nextInt();
        int luas = Luas(sisi);
        int volume = Volume(sisi);

        System.out.println("Luas permukaan kubus = "+luas);
        System.out.println("Volume kubus = "+volume);
    }

    public static int Luas(int sisi){
        int luas = sisi*sisi*6;
        return luas;
    }

    public static int Volume(int sisi){
        int volume = sisi*sisi*sisi;
        return sisi;
    }
}
