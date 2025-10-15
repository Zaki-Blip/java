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
public class percabanganswitch {
    public static void main(String[] args) {
        
        System.out.println("1. Merah 2. Kuning 3. Hijau");
        String ulang = "y";
        while (ulang.equalsIgnoreCase("y")){
        Scanner input = new Scanner (System.in);
        System.out.println("Masukan Nilai");
        int pilih = input.nextInt();
        
        switch(pilih){
        case 1 :
            System.out.println("Berhenti");
        break;
        case 2 :
            System.out.println("Hati-Hati");
        break;
        case 3 :
            System.out.println("Jalan");
        break;
        default :
            System.out.println("Pilihan Tidak Ada");
        break;
        
        }
        
            System.out.println("\nUlangi?(y/n): ");
            ulang = input.next();
        }
    }
}
