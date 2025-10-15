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
public class karyawan {
    
    private String nama;
    private int kehadiran;
    private double gaji;    
    

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getKehadiran() {
        return kehadiran;
    }
    
    public void setKehadiran(int kehadiran) {
        if (kehadiran < 1) {
            this.kehadiran = 1;
        }else {
            this.kehadiran = kehadiran;
        }
    }

    public void setGaji(double Gaji){
        this.gaji = Gaji;
    }
    public double getGaji() {
        gaji = kehadiran * 200000;
        return gaji;
    }
    
    private void showDataGaji(){
        
        System.out.println("Data Gaji Pegawai");
        System.out.println("Nama       : " + nama);
        System.out.println("Kehadiran  : " + kehadiran + " hari");
        System.out.println("Gaji       : " + getGaji());
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        karyawan kyw = new karyawan();
        System.out.print("Masukkan nama pegawai: ");
        String nm = input.nextLine();
        kyw.setNama(nm);

        System.out.print("Masukkan jumlah kehadiran: ");
        int hadir = input.nextInt();
        kyw.setKehadiran(hadir);

        kyw.showDataGaji();
        
    }

    
}
