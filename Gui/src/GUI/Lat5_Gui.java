/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Jecky
 */
public class Lat5_Gui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame jf = new JFrame("BUTON");
       JButton jb = new JButton("Tombol INI BISA DI TEKAN");
       jf.setLayout(null);
       jf.setSize(500,500);
       jb.setBounds(400,400,350,50);
       jf.setLocationRelativeTo(null); 
       jf.add(jb);
       jf.setVisible(true);
       jf.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE  );
    }
    
}
