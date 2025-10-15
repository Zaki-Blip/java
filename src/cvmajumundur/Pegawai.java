/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cvmajumundur;

/**
 *
 * @author Jecky
 */
public class Pegawai {
   
    String noPeg;
    String nama;
    int kehadiran;
    double gajiPokok;

    public Pegawai(String noPeg, String nama, int kehadiran, double gajiPokok) {
        this.noPeg = noPeg;
        this.nama = nama;
        this.kehadiran = kehadiran;
        this.gajiPokok = gajiPokok;
    }

    public double hitungGaji() {
        return gajiPokok;
    }

    public void lihatData() {
        System.out.println("No Pegawai   : " + noPeg);
        System.out.println("Nama         : " + nama);
        System.out.println("Kehadiran    : " + kehadiran);
        System.out.println("Gaji Pokok   : " + gajiPokok);
        System.out.println("Total Gaji   : " + hitungGaji());
    }
}

