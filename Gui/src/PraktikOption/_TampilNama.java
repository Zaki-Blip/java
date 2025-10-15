package PraktikOption;

import javax.swing.JOptionPane;

public class _TampilNama {

    public static void main(String[] args) {
        String jumlah = JOptionPane.showInputDialog(null, "Berapa jumlah data?");
        int n = Integer.parseInt(jumlah);

        for (int i = 1; i <= n; i++) { // diganti <= biar sesuai jumlah
            JOptionPane.showMessageDialog(null, "Data ke : " + i);

            String nis = JOptionPane.showInputDialog(null, "Masukkan NIS : " + i);
            String nama = JOptionPane.showInputDialog(null, "Masukkan Nama : " + i);
            String nu1 = JOptionPane.showInputDialog(null, "Masukkan Nilai Ujian 1 : " + i);
            String nu2 = JOptionPane.showInputDialog(null, "Masukkan Nilai Ujian 2 : " + i);
            String nt = JOptionPane.showInputDialog(null, "Masukkan Nilai Tugas : " + i);

            // Ubah string jadi angka
            double nU1 = Double.parseDouble(nu1);
            double nU2 = Double.parseDouble(nu2);
            double nT = Double.parseDouble(nt);

            // Hitung nilai akhir (rata-rata sederhana)
            double na = (nU1 + nU2 + nT) / 3;

            // Tampilkan hasil
            String hasil = "NIS : " + nis +
                    "\nNama : " + nama +
                    "\nNilai Ujian 1 : " + nU1 +
                    "\nNilai Ujian 2 : " + nU2 +
                    "\nNilai Tugas : " + nT +
                    "\nNilai Akhir : " + String.format("%.2f", na);

            if (na >= 77) {
                hasil += "\nStatus : Lulus 🎉";
            } else {
                hasil += "\nStatus : Tidak Lulus 😢";
            }

            JOptionPane.showMessageDialog(null, hasil);

            // Cetak ke console juga (biar bisa lihat di output NetBeans)
            System.out.println("===== Data ke-" + i + " =====");
            System.out.println("NIS           : " + nis);
            System.out.println("Nama          : " + nama);
            System.out.println("Nilai Ujian 1 : " + nU1);
            System.out.println("Nilai Ujian 2 : " + nU2);
            System.out.println("Nilai Tugas   : " + nT);
            System.out.println("Nilai Akhir   : " + na);
            System.out.println("Status        : " + (na >= 77 ? "Lulus" : "Tidak Lulus"));
            System.out.println();
        }

        JOptionPane.showMessageDialog(null, "Input data selesai ✅");
    }
}
