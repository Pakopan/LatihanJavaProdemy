package Logic3;
import java.util.Arrays;

import latihan.MethodFile;
public class Soal1Part3 {

    void printPattern () {
        MethodFile m = new MethodFile();
        int n = m.getInput();
        String[] payload  = new String [n], mirrorPayload  = new String [n];
        int[] deretFibo = m.getFibonacci(n,0);

        for (int i=0; i<n; i++) {
            Arrays.fill(payload, " ");
            Arrays.fill(mirrorPayload, " ");
            mirrorPayload[i] = Integer.toString(deretFibo[n-i-1]);
            mirrorPayload[n-i-1] = Integer.toString(deretFibo[i]);

            payload[i] = Integer.toString(deretFibo[i]);
            payload[n-i-1] = Integer.toString(deretFibo[n-i-1]);
  
            for (int j=0; j<n; j++) System.out.print(payload[j]);
            for (int j=1; j<n; j++) System.out.print(mirrorPayload[j]);
            System.out.println();
        }
    }
    public static void main (String[] arg) {
        Soal1Part3 s = new Soal1Part3();
        s.printPattern();
    }
    
}
