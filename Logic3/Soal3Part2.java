package Logic3;

public class Soal3Part2 {
    public static void main (String[] arg) {
        int val_1 = 0, val_2 = 0, sum = 0;
        int n = 9;
        int [] dupPayload = new int [(n-1)/2+1];
        for (int i=0; i<=(n-1)/2; i++) {
            if (i==0) sum=1;
            else sum = val_1+val_2;
            System.out.print(sum + " ");
            dupPayload[(n-1)/2-i] = sum;
            val_2 = val_1;
            val_1 = sum;
        }
        for (int i=0; i<dupPayload.length-1; i++) {
            System.out.print(dupPayload[i+1]+ " ");
        }
        
    }
}
