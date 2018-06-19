package com.example.msiraider.newproject.Price.DataFetching;

import android.os.AsyncTask;


import com.example.msiraider.newproject.Price.Prediction.Price.CassavaPrice;

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

public class fetchCassavaData extends AsyncTask<Void, Void, Void> {
    public static String data = "";
    public static String month = "";
    public static Double cassavaPrice = 0.0;
    public static String year = "";
    public static String cassavaNew = "";
    public static ArrayList cassavaList = new ArrayList();


    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url = new URL("http://plantphet.ngrok.io/cassava");
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
                cassavaPrice = (Double) JO.get("cassava_price");
                cassavaNew = cassavaPrice.toString();
                cassavaList.add(cassavaNew);

            }
            System.out.println("Cassava:"+cassavaList);

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
        CassavaPrice.cassavahomeprice.setText(cassavaNew);

    }

}
