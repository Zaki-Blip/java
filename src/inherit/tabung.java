
package inherit;

/**
 *
 * @author Jecky
 */
public class tabung extends lingkaran {
   
    private double tinggi;
    
    public tabung (double jari, double tinggi){
        super(jari);
        this.tinggi= tinggi;
    }
   
    
   
    public double VolumeTabung(){
        double volum = super.luas() * tinggi ;
        return volum;
    }

    public double getTinggi() {
        return tinggi;
    }
}

