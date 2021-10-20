package Logic3;
import java.util.Arrays;

public class Soal9Part2 {
    public static void main (String[] arg) {
        int n=11; 
        int[] payload = new int [n];
        for (int i=0; i<n; i++) {
            if (i==0 || i==n-1 || i==n-3 || i==2){
                Arrays.fill(payload, 1);
                if (i==n-3 || i==2) {
                    payload[1] = 0;
                    payload[n-2] = 0;
                }
            } 
                
            else {
                if (i==4 || i==6 || i==5) { 
                    Arrays.fill(payload, 2);
                    payload[1] = 0;
                    payload[n-2] = 0;
                    payload[3] = 0;
                    payload[n-4] = 0;
                }
                else Arrays.fill(payload, 0);
                payload[0] = 1;
                payload[n-1] = 1;
               
                if (i!=1 && i!=n-2) {
                    payload[2] = 1;
                    payload[n-3] = 1;
                }
                if (i==(n-1)/2) payload[i] = 0;
            }

            for (int item: payload) {
                if (item!=0) System.out.print(item);
                else System.out.print(" ");
            }
            System.out.println();

        }
    }
}
