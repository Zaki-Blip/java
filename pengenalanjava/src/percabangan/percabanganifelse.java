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
public class percabanganifelse {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Inputkan Nilai");
        int nilai = input.nextInt();
        if( nilai %2 != 0){
            System.out.println(nilai +" = ganjil");
        }else{
            System.out.println(nilai +" = genap");
        }
//        
    }
}
