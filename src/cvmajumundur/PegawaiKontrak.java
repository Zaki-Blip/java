/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cvmajumundur;

/**
 *
 * @author Jecky
 */
public class PegawaiKontrak extends Pegawai{
   String masaKontrak;

    // Hanya ada 1 constructor
    PegawaiKontrak(String noPeg, String nama, String masaKontrak, int kehadiran, double gajiPokok) {
        super(noPeg, nama, kehadiran, gajiPokok);
        this.masaKontrak = masaKontrak;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (6000 * kehadiran);
    }

    @Override
    public void lihatData() {
        super.lihatData();
        System.out.println("Masa Kontrak: " + masaKontrak);
        System.out.println("Uang Makan  : " + (6000 * kehadiran));
        System.out.println("Gaji Bersih : " + hitungGaji());
    }

}
