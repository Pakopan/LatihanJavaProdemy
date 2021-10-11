/*
 * @author Akbar Riyan Nugroho
 * @Created 9-10-2021
 *
 */

package j4_latihan01;

import java.util.Scanner;
import java.util.regex.*;

class MethodBox2 {
    void sumLetter (String input) {
        int total = 0;
        String[] inputSplit = input.split(" ");
        for (String child:inputSplit) total+=child.length();
        System.out.println("Total huruf = " + total);
    }
    void sumWord (String input) {
        String[] inputSplit = input.split(" ");
        System.out.println("Total kata = " + inputSplit.length);
    }
    void sumVowels (String input) {
        int total = 0;
        Pattern pattern = Pattern.compile("[AIUEOaiueo]");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) total++;
        System.out.println("Total huruf vokal = " + total);
    }

    void vocal2Num (String input) {
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
    }

    void starWord (String input) {
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
        String output="";
        for (String i:outputArray) output+=i;
        System.out.println(output);
    }
    void kapitalisasi (String input) {
        String output = "";
        String [] inputSplitSpace = input.split(" ");
        for (String child:inputSplitSpace) {
            output+=child.substring(0,1).toUpperCase();
            output+=child.substring(1).toLowerCase();
            output+=" ";
        }
        System.out.println(output);
    }
    void reverseSentence (String input) {
        String output="";
        String [] inputSplitSpace = input.split(" ");
        for (int i=0; i<inputSplitSpace.length; i++) 
            output+=inputSplitSpace[inputSplitSpace.length-1-i]+" ";
        System.out.println(output);
    }
}

public class Lat2Method {

    public static void main(String[] args) {
        Scanner toolInput = new Scanner (System.in);
        MethodBox2 metode = new MethodBox2();
        System.out.println("Silahkan masukkan Kalimat yang ingin diproses :");
        String input = toolInput.nextLine();
        toolInput.close();

        metode.sumLetter(input);
        metode.sumWord(input);
        metode.sumVowels(input);
        metode.vocal2Num(input);
        metode.starWord(input);
        metode.kapitalisasi(input);
        metode.reverseSentence(input);
    }
}
