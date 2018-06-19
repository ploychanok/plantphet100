package com.example.msiraider.newproject.Price.Prediction.Price;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.msiraider.newproject.Price.DataFetching.fetchCornData;
import com.example.msiraider.newproject.R;

/**
 * Created by PC on 5/6/2018.
 */

public class CornPrice extends AppCompatActivity {
    public static TextView cornhomeprice,corn_price3m,corn_price6m,corn_price9m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.corn_price);
        cornhomeprice = (TextView) findViewById(R.id.homeprice);
        corn_price3m = (TextView) findViewById(R.id.corn_price3m);
        corn_price6m = (TextView) findViewById(R.id.corn_price6m);
        corn_price9m = (TextView) findViewById(R.id.corn_price9m);
        fetchCornData process3 = new fetchCornData();
        process3.execute();

        cornhomeprice.setText("6.20");
        corn_price3m.setText("6.26");
        corn_price6m.setText("6.20");
        corn_price9m.setText("5.13");

    }
}
