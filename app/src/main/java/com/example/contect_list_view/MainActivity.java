package com.example.contect_list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String name[]={"Dhyey","Dhyana","Angle","Mansvi","Nirmal","Aman","Dhruv","Harekrishna","Mahir","Namr","Swra","Rahul"};
    String subtitle[]={"9825556734","9943526725","9745624356","7654334256","9745624356","9745624356",
            "9745624356","9745624356","9745624356","9745624356","9745624356","9745624356"};
    int img[]={R.drawable.d,R.drawable.d,R.drawable.a,R.drawable.m,R.drawable.n,R.drawable.a,
               R.drawable.d,R.drawable.h,R.drawable.m,R.drawable.n,R.drawable.s,R.drawable.r};

    CustomAdapter adapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);


        adapter=new CustomAdapter(MainActivity.this,name,subtitle,img);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this, DetailsView_Activity.class);
                intent.putExtra("position",position);
                intent.putExtra("nameArr",name);
                intent.putExtra("subTitleArr",subtitle);
                intent.putExtra("imgArr",img);
                startActivity(intent);
                //finish();
            }
        });
    }
}