package Logic3;

public class Soal6Part2 {
    public static void main (String[] arg) {
        int n =9; 
        String [] payload  = new String [n];
        int val_1=0, val_2=0, sum=0;
        int [] deret =  new int [n];
        
        for (int i=0; i<n; i++) {
            if (i==0) sum = 1;
            else sum=val_1+val_2;
            deret[i] = sum;
            val_2 = val_1;
            val_1 = sum;
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<i; j++) payload[j] = "D";
            for (int w=i+1; w<n-1-(i*2); w++) payload[w] = "A";
            for (int j=0; j<i; j++) payload[n-j-1] = "B";
            for (int j=n-i; j<=i; j++) payload[j] = "C";

            payload[i] = Integer.toString(deret[i]);
            payload[n-i-1] = Integer.toString(deret[n-i-1]);
            for (String item:payload)
                System.out.print(item);
            System.out.println();
        }
    }
}
