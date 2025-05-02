package A2Praktikum6A213020230049;



public class TransaksiTabungan implements Transaksi{
    int saldo;
    public TransaksiTabungan(int saldo){
        this.saldo=saldo;
    }

    @Override
    public void tarik(int nominal){
        if(nominal>saldo){
            System.out.println("Maaf saldo tabungan anda tidak mencukupi");
        }else{
            saldo-=nominal;
            System.out.println("Penarikan berhasil, saldo tabungan saat ini : "+saldo);
        }
    }
    @Override
    public void setor(int nominal){
        saldo+=nominal;
        System.out.println("Setoran berhasil, saldo tabungan saat ini : " + saldo);
    }
   
}
