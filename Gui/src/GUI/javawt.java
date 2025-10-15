package GUI;

import javax.swing.*;

public class javawt {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BUTTON");
        JButton button = new JButton("click me");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        button.setBounds(100, 70, 100, 30);
        frame.add(button);

        frame.setVisible(true);
    }
}