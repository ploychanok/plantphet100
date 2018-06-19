package com.example.ploychanok.subscriber.Map;

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
import org.osmdroid.views.overlay.mylocation.GpsMyLocationProvider;
import org.osmdroid.views.overlay.mylocation.MyLocationNewOverlay;

public class MapActivity extends AppCompatActivity {
    MyLocationNewOverlay myLocationNewOverlay;
    MapView map = null;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

        Marker marker1 = new Marker(map);
        marker1.setPosition(secondStartPoint);
        marker1.showInfoWindow();
        marker1.setAnchor(Marker.ANCHOR_CENTER,Marker.ANCHOR_BOTTOM);
        marker1.setIcon(getResources().getDrawable(R.drawable.ic_place_cassava_24dp));
        marker1.setTitle("ฟาร์มลุงไก่:มันสำปะหลัง");
        map.getOverlays().add(marker1);
        map.invalidate();
        GeoPoint thirdStartPoint = new GeoPoint(18.7090,98.9810);

        Marker marker2 = new Marker(map);
        marker2.setPosition(thirdStartPoint);
        marker2.showInfoWindow();
        marker2.setAnchor(Marker.ANCHOR_CENTER,Marker.ANCHOR_BOTTOM);
        marker2.setIcon(getResources().getDrawable(R.drawable.ic_place_rice_24dp));
        marker2.setTitle("ข้าวโพดบ้านฉันสาขา1:ข้าวโพดเลี้ยงสัตว์");
        map.getOverlays().add(marker2);
        map.invalidate();

//        this.myLocationNewOverlay = new MyLocationNewOverlay(new GpsMyLocationProvider(getApplicationContext()), map);
//        this.myLocationNewOverlay.enableMyLocation();
//        map.getOverlays().add(this.myLocationNewOverlay);
    }

        public void onResume(){
            super.onResume();
            map.onResume();
        }
        public void onPause(){
        super.onPause();
        map.onPause();
        }

    }

