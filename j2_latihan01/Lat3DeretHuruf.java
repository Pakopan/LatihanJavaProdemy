/*
 * @author Akbar Riyan Nugroho
 * @Created 6-10-2021
 *
 */

package j2_latihan01;

/*
* Mencetak Deret Huruf Sepanjang n
* Jika n = 6
* hasil : A  B   C   D   E   F
*
* jika n = 3
* hasil : A   B   C
* */
import java.util.Scanner;
public class Lat3DeretHuruf {
    public static void main(String[] args) {
        Scanner tool_input = new Scanner (System.in);
        System.out.print("Silahkan masukkan nilai n : ");        
        int n = tool_input.nextInt();
        tool_input.close();

        for (int i=0; i<n; i++) System.out.print((char)(65+i) + " ");

    }
}
