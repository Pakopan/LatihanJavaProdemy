package j2_latihan01;

/*
 * @author Akbar Riyan Nugroho
 * @Created 6-10-2021
 *
 */

//package com.arnugroho.j2_latihan01;

/*
* Mencetak Deret Ganjil Sepanjang n
* Jika n = 6
* hasil : 1   3   5   7   9    11
*
* jika n = 3
* hasil : 1   3   5
* */
import java.util.Scanner;
public class Lat1DeretGanjil {
    public static void main(String[] args) {
        Scanner toolInput = new Scanner (System.in);
        System.out.print("Silahkan masukkan nilai n : ");
        int n = toolInput.nextInt();
        toolInput.close();

        for (int i=0; i<n; i++) System.out.print(2*i+1 + " ");
    }
}
