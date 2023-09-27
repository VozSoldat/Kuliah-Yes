package praktikPemilihan;
import java.util.Scanner;
public class PemilihanPercobaan218a {

    public static void main(String[] args) {
        
       Scanner input19 = new Scanner(System.in);
       
       System.out.print("Nilai UAS   : ");
       float uas = input19.nextFloat();

       System.out.print("Nilai UTS   : ");
       float uts = input19.nextFloat();

       System.out.print("Nilai kuis  : ");
       float kuis = input19.nextFloat();

       System.out.print("Nilai tugas  : ");
       float tugas = input19.nextFloat();

       float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        if (total <= 39) {
            System.out.println("Nilai huruf : E (gagal)");
            System.out.println("Nilai setara : 0");
        } else if (total<=50) {
            System.out.println("Nilai huruf : D (kurang)");
            System.out.println("Nilai setara : 1");
        } else if (total <= 60) {
            System.out.println("Nilai huruf : C (cukup)");
            System.out.println("Nilai setara : 2");
        } else if (total <= 65) {
            System.out.println("Nilai huruf : C+ (lebih dari cukup)");
            System.out.println("Nilai setara : 2,5");
        } else if (total <= 73) {
            System.out.println("Nilai huruf : B (baik)");
            System.out.println("Nilai setara : 3");
        } else if (total <=80) {
            System.out.println("Nilai huruf : B+ (lebih dari baik)");
            System.out.println("Nilai setara : 3,5");
        } else {
         System.out.println("Nilai huruf : A (sangat baik)");
            System.out.println("Nilai setara : 4");   
        }
            
      

       String message = (total < 65) ? "Remidi" : "Tidak remidi";

       System.out.println("Nilai akhir = " +total+ " sehingga " +message);
       


    }
}