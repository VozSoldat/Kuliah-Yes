package praktikPerulanganII;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.print("Masukkan nilai N (minimal 5): ");
        N = sc.nextInt();
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
