package bank;

import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Transaksi tr = new Transaksi(200000);
        int pinBenar = 1234;
        int percobaan = 0;
        boolean login = false;

        while (percobaan < 3) {
            System.out.print("Masukkan PIN Anda: ");
            int pinInput = sc.nextInt();
            if (pinInput == pinBenar) {
                System.out.println("Login berhasil!\n");
                login = true;
                break;
            } else {
                percobaan++;
                System.out.println("PIN salah (" + percobaan + "x)");
            }
        }

        if (!login) {
            System.out.println("Silahkan hubungi Customer Service.");
            sc.close();
            return;
        }

        String ulang = "y";
        while (ulang.equalsIgnoreCase("y")) {
            System.out.println("\n===== Bank RPL 1 =====");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Menabung");
            System.out.println("3. Transfer");
            System.out.println("4. Tarik Tunai");
            System.out.println("5. Pembelian (Pulsa/Token/PAM)");
            System.out.println("6. Keluar");
            System.out.print("Silahkan pilih menu: ");
            int pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Saldo anda saat ini: Rp " + tr.saldo);
                    break;

                case 2:
                    System.out.print("Masukkan jumlah yang ingin ditabung: ");
                    int nabung = sc.nextInt();
                    tr.menabung(nabung);
                    System.out.println("Tabungan Rp " + nabung + " berhasil ditambahkan.");
                    System.out.println("Saldo Anda saat ini: Rp " + tr.saldo);
                    break;

                case 3:
                    System.out.print("Masukkan jumlah uang yang ingin ditransfer: ");
                    int transfer = sc.nextInt();
                    if (tr.transfer(transfer)) {
                        System.out.println("Transfer Rp " + transfer + " berhasil.");
                    } else {
                        System.out.println("Saldo tidak cukup!");
                    }
                    System.out.println("Saldo Anda saat ini: Rp " + tr.saldo);
                    break;

                case 4:
                    System.out.print("Masukkan jumlah uang yang ingin ditarik: ");
                    int tarik = sc.nextInt();
                    if (tr.menarik(tarik)) {
                        System.out.println("Penarikan Rp " + tarik + " berhasil.");
                    } else {
                        System.out.println("Saldo tidak cukup!");
                    }
                    System.out.println("Saldo Anda saat ini: Rp " + tr.saldo);
                    break;

                case 5:
                    System.out.println("=== Menu Pembelian ===");
                    System.out.println("1. Pulsa");
                    System.out.println("2. Token Listrik");
                    System.out.println("3. PAM");
                    System.out.print("Pilih menu: ");
                    int beli = sc.nextInt();
                    System.out.print("Masukkan nominal pembelian: ");
                    int nominal = sc.nextInt();

                    if (tr.menarik(nominal)) {
                        switch (beli) {
                            case 1:
                                System.out.println("Pulsa Rp " + nominal + " berhasil dibeli.");
                                break;
                            case 2:
                                System.out.println("Token listrik Rp " + nominal + " berhasil dibeli.");
                                break;
                            case 3:
                                System.out.println("PAM Rp " + nominal + " berhasil dibayar.");
                                break;
                            default:
                                System.out.println("Menu pembelian tidak valid.");
                                break;
                        }
                        System.out.println("Saldo Anda saat ini: Rp " + tr.saldo);
                    } else {
                        System.out.println("Saldo tidak cukup untuk melakukan pembelian.");
                    }
                    break;

                case 6:
                    System.out.println("Terima kasih telah menggunakan Bank RPL 1.");
                    ulang = "n";
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            if (!ulang.equalsIgnoreCase("n")) {
                System.out.print("\nUlangi transaksi? (y/n): ");
                ulang = sc.next();
            }
        }

        sc.close();
    }
}