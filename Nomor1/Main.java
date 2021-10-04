package Nomor1;

public class Main {
    public static void main(String[] args) {
        //konstruktor 2 parameter
        Barang barang1 = new Barang("BRG-001", "Tas Gucci");
        Barang barang2 = new Barang("BRG-002", "Printer Epson L355");

        //barang konstruktor 2 parameter
        System.out.println("Data Barang :");
        System.out.println("Barang 1 ");
        System.out.println("ID Produk : " + barang1.getIdProduk());
        System.out.println("Nama Barang : " + barang1.getNama());
        System.out.println("");

        System.out.println("Barang 2 ");
        System.out.println("ID Produk : " + barang2.getIdProduk());
        System.out.println("Nama Barang : " + barang2.getNama());
        System.out.println("");

        //konstruktor 3 parameter
        Barang barang3 = new Barang("BRG-003", "Koper", 150.0);
        Barang barang4 = new Barang("BRG-004", "Helm", 20.0);

        //barang konstruktor 3 parameter
        System.out.println("Barang 3 ");
        System.out.println("ID Produk : " + barang3.getIdProduk());
        System.out.println("Nama Barang : " + barang3.getNama());
        System.out.println("Harga Barang : $" + barang3.getHarga());
        System.out.println("");

        System.out.println("Barang 4 ");
        System.out.println("ID Produk : " + barang4.getIdProduk());
        System.out.println("Nama Barang : " + barang4.getNama());
        System.out.println("Harga Barang : $" + barang4.getHarga());

        //total harga BRG-001, BRG-003, BRG-004
        System.out.println("Total harga BRG-001, BRG-003, dan BRG-004 : " + (1200+150+20) + " $");
    }
}
