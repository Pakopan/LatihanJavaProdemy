package Logic4;

import java.util.Arrays;

public class Soal1Part1 {
    public static void main (String[] arg) {
        int n=9;
        int[] payload = new int[n];
        int[][]dupPayload = new int [(n-1)/2+1][n];
        for (int i=0; i<=(n-1)/2; i++) {
            Arrays.fill(payload, 0);
            for (int j=0; j<i*2+1; j++) {
                payload[j+(n-1)/2-i] = j+1;
            }
            for (int j=0; j<n; j++) {
                if (payload[j]!=0)  {
                    System.out.print(payload[j]);
                }
                else System.out.print(" ");
                dupPayload[dupPayload.length-1-i][j]=payload[j];
            }
            System.out.println();
        }

        for (int j=1; j<dupPayload.length; j++) {
            for (int i=0; i<n; i++) {
                if (dupPayload[j][i]!=0) System.out.print(dupPayload[j][i]);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
