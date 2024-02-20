/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author Nmedia_Comp
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Masukkan Pilihan=\n"
                + "1. Sudah Membayar\n"
                + "2. Belum Membayar\n ");
        Scanner p=new Scanner(System.in);
        int pil=p.nextInt();
        if(pil==1){
            System.out.println("Masukkan Nilai");
            int nilai=p.nextInt();
            if(nilai>=91 && nilai<=100){
                System.err.println("Nilai A");
            }else if (nilai>=81 && nilai<90){
                System.err.println("Nilai B");
            }
        }else{
            System.err.println("Mohon maaf belum membayar");
        }
    }
    
}
