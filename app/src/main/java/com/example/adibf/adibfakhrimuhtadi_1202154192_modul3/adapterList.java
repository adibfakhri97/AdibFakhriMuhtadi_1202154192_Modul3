package com.example.adibf.adibfakhrimuhtadi_1202154192_modul3;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by adibf on 2/25/2018.
 */

public class adapterList extends RecyclerView.Adapter<adapterList.ListViewHolder> {

    static List<methodAir> bMenu;
    static Context aContext;

    public adapterList(Context aContext, List<methodAir> bMenu) {
        this.aContext = aContext;
        this.bMenu = bMenu;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inf = LayoutInflater.from(aContext);
        View view = inf.inflate(R.layout.layout_air, null);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        final methodAir current = bMenu.get(position); //membuat variable current dengan class methodAir
        holder.cNama.setText(current.getNama());
  //      holder.cKeterangan.setText(current.getKeterangan());
        holder.cGambar.setImageDrawable(aContext.getResources().getDrawable(current.getGambar()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(aContext, DetailAir.class); //Mengambil data air dengan method yang ada pada class methodAir
                intent.putExtra("nama", current.getNama());
                intent.putExtra("gambar", current.getGambar());
                intent.putExtra("keterangan", current.getKeterangan());
                aContext.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return bMenu.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView cNama, cKeterangan;
        ImageView cGambar;


        public ListViewHolder(View itemView) {
            super(itemView);
            cNama = (TextView) itemView.findViewById(R.id.namaAir); //menampilkan data air
            cKeterangan = (TextView) itemView.findViewById(R.id.keteranganAir);
            cGambar = (ImageView) itemView.findViewById(R.id.gambarAir);


        }

    }
}
