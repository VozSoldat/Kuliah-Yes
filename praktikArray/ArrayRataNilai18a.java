package praktikArray;
import java.util.Scanner;
public class ArrayRataNilai18a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs;
        int jmlMhsLulus = 0, jmlMhsTLulus=0;
        int a;
        double total = 0, totalLulus=0, totalTLulus=0;
        double rata2, rata2Lulus, rata2TLulus;

        System.out.println("Masukkan jumlah mahasiswa!");
        a = sc.nextInt();
        nilaiMhs = new int[a];

        for (int i = 0;i<nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i]>70) {
                jmlMhsLulus++;
            } else {
                jmlMhsTLulus++;
            }
        }
        System.out.println("Jumlah mahasiswa lulus adalah "+jmlMhsLulus);

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i]>70) {
                totalLulus += nilaiMhs[i];
            } else {
                totalTLulus += nilaiMhs[i];
            }
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata2);
        rata2Lulus = totalLulus/jmlMhsLulus;
        rata2TLulus= totalTLulus/jmlMhsTLulus;
        System.out.println("Rata-rata nilai lulus "+rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus "+rata2TLulus);
    }
}