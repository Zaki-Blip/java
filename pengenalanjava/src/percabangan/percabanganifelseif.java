/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author Jecky
 */
public class percabanganifelseif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai");
        int nilai = input.nextInt();
        if (nilai >= 91 && nilai <= 100){
            System.out.println( " Excellent");
        }else if(nilai >= 81 && nilai <= 90){
            System.out.println("Great");
        }else if(nilai >= 71 && nilai <= 80){
            System.out.println("Good");
        }else{
            System.out.println("Mbut");
        }
    }
}
