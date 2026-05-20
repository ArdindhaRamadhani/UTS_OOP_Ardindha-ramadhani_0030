public class Mobil {

    private int jumlahKursi;
    private String jenisTransmisi;

    public Mobil(String namaUnit, double hargaSewaHarian,
            int unitTersedia, int jumlahKursi, String jenisTransmisi) {

        super(namaUnit, hargaSewaHarian, unitTersedia);
        this.jenisTransmisi = jenisTransmisi;
        this.jumlahKursi = jumlahKursi;

    }

    // penerapan Overriding
    @Override
    public double hitungBiaya(int hari) {
        double total = getHargaSewaHarian() * hari;
        if (jumlahKursi > 7) {
            total += 770000;
        }

        return total;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Kursi   : " + jumlahKursi);
        System.out.println("Transmisi      : " + jenisTransmisi);

    }

}
