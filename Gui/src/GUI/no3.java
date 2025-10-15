package GUI;

import java.awt.*;

public class no3 {
    public static void main(String[] args) {
        Frame frame = new Frame("Latihan AWT");
        TextField textField = new TextField();

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.add(textField);
        textField.setBounds(50, 100, 300, 30);

        frame.setVisible(true);

        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
    }
}