package praktikPerulanganII;
import java.util.Scanner;
public class NestedLoop_2341720183_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }
        for (double[] baris : temps) {
            System.out.print("Kota ke-" + ": ");
            for (double suhu : baris) {
                System.out.print(suhu + " ");
            }
            System.out.println();
        }
        
    }
}

