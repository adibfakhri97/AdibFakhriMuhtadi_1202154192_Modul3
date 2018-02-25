package com.example.adibf.adibfakhrimuhtadi_1202154192_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

public class DetailAir extends AppCompatActivity {



    TextView nama, keterangan, banyakAir;
    public ImageView gambarAir, levelGambar;
    public String banyakAirtxt;

    private int LevelAirMin = 1;
    private int LevelAir = 1;
    private int LevelAirMaks = 6;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_air);

        nama = (TextView)findViewById(R.id.namaAirDetail);
        keterangan = (TextView)findViewById(R.id.detail);
        gambarAir = (ImageView)findViewById(R.id.fotoDetail);

        int gambarair = getIntent().getIntExtra("gambar",1);

        nama.setText(getIntent().getStringExtra("nama")); // memasukkan data air ke dalam masing-masing TextView

        keterangan.setText(getIntent().getStringExtra("keterangan"));

        gambarAir.setImageDrawable(getResources().getDrawable(gambarair));

        levelGambar = (ImageView) findViewById(R.id.levelbanyakAir);

        banyakAir = (TextView) findViewById(R.id.levelAir);

    }


// method untuk menjalankan perintah onClick pada ImageView plus
    public void tambahAir(View view) {
        LevelAir+= 1;

        if (LevelAir <= LevelAirMaks){ //pernyataan ketika kondisi air masih di bawah kondisi maksimal
            levelGambar.setImageLevel(LevelAir+=0); //setting gambar berdasarkan kondisi banyaknya air
            banyakAir.setText(LevelAir+ " Liter"); //setting text sesuai banyak air

            if (LevelAir == LevelAirMaks){ //jika air sudah penuh
                Toast.makeText(this, "Air Sudah Full", Toast.LENGTH_SHORT).show(); //menampilkan toast air full

            }

        } else {
            LevelAir = LevelAirMaks;
            banyakAirtxt = LevelAir+ " Liter";
        }


    }

    public void kurangiAir(View view) {
        LevelAir-= 1;

        if (LevelAir >= LevelAirMin){
            levelGambar.setImageLevel(LevelAir-=0);
            banyakAir.setText(LevelAir+ " Liter");

            if (LevelAir == LevelAirMin){
                Toast.makeText(this, "Air Sedikit", Toast.LENGTH_SHORT).show();

            }


        } else {
            LevelAir = LevelAirMin;
            banyakAirtxt = LevelAir+ " Liter";
        }

    }
}
