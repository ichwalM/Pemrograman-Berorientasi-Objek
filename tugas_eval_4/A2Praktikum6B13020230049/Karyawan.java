package A2Praktikum6B13020230049;
public abstract class Karyawan {
    int id,gaji,bonus;
    String nama;
    public Karyawan(int id, String nama, int gaji, int bonus){
        this.id=id;
        this.nama=nama;
        this.gaji=gaji;
        this.bonus=bonus;
    }
    public void totalGaji(){
        int total = this.gaji+=this.bonus;
        System.out.println("Total Gaji : "+total);
    }
    public abstract void updateJabatan(String jabatan);
    public abstract void updateGaji(int gaji);
    public abstract void updateBonus(int bonus);
    public void detailKaryawan(){
        System.out.println("ID   : "+this.id);
        System.out.println("Nama : "+this.nama);
        System.out.println("Gaji : "+this.gaji);
        System.out.println("Bonus: "+this.bonus);
    }
}
