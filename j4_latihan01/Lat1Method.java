/*
 * @author Akbar Riyan Nugroho
 * @Created 9-10-2021
 *
 */

package j4_latihan01;

/*
* Buatlah suatu class yang berisikan method-method sesuai dengan j2_latihan01
* */
import java.util.Scanner;
class MethodBox {
    public void deretGanjil (int n){
        for(int i=0; i<n; i++) System.out.printf("%d ", 2*i+1);
        System.out.println();
    }

    //
    public void deretGenap (int n){
        for (int i=0; i<n; i++) System.out.printf("%d ", 2*i+2);
        System.out.println();
    }

    public void deretHuruf (int n) {
        for (int i=0; i<n; i++) System.out.printf("%c ", 65+i);
        System.out.println();
    }

    public void deretBerpola (int n) {
        int pola2 = 3;
        for (int i=0; i<n; i++) {
            System.out.printf("%d ", i+2);
            if (++i<n) System.out.printf("%d ", pola2);
            pola2+=3;
        }
        System.out.println();
    }

    public void deretHurufAngka (int n) {
        char pola2='A';
        for (int i=0; i<n; i++) {
            System.out.printf("%d ", i+2);
            if (++i<n) System.out.printf("%c ", pola2++);
        }
        System.out.println();
    }
}

public class Lat1Method {
    public static void main(String[] args) {
        Scanner toolInput = new Scanner(System.in);
        System.out.println("Silahkan masukkan nilai n:");
        int n = toolInput.nextInt();
        toolInput.close();

        MethodBox metode = new MethodBox();
        metode.deretGanjil(n);
        metode.deretGenap(n);
        metode.deretHuruf(n);
        metode.deretBerpola(n);
        metode.deretHurufAngka(n);
    }
}
