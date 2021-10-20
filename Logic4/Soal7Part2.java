package Logic4;

import java.util.Arrays;

public class Soal7Part2 {
    public static void main (String[] arg) {
        int n = 5, column = 9;
        int[] payload = new int [column];
        int [] deret = new int [(column-1)/2+1];
        for (int i=0; i<(column-1)/2+1; i++) deret[i] = 2*i+1;
        
        for (int i=0; i<n; i++) {
            Arrays.fill(payload, 0);
            for (int j=0; j<=(column-1)/2-i ; j++) {
                payload[j+i] = deret[j];
                if (j!=(column-1)/2-i) 
                    payload[(column-1)/2+1+j] = deret[deret.length-i-1-j];
            }
            for (int item:payload)  {
                if (item!=0) System.out.print(item);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
