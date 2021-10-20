package Logic4;

import java.util.Arrays;

public class Soal1Part4 {
    public static void main (String[] arg) {
        int n = 4, dim = 10;
        int numStar=1;
        char[] payload = new char [dim];
        int space =0;

        for (int i=0; i<n; i++) {
            for (int h=0; h<numStar; h++) {
                Arrays.fill(payload, ' ');
                for (int j=1; j<=numStar; j++) {
                    payload[space+j-1] = '*';
                }
                for (char item:payload) System.out.print(item);
                System.out.println();
            }
            space+=numStar;
            numStar++;
        }
        
    }
}
