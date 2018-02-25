package com.example.asusx453sa.YOGAADITAMA_1202152172_MODUL3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMinuman extends AppCompatActivity {
    private RecyclerView RVview;
    private RecyclerView.Adapter RVadapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> NamaMinuman;
    private ArrayList<String> ALminuman;
    private ArrayList<Integer> gambar;

    //Daftar Menu merek
    private String[] Nminuman = {
            "Aqua",
            "Pristine",
            "LeMineral",
            "Cleo",
            "Club",
            "Amidis",
            "Ades",
            "Equil",
             "Evian",
             "Nestle",
             "Vit"};

    //daftar harga
    private String[] PMinum = {
            "ini adalah minuman aqua", "ini adalah minuman pristine",
            "ini adalah minuman LeMineral", "ini adalah minuman Cleo  ",
            "ini adalah minuman Club", "ini adalah minuman Amidis",
            "ini adalah minuman Ades", "ini adalah minuman Equil",
            "ini adalah minuman Evian", "ini adalah minuman Nestle",
            "ini adalah minuman Vit"};

    //Daftar Gambar
    private int[] Gambar = {R.drawable.img_aqua,
            R.drawable.img_pristine,
            R.drawable.img_leminerale,
            R.drawable.img_cleo,
            R.drawable.img_club,
            R.drawable.img_amidis,
            R.drawable.img_ades,
            R.drawable.img_equil,
            R.drawable.img_evian,
            R.drawable.img_nestle,
            R.drawable.img_vit,};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_minuman);

        //mendeklrasikan array data menu, harga, image
        NamaMinuman = new ArrayList<>();
        ALminuman = new ArrayList<>();
        gambar = new ArrayList<>();
        DaftarItem();

        //inisisasi
        RVview = (RecyclerView) findViewById(R.id.Rview);
        RVview.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        RVview.setLayoutManager(layoutManager);

        RVadapter = new RecyclerViewAdapter(NamaMinuman, ALminuman, gambar);
        RVview.setAdapter(RVadapter);

    }
    //Mengambil data dari Varibale Gambar dan Judul, lalu memasangnya pada list yang terhubung dengan Class Adapter
    private void DaftarItem() {
        for (int w = 0; w < Nminuman.length; w++) {
            NamaMinuman.add(Nminuman[w]);
            ALminuman.add(PMinum[w]);
            gambar.add(Gambar[w]);
        }
    }
}



