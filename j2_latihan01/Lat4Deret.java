/*
 * @author Akbar Riyan Nugroho
 * @Created 6-10-2021
 *
 */

package j2_latihan01;

/*
* Mencetak Deret Berpola Sepanjang n
* Jika n = 6
* hasil : 2   3   4   6   6   9
*
* jika n = 8
* hasil : 2   3   4   6   6   9   8   12
* */
import java.util.Scanner;
public class Lat4Deret {
    public static void main(String[] args) {
        Scanner tool_input = new Scanner (System.in);
        System.out.print("Silahkan masukkan nilai n : ");
        int n = tool_input.nextInt();
        tool_input.close();

        int pola2=3;

        for (int i=0; i<n; i++) {
            System.out.print(i+2 + " ");
            if (++i<n) {
               System.out.print(pola2 + " ");
               pola2+=3;
            }
        }
    }
}
