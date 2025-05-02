package A2Praktikum6B13020230049;

public class Dosen extends Karyawan{
    public String jabatan;
    public Dosen(int id, String nama,int gaji, int bonus){
        super(id, nama, gaji, bonus);
    }
    public String getJabatan(){
        return this.jabatan;
    }
    public void setJabatan(String jabatan){
        this.jabatan=jabatan;
    }
    @Override
    public void updateJabatan(String jabatan){
        this.jabatan=jabatan;
    }
    @Override
    public void updateGaji(int gaji){
        super.gaji=gaji;
    }
    @Override
    public void updateBonus(int bonus){
        super.bonus=bonus;
    }
}
