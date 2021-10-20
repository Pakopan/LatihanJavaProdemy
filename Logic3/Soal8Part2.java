package Logic3;


import java.util.Arrays;

public class Soal8Part2 {
    public static void main (String[] arg) {
        int n=9; 
        int[] payload = new int [n];
        for (int i=0; i<n; i++) {
            if (i==0 || i==n-1) Arrays.fill(payload, 1);
            else {
                if (i==2 || i==6) { 
                    Arrays.fill(payload, 3);
                    payload[1] = 0;
                    payload[n-2] = 0;
                }
                else Arrays.fill(payload, 0);
                payload[0] = 1;
                payload[n-1] = 1;
                if (i!=1 && i!=n-2) {
                    payload[2] = 3;
                    payload[n-3] = 3;
                }
                if (i==(n-1)/2) payload[i] = 5;
            }

            for (int item: payload) {
                if (item!=0) System.out.print(item);
                else System.out.print(" ");
            }
            System.out.println();

        }
    }
}
