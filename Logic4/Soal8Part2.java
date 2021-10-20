package Logic4;

import java.util.Arrays;

public class Soal8Part2 {
    public static void main (String[] arg) {
        int n=9;
        int [] payload = new int[n];
        int [] deret  = new int [n];
        int [][] dupPayload = new int [(n-1)/2+1][n]; 
        for (int i=0; i<n; i++) deret[i] = i*2+1;

        for (int i=0; i<=(n-1)/2; i++) {
            Arrays.fill(payload, 0);
            for (int j=0; j<=i; j++) {
                payload[j+(n-1)/2-i] = deret[j];
                if (j!=i) payload[(n-1)/2+j+1] = deret[i-j-1];
            }
            for (int j=0; j<n; j++) {
                if (payload[j]!=0) System.out.print(payload[j]);
                else System.out.print(" ");
                dupPayload[((n-1)/2)-i][j] = payload[j];
            }
            System.out.println();
        }
        for (int i=1; i<=(n-1)/2; i++) {
            for (int j=0; j<n; j++) {
                if (dupPayload[i][j]!=0) System.out.print(dupPayload[i][j]);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
