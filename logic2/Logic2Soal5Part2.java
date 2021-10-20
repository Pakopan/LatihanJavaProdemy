package latihan;

public class Logic2Soal5Part2 {
    public static void main (String[] args) {
        int n=9;
        int [] payload = new int [n];
        for (int i=0; i<n; i++) {
            payload[i] = 2*i+1;
            for (int item:payload) {
                if (item!=0) System.out.print(item);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
