/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;

/**
 *
 * @author Jecky
 */

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
        
public class Lat1_Gui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame f1 =new Frame();
        f1.setTitle("Contoh Frame");
        f1.setSize(300,200);
        f1.setResizable(false);
        f1.setVisible(true);
        
        f1.addWindowListener(new WindowAdapter(){
            
            public void WindowClosing(WindowEvent e){
              System.exit(0);
            }
        });
    }
    
}
