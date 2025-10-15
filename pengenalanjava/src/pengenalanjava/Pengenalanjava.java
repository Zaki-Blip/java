/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pengenalanjava;

import java.util.Scanner;

/**
 *
 * @author Jecky
 */
public class Pengenalanjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nama");
        String nama = input.next();
        System.out.println("Kelas");
        String kelas = input.next();
        System.out.println("Umur");
        int umur = input.nextInt();
    }
    
}
