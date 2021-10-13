package Bagian1;

public class EntitasBuku {

    private String isbn;
    private String judulBuku;
    private String tahunTerbit;
    private int harga;
    private float rating;

    public EntitasBuku(String isbn, String judulBuku, String tahunTerbit, int harga, float rating) {
        this.isbn = isbn;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.rating = rating;
    }
    public String getIsbn() {
        return isbn;

    }
    public String getJudulBuku() {
        return judulBuku;
    }
    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }
    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }

    public void searchIsbn(String isbn) {
        if (this.isbn.equalsIgnoreCase(isbn)) {
            System.out.println(isbn + " " + judulBuku + " " + tahunTerbit + " " + harga + " " + rating);
        }
    }

    @Override
    public String toString() {
        return isbn + " " + judulBuku + " " + tahunTerbit + " " + harga + " " + rating;
    }
}

