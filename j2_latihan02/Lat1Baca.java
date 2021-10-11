/*
 * @author Akbar Riyan Nugroho
 * @Created 9-10-2021
 *
 */

package j2_latihan02;

/*
* Membuat baris code untuk membaca inputan berupa kalimat
* 1. Hitung jumlah huruf dalam kalimat tersebut
* 2. Hitung jumlah kata dalam kalimat tersebut
* 3. Hitung jumlah huruf vokal dalam kalimat tersebut
* */

import java.util.Scanner;
import java.util.regex.*;
public class Lat1Baca {
    public static void main(String[] args) {
        Scanner toolInput = new Scanner (System.in);
        System.out.println("Silahkan masukkan kalimat : ");
        String input = toolInput.nextLine();
        toolInput.close();

        Pattern pattern = Pattern.compile("[AIOUEOaiueo]");
        Matcher matcher = pattern.matcher(input);
        String [] inputSplit  = input.split(" ");
        
        int totalLetter = 0;
        int totalVowels = 0;
        for (String child:inputSplit) totalLetter+=child.length();
        while (matcher.find()) totalVowels++;
        System.out.println("Jumlah huruf : " + totalLetter);
        System.out.println("Jumlah kata : " + inputSplit.length);
        System.out.println("Jumlah huruf vokal : " + totalVowels);
        /*Gunakan Scanner agar kalimat dinamis*/
    }
}
