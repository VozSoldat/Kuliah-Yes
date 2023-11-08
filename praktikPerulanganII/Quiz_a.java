package praktikPerulanganII;
import java.util.Scanner;
import java.util.Random; 
public class Quiz_a {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random.nextInt(10) +1;
            boolean success = false;
            do {
                System.out.println("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                if (answer < number) {
                    System.out.println("Jawaban Anda lebih kecil dari bilangan yang benar.");
                } else if (answer > number) {
                    System.out.println("Jawaban Anda lebih besar dari bilangan yang benar.");
                }
                success=(answer == number);
            } while (!success);
            System.out.println("Apakah Anda ingin mengulang permainan(Y/y)?");
            menu = input.nextLine().charAt(0);
        } while (menu=='y' || menu=='Y');

    }
}