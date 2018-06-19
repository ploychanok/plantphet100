package com.example.msiraider.newproject.Price.ViewHistory.ListRecord;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.msiraider.newproject.Price.ViewHistory.nineMonthRecord.nineMonthCorn;
import com.example.msiraider.newproject.Price.ViewHistory.nineMonthRecord.nineMonthJasmine;
import com.example.msiraider.newproject.Price.ViewHistory.tenYearRecord.tenYearCassava;
import com.example.msiraider.newproject.Price.ViewHistory.tenYearRecord.tenYearJasmine;
import com.example.msiraider.newproject.Price.ViewHistory.threeMonthRecord.threeMonthCorn;
import com.example.msiraider.newproject.Price.ViewHistory.threeMonthRecord.threeMonthJasmine;
import com.example.msiraider.newproject.Price.ViewHistory.twoYearRecord.twoYearCorn;
import com.example.msiraider.newproject.Price.ViewHistory.twoYearRecord.twoYearJasmine;
import com.example.msiraider.newproject.R;

/**
 * Created by PC on 5/6/2018.
 */

public class ListRecordJasmine extends AppCompatActivity {
    Button jasmine3m,jasmine9m,jasmine2y,jasmine10y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record_jasmine);


        jasmine3m = (Button) findViewById(R.id.record_jasmine_3m);
        jasmine9m = (Button) findViewById(R.id.record_jasmine_9m);
        jasmine2y= (Button) findViewById(R.id.record_jasmine_2y);
        jasmine10y = (Button) findViewById(R.id.record_jasmine_10y);

        jasmine3m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListRecordJasmine.this,threeMonthJasmine.class);
                startActivity(intent);

            }
        });
        jasmine9m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListRecordJasmine.this,nineMonthJasmine.class);
                startActivity(intent);

            }
        });
        jasmine2y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListRecordJasmine.this,twoYearJasmine.class);
                startActivity(intent);
            }
        });
        jasmine10y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListRecordJasmine.this,tenYearJasmine.class);
                startActivity(intent);

            }
        });
    }
}

