package Logic4;
import java.util.Arrays;
public class Soal1Part2 {
    public static void main (String[] arg) {
        int n=5;
        int column = 9;
        int[] payload = new int[column];
        for (int i=0; i<n; i++) {
            Arrays.fill(payload, 0);
            for (int j=0; j<i*2+1; j++) {
                payload[j+(column-1)/2-i] = j+1;
            }
            for (int j=0; j<column; j++) {
                if (payload[j]!=0) System.out.print(payload[j]);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
