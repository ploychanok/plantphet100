package com.example.msiraider.newproject.Price.ViewHistory.tenYearRecord;

import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.CartesianSeriesColumn;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.EnumsAnchor;
import com.anychart.anychart.HoverMode;
import com.anychart.anychart.Position;
import com.anychart.anychart.TooltipPositionMode;
import com.anychart.anychart.ValueDataEntry;
import com.example.msiraider.newproject.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PC on 5/6/2018.
 */

public class tenYearCorn extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ten_year_corn);
        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        Cartesian cartesian = AnyChart.column();

        List<DataEntry> data = new ArrayList<>();
        data.add(new ValueDataEntry("1-2561", 7.93));
        data.add(new ValueDataEntry("12-2560", 5.41));
        data.add(new ValueDataEntry("11-2560", 4.67));
        data.add(new ValueDataEntry("10-2560", 4.97));
        data.add(new ValueDataEntry("9-2560", 5.59));
        data.add(new ValueDataEntry("8-2560", 5.6));
        data.add(new ValueDataEntry("7-2560", 5.34));
        data.add(new ValueDataEntry("6-2560", 5.84));
        data.add(new ValueDataEntry("5-2560", 5.84));
        data.add(new ValueDataEntry("4-2560", 5.61));
        data.add(new ValueDataEntry("3-2560", 6.68));
        data.add(new ValueDataEntry("2-2560", 6.5));
        data.add(new ValueDataEntry("1-2560", 6.29));
        data.add(new ValueDataEntry("12-2559", 6.13));
        data.add(new ValueDataEntry("11-2559", 5.95));
        data.add(new ValueDataEntry("10-2559", 5.98));
        data.add(new ValueDataEntry("9-2559", 7.03));
        data.add(new ValueDataEntry("8-2559", 7.11));
        data.add(new ValueDataEntry("7-2559", 7.51));
        data.add(new ValueDataEntry("6-2559", 7.5));
        data.add(new ValueDataEntry("5-2559", 7.72));
        data.add(new ValueDataEntry("4-2559", 7.75));
        data.add(new ValueDataEntry("3-2559", 7.61));
        data.add(new ValueDataEntry("2-2559", 8.4));
        data.add(new ValueDataEntry("1-2559", 8.65));
        data.add(new ValueDataEntry("12-2558",7.96));
        data.add(new ValueDataEntry("11-2558",7.86));
        data.add(new ValueDataEntry("10-2558",7.64));
        data.add(new ValueDataEntry("9-2558",7.83));
        data.add(new ValueDataEntry("8-2558",8.34));
        data.add(new ValueDataEntry("7-2558",7.74));
        data.add(new ValueDataEntry("6-2558",7.5));
        data.add(new ValueDataEntry("5-2558",7.56));
        data.add(new ValueDataEntry("4-2558",7.85));
        data.add(new ValueDataEntry("3-2558",8.59));
        data.add(new ValueDataEntry("2-2558",8.64));
        data.add(new ValueDataEntry("1-2558",9.01));
        data.add(new ValueDataEntry("12-2557",8.22));
        data.add(new ValueDataEntry("11-2557",7.64));
        data.add(new ValueDataEntry("10-2557",6.94));
        data.add(new ValueDataEntry("9-2557",6.5));
        data.add(new ValueDataEntry("8-2557",6.82));
        data.add(new ValueDataEntry("7-2557",7.28));
        data.add(new ValueDataEntry("6-2557",7.02));
        data.add(new ValueDataEntry("5-2557",6.9));
        data.add(new ValueDataEntry("4-2557",6.19));
        data.add(new ValueDataEntry("3-2557",6.11));
        data.add(new ValueDataEntry("2-2557",6.1));
        data.add(new ValueDataEntry("1-2557",6.09));
        data.add(new ValueDataEntry("12-2556",6.31));
        data.add(new ValueDataEntry("11-2556",7.22));
        data.add(new ValueDataEntry("10-2556",6.99));
        data.add(new ValueDataEntry("9-2556",6.9));
        data.add(new ValueDataEntry("8-2556",8.46));
        data.add(new ValueDataEntry("7-2556",8.3));
        data.add(new ValueDataEntry("6-2556",9.37));
        data.add(new ValueDataEntry("5-2556",8.86));
        data.add(new ValueDataEntry("4-2556",8.42));
        data.add(new ValueDataEntry("3-2556",8.77));
        data.add(new ValueDataEntry("2-2556",8.87));
        data.add(new ValueDataEntry("1-2556",8.45));


        CartesianSeriesColumn column = cartesian.column(data);

        column.getTooltip()
                .setTitleFormat("{%X}")
                .setPosition(Position.CENTER_BOTTOM)
                .setAnchor(EnumsAnchor.CENTER_BOTTOM)
                .setOffsetX(0d)
                .setOffsetY(5d)
                .setFormat("{%Value}{groupsSeparator: }");

        cartesian.setAnimation(true);
        cartesian.setTitle("สถิติราคาของข้าวโพดย้อนหลัง5ปี");

        cartesian.getYScale().setMinimum(0d);

        cartesian.getYAxis().getLabels().setFormat("{%Value}{groupsSeparator: } บาท");

        cartesian.getTooltip().setPositionMode(TooltipPositionMode.POINT);
        cartesian.getInteractivity().setHoverMode(HoverMode.BY_X);

        cartesian.getXAxis().setTitle("เดือน");
        cartesian.getYAxis().setTitle("ราคา");

        anyChartView.setChart(cartesian);
    }
}
