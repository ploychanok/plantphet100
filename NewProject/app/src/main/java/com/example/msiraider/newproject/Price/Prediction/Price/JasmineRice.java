package com.example.msiraider.newproject.Price.Prediction.Price;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.msiraider.newproject.Price.DataFetching.fetchRiceData;
import com.example.msiraider.newproject.R;

/**
 * Created by PC on 5/6/2018.
 */

public class JasmineRice extends AppCompatActivity {
    public static TextView ricehomeprice, jasmine_price3m, jasmine_price6m, jasmine_price9m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rice_price);
        ricehomeprice = (TextView) findViewById(R.id.homeprice);
        jasmine_price3m = (TextView) findViewById(R.id.rice_price3m);
        jasmine_price6m = (TextView) findViewById(R.id.rice_price6m);
        jasmine_price9m = (TextView) findViewById(R.id.rice_price9m);
        fetchRiceData process1 = new fetchRiceData();
        process1.execute();

        ricehomeprice.setText("14225.90");
        jasmine_price3m.setText("14459.27");
        jasmine_price6m.setText("15862.64");
        jasmine_price9m.setText("16915.30");
    }
}