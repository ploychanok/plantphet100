package com.example.msiraider.newproject.Price.DataFetching;

import android.os.AsyncTask;

import com.example.msiraider.newproject.Price.Prediction.Price.StickyPrice;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class fetchStickyRice extends AsyncTask<Void, Void, Void> {
    String data = "";
    String month = "";
    String year = "";
    Double stickyricePrice = 0.0;
    String stickyriceNew = "";
    public static ArrayList stickyList = new ArrayList();


    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url = new URL("http://plantphet.ngrok.io/sticky");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while (line != null) {
                line = bufferedReader.readLine();
                data = data + line;


            }
            JSONArray JA = new JSONArray(data);
            for (int i = 0; i < JA.length(); i++) {
                JSONObject JO = (JSONObject) JA.get(i);
                stickyricePrice = (Double) JO.get("sticky_price");
                stickyriceNew = stickyricePrice.toString();
                stickyList.add(stickyriceNew);
            }
            System.out.println("Sticky Rice:"+stickyList);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
    //Casava https://api.myjson.com/bins/167ycv

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        StickyPrice.stickyhomeprice.setText(stickyriceNew);

    }

}
