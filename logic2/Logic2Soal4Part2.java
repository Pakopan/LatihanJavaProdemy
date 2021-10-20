package latihan;

import java.util.Arrays;

public class Logic2Soal4Part2 {
    public static void main (String[] args) {
        int n = 9;
        
        int [] payload = new int [n];
        for (int i=0; i<n; i++) {
            Arrays.fill(payload, -100);
            payload [n-i-1] = 16-2*i;
            payload [(n-1)/2] = i*2+1;
            payload[i] = i*2+1;
            if (i==(n-1)/2) {
                for (int l=0; l<n; l++) {
                    if (l!=(n-1)/2) System.out.print(l*2); 
                }
            } 
            else{
                for (int item:payload) {
                    if (item!=-100) System.out.print(item);
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
