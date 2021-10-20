package latihan;

import java.util.Arrays;

public class Logic2Soal7Part2 {
    public static void main (String[] args) {
        int n=9;
        String[] payload = new String [n];
        Arrays.fill(payload, "A");
        int index=0;
        boolean flag= true;

        for (int i=0; i<n; i++) {
            if (i>(n-1)/2 && flag) {
                index=3;
                flag=false;
                Arrays.fill(payload, "B");
            }
            for (int j=0; j<index; j++) {
                payload[j] = " ";
                payload[n-j-1] = " ";
            }
            payload[n-i-1] = "" + (16-i*2);
            payload[i] = "" + (i*2+1);
            
            for (String item:payload) System.out.print(item);
            System.out.println();
            if (i>(n-1)/2) {
                index--;
                Arrays.fill(payload, "B");
            }
            else index++;
        }




    }
    
}
