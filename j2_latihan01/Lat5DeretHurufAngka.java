/*
 * @author Akbar Riyan Nugroho
 * @Created 6-10-2021
 *
 */

package j2_latihan01;

/*
* Mencetak Deret Berpola Sepanjang n
* Jika n = 6
* hasil : 2   A   4   B   6   C
*
* jika n = 8
* hasil : 2   A   4   B   6   C   8   D
* */
import java.util.Scanner;
public class Lat5DeretHurufAngka {
    public static void main(String[] args) {
        Scanner toolInput = new Scanner (System.in);
        System.out.print("Silahkan masukkan nilai n : ");
        int n = toolInput.nextInt();
        toolInput.close();

        char polaHuruf = 'A';

        for (int i=0; i<n; i++) {
            System.out.print(i+2 + " ");
            if (++i<n) System.out.print(polaHuruf++ + " ");
        }
    }
}
