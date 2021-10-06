package Bagian1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<EntitasBuku> Data = new ArrayList <EntitasBuku>();

        // Masukkan data
        Data.add(new EntitasBuku("3105", "Greekz Tamvan", "2002", 45000, 6));
        Data.add(new EntitasBuku("2906", "Ratu Cijerah", "1997", 50000, 8));
        Data.add(new EntitasBuku("3129", "Viktor Penguasa Sekolah", "2018", 80000, 9));

        // Mengubah data
        Data.get(0).setJudulBuku("Greekz Tamvan");
        Data.get(0).setTahunTerbit("1998");
        Data.get(0).setHarga(45000);
        Data.get(0).setRating(6);

        // Menampilkan data dari salah satu buku
        System.out.println("Menampilkan data dari salah satu buku:");
        for (EntitasBuku buku: Data) {
            buku.searchIsbn("3105");
        }
        // Menghapus salah satu data buku
        Data.remove(0);
        System.out.println("\n Menampilkan buku setelah ada data yang dihapus:");
        for (EntitasBuku buku: Data) {
            System.out.println(buku);
        }
    }
}
