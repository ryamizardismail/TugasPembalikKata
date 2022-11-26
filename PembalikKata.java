/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pembalikkata;

import java.util.Scanner;

/**
 *
 * @author Iis
 */
public class PembalikKata {
    public static void main(String[] args) {
        // variabel untuk menampung hasil validasi kata
        String simpanKata= " ";
        
        Scanner input = new Scanner(System.in);
        System.out.println("--- Masukkan Kata ---");
        
        System.out.print("Masukkan Sebuah Kata : ");
        String masukan = input.nextLine();
        
        char[] validasi = masukan.toCharArray();
        
        // validasi kata
        for (int i = validasi.length - 1; i >= 0; i--){
             if (validasi[i] == ' '){
                System.out.println("Anda memasukkan kalimat bukan kata !!!");
                System.exit(0); 
             }  else {
                simpanKata = masukan;
            } 
        }
        
        char[] kata = simpanKata.toCharArray();
        
        for (int a = kata.length - 1; a >= 0; a--){
            if(kata[a] == 'n' && kata[a + 1] == 'g'){
                System.out.print(kata[a + 1]);
            } else if(kata[a] == 'g' && kata[a - 1] == 'n'){
                System.out.print(kata[a - 1]);
            } else if(kata[a] == 'n' && kata[a + 1] == 'y'){
                System.out.print(kata[a + 1]);
            } else if(kata[a] == 'y' && kata[a - 1] == 'n'){
                System.out.print(kata[a - 1]);
            } else {
                System.out.print(kata[a]);
            }
        }
        System.out.println(" ");
    }   
}
