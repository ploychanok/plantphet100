package com.example.msiraider.newproject.Price.ViewHistory.ListRecord;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.msiraider.newproject.Price.ViewHistory.nineMonthRecord.nineMonthCassava;
import com.example.msiraider.newproject.Price.ViewHistory.tenYearRecord.tenYearCassava;
import com.example.msiraider.newproject.Price.ViewHistory.threeMonthRecord.threeMonthCassava;
import com.example.msiraider.newproject.Price.ViewHistory.threeMonthRecord.threeMonthCorn;
import com.example.msiraider.newproject.Price.ViewHistory.twoYearRecord.twoYearCassava;
import com.example.msiraider.newproject.R;

/**
 * Created by PC on 5/6/2018.
 */

public class ListRecordCassava extends AppCompatActivity {
    Button cassava3m,cassava9m,cassava2y,cassava10y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record_cassava);

        cassava3m = (Button) findViewById(R.id.record_cassava_3m);
        cassava9m = (Button) findViewById(R.id.record_cassava_9m);
        cassava2y = (Button) findViewById(R.id.record_cassava_2y);
        cassava10y = (Button) findViewById(R.id.record_cassava_10y);

        cassava3m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListRecordCassava.this,threeMonthCassava.class);
                startActivity(intent);
            }
        });
        cassava9m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListRecordCassava.this,nineMonthCassava.class);
                startActivity(intent);

            }
        });
        cassava2y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListRecordCassava.this,twoYearCassava.class);
                startActivity(intent);

            }
        });
        cassava10y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListRecordCassava.this,tenYearCassava.class);
                startActivity(intent);

            }
        });

    }
}