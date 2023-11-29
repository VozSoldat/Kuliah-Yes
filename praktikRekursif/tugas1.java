import java.util.Scanner;

public class tugas1 {
    public static int DeretDescendingRekursif(int n){
        if (n==0) {
            return n;
        } else {
            System.out.print(n+", ");
            return DeretDescendingRekursif(n-1);
        }
    }

    public static void DeretDescendingIteratif(int n){
        for (int i = n; i >= 0; i--) {
            System.out.print(i+", ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int p = sc.nextInt();
        System.out.println(DeretDescendingRekursif(p));
        DeretDescendingIteratif(p);
    }
}
