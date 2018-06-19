package com.example.msiraider.newproject.Price.Prediction;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.msiraider.newproject.HomeActivity;
import com.example.msiraider.newproject.Price.Prediction.Price.CassavaPrice;
import com.example.msiraider.newproject.Price.Prediction.Price.CornPrice;
import com.example.msiraider.newproject.Price.Prediction.Price.JasmineRice;
import com.example.msiraider.newproject.Price.Prediction.Price.StickyPrice;
import com.example.msiraider.newproject.Price.ViewHistory.threeMonthRecord.threeMonthCassava;
import com.example.msiraider.newproject.R;

/**
 * Created by PC on 5/6/2018.
 */

public class PreditionActivity extends AppCompatActivity {
    Button top,buttonlist1,buttonlist2,buttonlist3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.price);
        top = (Button) findViewById(R.id.top);
        buttonlist1 = (Button) findViewById(R.id.buttonlist1);
        buttonlist2 = (Button) findViewById(R.id.buttonlist2);
        buttonlist3 = (Button) findViewById(R.id.buttonlist3);

        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreditionActivity.this,CassavaPrice.class);
                startActivity(intent);
            }
        });
        buttonlist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreditionActivity.this,StickyPrice.class);
                startActivity(intent);
            }
        });
        buttonlist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreditionActivity.this,JasmineRice.class);
                startActivity(intent);
            }
        });
        buttonlist3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreditionActivity.this,CornPrice.class);
                startActivity(intent);

            }
        });



    }
}