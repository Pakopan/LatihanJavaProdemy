package latihan;

import java.util.Arrays;

public class Logic2Soal6Part2 {
    public static void main (String[] args) {
        int n = 9;
        int[] payload = new int[n];
        Arrays.fill(payload, -100);
        for (int j=1; j<=n; j++) {
            for (int i=1; i<=j; i++) {
                payload[n-i] = 16-(j-1)*2;
            }
            for (int item:payload) {
                if (item!=-100) System.out.print(item);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
