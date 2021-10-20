package Logic3;
import java.util.Arrays;
public class Soal10Part2 {
    public static void main (String[] arg) {
        int n=11; 
        String[] payload = new String [n];
        for (int i=0; i<n; i++) {
            if (i==0 || i==n-1 || i==n-3 || i==2){
                Arrays.fill(payload, "1");
                if (i==n-3 || i==2) {
                    payload[1] = "A";
                    payload[n-2] = "A";
                }
            } 
                
            else {
                if (i==4 || i==6 || i==5) { 
                    Arrays.fill(payload, "2");
                    payload[3] = "B";
                    payload[n-4] = "B";
                }
                else if (i==3 || i==n-4) Arrays.fill(payload, "B");
                else Arrays.fill(payload, "A");
                payload[0] = "1";
                payload[n-1] = "1";
                payload[1] = "A";
                payload[n-2] = "A";
                if (i!=1 && i!=n-2) {
                    payload[2] = "1";
                    payload[n-3] = "1";
                }
                if (i==(n-1)/2) payload[i] = "C";
            }

            for (String item: payload) {
                System.out.print(item);
            }
            System.out.println();

        }
    }
}
