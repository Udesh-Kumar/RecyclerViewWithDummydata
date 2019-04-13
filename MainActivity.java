package com.example.cc.recyclviewwithmodel;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    ArrayList<Integer> itemsimg = new ArrayList<>();
    List<String> data=new ArrayList<>();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        context=MainActivity.this;
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));


        data.add("Goku");//To pass data
        data.add("Berrus Sama");
        data.add("Gohan");
        data.add("Brolly");
        data.add("Freeza");
        data.add("Harrican");








        itemsimg.add(R.drawable.goku);
        itemsimg.add(R.drawable.beerussama);
        itemsimg.add(R.drawable.gohan);
        itemsimg.add(R.drawable.brolly);
        itemsimg.add(R.drawable.freeza);
        itemsimg.add(R.drawable.huriccan);



        MyAdapter myAdapter=new MyAdapter(context,data,itemsimg);
        recyclerView.setAdapter(myAdapter);


    }
}
