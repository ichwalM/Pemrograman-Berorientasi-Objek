package main;
import java.sql.*;
import java.util.Scanner;

public class Main {
    static final String URL = "jdbc:mysql://localhost:3306/icl_crud";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
            int choice;
            do {
                System.out.print("===Selamat Datadang Di Cave Ezz===\n"
                        + "1. Tambah Menu\n"
                        + "2. Lihat Menu\n"
                        + "3. Cari Menu\n"
                        + "4. Ubah Menu\n"
                        + "5. Hapus Menu\n"
                        + "6. Keluar\n"
                        + "Masukkan Pilihan : ");
                choice = input.nextInt(); input.nextLine();
                switch (choice) {
                    case 1 -> {
                        System.out.print("Nama: ");
                        String nama = input.nextLine();
                        System.out.print("Harga: ");
                        double harga = input.nextDouble();
                        PreparedStatement add = conn.prepareStatement("INSERT INTO produk (nama, harga) VALUES (?, ?)");
                        add.setString(1, nama);
                        add.setDouble(2, harga);
                        add.executeUpdate();
                        System.out.println("Produk berhasil ditambah.");
                    }
                    case 2 -> {
                        ResultSet read = conn.createStatement().executeQuery("SELECT * FROM produk");
                        while (read.next()) {
                            System.out.println(read.getInt("id") 
                                    + ". " + read.getString("nama") 
                                    + " - Rp" 
                                    + read.getDouble("harga"));
                            System.out.println("--------------");
                        }
                    }
                    case 3 -> {
                        System.out.print("ID produk: ");
                        int id = input.nextInt();
                        PreparedStatement src = conn.prepareStatement("SELECT * FROM produk WHERE id=?");
                        src.setInt(1, id);
                        ResultSet rs = src.executeQuery();
                        if (rs.next())
                            System.out.println("Nama: " + rs.getString("nama") + ", Harga: Rp" + rs.getDouble("harga"));
                        else
                            System.out.println("Produk tidak ditemukan.");
                    }
                    case 4 -> {
                        System.out.print("ID produk: ");
                        int id = input.nextInt(); input.nextLine();
                        System.out.print("Nama baru: ");
                        String nama = input.nextLine();
                        System.out.print("Harga baru: ");
                        double harga = input.nextDouble();
                        PreparedStatement ps = conn.prepareStatement("UPDATE produk SET nama=?, harga=? WHERE id=?");
                        ps.setString(1, nama);
                        ps.setDouble(2, harga);
                        ps.setInt(3, id);
                        int hasil = ps.executeUpdate();
                        System.out.println(hasil > 0 ? "Produk diupdate." : "ID tidak ditemukan.");
                    }
                    case 5 -> {
                        System.out.print("ID produk: ");
                        int id = input.nextInt();
                        PreparedStatement ps = conn.prepareStatement("DELETE FROM produk WHERE id=?");
                        ps.setInt(1, id);
                        int hasil = ps.executeUpdate();
                        System.out.println(hasil > 0 ? "Produk dihapus." : "ID tidak ditemukan.");
                    }
                    case 6 -> {
                        System.out.println("exit");
                    }
                    default -> System.out.println("Pilihan tidak valid.");
                }
            } while (choice != 6);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}