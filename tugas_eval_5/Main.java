public class Main {
    public static void main(String[] args) {
        KotakGenerik<Integer> kotak1 = new KotakGenerik<>(100);
        KotakGenerik<Integer> kotak2 = new KotakGenerik<>(100);
        KotakGenerik<String> kotak3 = new KotakGenerik<>("100");
        //pemanggilan method untuk menampilkan isi kotak
        System.out.println("Kotak1 == Kotak2: " + kotak1.samaDengan(kotak2));
        System.out.println("Kotak1 == Kotak3: " + kotak1.samaDengan(kotak3));
    }
}