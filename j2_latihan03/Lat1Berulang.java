/*
 * @author Akbar Riyan Nugroho
 * @Created 9-10-2021
 *
 */

package j2_latihan03;

/*
* Buat aplikasi untuk mencetak deret sepanjang n, dengan ketentuan :
* 1. User diminta untuk memasukkan jenis deret yang akan dicetak
*       1. ganjil
*       2. Genap
*       3. huruf
* 2. User diminta untuk memasukkan n sebagai panjang deret
* 3. Setelah hasil deret tertampilkan, User diberi pilhan apakah akan mencetak deret lain atau mengakhiri aplikasi
*       Jika ya, kembali ke alur diatas
*       Jika tidak, aplikasi berhenti
* */
import java.util.Scanner;
public class Lat1Berulang {
    
    int openingScene (Scanner toolInput) {
        int mode = 0;
        System.out.println("Silahkan masukkan jenis deret yang dicetak :");
        System.out.printf("1. Ganjil\n2. Genap\n3. Huruf\n");
        while(true) {
            while (mode==0) mode=toolInput.nextInt();
            if (mode>3 || mode<=0){
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
            System.out.print("Masukkan nilai n yang ingin diproses : ");
            while(n.equals("")) n=toolInput.nextLine(); 
            if (Integer.parseInt(n)<0){
                System.out.println("=========================================");
                System.out.println("Masukan anda negatif, silahkan coba lagi.");
                System.out.println("=========================================");
                n="";
            }else break;
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

        while(true){
            String n = inputScene(toolInput);
            System.out.println("Hasil : ");
            for (int i=0; i<Integer.parseInt(n); i++) System.out.print(i*2+2+" ");
            System.out.println();
            
            exitStatement = closingScene(toolInput);
            break;
        }
        return exitStatement;
    }

    String oddPattern (Scanner toolInput) {
        String exitStatement = "";

        while(true){
            String n = inputScene(toolInput);
            System.out.println("Hasil : ");
            for (int i=0; i<Integer.parseInt(n); i++) System.out.print(2*i+1+" ");
            System.out.println();
            
            exitStatement = closingScene(toolInput);
            break;
        }
        return exitStatement;
    }

    String letterPattern (Scanner toolInput) {
        String exitStatement = "";

        while(true){
            String n = inputScene(toolInput);
            System.out.println("Hasil : ");
            for (int i=0; i<Integer.parseInt(n); i++) System.out.print((char)(65+i)+" ");
            System.out.println();
            
            exitStatement = closingScene(toolInput);
            break;
        }
        return exitStatement;
    }

    public static void main(String[] args) {
        String exitStatement = "Y";
        Scanner toolInput = new Scanner (System.in);
        Lat1Berulang solution  = new Lat1Berulang();

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
            }     
        }
        
        toolInput.close();

    }
}
