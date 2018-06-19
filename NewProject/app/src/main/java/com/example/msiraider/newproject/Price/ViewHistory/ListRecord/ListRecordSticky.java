package com.example.msiraider.newproject.Price.ViewHistory.ListRecord;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.msiraider.newproject.Price.ViewHistory.nineMonthRecord.nineMonthCassava;
import com.example.msiraider.newproject.Price.ViewHistory.tenYearRecord.tenYearCassava;
import com.example.msiraider.newproject.Price.ViewHistory.threeMonthRecord.threeMonthCassava;
import com.example.msiraider.newproject.Price.ViewHistory.twoYearRecord.twoYearCassava;
import com.example.msiraider.newproject.R;

/**
 * Created by PC on 5/6/2018.
 */

public class ListRecordSticky extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button sticky3m,sticky9m,sticky2y,sticky10y;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record_sticky);

        sticky3m = (Button) findViewById(R.id.record_sticky_3m);
        sticky9m = (Button) findViewById(R.id.record_sticky_9m);
        sticky2y = (Button) findViewById(R.id.record_sticky_2y);
        sticky10y = (Button) findViewById(R.id.record_sticky_10y);

        sticky3m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListRecordSticky.this,threeMonthCassava.class);
                startActivity(intent);
            }
        });
        sticky9m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListRecordSticky.this,nineMonthCassava.class);
                startActivity(intent);

            }
        });
        sticky2y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListRecordSticky.this,twoYearCassava.class);
                startActivity(intent);

            }
        });
        sticky10y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListRecordSticky.this,tenYearCassava.class);
                startActivity(intent);
            }
        });
    }
}