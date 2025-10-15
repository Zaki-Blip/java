package GUI;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class no5 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Form Pendaftaran Siswa");
        frame.setSize(500, 400);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JLabel lblNama = new JLabel("Nama Lengkap:");
        JTextField tfNama = new JTextField();
        lblNama.setBounds(30, 30, 120, 25);
        tfNama.setBounds(160, 30, 280, 25);

        JLabel lblNIS = new JLabel("NIS:");
        JTextField tfNIS = new JTextField();
        lblNIS.setBounds(30, 70, 120, 25);
        tfNIS.setBounds(160, 70, 280, 25);

        JLabel lblJurusan = new JLabel("Jurusan:");
        String[] jurusan = {"RPL", "TKJ", "Multimedia", "DKV", "SIqma"};
        JComboBox<String> cbJurusan = new JComboBox<>(jurusan);
        lblJurusan.setBounds(30, 110, 120, 25);
        cbJurusan.setBounds(160, 110, 150, 25);

        JLabel lblJK = new JLabel("Jenis Kelamin:");
        JRadioButton rbLaki = new JRadioButton("Laki-laki");
        JRadioButton rbPerempuan = new JRadioButton("Perempuan");
        ButtonGroup bgJK = new ButtonGroup();
        bgJK.add(rbLaki);
        bgJK.add(rbPerempuan);
        lblJK.setBounds(30, 150, 120, 25);
        rbLaki.setBounds(160, 150, 100, 25);
        rbPerempuan.setBounds(270, 150, 100, 25);

        JButton btnDaftar = new JButton("Daftar");
        JButton btnReset = new JButton("Reset");
        btnDaftar.setBounds(160, 200, 100, 30);
        btnReset.setBounds(280, 200, 100, 30);

        frame.add(lblNama);
        frame.add(tfNama);
        frame.add(lblNIS);
        frame.add(tfNIS);
        frame.add(lblJurusan);
        frame.add(cbJurusan);
        frame.add(lblJK);
        frame.add(rbLaki);
        frame.add(rbPerempuan);
        frame.add(btnDaftar);
        frame.add(btnReset);

        // === Event tombol DAFTAR ===
        btnDaftar.addActionListener(e -> {
            String nama = tfNama.getText().trim();
            String nis = tfNIS.getText().trim();
            String jur = cbJurusan.getSelectedItem().toString();
            String jk = rbLaki.isSelected() ? "Laki-laki" : rbPerempuan.isSelected() ? "Perempuan" : "";

            if (nama.isEmpty() || nis.isEmpty() || jk.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Semua input harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try (Connection conn = KoneksiDB.getConnection()) {
                    String sql = "INSERT INTO siswa (nama, nis, jurusan, jk) VALUES (?, ?, ?, ?)";
                    PreparedStatement pst = conn.prepareStatement(sql);
                    pst.setString(1, nama);
                    pst.setString(2, nis);
                    pst.setString(3, jur);
                    pst.setString(4, jk);
                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(frame, "Data berhasil disimpan ke database!",
                            "Sukses", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Gagal menyimpan data: " + ex.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

     
        btnReset.addActionListener(e -> {
            tfNama.setText("");
            tfNIS.setText("");
            cbJurusan.setSelectedIndex(0);
            bgJK.clearSelection();
        });

        frame.setVisible(true);
    }
}
