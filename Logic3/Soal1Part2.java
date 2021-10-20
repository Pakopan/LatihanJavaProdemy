package Logic3;

public class Soal1Part2 {
    public static void main (String[] arg) {
        int val_1=0, val_2=0, sum=0;
        int n = 9;
        for (int i=0; i<n; i++) {
            if (i==0) sum = 1;
            else sum = val_1+val_2;
            System.out.print (sum + " ");
            val_2=val_1;
            val_1=sum;
        }
    }
}
