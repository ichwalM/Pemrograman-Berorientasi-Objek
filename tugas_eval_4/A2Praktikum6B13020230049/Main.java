package A2Praktikum6B13020230049;

public class Main {

    public static void main(String[] args) {
        Dosen dosen = new Dosen(1, "Mohades Gandhi", 5000000, 500000);
        dosen.setJabatan("Dosen tetap");
        dosen.detailKaryawan();
        System.out.println("Jabatan : "+ dosen.getJabatan());
        dosen.totalGaji();
        
        System.out.println("");
        
        Staff staff = new Staff(2, "John Dhoe", 2500000, 200000);
        staff.detailKaryawan();
        staff.updateBonus(300000);
        staff.totalGaji();
   }
    
}
