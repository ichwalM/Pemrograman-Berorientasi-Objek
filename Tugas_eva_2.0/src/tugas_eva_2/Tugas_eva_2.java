package tugas_eva_2;

public class Tugas_eva_2 {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Inp");
//        String stb = input.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa("13020230049", "Ichwal", 2023);
        System.out.println("Stambuk \t: "+mahasiswa.getStambuk());
        System.out.println("Nama \t\t: "+mahasiswa.getNama());
        System.out.println("Angkatan \t: "+mahasiswa.getAngkatan());
    }
    
}