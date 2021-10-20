package Logic3;

public class Soal5Part2 {
    public static void main (String[] arg) {
        int n = 9;
        int [] payload  =  new int [n];
        int [][] dupPayload  =  new int [(n-1)/2+1][n];
        int val_1 = 0, val_2 = 0, sum = 0;
        for(int k=0; k<payload.length; k++) {
            if (k==0) sum=1;
            else if(k<=(n-1)/2) sum=val_1+val_2;
            else sum = payload[n-k-1];
            payload[k] = sum;
            val_2=val_1;
            val_1=sum;
        }
        for (int i=0; i<=(n-1)/2; i++) {
            for (int j=0; j<i; j++) payload[j] = 0;
            
            for (int w=0; w<n; w++) {
                dupPayload[i][w] = payload[w];
                if (payload[w]!=0) System.out.print(payload[w]);
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=0; i<(n-1)/2; i++) {
            for (int j=0; j<n; j++) {
                if (dupPayload[(n-1)/2-i-1][j]!=0)
                    System.out.print(dupPayload[(n-1)/2-i-1][j]);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
