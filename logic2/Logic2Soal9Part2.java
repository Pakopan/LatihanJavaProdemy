package latihan;

public class Logic2Soal9Part2 {
    public static void main (String[] args) {
        int n=9;
        int[] payload = new int [n];
        for (int i=0; i<=(n-1)/2; i++) {
            payload[i] = i*2+1;
            payload[n-i-1] = i*2+1;
        }
        for (int i=0; i<n; i++) {
            for (int item:payload) {
                System.out.print(item);
            }
            System.out.println();
        }
    }
}
