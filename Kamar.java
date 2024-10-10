package uts;

public class Kamar {
    int nomorKamar;
    boolean sudahDipesan;
    String dipesanOleh;

    public Kamar(int nomorKamar) {
        this.nomorKamar = nomorKamar;
        this.sudahDipesan = false;
        this.dipesanOleh = null;
    }

    public void pesanKamar(String namaPemesan) {
        if (!sudahDipesan) {
            sudahDipesan = true;
            dipesanOleh = namaPemesan;
            System.out.println("Kamar " + nomorKamar + " berhasil dipesan oleh " + namaPemesan);
        } else {
            System.out.println("Kamar " + nomorKamar + " sudah dipesan.");
        }
    }

    public void batalPesan() {
        if (sudahDipesan) {
            sudahDipesan = false;
            dipesanOleh = null;
            System.out.println("Pesanan untuk kamar " + nomorKamar + " berhasil dibatalkan.");
        } else {
            System.out.println("Kamar " + nomorKamar + " belum dipesan.");
        }
    }

    public void tampilkanDetail() {
        System.out.println("Nomor Kamar: " + nomorKamar + ", Status: " + (sudahDipesan ? "Sudah dipesan oleh " + dipesanOleh : "Belum dipesan"));
    }
}
