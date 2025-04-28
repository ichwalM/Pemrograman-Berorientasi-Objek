package abstraction;

abstract  public class Kendaraan {
    String nama;
    
    Kendaraan(String nama) {
        this.nama = nama;
    }
    
    abstract void berjalan();
    
    void info() {
        System.out.println("Nama Kendaraan: " + nama);
    }
}
