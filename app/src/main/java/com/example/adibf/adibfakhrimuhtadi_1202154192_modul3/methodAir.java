package com.example.adibf.adibfakhrimuhtadi_1202154192_modul3;

/**
 * Created by adibf on 2/25/2018.
 */

public class methodAir {
    private int id, gambar;
    private String nama, keterangan;

    public methodAir(int id, String nama, int gambar, String keterangan){
        this.id = id;
        this.nama = nama;
        this.gambar = gambar;
        this.keterangan = keterangan;
    }


    public int getId(){
        return id;
    }



    public String getNama() {
        return nama;
    }

    public int getGambar() {
        return gambar;
    }

    public String getKeterangan(){
        return keterangan;
    }
}
