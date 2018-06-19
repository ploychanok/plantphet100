package com.example.msiraider.newproject;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.msiraider.newproject.FAQ.FaqHomeActivity;
import com.example.msiraider.newproject.Map.MapActivity;
import com.example.msiraider.newproject.Price.Prediction.PreditionActivity;
import com.example.msiraider.newproject.Price.ViewHistory.ListRecord.ListRecordCassava;
import com.example.msiraider.newproject.Price.ViewHistory.RecordActivity;
import com.example.msiraider.newproject.Price.ViewHistory.threeMonthRecord.threeMonthCassava;
import com.example.msiraider.newproject.Register.RegisterActivity;

public class HomeActivity extends AppCompatActivity {
    ImageButton price,map,graph,faq,register;
    TextView logo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        price = (ImageButton) findViewById(R.id.price);
        map = (ImageButton) findViewById(R.id.map);
        graph = (ImageButton) findViewById(R.id.graph);
        faq = (ImageButton) findViewById(R.id.faq);

        register = (ImageButton) findViewById(R.id.register);
        faq =(ImageButton)findViewById(R.id.faq);

        price.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,PreditionActivity.class);
                startActivity(intent);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,MapActivity.class);
                startActivity(intent);

            }
        });
        graph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,RecordActivity.class);
                startActivity(intent);
            }
        });


        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,FaqHomeActivity.class);
                startActivity(intent);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });



    }
}
