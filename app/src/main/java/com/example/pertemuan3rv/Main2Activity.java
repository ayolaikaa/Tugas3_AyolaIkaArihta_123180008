package com.example.pertemuan3rv;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

class Main2Activity extends AppCompatActivity {
    private TextView tvNama,tvDetail;
    private ImageView ivAlbum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvNama= findViewById(R.id.tvNama);
        tvDetail= findViewById(R.id.tvDetail);

        Bundle bundle= getIntent().getExtras();
        String nama= bundle.getString("nama");
        String detail= bundle.getString("detail");


        tvNama.setText(nama);
        tvDetail.setText(detail);
    }
}

