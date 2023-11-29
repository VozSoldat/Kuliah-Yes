import java.util.Scanner;

public class tugas2 {
    public static int PenjumlahanRekursif(int n){
        if (n==1) {
            return n;
        } else {
            return (n+PenjumlahanRekursif(n-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int p = sc.nextInt();
        for (int i = 1; i <= p  ; i++) {
            if (i == p) {
                System.out.print(p+"=");
            } else {
                System.out.print(i+"+");
            }
        }
        System.out.println(PenjumlahanRekursif(p));        
    }
}
