package latihan;

import java.util.Arrays;

public class Logic2Soal8Part2 {
    public static void main (String[] args) {
        int n=9;
        String[] payload = new String [n];
        Arrays.fill(payload, " ");
        for (int i=0; i<=(n-1)/2; i++) {
            for (int j=1; j<=i; j++) {
                payload[j-1] = "A";
                payload[n-j] = "B";
            }
            payload[n-i-1] = "" + (16-2*i);
            payload[i] = "" + (2*i+1);
            for (String item:payload) {
                System.out.print(item);
            }
            System.out.println();
        }
        for (int i=0; i<(n-1)/2; i++) {
            Arrays.fill(payload, " ");
            for (int j=0; j<(n-1)/2-1-i; j++) {
                payload[j] = "A";
                payload[n-1-j] = "B";
            }
            payload[5+i] = "" + (11+2*i);
            payload[3-i] = "" + (6-2*i);
            for (String item:payload) {
                System.out.print(item);
            }
            System.out.println();
        }
    }
}
