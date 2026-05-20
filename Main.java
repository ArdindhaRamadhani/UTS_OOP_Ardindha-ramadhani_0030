public class Main {

    public static void main(String[] args) {
       Produk p1 = new Mobil(nama: "Toyota Avanza", Transmisi: "Manual", bnyakUnit: 3, harisewa: 2, jumlahkursi: 7, TotalBiaya:770000 );
       Produk p2 = new Motor(nama: "Honda Beat", Jenis Motor: "Matic", bnyakUnit: 5, Hari Sewa: 3, Total Biaya: 240000 );

    p1.tampilInfo();
        kasir.tampilIndentitas();
        kasir.prosesSewaUnit(p1, 3);

        system.out.println();
        system.out.println();
        
    p2.tampilInfo();
        kasir.tampilIndentitas();\
        kasir.prosesSewaUnit(p2, 5);
    }

}

}
