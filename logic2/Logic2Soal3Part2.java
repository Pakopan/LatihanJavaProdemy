package latihan;
import java.util.Arrays;

public class Logic2Soal3Part2 {
    public static void main (String[] args) {
        int n = 9;

        int [] payload  = new int [n];
        for (int i=0; i<n; i++) {
            Arrays.fill(payload, -100);
            payload[n-i-1] = 16-2*i;
            payload[i] = 2*i+1;
            for (int item:payload) {
                if (item!=-100) System.out.print(item);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
