/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inherit;

/**
 *
 * @author Jecky
 */
public class lingkaran {
    private double jari;
    
    public lingkaran (double jari){
        this.jari = jari;
    }
    public double getJari() {
        return jari;
    }
    
   
    public double luas(){
        double luas = Math.PI * jari * jari;
        return luas;
    }
}
