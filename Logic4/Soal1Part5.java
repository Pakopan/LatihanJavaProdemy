package Logic4;

public class Soal1Part5 {
    public static void main (String [] arg) {
        int n1=5, n2=2;
        char [] payload = new char [n1];
        for (int i=0; i<n1; i++) {
            payload[i] = '*';
            for (int h=0; h<n2; h++) 
                for (char item:payload) System.out.print(item);
            System.out.println();
        }
        
    }
}
