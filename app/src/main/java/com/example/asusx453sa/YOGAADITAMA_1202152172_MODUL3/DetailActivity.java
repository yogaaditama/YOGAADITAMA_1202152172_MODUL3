package com.example.asusx453sa.YOGAADITAMA_1202152172_MODUL3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private TextView Nminum, Pminum;
    private ImageView imgmenu;
    TextView jmlh;
    ImageView batre;
    Button btplus, btmin;

    private int i = 1;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //inisiasi id yang sesuai

        Nminum = (TextView) findViewById(R.id.textView_nama);
        Pminum = (TextView) findViewById(R.id.textView_pMinum);
        jmlh = (TextView) findViewById(R.id.TextViewjumlah);
        imgmenu = (ImageView) findViewById(R.id.imageViewdetail);
        batre = (ImageView) findViewById(R.id.battray);
        btplus = (Button) findViewById(R.id.btnplus);
        btmin = (Button) findViewById(R.id.btnminus);



        btplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ++i;
                batre.setImageLevel(i);
                jmlh.setText(String.valueOf(i));

            }
        });
        btmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                --i;
                batre.setImageLevel(i);
                jmlh.setText(String.valueOf(i));
            }
        });

        Intent data = getIntent();
        String menu = data.getStringExtra("nama");
        String penminuman = data.getStringExtra("pminuman");
        Integer gmbr = data.getIntExtra("gambar", 0);

        Nminum.setText(menu);
        Pminum.setText(penminuman);
        imgmenu.setImageResource(gmbr);

    }

}