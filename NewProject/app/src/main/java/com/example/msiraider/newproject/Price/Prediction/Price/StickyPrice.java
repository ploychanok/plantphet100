package com.example.msiraider.newproject.Price.Prediction.Price;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.msiraider.newproject.Price.DataFetching.fetchStickyRice;
import com.example.msiraider.newproject.R;

/**
 * Created by PC on 5/6/2018.
 */

public class StickyPrice extends AppCompatActivity {
    public static TextView stickyhomeprice, sticky_price3m, sticky_price6m, sticky_price9m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sticky_price);
        stickyhomeprice = (TextView) findViewById(R.id.homeprice);
        sticky_price3m = (TextView) findViewById(R.id.sticky_price3m);
        sticky_price6m = (TextView) findViewById(R.id.sticky_price6m);
        sticky_price9m = (TextView) findViewById(R.id.sticky_price9m);
        final fetchStickyRice process2 = new fetchStickyRice();
        process2.execute();

        stickyhomeprice.setText("9050.00");
        sticky_price3m.setText("9220.05");
        sticky_price6m.setText("8830.83");
        sticky_price9m.setText("7225.87");
    }
}
