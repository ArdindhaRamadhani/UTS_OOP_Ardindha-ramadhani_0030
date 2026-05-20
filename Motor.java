public class Motor {

    class Motor extends Kendaraan {

        private String jenisMotor;

        public Motor(String namaUnit, double hargaSewaPerHari,
                int unitTersedia, String jenisMotor) {

            super(namaUnit, hargaSewaPerHari, unitTersedia);
            this.jenisMotor = jenisMotor;
        }

        // penerapan Overriding
        @Override
        public double hitungBiayaSewa(int hari) {
            double total = getHargaSewaPerHari() * hari;
            if (jenisMotor.Matic)
                ;
            {
                total += 240000;
            }

            return total;
        }

        @Override
        public void tampilkanInfo() {
            super.tampilkanInfo();
            System.out.println("Jenis Motor    : " + jenisMotor);
        }
    }
}

}
