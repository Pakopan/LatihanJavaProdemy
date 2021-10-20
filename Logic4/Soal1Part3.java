package Logic4;


import java.util.Arrays;
public class Soal1Part3 {
    public static void main (String[] arg) {
        int n=9;
        int val_1=0, val_2=1, sum=0;
        String [] payload = new String[n], dupPayload = new String [n-1];
        int [] fibonacci= new int [n];
        char [] letter = new char [n];
        for (int i=0; i<n; i++) {
            if (i==0) sum=1;
            else sum = val_1+val_2;
            fibonacci[i] = sum;
            val_2=val_1;
            val_1=sum;
            letter[i] = (char)(65+i);
        }

        for (int i=0; i<n; i++) {
            Arrays.fill(payload, " ");
            payload[i] = "" + fibonacci[i];
            payload[n-i-1] = "" + fibonacci[n-i-1];

            for (int j=0; j<=(n-1)/4-i; j++) {
                payload[j+2+i] = "" + letter[j];
                if (j!=(n-1)/4-i) 
                   payload[n-3-j-i] = "" + letter[j];
            }
            //bawah
            for (int j=0; j<=i-6; j++) {
                payload[n-i+1+j] = "" + letter[j];
                if (j!=i-3*(n-1)/4) 
                   payload[i-2-j] = "" + letter[j];
            }

            if (i<=(n-1)/2) {
                for (int j=0; j<=i-2; j++)
                    payload[j] = "" + letter[i-2-j];
            } else {
                for (int j=0; j<=6-i; j++) {
                    payload[j] = "" + letter[6-i-j];
                }
            }

            for (int h=0; h<n; h++) {
                if (h!=0) dupPayload[h-1] = payload[n-h-1];
                System.out.print(payload[h]);
            }

            for (int h=0; h<n-1; h++) {
                System.out.print(dupPayload[h]);
            }
            System.out.println();
            
        }

    }
}
