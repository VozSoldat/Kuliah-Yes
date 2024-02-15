/**
 * Pseudocode2
 */
public class Pseudocode2 {

    public static void main(String[] args) {
        short[] film = {1,2,3,4};
        int[][] rating = {{4,1,1},{3,1,2},{4,2,3,},{4,3,4}};
        double[] rata = new double[4];
        

        for (int i = 0; i < rating.length; i++) {
            double jumlah = 0;
            for (int j = 0; j < rating[i].length; j++) {
                jumlah += rating[i][j];
            }
            rata[i] = jumlah/3;
        }
        
        for (int i = 0; i < rata.length; i++) {
            System.out.println(rata[i]);
        }
        int iTertinggi = 0;
        int iTerendah = 0;
        for (int i = 0; i < 3; i++) {
            if (rata[i]<rata[i+1]) {
                iTertinggi = i+1;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (rata[i]>rata[i+1]) {
                iTerendah = i+1;
            }
        }
        System.out.println("Film dengan rata-rata rating terbesar adalah film ke-"+film[iTertinggi]);
        System.out.println("Film dengan rata-rata rating terendah adalah film ke-"+film[iTerendah]);

    }
}