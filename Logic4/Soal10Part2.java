package Logic4;

import java.util.Arrays;

public class Soal10Part2 {
    public static void main (String[] arg) {
        int n1=9, n2=2;
        char [] payload = new char [n1], deret  = new char [n1];
        char [][] dupPayload = new char [(n1-1)/2+1][n1]; 
        boolean flag=true;
        for (int i=0; i<=(n1-1)/2; i++) deret[i] = (char)(65+i);

        for (int i=0; i<=(n1-1)/2; i++) {
            Arrays.fill(payload, ' ');
            flag=true;
            for (int j=0; j<=i; j++) {
                payload[j+(n1-1)/2-i] = deret[j];
                if (j!=i) payload[(n1-1)/2+j+1] = deret[i-j-1];
            }
            for (int cpy=0; cpy<n2; cpy++) {
                for (int j=0; j<n1; j++) {
                    if (cpy>0 && j==0) System.out.print("");
                    else System.out.print(payload[j]);
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
                    else System.out.print(dupPayload[i][j]);
                }
            }
            System.out.println();
        }
    }
}
