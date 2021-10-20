package Logic3;
import java.util.Arrays;
public class Soal1Part3 {
    public static void main (String[] arg) {
        int n=9;
        String[] payload  = new String [n];
        String[] mirrorPayload  = new String [n];
        int[] deret = new int [n];
        int val_1 = 0,val_2=0, sum=0;
        for (int i=0; i<n; i++) {
            if (i==0) sum=1;
            else sum=val_1+val_2;
            deret[i] = sum;
            val_2=val_1;
            val_1=sum;
        }

        for (int i=0; i<n; i++) {
            Arrays.fill(payload, " ");
            Arrays.fill(mirrorPayload, " ");
            mirrorPayload[i] = Integer.toString(deret[n-i-1]);
            mirrorPayload[n-i-1] = Integer.toString(deret[i]);

            payload[i] = Integer.toString(deret[i]);
            payload[n-i-1] = Integer.toString(deret[n-i-1]);
  
            if (i==(n-1)/2) {
                int index=0;
                for (int h=0; h<n; h++) {
                    if (h!=i) {
                        payload[h] = ""+(char)(65+index);
                        mirrorPayload[h] = ""+(char)(65+n-index-2);
                        index++;
                    }
                }
            }
            for (int j=0; j<n; j++) System.out.print(payload[j]);
            for (int j=1; j<n; j++) System.out.print(mirrorPayload[j]);
            System.out.println();
        }
    }
    
}
