//generic class
public class KotakGenerik<T> {
    private T isi;

    public KotakGenerik(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }

    // Generic method 
    public <U> boolean samaDengan(KotakGenerik<U> kotakLain) {
        return this.isi.equals(kotakLain.getIsi());
    }
}