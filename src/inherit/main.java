package inherit;

import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dof = new DecimalFormat("0.00");

        String ulang = "y";
        while (ulang.equalsIgnoreCase("y")) {

            System.out.println("----------------");
            System.out.println("1. Tabung  2. Kerucut");
            System.out.print("\tpilih 1/2 : ");
            int pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan jari : ");
                    double jariT = sc.nextDouble();
                    System.out.print("Masukkan tinggi : ");
                    double tinggiT = sc.nextDouble();
                    tabung tb = new tabung(jariT, tinggiT);
                    System.out.println("Volume tabung = " + dof.format(tb.VolumeTabung()));
                    break;

                case 2:
                    System.out.print("Masukkan jari : ");
                    double jariK = sc.nextDouble();
                    System.out.print("Masukkan tinggi : ");
                    double tinggiK = sc.nextDouble();
                    kerucut kc = new kerucut(jariK, tinggiK);
                    System.out.println("Volume kerucut = " + dof.format(kc.VolumeKerucut()));
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
            System.out.print("\tUlangi? (y/n) : ");
            ulang = sc.next();
        }
        sc.close();
    }
}