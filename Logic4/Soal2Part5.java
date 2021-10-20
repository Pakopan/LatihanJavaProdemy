package Logic4;

import java.util.Scanner;
public class Soal2Part5 {
    
    public static void main (String [] arg) {
        Scanner toolInput = new Scanner (System.in);
        System.out.println("Silahkan masukkan nilai n2 : ");
        int n1=5, n2 = toolInput.nextInt();
        toolInput.close();
        char [] payload = new char [n1];
        for (int i=0; i<n1; i++) {
            payload[i] = '*';
            for (int h=0; h<n2; h++) 
                if (h%2==0) for (char item:payload) System.out.print(item);
                else {
                    for (int j=0; j<n1; j++) System.out.print(payload[n1-j-1]);
                }
            System.out.println();
        }
        
    }
}
