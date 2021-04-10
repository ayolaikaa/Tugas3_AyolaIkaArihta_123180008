package com.example.pertemuan3rv;



import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterAlbum extends RecyclerView.Adapter<AdapterAlbum.ViewHolder> {
    private ArrayList<modelAlbum> modelAlbums;
    private Context context;

    public AdapterAlbum(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow= LayoutInflater.from(parent.getContext()).inflate(R.layout.detail,parent,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(context).load(getModelAlbum().get(position).albumImages).into(holder.ivAlbum);
        holder.tvNama.setText(getModelAlbum().get(position).albumNames);
        holder.tvDetail.setText(getModelAlbum().get(position).albumDetails);
        holder.itemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Main2Activity.class);
                intent.putExtra("nama",getModelAlbum().get(position).albumNames);
                intent.putExtra("detail",getModelAlbum().get(position).albumDetails);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getModelAlbum().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivAlbum;
        private TextView tvNama, tvDetail;
        LinearLayout itemLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivAlbum= itemView.findViewById(R.id.ivAlbum);
            tvNama=itemView.findViewById(R.id.tvNama);
            tvDetail=itemView.findViewById(R.id.tvDetail);
            itemLayout=itemView.findViewById(R.id.Item);
        }
    }

    public ArrayList<modelAlbum> getModelAlbum() {
        return modelAlbums;
    }

    public void setModelAlbums(ArrayList<modelAlbum> modelAlbums) {
        this.modelAlbums = modelAlbums;
    }
}
