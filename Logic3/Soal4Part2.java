package Logic3;

public class Soal4Part2 {
    public static void main (String [] arg) {
        int n = 9;
        int val_1 = 0, val_2 = 0, val_3 = 0, sum = 0;
        int [] dupPayload = new int  [(n-1)/2+1];
        for (int i=0; i<=(n-1)/2; i++) {
            if (i<3) sum=1;
            else sum = val_1+val_2+val_3;
            dupPayload[(n-1)/2-i] = sum;
            System.out.print(sum+ " ");
            val_3=val_2;
            val_2=val_1;
            val_1=sum;
        }
        for (int i=0; i<dupPayload.length-1; i++) {
            System.out.print(dupPayload[i+1] + " ");
        }
    }
}
