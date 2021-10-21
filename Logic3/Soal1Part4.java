package Logic3;
import latihan.MethodFile;
import java.util.Arrays;
public class Soal1Part4 {
    void printPattern () {
        MethodFile m = new MethodFile();
        int n = m.getInput();
        String[] payload  = new String [n], mirrorPayload  = new String [n];
        int[] deretFibo = m.getFibonacci(n,0);
        char[] deretHuruf = m.getLetter(n);

        for (int i=0; i<n; i++) {
            Arrays.fill(payload, " ");
            Arrays.fill(mirrorPayload, " ");
            mirrorPayload[i] = Integer.toString(deretFibo[n-i-1]);
            mirrorPayload[n-i-1] = Integer.toString(deretFibo[i]);

            payload[i] = Integer.toString(deretFibo[i]);
            payload[n-i-1] = Integer.toString(deretFibo[n-i-1]);
  
            if (i==(n-1)/2) {
                for (int h=0; h<n; h++) {
                    if (h!=i) {
                        payload[h] = "" + deretHuruf[h];
                        mirrorPayload[h] = "" + deretHuruf[n-h-1];
                    }
                }
            }
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
