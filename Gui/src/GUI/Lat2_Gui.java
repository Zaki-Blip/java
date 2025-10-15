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
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Lat2_Gui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame f2=new Frame("TEXT");
        TextField t = new TextField();
        f2.setSize(300,200);
        f2.setLocationRelativeTo(null);
        f2.add(t);
        f2.setVisible(true);
        
        f2.addWindowListener(new WindowAdapter(){
            
            public void WindowClosing(WindowEvent e){
              System.exit(0);
            }
        });
    }
    
}
