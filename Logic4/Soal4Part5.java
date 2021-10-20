package Logic4;

public class Soal4Part5 {
    
    public static void main (String [] arg) {
        int n1=5, n2 = 3;
        char [][] payload = new char [n1*2][n1];
        for (int i=0; i<n1*2; i++) {
            for (int j=0; j<n1; j++) {
                payload[i][j] =' ';
            }
        }
        for (int i=0; i<n1; i++) for (int j=0; j<=i; j++) payload[i][j] = '*';

        for (int i=0; i<n1*2; i++) {
            for (int loop=0; loop<n2; loop++) {
                for (int j=0; j<n1; j++) {
                    if (loop%2==0) System.out.print(payload[i][j]);
                    else System.out.print(payload[n1*2-i-1][n1-j-1]);
                }
            }
            System.out.println();
        }        
    }
}
