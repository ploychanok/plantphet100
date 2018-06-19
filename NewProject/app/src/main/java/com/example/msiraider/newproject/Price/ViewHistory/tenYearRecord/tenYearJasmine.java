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

public class tenYearJasmine extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ten_year_rice);
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
        data.add(new ValueDataEntry("12-2558",11184.0));
        data.add(new ValueDataEntry("11-2558",12012.0));
        data.add(new ValueDataEntry("10-2558",13098.0));
        data.add(new ValueDataEntry("9-2558",13281.0));
        data.add(new ValueDataEntry("8-2558",13073.0));
        data.add(new ValueDataEntry("7-2558",13100.0));
        data.add(new ValueDataEntry("6-2558",13133.0));
        data.add(new ValueDataEntry("5-2558",13340.0));
        data.add(new ValueDataEntry("4-2558",13469.0));
        data.add(new ValueDataEntry("3-2558",13646.0));
        data.add(new ValueDataEntry("2-2558",13678.0));
        data.add(new ValueDataEntry("1-2558",13561.0));
        data.add(new ValueDataEntry("12-2557",13075.0));
        data.add(new ValueDataEntry("11-2557",13401.0));
        data.add(new ValueDataEntry("10-2557",14178.0));
        data.add(new ValueDataEntry("9-2557",14093.0));
        data.add(new ValueDataEntry("8-2557",13992.0));
        data.add(new ValueDataEntry("7-2557",13866.0));
        data.add(new ValueDataEntry("6-2557",13811.0));
        data.add(new ValueDataEntry("5-2557",13845.0));
        data.add(new ValueDataEntry("4-2557",13901.0));
        data.add(new ValueDataEntry("3-2557",14186.0));
        data.add(new ValueDataEntry("2-2557",14222.0));
        data.add(new ValueDataEntry("1-2557",14247.0));
        data.add(new ValueDataEntry("12-2556",14312.0));
        data.add(new ValueDataEntry("11-2556",14983.0));
        data.add(new ValueDataEntry("10-2556",15708.0));
        data.add(new ValueDataEntry("9-2556",15775.0));
        data.add(new ValueDataEntry("8-2556",15674.0));
        data.add(new ValueDataEntry("7-2556",15576.0));
        data.add(new ValueDataEntry("6-2556",15870.0));
        data.add(new ValueDataEntry("5-2556",15808.0));
        data.add(new ValueDataEntry("4-2556",15643.0));
        data.add(new ValueDataEntry("3-2556",15861.0));
        data.add(new ValueDataEntry("2-2556",16069.0));
        data.add(new ValueDataEntry("1-2556",15710.0));


        CartesianSeriesColumn column = cartesian.column(data);

        column.getTooltip()
                .setTitleFormat("{%X}")
                .setPosition(Position.CENTER_BOTTOM)
                .setAnchor(EnumsAnchor.CENTER_BOTTOM)
                .setOffsetX(0d)
                .setOffsetY(5d)
                .setFormat("{%Value}{groupsSeparator: }");

        cartesian.setAnimation(true);
        cartesian.setTitle("สถิติราคาของข้าวหอมมะลิย้อนหลัง5ปี");

        cartesian.getYScale().setMinimum(0d);

        cartesian.getYAxis().getLabels().setFormat("{%Value}{groupsSeparator: } บาท");

        cartesian.getTooltip().setPositionMode(TooltipPositionMode.POINT);
        cartesian.getInteractivity().setHoverMode(HoverMode.BY_X);

        cartesian.getXAxis().setTitle("เดือน");
        cartesian.getYAxis().setTitle("ราคา");

        anyChartView.setChart(cartesian);
    }
}
