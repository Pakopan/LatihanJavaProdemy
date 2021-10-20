package latihan;

import java.util.Arrays;

public class Logic2Soal2Part2 {
    public static void main (String[] args) {
        int n=9;
        int [] payload = new int[n];

        for (int i=0; i<n; i++) {
            Arrays.fill(payload, 0);    
            payload[n-i-1] = 16-2*i;
            for (int item:payload) {
                if (item!=0) System.out.print(item);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
