/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cvmajumundur;

import java.util.Scanner;

/**
 *
 * @author Jecky
 */
public class PegawaiMajuMundur {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pegawai pegawai = null;
        int pilih;

        do {
            System.out.println("\nMENU UTAMA");
            System.out.println("1. Input Data Pegawai");
            System.out.println("2. Lihat Data Pegawai");
            System.out.println("3. Keluar");
            System.out.print("Pilih [1/2/3] : ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Jenis Pegawai (1=Tetap, 2=Kontrak): ");
                    int jenis = sc.nextInt(); sc.nextLine();

                    System.out.print("No Pegawai : ");
                    String no = sc.nextLine();
                    System.out.print("Nama       : ");
                    String nama = sc.nextLine();
                    System.out.print("Kehadiran  : ");
                    int hadir = sc.nextInt();
                    System.out.print("Gaji Pokok : ");
                    double gaji = sc.nextDouble(); sc.nextLine();

                    switch (jenis) {
                        case 1:
                            pegawai = new PegawaiTetap(no, nama, hadir, gaji);
                            break;
                        case 2:
                            System.out.print("Masa Kontrak: ");
                            String mk = sc.nextLine();
                            pegawai = new PegawaiKontrak(no, nama, mk, hadir, gaji);
                            break;
                        default:
                            System.out.println("Jenis pegawai tidak valid!");
                    }
                    break;

                case 2:
                    if (pegawai != null) {
                        pegawai.lihatData();
                    } else {
                        System.out.println("Belum ada data pegawai!");
                    }
                    break;

                case 3:
                    System.out.println("Keluar program...");
                    break;

                default:
                    System.out.println("Pilihan salah!");
            }
        } while (pilih != 3);

        sc.close();
    }
}
    

