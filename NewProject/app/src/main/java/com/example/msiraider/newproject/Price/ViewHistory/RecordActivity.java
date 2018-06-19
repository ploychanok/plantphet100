package com.example.msiraider.newproject.Price.ViewHistory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.example.msiraider.newproject.Price.ViewHistory.ListRecord.ListRecordCassava;
import com.example.msiraider.newproject.Price.ViewHistory.ListRecord.ListRecordCorn;
import com.example.msiraider.newproject.Price.ViewHistory.ListRecord.ListRecordJasmine;
import com.example.msiraider.newproject.Price.ViewHistory.ListRecord.ListRecordSticky;
import com.example.msiraider.newproject.R;

/**
 * Created by MSI Raider on 27/3/2561.
 */

public class RecordActivity extends AppCompatActivity {
//    public static ImageButton top, buttonlist1, buttonlist2, buttonlist3;
//    public static TextView rice,cassava,corn,sticky;
    public static Button recordCassava,recordSticky,recordjasmine,recordCorn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record);
        recordCassava = (Button) findViewById(R.id.record_cassava);
        recordSticky = (Button) findViewById(R.id.record_sticky);
        recordjasmine = (Button) findViewById(R.id.record_jusmine);
        recordCorn = (Button)findViewById(R.id.record_corn);

        recordCassava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecordActivity.this,ListRecordCassava.class);
                startActivity(intent);
            }
        });
        recordSticky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecordActivity.this,ListRecordSticky.class);
                startActivity(intent);
            }
        });
        recordjasmine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecordActivity.this,ListRecordJasmine.class);
                startActivity(intent);
            }
        });
        recordCorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecordActivity.this,ListRecordCorn.class);
                startActivity(intent);
            }
        });

    }
}
