/*
 * @author Akbar Riyan Nugroho
 * @Created 9-10-2021
 *
 */

package j4_latihan01;

/*
 * Buat aplikasi untuk menjalankan method yang terdapat di Lat1Method dan Lat2Method
 * 1. User diminta untuk memasukkan jenis method yang akan dijalankan
 * 2. Setelah selesai, User diberi pilhan apakah akan menjalankan method lain atau mengakhiri aplikasi
 *       Jika ya, kembali ke alur diatas
 *       Jika tidak, aplikasi berhenti
 * */

import java.util.Scanner;

class MethodBox3 {
    int openingScene (Scanner toolInput) {
        int mode = 0;
        System.out.println("Silahkan masukkan Mode yang ingin dikerjakan / dicetak :");
        System.out.printf("1. Deret Ganjil\n2. Deret Genap\n3. Deret Huruf\n4. Deret Berpola\n5. Deret Huruf Angka\n6. Jumlah huruf\n");
        System.out.printf("7. Jumlah kata\n8. Jumlah huruf vokal\n9. Huruf vokal ke nomor\n10. Star Word\n11. Kapitalisasi\n12. Reverse\n");
        while(true) {
            while (mode==0) mode=toolInput.nextInt();
            if (mode>12 || mode<=0){
                System.out.println("=========================================");
                System.out.println("Masukan anda invalid, silahkan coba lagi.");
                System.out.println("=========================================");
                mode=0;
            }else break;
        }        
        return mode;
    }
    
    String inputScene (Scanner toolInput) {
        String n = "";
        while(true) {
            System.out.print("Masukkan input (nilai n atau kalimat) yang ingin diproses : ");
            while(n.equals("")) n=toolInput.nextLine(); 
          break;
        }
        return n;
    }

    String closingScene (Scanner toolInput) {
        String exitStatement  = "";
        while(true){
            exitStatement="";
            System.out.println("Apakah ingin mencetak deret yang lain ? (Y/N)");
            while(exitStatement.equals("")) {
                exitStatement=toolInput.nextLine();
                if (exitStatement.equals("Y")||exitStatement.equals("N")){
                    break;   
                } else {
                    System.out.println("=========================================");
                    System.out.println("Masukan anda invalid, silahkan coba lagi.");
                    System.out.println("=========================================");
                    exitStatement="";
                }
            }
            if (exitStatement.equals("Y")||exitStatement.equals("N")) break;
        }
        return exitStatement;
    }

    String evenPattern (Scanner toolInput) {
        String exitStatement = "";
        MethodBox metode = new MethodBox();

        while(true){
            String n = inputScene(toolInput);
            System.out.println("Hasil : ");
            metode.deretGenap(Integer.parseInt(n));
            
            exitStatement = closingScene(toolInput);
            break;
        }
        return exitStatement;
    }

    String oddPattern (Scanner toolInput) {
        String exitStatement = "";
        MethodBox metode = new MethodBox();

        while(true){
            String n = inputScene(toolInput);
            System.out.println("Hasil : ");
            metode.deretGanjil(Integer.parseInt(n));
            
            exitStatement = closingScene(toolInput);
            break;
        }
        return exitStatement;
    }

    String letterPattern (Scanner toolInput) {
        String exitStatement = "";
        MethodBox metode = new MethodBox();

        while(true){
            String n = inputScene(toolInput);
            System.out.println("Hasil : ");
            metode.deretHuruf(Integer.parseInt(n));
            
            exitStatement = closingScene(toolInput);
            break;
        }
        return exitStatement;
    }

    String specialPattern (Scanner toolInput) {
        String exitStatement = "";
        MethodBox metode = new MethodBox();

        while(true){
            String n = inputScene(toolInput);
            System.out.println("Hasil : ");
            metode.deretBerpola(Integer.parseInt(n));
            exitStatement = closingScene(toolInput);
            break;
        }
        return exitStatement;
    }

    String letterNumber (Scanner toolInput) {
        String exitStatement = "";
        MethodBox metode = new MethodBox();
        while(true){
            String n = inputScene(toolInput);
            System.out.println("Hasil : ");
            metode.deretHurufAngka(Integer.parseInt(n));
            exitStatement = closingScene(toolInput);
            break;
        }
        return exitStatement;
    }

    String sumLetter (Scanner toolInput){
        String exitStatement = "";
        MethodBox2 metode = new MethodBox2();

        while(true){
            String n = inputScene(toolInput);
            System.out.println("Hasil : ");
            metode.sumLetter(n);
            exitStatement = closingScene(toolInput);
            break;
        }
        return exitStatement;
    }

    String sumWord (Scanner toolInput){
        String exitStatement = "";
        MethodBox2 metode = new MethodBox2();

        while(true){
            String n = inputScene(toolInput);
            System.out.println("Hasil : ");
            metode.sumWord(n);
            exitStatement = closingScene(toolInput);
            break;
        }
        return exitStatement;
    }

    String sumVowels (Scanner toolInput){
        String exitStatement = "";
        MethodBox2 metode = new MethodBox2();

        while(true){
            String n = inputScene(toolInput);
            System.out.println("Hasil : ");
            metode.sumVowels(n);
            exitStatement = closingScene(toolInput);
            break;
        }
        return exitStatement;
    }
    
    String vocal2Num (Scanner toolInput){
        String exitStatement = "";
        MethodBox2 metode = new MethodBox2();

        while(true){
            String n = inputScene(toolInput);
            System.out.println("Hasil : ");
            metode.vocal2Num(n);
            exitStatement = closingScene(toolInput);
            break;
        }
        return exitStatement;
    }
    
    String starWord (Scanner toolInput){
        String exitStatement = "";
        MethodBox2 metode = new MethodBox2();

        while(true){
            String n = inputScene(toolInput);
            System.out.println("Hasil : ");
            metode.starWord(n);
            exitStatement = closingScene(toolInput);
            break;
        }
        return exitStatement;
    }

    String kapitalisasi (Scanner toolInput){
        String exitStatement = "";
        MethodBox2 metode = new MethodBox2();

        while(true){
            String n = inputScene(toolInput);
            System.out.println("Hasil : ");
            metode.kapitalisasi(n);
            exitStatement = closingScene(toolInput);
            break;
        }
        return exitStatement;
    }

    String reverseSentence (Scanner toolInput){
        String exitStatement = "";
        MethodBox2 metode = new MethodBox2();

        while(true){
            String n = inputScene(toolInput);
            System.out.println("Hasil : ");
            metode.reverseSentence(n);
            exitStatement = closingScene(toolInput);
            break;
        }
        return exitStatement;
    }
}


public class Lat3Method {

    public static void main(String[] args) {
        String exitStatement = "Y";
        Scanner toolInput = new Scanner (System.in);
        MethodBox3 solution = new MethodBox3();

        while(exitStatement.equals("Y")){
            int mode=solution.openingScene(toolInput);

            switch (mode) {
                case 1 :{
                    exitStatement=solution.oddPattern(toolInput);
                    break;
                }
                case 2 :
                    exitStatement=solution.evenPattern(toolInput);
                    break;
                case 3 :
                    exitStatement=solution.letterPattern(toolInput);
                    break;
                case 4 :
                    exitStatement=solution.specialPattern(toolInput);
                    break;
                case 5 :
                    exitStatement=solution.letterNumber(toolInput);
                    break;
                case 6 :
                    exitStatement=solution.sumLetter(toolInput);
                    break;
                case 7 :
                    exitStatement=solution.sumWord(toolInput);
                    break;
                case 8 :
                    exitStatement=solution.sumVowels(toolInput);
                    break;
                case 9 :
                    exitStatement=solution.vocal2Num(toolInput);
                    break;
                case 10 :
                    exitStatement=solution.starWord(toolInput);
                    break;
                case 11 :
                    exitStatement=solution.kapitalisasi(toolInput);
                    break;
                case 12 :
                    exitStatement=solution.reverseSentence(toolInput);
                    break;
            }     
        }
        
        toolInput.close();

    }
}


