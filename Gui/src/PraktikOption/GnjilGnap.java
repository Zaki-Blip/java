package PraktikOption;

import javax.swing.JOptionPane;

public class GnjilGnap {

    public static void main(String[] args) {
        while (true) {
            String angka = JOptionPane.showInputDialog("Inputkan Angka : ");
            
            if (angka == null) break;

            int nilaiangka = Integer.parseInt(angka);

            boolean prima = true;

            if (nilaiangka <= 1) {
                prima = false;
            } else {
                for (int i = 2; i <= Math.sqrt(nilaiangka); i++) {
                    if (nilaiangka % i == 0) {
                        prima = false;
                        break;
                    }
                }
            }

            if (prima) {
                JOptionPane.showMessageDialog(null, nilaiangka + " = Bilangan Prima");
            } else {
                JOptionPane.showMessageDialog(null, nilaiangka + " = Bukan Bilangan Prima");
            }

            int jawab = JOptionPane.showConfirmDialog(null, "Ulangi?", "", JOptionPane.YES_NO_OPTION);
            if (jawab == JOptionPane.NO_OPTION) {
                break;
            }
        }
    }
}
