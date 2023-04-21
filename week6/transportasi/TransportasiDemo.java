import transportasi.*;

public class TransportasiDemo {
    public static void main(String[] args) {
        // objek
        Sepeda sepeda1 = new Sepeda(2, "Sepeda Gunung", "Pacific");

        // mengakses atribut dan method
        int gearSepeda = sepeda1.gear;
        System.out.println("Jumlah Gear " + gearSepeda);
        sepeda1.ngerem();

        // membuat objek
        Mobil mobil1 = new Mobil();

        mobil1.warna = "Hitam";
        mobil1.merk = "Hondaa Apansa";
        mobil1.roda = 4;
        mobil1.infoKendaraan();

        mobil1.berjalan("Depan");
        mobil1.berhenti();
        mobil1.kecepatan = 180;

        System.out.println("Kecepatan awal " + mobil1.kecepatan);
        int kecepatan = mobil1.kecepatanSekarang(10, "lambat");
        System.out.println("Kecepatan kendaraan adalah " + kecepatan);
        mobil1.mundur();
        System.out.println("Kecepatan sekarang setelah mundur adalah " + mobil1.kecepatan);

    }
}