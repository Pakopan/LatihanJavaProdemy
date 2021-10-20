package Logic4;
import java.util.Arrays;
public class Soal4part2 {
    public static void main (String[] arg) {
        int n=5;
        int column = 9;
        char[] payload = new char[column];
        for (int i=0; i<n; i++) {
            Arrays.fill(payload, ' ');
            for (int j=0; j<i*2+1; j++) {
                payload[j+(column-1)/2-i] = (char)(65+j);
            }
            for (int j=0; j<column; j++) {
                System.out.print(payload[j]);
            }
            System.out.println();
        }
    }
}


