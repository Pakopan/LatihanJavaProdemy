package Logic3;

public class Soal2Part2 {
    public static void main (String[] arg) {
        int n = 9;
        int val_1 = 0, val_2 = 0, val_3 = 0, sum=0;
        for (int i=0; i<n; i++) {
            if (i<=2) sum = 1;
            else sum = val_1+val_2+val_3;
            System.out.print(sum + " ");
            val_3 = val_2;
            val_2 = val_1;
            val_1 =sum;
        }
    }
}
