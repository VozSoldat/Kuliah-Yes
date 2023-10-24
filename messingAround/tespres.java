
import java.util.Scanner;
public class tespres {
    public static void main(String[] args) {
        double nTugasIpa, nTugasIps, nUHIpa, nUHIps, nUIpa, nUIps, nAkhirIpa, proporsiTugas=0.4, proporsiU=0.25, proporsiUH=0.35, nAkhirIps, bobotIpa=3, bobotIps=2, indeksPrestasi;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan nilai tugas IPA");
        nTugasIpa = scan.nextDouble();

        System.out.println("Masukkan nilai UH IPA");
        nUHIpa = scan.nextDouble();

        System.out.println("Masukkan nilai Ujian IPA");
        nUIpa = scan.nextDouble();

        System.out.println("Masukkan nilai tugas IPS");
        nTugasIps = scan.nextDouble();

        System.out.println("Masukkan nilai UH IPS");
        nUHIps = scan.nextDouble();

        System.out.println("Masukkan nilai Ujian IPS");
        nUIps = scan.nextDouble();

        nAkhirIpa = ((nTugasIpa*proporsiTugas)+(nUHIpa*proporsiUH)+(nUHIpa*proporsiU))*bobotIpa;

        nAkhirIps = ((nTugasIps*proporsiTugas)+(nUHIps*proporsiUH)+(nUHIps*proporsiU))*bobotIps;

        indeksPrestasi = (nAkhirIpa+nAkhirIps)/((bobotIpa+bobotIps)*25);

        System.out.println("Indeks prestasi Anda adalah "+indeksPrestasi);

    }
}
