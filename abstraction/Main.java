package abstraction;
public class Main {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil("Toyota Avanza");
        
        mobilku.info();            // Memanggil method dari abstract class
        mobilku.hidupkanMesin();    // Memanggil method dari interface
        mobilku.berjalan();         // Memanggil method override dari abstract class
        mobilku.matikanMesin();     // Memanggil method dari interface
    }
}