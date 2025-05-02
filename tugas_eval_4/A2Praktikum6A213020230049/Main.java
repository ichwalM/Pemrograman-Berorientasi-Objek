package A2Praktikum6A213020230049;


public class Main {
    public static void main(String[] args) {
        TransaksiGiro transaksiGiro = new TransaksiGiro(5000000);
        transaksiGiro.setor(2000000);
        transaksiGiro.tarik(4000000);
        System.out.println("");
        TransaksiTabungan transaksiTabungan = new TransaksiTabungan(2000000);
        transaksiTabungan.setor(3000000);
        transaksiTabungan.tarik(250000);
    }
    
}
