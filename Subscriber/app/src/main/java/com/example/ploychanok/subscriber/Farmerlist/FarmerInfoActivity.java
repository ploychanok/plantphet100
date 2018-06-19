package com.example.ploychanok.subscriber.Farmerlist;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

import com.example.ploychanok.subscriber.R;

import org.osmdroid.api.IMapController;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;
import org.osmdroid.views.overlay.mylocation.MyLocationNewOverlay;

public class FarmerInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MyLocationNewOverlay myLocationNewOverlay;
        MapView map = null;
        Context context;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_info);

        Context ctx = getApplicationContext();
        Configuration.getInstance().load(ctx, PreferenceManager.getDefaultSharedPreferences(ctx));
        setContentView(R.layout.map);
        map = (MapView) findViewById(R.id.mapview);
        map.setTileSource(TileSourceFactory.MAPNIK);
        map.setBuiltInZoomControls(true);
        map.setMultiTouchControls(true);
        IMapController mapController = map.getController();
        mapController.setZoom(15.3);
        ;
        GeoPoint startPoint = new GeoPoint(18.7061, 98.9817);
        mapController.setCenter(startPoint);

        GeoPoint secondStartPoint = new GeoPoint(18.7082,98.9820);

        Marker marker = new Marker(map);
        marker.setPosition(startPoint);
        marker.showInfoWindow();
        marker.setAnchor(Marker.ANCHOR_CENTER,Marker.ANCHOR_BOTTOM);
        marker.setIcon(getResources().getDrawable(R.drawable.ic_place_cassava_24dp));
        marker.setTitle("สวนลุงแซม:มันสำปะหลัง");
        map.getOverlays().add(marker);
        map.invalidate();

    }
}

