package com.example.msiraider.newproject.Price.ViewHistory.tenYearRecord;

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

public class tenYearSticky extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ten_year_sticky);
        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        Cartesian cartesian = AnyChart.column();

        List<DataEntry> data = new ArrayList<>();
        data.add(new ValueDataEntry("1-2561", 9398.0));
        data.add(new ValueDataEntry("12-2560", 8754.0));
        data.add(new ValueDataEntry("11-2560", 8680.0));
        data.add(new ValueDataEntry("10-2560", 8618.0));
        data.add(new ValueDataEntry("9-2560", 9712.0));
        data.add(new ValueDataEntry("8-2560", 10263.0));
        data.add(new ValueDataEntry("7-2560", 10474.0));
        data.add(new ValueDataEntry("6-2560", 10610.0));
        data.add(new ValueDataEntry("5-2560", 10549.0));
        data.add(new ValueDataEntry("4-2560", 10573.0));
        data.add(new ValueDataEntry("3-2560", 10775.0));
        data.add(new ValueDataEntry("2-2560", 10891.0));
        data.add(new ValueDataEntry("1-2560", 10934.0));
        data.add(new ValueDataEntry("12-2559", 10540.0));
        data.add(new ValueDataEntry("11-2559", 10069.0));
        data.add(new ValueDataEntry("10-2559", 11743.0));
        data.add(new ValueDataEntry("9-2559", 12861.0));
        data.add(new ValueDataEntry("8-2559", 12965.0));
        data.add(new ValueDataEntry("7-2559", 13183.0));
        data.add(new ValueDataEntry("6-2559", 13070.0));
        data.add(new ValueDataEntry("5-2559", 12772.0));
        data.add(new ValueDataEntry("4-2559", 12049.0));
        data.add(new ValueDataEntry("3-2559", 11717.0));
        data.add(new ValueDataEntry("2-2559", 11604.0));
        data.add(new ValueDataEntry("1-2559", 11372.0));
        data.add(new ValueDataEntry("12-2558",11082.0));
        data.add(new ValueDataEntry("11-2558",11548.0));
        data.add(new ValueDataEntry("10-2558",12241.0));
        data.add(new ValueDataEntry("9-2558",12198.0));
        data.add(new ValueDataEntry("8-2558",11935.0));
        data.add(new ValueDataEntry("7-2558",11401.0));
        data.add(new ValueDataEntry("6-2558",11128.0));
        data.add(new ValueDataEntry("5-2558",11178.0));
        data.add(new ValueDataEntry("4-2558",11202.0));
        data.add(new ValueDataEntry("3-2558",11405.0));
        data.add(new ValueDataEntry("2-2558",11225.0));
        data.add(new ValueDataEntry("1-2558",9687.0));
        data.add(new ValueDataEntry("12-2557",9731.0));
        data.add(new ValueDataEntry("11-2557",9928.0));
        data.add(new ValueDataEntry("10-2557",11387.0));
        data.add(new ValueDataEntry("9-2557",12698.0));
        data.add(new ValueDataEntry("8-2557",12532.0));
        data.add(new ValueDataEntry("7-2557",12453.0));
        data.add(new ValueDataEntry("6-2557",12377.0));
        data.add(new ValueDataEntry("5-2557",12312.0));
        data.add(new ValueDataEntry("4-2557",12328.0));
        data.add(new ValueDataEntry("3-2557",12506.0));
        data.add(new ValueDataEntry("2-2557",12389.0));
        data.add(new ValueDataEntry("1-2557",11417.0));
        data.add(new ValueDataEntry("12-2556",11726.0));
        data.add(new ValueDataEntry("11-2556",14983.0));
        data.add(new ValueDataEntry("10-2556",13963.0));
        data.add(new ValueDataEntry("9-2556",13364.0));
        data.add(new ValueDataEntry("8-2556",13199.0));
        data.add(new ValueDataEntry("7-2556",13016.0));
        data.add(new ValueDataEntry("6-2556",12985.0));
        data.add(new ValueDataEntry("5-2556",12779.0));
        data.add(new ValueDataEntry("4-2556",12720.0));
        data.add(new ValueDataEntry("3-2556",12684.0));
        data.add(new ValueDataEntry("2-2556",12817.0));
        data.add(new ValueDataEntry("1-2556",12427.0));



        CartesianSeriesColumn column = cartesian.column(data);

        column.getTooltip()
                .setTitleFormat("{%X}")
                .setPosition(Position.CENTER_BOTTOM)
                .setAnchor(EnumsAnchor.CENTER_BOTTOM)
                .setOffsetX(0d)
                .setOffsetY(5d)
                .setFormat("{%Value}{groupsSeparator: }");

        cartesian.setAnimation(true);
        cartesian.setTitle("สถิติราคาของข้าวเหนียวย้อนหลัง5ปี");

        cartesian.getYScale().setMinimum(0d);

        cartesian.getYAxis().getLabels().setFormat("{%Value}{groupsSeparator: } บาท");

        cartesian.getTooltip().setPositionMode(TooltipPositionMode.POINT);
        cartesian.getInteractivity().setHoverMode(HoverMode.BY_X);

        cartesian.getXAxis().setTitle("เดือน");
        cartesian.getYAxis().setTitle("ราคา");

        anyChartView.setChart(cartesian);
    }
}
