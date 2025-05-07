package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        Buku nonFiksi = new Nonfiksi("Madilog", "Tan Malaka", "Sejarah & Ilmu Pengetahuan");
        Buku fiksi = new Fiksi("Hainuwele: Sang Putri Kelapa", "Lilis Hu", "Dongeng");

        nonFiksi.displayInfo();
        fiksi.displayInfo();

        Anggota anggota1 = new Anggota("Shonia", "209");
        Anggota anggota2 = new Anggota("Fadila", "215");

        anggota1.displayInfo();
        anggota2.displayInfo();

        anggota1.pinjamBuku("Madilog");
        anggota2.pinjamBuku("Hainuwele: Sang Putri Kelapa", 7);

        anggota1.kembalikanBuku("Madilog");
        anggota2.kembalikanBuku("Hainuwele: Sang Putri Kelapa");
    }
}