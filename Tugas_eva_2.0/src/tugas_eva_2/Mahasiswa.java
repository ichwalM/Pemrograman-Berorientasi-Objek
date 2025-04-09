/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_eva_2;

public class Mahasiswa {
    private String stambuk,nama;
    private int angkatan;
    
    public Mahasiswa(String stambuk, String nama, int angkatan){
        this.stambuk=stambuk;
        this.nama=nama;
        this.angkatan=angkatan;
    }
    public String getStambuk(){
        return stambuk;
    }
    public String  getNama(){
        return nama;
    }
    public int getAngkatan(){
        return angkatan;
    }
}
