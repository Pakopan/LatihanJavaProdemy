package latihan;
import java.util.Arrays;
public class Logic2Soal10Part2 {
    public static void main (String[] arg) {
        int n=9;
        int [] payload = new int [n];
        for (int i=0; i<=(n-1)/2; i++) {
            Arrays.fill(payload, i*2);
            for (int item:payload) System.out.print(item);
            System.out.println();
        }
        for (int i=0; i<(n-1)/2; i++) {
            Arrays.fill(payload, 6-i*2);
            for (int item:payload) System.out.print(item);
            System.out.println();
        }
    }
}
