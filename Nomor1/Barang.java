package Nomor1;

public class Barang {

    private String idProduk;
    private String nama;
    private Double harga;

    public Barang(String idProduk, String nama, Double harga) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    public Barang(String idProduk, String nama) {
        this.idProduk = idProduk;
        this.nama = nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }

    public void setHarga(Double Harga){
        this.harga = harga;
    }
    public Double getHarga() {
        return harga;
    }

    public String getIdProduk(){
        return idProduk;
    }
}
