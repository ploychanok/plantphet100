package com.example.msiraider.newproject.Price.ViewHistory.ListRecord;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.msiraider.newproject.Price.ViewHistory.nineMonthRecord.nineMonthCorn;
import com.example.msiraider.newproject.Price.ViewHistory.tenYearRecord.tenYearCassava;
import com.example.msiraider.newproject.Price.ViewHistory.threeMonthRecord.threeMonthCassava;
import com.example.msiraider.newproject.Price.ViewHistory.threeMonthRecord.threeMonthCorn;
import com.example.msiraider.newproject.Price.ViewHistory.twoYearRecord.twoYearCorn;
import com.example.msiraider.newproject.R;

/**
 * Created by PC on 5/6/2018.
 */

public class ListRecordCorn extends AppCompatActivity {
    Button corn3m,corn9m,corn2y,corn10y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record_corn);
        corn3m = (Button) findViewById(R.id.record_corn_3m);
        corn9m = (Button) findViewById(R.id.record_corn_9m);
        corn2y= (Button) findViewById(R.id.record_corn_2y);
        corn10y = (Button) findViewById(R.id.record_corn_10y);

        corn3m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListRecordCorn.this,threeMonthCorn.class);
                startActivity(intent);

            }
        });
        corn9m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListRecordCorn.this,nineMonthCorn.class);
                startActivity(intent);

            }
        });
        corn2y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListRecordCorn.this,twoYearCorn.class);
                startActivity(intent);
            }
        });
        corn10y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListRecordCorn.this,tenYearCassava.class);
                startActivity(intent);

            }
        });
}
    }