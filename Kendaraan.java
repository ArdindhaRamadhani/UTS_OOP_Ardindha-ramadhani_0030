public class kendaraan {

    // Penerapan Encapsulation
    private String jenisTransmisi;
    private double hargaSewaHarian;
    private int unitTersedia;

    // Penerapan Constructor
    public Produk(String jenisTransmisi, double hargaSewaHarian, int unitTersedia) {
        this.jenisTransmisi = jenisTransmisi;
        this.hargaSewaHarian = hargaSewaHarian;
        this.unitTersedia = unitTersedia;
        
    }

    // Memasukan Getter
    public String getjenisTransmisi() {
        return jenisTransmisi;
    }

    public double getHargaSewaPerHari() {
        return hargaSewaHarian;
    }

    // Memasukan Setter
    public int setUnitTersedia() {
        return unitTersedia;
    }

    // Menampilkan info kendaraan
    public void tampilInfo() {
        System.out.println("===== Kendaraan =====");
        System.out.println("jenisTransmisi: " + jenisTransmisi);
        System.out.println("HargaSewaHarian: " + hargaSewaHarian);
        System.out.println("unitTersedia: " + unitTersedia);
    }
    
    // Memasukan Metod Transaksi
    public double hitungTotalHarga(int jenisTransmisi) {
        return jenisTransmisi * harga;
    }

    public abstract double hitungHargaAkhir(int jenisTransmisi);
}}

}
