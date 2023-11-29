import java.util.Scanner;

public class tugas3 {
    public static boolean CekPrimaRekursif(int n, int m){
        if (n < 2){
            return false;
        }

        if (m * m > n){
            return true;
        }
        if (n % m == 0){
            return false;
        }
    return CekPrimaRekursif(n, m + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = sc.nextInt();
        boolean isPrima= CekPrimaRekursif(bilangan, 2);
        System.out.println("Bilangan merupakan bilangan prima: " + isPrima);
    }
}
