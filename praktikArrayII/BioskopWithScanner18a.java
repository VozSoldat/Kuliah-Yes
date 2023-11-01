package praktikArrayII;
import java.util.Scanner;
public class BioskopWithScanner18a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
        System.out.println("Silakan pilih menu:\n- Input data penonton (1).\n- Daftar penonton (2).\n- Exit (3).");
        menu = sc.nextInt();
            switch (menu) {
                case 1:
                do {
                    while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.next();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if(penonton[baris-1][kolom-1]==null){
                        penonton[baris-1][kolom-1] = nama;
                        break;
                    } else {
                        System.out.println("Kursi "+baris+","+kolom+" sudah terisi.\nSilakan coba lagi.");
                    }
                
                    }
                
                System.out.print("Input penonton lainnya? (y/n): ");
                next = sc.nextLine();
                
                }while (next.equalsIgnoreCase("y"));
                    break;
                case 2:
                System.out.println("Daftar penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                            }
                        }
                    }
                    break;
                case 3:
                System.out.println("Terima kasih.");
                System.exit(0);
                    break;
                default:
                System.out.println("Input tidak valid.\nSilakan coba lagi.");
                    break;
            }
        }
    }
}