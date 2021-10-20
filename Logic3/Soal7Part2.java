package Logic3;
import java.util.Arrays;

public class Soal7Part2 {
    public static void main (String[] arg) {
        int n = 9;
        int[] payload = new int [n];
        for (int i=0; i<n; i++) {
            Arrays.fill(payload,1);
            if (i>=(n-1)/4 && i<n-2) {
                for (int j=0; j<(n-1)/2+1; j++) {
                    payload[j+(n-1)/4] = 2;
                }
            }
            if (i>(n-1)/4 && i<n-3) {
                for (int j=0; j<(n-1)/2-1; j++) {
                    payload[j+(n-1)/4+1] = 3;
                }
            }
            if (i==(n-1)/2) payload[i] = 1;
            for (int item:payload)
                System.out.print(item);
            
            System.out.println();
        }
    }
}
