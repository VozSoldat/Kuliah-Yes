import java.util.Scanner;

/**
 * cekinput
 */
public class cekinput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            double nBin, nUHBin, nUMat, nUBin, nUBin, bMat = 3, bBin = 3, bBin = 3;
            double[] nMat = new double[4], nUHMat = new double[2], nBin = new double[4], nUHBin = new double[2];
            double rata_nMat, rata_nUHMat, rata_nBin, rata_nUHBin;
            double proporsiTugas = 0.4, proporsiUH = 0.25, proporsiU = 0.35; //proporsi setiap tugas/penilaian
            double rataRata, indeksPrestasi, nABin, nAMat, nABin; //int ganti ke double karena input nilai bisa berupa pecahan
            String[] user = {"admin", "userA", "userB"};
            String pass[] = {"admin", "passA", "passB"};
            String username;
            String password;
            String kelas;
            String nama = "";
            String a1[] = {"murid1a1", "murid1a2", "murid1a3", "murid1a4", "murid1a5"};
            String a2[] = {"murid2a1", "murid2a2", "murid2a3", "murid2a4", "murid2a5"};
            String a3[] = {"murid3a1", "murid3a2", "murid3a3", "murid3a4", "murid3a5"};
            String b1[] = {"murid1b1", "murid1b2", "murid1b3", "murid1b4", "murid1b5"};
            String b2[] = {"murid2b1", "murid2b2", "murid2b3", "murid2b4", "murid2b5"};
            String b3[] = {"murid3b1", "murid3b2", "murid3b3", "murid3b4", "murid3b5"};
            String c1[] = {"murid1c1", "murid1c2", "murid1c3", "murid1c4", "murid1c5"};
            String c2[] = {"murid2c1", "murid2c2", "murid2c3", "murid2c4", "murid2c5"};
            String c3[] = {"murid3c1", "murid3c2", "murid3c3", "murid3c4", "murid3c5"};

                // INPUT NILAI ARRAY - IPA
                int i = 0;
                do {
                    System.out.println("\nNilai Tugas IPA \n Tugas ke-"+(i+1)+" : ");
                    do {
                        nBin[i] = sc.nextDouble();
                        if (nBin[i] < 0 || nBin[i] > 100) {
                        System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
                        System.out.println("\nNilai Tugas IPA : ");
                        }
                    } while (nBin[i] < 0 || nBin[i] > 100);
                    i++;
                } while (i<nBin.length);
        
                i = 0;
                do {
                    System.out.println("\nNilai Ulangan Harian IPA \n UH ke-"+(i+1)+" : ");
                    do {
                        nUHBin[i] = sc.nextDouble();
                        if (nUHBin[i] < 0 || nUHBin[i] > 100) {
                        System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
                        System.out.println("\nNilai Tugas IPA : ");
                        }
                    } while (nUHBin[i] < 0 || nUHBin[i] > 100);
                    i++;
                } while (i<nUHBin.length);
                
                System.out.println("\nNilai Ujian IPA : ");
               do {
                    nUBin = sc.nextDouble();
                    if (nUBin < 0 || nUBin > 100) {
                    System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
                    System.out.println("Nilai Ujian IPA : ");
                    }
               } while (nUBin < 0 || nUBin > 100);
                
                //rata-rata nilai mat dalam array
                double j=0;
                for(i=0; i<nBin.length; i++){
                    j = nBin[i] +j;
                }
                rata_nBin = j/4;
        
                j=0;
                for(i=0; i<2; i++){
                    j= nUHBin[i]+j;
                }
                rata_nUHBin= j/nUHBin.length;
        
                    nABin = (rata_nBin*proporsiTugas+nUBin*proporsiU+rata_nUHBin*proporsiUH)*bBin;
                System.out.println("Hasil Nilai Akhir Matematika : " + nABin);
                    if (nABin<75) {
                        System.out.println("Remedi.");
                    } else {
                        System.out.println("Tidak Remedi.\n\n");
                    }
    }
}