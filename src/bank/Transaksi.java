/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Jecky
 */
public class Transaksi {
    int saldo;

    public Transaksi(int saldoAwal) {
        saldo = saldoAwal;
    }

    public void menabung(int jumlah) {
        saldo += jumlah;
    }

    public boolean menarik(int jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(int jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        } else {
            return false;
        }
    }
}
