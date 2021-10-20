package latihan;

import java.util.Arrays;

public class Logic2Soal1Part3 {
    public static void main (String[] arg) {
        int n = 9;
        int [] payload  = new int[n];
        int val_2 = 1, val_1 = 1;
        int [] patok = new int [n];
        int indexPatok = 1;
        for (int i=0; i<n; i++) {
            Arrays.fill(payload,0);
            if (i==0 || i==1) payload [(n-1)/2] = 1;
            else {
                payload [(n-1)/2] = val_2+val_1;
                val_1 = val_2;
                val_2 = payload [(n-1)/2];
            }
            patok[i] = payload [(n-1)/2];
            if (i>(n-1)/2) {
                payload[n-i-1] = patok[(n-1)/2-indexPatok];
                payload[i] = patok[(n-1)/2-indexPatok];
                indexPatok++;
            }
            for (int item:payload){
                if (item!=0) System.out.print(item);
                else System.out.print(" ");
            }

            System.out.println();
        }
    }
}
