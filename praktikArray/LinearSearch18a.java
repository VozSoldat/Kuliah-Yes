package praktikArray;
import java.util.Scanner;
public class LinearSearch18a {
    public static void main(String[] args) {
        int[] arrayInt;
        int key;
        int hasil= 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah elemen array:");
        arrayInt= new int[sc.nextInt()];

        for (int i = 0; i<arrayInt.length; i++) {
            System.out.println("Masukkan elemen array ke-"+i);
            arrayInt[i] = sc.nextInt();

        }
        
        System.out.println("Masukkan key yang ingin dicari:");
        key = sc.nextInt();

        int i = 0;
        for (; i<arrayInt.length; i++) {
            if (arrayInt[i] == key) {
            hasil = i;
            break;
            }
        }
        if (hasil == i) {
            System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);
        } else {
            System.out.println("Key tidak ditemukan.");
        }
        
    }
}
