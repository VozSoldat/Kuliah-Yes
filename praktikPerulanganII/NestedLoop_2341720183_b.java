package praktikPerulanganII;
import java.util.Scanner;
public class NestedLoop_2341720183_b {
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
        
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-"+ (i + i) + ": ");
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print(temps[i][j] + " ");
            }
            System.out.println();
        }

        double jmlSuhu=0;
        double[] rata = new double[temps.length];
        for (int i = 0; i < temps.length; i++) {
            for (int j = 0; j < temps[i].length; j++) {
                jmlSuhu = temps[i][j] + jmlSuhu;
            }
            rata[i] = jmlSuhu/temps[i].length;
            jmlSuhu = 0;
        }

        for (int i = 0; i < temps.length; i++) {
            System.err.println("Rata-rata kota-"+(i+1));
            System.out.println(rata[i]);
        }
    }
}
