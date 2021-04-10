package com.example.pertemuan3rv;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<modelAlbum> modelAlbums =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.rvAlbum);
        recyclerView.setHasFixedSize(true);
        modelAlbums.addAll(dataAlbum.getListData());

        showRecyclerList();
    }
    private void showRecyclerList(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterAlbum adapterAlbum= new AdapterAlbum(this);
        adapterAlbum.setModelAlbums(modelAlbums);
        recyclerView.setAdapter(adapterAlbum);
    }
}
