/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan49.biayaemas;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class IF0110118025Latihan49BiayaEmas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Emas emas = new Emas();
        emas.setNama("Hendi");
        emas.setBeratEmas(15.7);
        emas.setHargaEmas(570000);
        emas.tampilPembeli(emas.totalHarga(emas.getHargaEmas()));
    }
 
    
}
