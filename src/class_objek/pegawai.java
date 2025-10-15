/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_objek;

import java.util.Scanner;

/**
 *
 * @author Jecky
 */
public class pegawai {
    
    //variable class/global
    String nama;
    int umur;
    private int usia;
    
    public void showData(){
        
        System.out.println("Data Pegawai : ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        pegawai pgw = new pegawai ();
        pgw.showData();
        
        System.out.print("nama = ");
        String nm = input.next();
        pgw.nama =nm ;
        System.out.println("Usia = ");
        int usia = input.nextInt();
        pgw.umur = usia;
        System.out.println("---------------------");
        System.out.println("Nama Pegawai = " + nm);
        
        
    }
}
