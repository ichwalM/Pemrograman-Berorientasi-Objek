package abstraction;
class Mobil extends Kendaraan implements Mesin {

    Mobil(String nama) {
        super(nama);
    }

    @Override
    void berjalan() {
        System.out.println(nama + " sedang berjalan di jalan raya.");
    }

    @Override
    public void hidupkanMesin() {
        System.out.println("Mesin " + nama + " dihidupkan.");
    }

    @Override
    public void matikanMesin() {
        System.out.println("Mesin " + nama + " dimatikan.");
    }
}