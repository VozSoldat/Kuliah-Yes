import java.util.Scanner;
public class UcapanTerimaKasih_18a {

    public static String penerimaUcapan () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan nama orang yang ingin anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void ucapanTerimaKasih() {
        String nama = penerimaUcapan();
        System.out.println("Thank you "+nama+" for being the best teacher in the world.\n"+ 
        "You inspired in me for learning and made me a love for learning and made me feel like i could ask you anything.");
    }
    public static void ucapanTambahan(String tambahan) {
        System.out.println(tambahan);
    }
    public static void main(String[] args) {
        ucapanTerimaKasih();
        String ucapan = "Terimakasih Pak... Bu... Semoga Sehat Selalu";
        ucapanTambahan(ucapan);
    }
}
