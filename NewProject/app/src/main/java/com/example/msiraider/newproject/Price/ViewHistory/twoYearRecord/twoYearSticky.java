package com.example.msiraider.newproject.Price.ViewHistory.twoYearRecord;

import android.os.Bundle;
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

public class twoYearSticky extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_year_sticky);
        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        Cartesian cartesian = AnyChart.column();

        List<DataEntry> data = new ArrayList<>();
        data.add(new ValueDataEntry("1-2561", 13685.0));
        data.add(new ValueDataEntry("12-2560", 12729.0));
        data.add(new ValueDataEntry("11-2560", 11451.0));
        data.add(new ValueDataEntry("10-2560", 11530.0));
        data.add(new ValueDataEntry("9-2560", 11341.0));
        data.add(new ValueDataEntry("8-2560", 10468.0));
        data.add(new ValueDataEntry("7-2560", 10094.0));
        data.add(new ValueDataEntry("6-2560", 9438.0));
        data.add(new ValueDataEntry("5-2560", 9136.0));
        data.add(new ValueDataEntry("4-2560", 9091.0));
        data.add(new ValueDataEntry("3-2560", 9259.0));
        data.add(new ValueDataEntry("2-2560", 9307.0));
        data.add(new ValueDataEntry("1-2560", 9242.0));
        data.add(new ValueDataEntry("12-2559", 8944.0));
        data.add(new ValueDataEntry("11-2559", 8366.0));
        data.add(new ValueDataEntry("10-2559", 9516.0));
        data.add(new ValueDataEntry("9-2559", 10697.0));
        data.add(new ValueDataEntry("8-2559", 11009.0));
        data.add(new ValueDataEntry("7-2559", 11130.0));
        data.add(new ValueDataEntry("6-2559", 11062.0));
        data.add(new ValueDataEntry("5-2559", 10900.0));
        data.add(new ValueDataEntry("4-2559", 10588.0));
        data.add(new ValueDataEntry("3-2559", 10724.0));
        data.add(new ValueDataEntry("2-2559", 10798.0));
        data.add(new ValueDataEntry("1-2559", 10547.0));


        CartesianSeriesColumn column = cartesian.column(data);

        column.getTooltip()
                .setTitleFormat("{%X}")
                .setPosition(Position.CENTER_BOTTOM)
                .setAnchor(EnumsAnchor.CENTER_BOTTOM)
                .setOffsetX(0d)
                .setOffsetY(5d)
                .setFormat("{%Value}{groupsSeparator: } บาท");

        cartesian.setAnimation(true);
        cartesian.setTitle("สถิติราคาของข้าวเหนียวย้อนหลัง2ปี");

        cartesian.getYScale().setMinimum(0d);

        cartesian.getYAxis().getLabels().setFormat("{%Value}{groupsSeparator: } บาท");

        cartesian.getTooltip().setPositionMode(TooltipPositionMode.POINT);
        cartesian.getInteractivity().setHoverMode(HoverMode.BY_X);

        cartesian.getXAxis().setTitle("เดือน");
        cartesian.getYAxis().setTitle("ราคา");

        anyChartView.setChart(cartesian);
    }
}
