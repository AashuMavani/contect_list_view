package com.example.contect_list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsView_Activity extends AppCompatActivity {
    TextView title1,title2;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        title1=findViewById(R.id.title1);
        title2=findViewById(R.id.title2);
        image=findViewById(R.id.image);
        int position=getIntent().getIntExtra("position",0);
        String[] name=getIntent().getStringArrayExtra("nameArr");
        String[] subTitle=getIntent().getStringArrayExtra("subTitleArr");
        int[] imgArr=getIntent().getIntArrayExtra("imgArr");

        //Log.d("TTT", "Position= "+position+"\tName="+name[position]);
        image.setImageResource(imgArr[position]);
        title1.setText(name[position]);
        title2.setText(subTitle[position]);

    }
}