package uts;

public class Admin extends Pengguna {
    public Admin(String namaAdmin) {
        super(namaAdmin);
    }

    public void batalPesanKamar(Kamar kamar) {
        kamar.batalPesan();
        System.out.println("Admin " + nama + " membatalkan pemesanan kamar.");
    }
}
