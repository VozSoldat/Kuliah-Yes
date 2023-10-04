package praktikPemilihanII;
import java.util.Scanner;
public class Pemilihan2Percobaan118a {

    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);
        int tahun;
        System.out.println("Masukkan tahun.");
        tahun = input18.nextInt();

        if ((tahun % 4)== 0) {
            if ((tahun % 100)!=0) {
                System.out.println("Tahun kabisat.");
            }
            else {
            if ((tahun % 400) ==0) {
                System.out.println("Tahun kabisat.");
            }
            }
        } else {
            System.out.println("Bukan tahun kabisat.");
        }


    }
}