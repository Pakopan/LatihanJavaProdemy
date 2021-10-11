/*
 * @author Akbar Riyan Nugroho
 * @Created 9-10-2021
 *
 */

package j2_latihan02;

/*
* Membuat baris code untuk membaca inputan berupa kalimat
* 1. Ubah huruf vokal menjadi angka berurutan
*   contoh : akbar riyan nugroho menjadi 1kb2r r3y4n n5gr6h7
* 2. Ubah huruf ditengah kata menjadi bintang
*   contoh : akbar riyan nugroho menjadi a***r r***n n*****o
* 3. ubah/memastikan huruf depan kata dalam suatu kalimat adalah huruf besar, sisanya huruf kecil
*   contoh : akBar riyAn Nugroho menjadi Akbar Riyan Nugroho
* 4. membalikkan urutan kata suatu kalimat
*   contoh : akbar riyan nugroho menjadi nugroho riyan akbar
* */

import java.util.Scanner;
import java.util.regex.*;
public class Lat2Baca {
    public static void main(String[] args) {
        Scanner toolInput = new Scanner (System.in);
        System.out.println("Silahkan masukkan kalimat :");
        String input = toolInput.nextLine();
        toolInput.close();

        Pattern pattern  = Pattern.compile("[AIUEOaiueo]");

        String [] inputSplitIndv  = input.split("");
        String output = "";
        int num=0;

        for (int i=0; i<input.length(); i++){
            Matcher matcher = pattern.matcher(inputSplitIndv[i]);
            if (matcher.matches()) inputSplitIndv[i]=Integer.toString(++num);
        }
        for (String child:inputSplitIndv) output+=child;
        System.out.println(output);
        //=====================================================
        String [] outputArray  = new String [input.length()];
        String [] inputSplitSpace = input.split(" ");
        int index = 0;
        for (String child:inputSplitSpace){
            String[] childSplit = child.split("");
            for (int i=0; i<childSplit.length; i++){
                if (i==0 || i==childSplit.length-1)
                outputArray[index++]=childSplit[i];
                else outputArray[index++]="*";
            }
            if (index+2<=outputArray.length) outputArray[index++]=" ";
        }
        output="";
        for (String i:outputArray) output+=i;
        System.out.println(output);
        //=========================================================
        output="";
        for (String child:inputSplitSpace) {
            output+=child.substring(0,1).toUpperCase();
            output+=child.substring(1).toLowerCase();
            output+=" ";
        }
        System.out.println(output);
        //=========================================================
        output="";
        for (int i=0; i<inputSplitSpace.length; i++) 
            output+=inputSplitSpace[inputSplitSpace.length-1-i]+" ";
        System.out.println(output);
    }
}
