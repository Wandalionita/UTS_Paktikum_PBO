package uts;

public class Pengguna implements UserInterface {
    protected String nama;

    public Pengguna(String nama) {
        this.nama = nama;
    }

    public void lihatKamar(Kamar[] kamars) {
        for (Kamar kamar : kamars) {
            kamar.tampilkanDetail();
        }
    }

    public void pesanKamar(Kamar kamar, String namaPemesan) {
        kamar.pesanKamar(namaPemesan);
    }

    public void batalPesanKamar(Kamar kamar) {
        kamar.batalPesan();
    }
}


