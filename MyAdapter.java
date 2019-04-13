package com.example.cc.recyclviewwithmodel;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    Context context;
    List<String> data;
    ArrayList<Integer> itemsimg;


    MyAdapter(Context context, List<String> data,ArrayList<Integer> itemsimg){
        this.context=context;
        this.data=data;
        this.itemsimg=itemsimg;


    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {



        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View v=inflater.inflate(R.layout.recycler_view_items,viewGroup,false);

        return new MyViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {


        myViewHolder.textViewww.setText(data.get(i));
        myViewHolder.images.setImageResource(itemsimg.get(i));
    }

    @Override
    public int getItemCount() {

        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textViewww;
        ImageView images;


        public MyViewHolder(@NonNull View itemView) {
                super(itemView);

            textViewww=itemView.findViewById(R.id.textViewww);
            images=itemView.findViewById(R.id.imageView1);



        }
    }
}

