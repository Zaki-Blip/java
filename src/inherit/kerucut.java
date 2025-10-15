package inherit;

public class kerucut extends lingkaran {
    private double tinggi;

    public kerucut(double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }

    public double VolumeKerucut() {
        return (1.0 / 3.0) * super.luas() * tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }
}