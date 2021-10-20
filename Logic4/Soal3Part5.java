package Logic4;

import java.util.Scanner;

public class Soal3Part5 {
    public static void main (String [] arg) {
        Scanner toolInput = new Scanner (System.in);
        System.out.println("Silahkan masukkan nilai n2 : ");
        int n1=5, n2 = toolInput.nextInt();
        toolInput.close();
        char [][] payload = new char [n1][n1];
        for (int i=0; i<n1; i++) for (int j=0; j<=i; j++) payload[i][j] = '*';

        for (int i=0; i<n1; i++) {
            for (int loop=0; loop<n2; loop++) {
                for (int j=0; j<n1; j++) {
                    if (loop%2==0) System.out.print(payload[i][j]);
                    else System.out.print(payload[n1-i-1][n1-j-1]);
                }
            }
            System.out.println();
        }
    }
}
