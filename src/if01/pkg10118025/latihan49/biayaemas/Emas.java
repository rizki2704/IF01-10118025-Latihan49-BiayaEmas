/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan49.biayaemas;

import java.text.DecimalFormat;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class Emas {
    DecimalFormat satuan = new DecimalFormat("###,###");
    private String nama;
    private double beratEmas;
    private int hargaEmas;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getBeratEmas() {
        return beratEmas;
    }

    public void setBeratEmas(double beratEmas) {
        this.beratEmas = beratEmas;
    }

    public int getHargaEmas() {
        return hargaEmas;
    }

    public void setHargaEmas(int hargaEmas) {
        this.hargaEmas = hargaEmas;
    }

    public double totalHarga(int hargaEmas) {
        double total = beratEmas * hargaEmas;
        return total;
    }

    public void tampilPembeli(double total) {
        System.out.printf("Pembeli \t: %s%n", nama);
        System.out.printf("Berat Emas \t: %.1f gram%n", beratEmas);
        System.out.printf("Harga Emas \t: Rp. %s%n", satuan.format(hargaEmas));
        System.out.printf("Total bayar \t: Rp. %s%n", satuan.format(total));

    }
}
