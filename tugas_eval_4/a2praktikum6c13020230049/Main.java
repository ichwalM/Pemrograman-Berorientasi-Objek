package a2praktikum6c13020230049;
public class Main {
    public static void main(String[] args) {
        Transportasi transportasi = new Transportasi("Kendaraan laut");
        transportasi.jenisTransportasi();
        
        transportasi= new Mobil("Kendaraan Darat");
        transportasi.jenisTransportasi();
        
        transportasi = new Pesawat("Kendaraan udara");
        transportasi.jenisTransportasi();
    }
}
