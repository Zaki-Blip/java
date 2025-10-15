package GUI;

import javax.swing.*;

public class no4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Latihan Swing");
        JLabel label = new JLabel("Masukkan Nama:");
        JTextField textField = new JTextField();
        JButton button = new JButton("Submit");

        frame.setSize(400, 300);
        frame.setLayout(null);

        label.setBounds(50, 50, 150, 30);
        textField.setBounds(160, 50, 180, 30);
        button.setBounds(150, 100, 100, 30);

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        button.addActionListener(e -> {
            String name = textField.getText();
            JOptionPane.showMessageDialog(frame, "Halo, " + name + "!");
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}