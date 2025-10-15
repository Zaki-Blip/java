/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cvmajumundur;

/**
 *
 * @author Jecky
 */
public class PegawaiTetap extends Pegawai {
    final double tunjangan = 200000;

    public PegawaiTetap(String noPeg, String nama, int kehadiran, double gajiPokok) {
        super(noPeg, nama, kehadiran, gajiPokok);
    }

    @Override
    public double hitungGaji() {
        double uangMakan = 6000 * kehadiran;
        return gajiPokok + uangMakan + tunjangan;
    }

    @Override
    public void lihatData() {
        super.lihatData();
        System.out.println("Tunjangan    : " + tunjangan);
        System.out.println("Uang Makan   : " + (6000 * kehadiran));
        System.out.println("Gaji Bersih  : " + hitungGaji());
        System.out.println("--------------------------------");
    }
}

