package class_objek;

import java.text.DecimalFormat;

import java.util.Scanner;


public class Lingkaran {

    public void setJari(double jari) {
        if(jari < 0){
            this.jari = 1;
        }else{
            this.jari = jari;
        }
        
    }

    double jari;

    public Lingkaran(double jari) {
        if (jari <= 0){
            this.jari = 1;
            System.out.println("Jari jari tidak boleh kurang dari 0");
        }else{
            this.jari = jari;
        }
        
    }

    public double getJari() {
        return jari;
    }

    public double Luas() {
       
        double luas = Math.PI * jari * jari;
        return luas;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        DecimalFormat dof = new DecimalFormat("0.00");
      
      
        
        System.out.println("Inputkan jari jari = ");
        double r = inp.nextDouble();
        Lingkaran obj = new Lingkaran(r); 
        obj.setJari(2);
          
        
        
        System.out.println(obj.getJari());
        System.out.println(dof.format(obj.Luas()));
        
    }
}
