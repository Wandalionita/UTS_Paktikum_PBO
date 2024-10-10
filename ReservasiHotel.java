package uts;

import java.util.Scanner;

public class ReservasiHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Kamar[] kamars = { new Kamar(101), new Kamar(102), new Kamar(103) };

        System.out.println("Selamat datang di Sistem Reservasi Hotel.");
        System.out.print("Apakah Anda seorang Customer atau Admin? (C/A): ");
        String tipePengguna = scanner.nextLine();

        Pengguna pengguna;
        if (tipePengguna.equalsIgnoreCase("C")) {
            System.out.print("Masukkan nama Anda: ");
            String namaPelanggan = scanner.nextLine();
            pengguna = new Pelanggan(namaPelanggan);
        } else {
            System.out.print("Masukkan username admin: ");
            String namaAdmin = scanner.nextLine();
            pengguna = new Admin(namaAdmin);
        }

        boolean berjalan = true;
        while (berjalan) {
            System.out.println("\nMenu:");
            System.out.println("1. Lihat Detail Kamar");
            System.out.println("2. Pesan Kamar");
            System.out.println("3. Batalkan Pemesanan");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    pengguna.lihatKamar(kamars);
                    break;

                case 2:
                    System.out.print("Masukkan nomor kamar yang ingin dipesan: ");
                    int nomorKamar = scanner.nextInt();
                    Kamar kamarUntukDipesan = cariKamar(kamars, nomorKamar);
                    if (kamarUntukDipesan != null) {
                        pengguna.pesanKamar(kamarUntukDipesan, pengguna.nama);
                    } else {
                        System.out.println("Kamar tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan nomor kamar yang ingin dibatalkan: ");
                    nomorKamar = scanner.nextInt();
                    Kamar kamarUntukDibatalkan = cariKamar(kamars, nomorKamar);
                    if (kamarUntukDibatalkan != null) {
                        pengguna.batalPesanKamar(kamarUntukDibatalkan);
                    } else {
                        System.out.println("Kamar tidak ditemukan.");
                    }
                    break;

                case 4:
                    berjalan = false;
                    System.out.println("Keluar dari sistem.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }

        scanner.close();
    }

    private static Kamar cariKamar(Kamar[] kamars, int nomorKamar) {
        for (Kamar kamar : kamars) {
            if (kamar.nomorKamar == nomorKamar) {
                return kamar;
            }
        }
        return null;
    }
}
