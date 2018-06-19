package com.example.ploychanok.subscriber.Farmerlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.ploychanok.subscriber.R;
import com.example.ploychanok.subscriber.homeActivity;

public class farmerlistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.farmerlist);

        ImageButton btnInfo = (ImageButton) findViewById(R.id.btninfo);
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(farmerlistActivity.this,MapInfoActivity.class);
                startActivity(intent);
            }
        });
    }
}
