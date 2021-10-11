package j2_latihan01;

import java.util.Scanner;

public class Lat2DeretGenap {
    public static void main(String[] args) {
        Scanner tool_input = new Scanner (System.in);
        System.out.print("Silahkan masukkan nilai n : ");
        int n = toolInput.nextInt();
        toolInput.close();

        for (int i=0; i<n; i++) System.out.print(i*2+2 + " ");
    }
}
