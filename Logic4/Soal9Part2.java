package Logic4;

import java.util.Arrays;
public class Soal9Part2 {
    public static void main (String[] arg) {
        int n1=9, n2=2;
        int [] payload = new int[n1], deret  = new int [n1];
        int [][] dupPayload = new int [(n1-1)/2+1][n1]; 
        boolean flag=true;
        for (int i=0; i<=(n1-1)/2; i++) deret[i] = i*2+1;

        for (int i=0; i<=(n1-1)/2; i++) {
            Arrays.fill(payload, 0);
            flag=true;
            for (int j=0; j<=i; j++) {
                payload[j+(n1-1)/2-i] = deret[j];
                if (j!=i) payload[(n1-1)/2+j+1] = deret[i-j-1];
            }
            for (int cpy=0; cpy<n2; cpy++) {
                for (int j=0; j<n1; j++) {
                    if (cpy>0 && j==0) System.out.print("");
                    else {
                        if (payload[j]!=0) System.out.print(payload[j]);
                        else System.out.print(" ");
                    }
                    if (flag) dupPayload[((n1-1)/2)-i][j] = payload[j];
                }
                flag=false;
            }
            System.out.println();
        }
        for (int i=1; i<=(n1-1)/2; i++) {
            for (int cpy=0; cpy<n2; cpy++) {
                for (int j=0; j<n1; j++) {
                    if (cpy>0 && j==0) System.out.print("");
                    else {
                        if (dupPayload[i][j]!=0) System.out.print(dupPayload[i][j]);
                        else System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
