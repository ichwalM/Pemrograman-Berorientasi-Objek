package tugas_eval_1;
import java.util.Scanner;
class Card {
    String name;
    String asal;
    String merek;
    int harga;
    void display(){
        System.out.println("Nama \t : "+ name);
        System.out.println("Asal \t : "+ asal);
        System.out.println("Merek \t : "+ merek);
        System.out.println("harga \t : "+ harga);
    }
};
public class Tugas_eval_1 {
    static Scanner input = new Scanner(System.in);
    static Card mobil = null;
    public static void main(String[] args) {
        int choice = 0;
        while(choice != 5){
            fitur();
            choice = input.nextInt();
            input.nextLine();
            switch(choice){
                case 1:
                    create();
                     break;
                case 2:
                    update();
                    break;
                case 3:{
                    if(mobil==null){
                       System.out.println("Mobil belum dibuat, Silahkan buat mobil terlebih dahulu");
                    }else{
                       mobil.display();
                    } break;
                }case 4:{
                   remove();
                    break;
                }case 5:
                    return;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }
    static void fitur(){
        System.out.println("1. Buat Mobil");
        System.out.println("2. update Mobil");
        System.out.println("3. Lihat Mobil");
        System.out.println("4. Hapus mobil");
        System.out.println("5. Keluar");
        System.out.print("Masukkan Pilihan Anda : ");
    }
    static void create(){
        if(mobil != null){
            System.out.println("Tidak bisa membuat mobil yang baru!, Mobil sudah ada!");
        }else{
            mobil = new Card();
            System.out.print("Masukkan nama mobil yang baru \t: ");
            mobil.name = input.nextLine();
            System.out.print("Masukkan asal mobil yang baru \t: ");
            mobil.asal = input.nextLine();
            System.out.print("Masukkan merek mobil yang baru \t: ");
            mobil.merek = input.nextLine();
            System.out.print("Masukkan harga mobil yang baru \t: ");
            mobil.harga = input.nextInt();
        }
    }
    static void update(){
        if(mobil==null){
            System.out.println("Mobil belum dibuat, Silahkan buat mobil terlebih dahulu");
        }else{
            Card oldCard = new Card();
            oldCard.name=mobil.name;
            oldCard.asal=mobil.asal;
            oldCard.merek=mobil.merek;
            oldCard.harga=mobil.harga;
            System.out.print("Masukkan nama mobil yang baru : ");
            mobil.name = input.nextLine();
            System.out.print("Masukkan asal mobil yang baru : ");
            mobil.asal = input.nextLine();
            System.out.print("Masukkan merek mobil yang baru : ");
            mobil.merek = input.nextLine();
            System.out.print("Masukkan harga mobil yang baru : ");
            mobil.harga = input.nextInt();
            System.out.println("Mobil sebelum di update");
            oldCard.display();
            System.out.println("Mobil Setelah di update");
            mobil.display();
            oldCard = null;
        } 
    }
    static void remove(){
        if(mobil==null){
            System.out.println("Mobil belum dibuat, Silahkan buat mobil terlebih dahulu");
        }else{
        mobil = null;
            System.out.println("Mobil Berhasil di Hapus");
        }
    }
}

