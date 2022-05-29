package com.example.project;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener{
    private Cars[] cars;
    private WebView webView;
    private TextView textView;
    ArrayAdapter<Cars> adapter;
    WebView myapp;
    WebView myapp3;
    private Object MainActivity;


    public void showExternalWebPage(int index){
        webView.loadUrl(cars[index].getAuxdata().getImg());
    }
    public void showInternalWebPage(){

    }


    private final String JSON_FILE = "cars.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        new JsonFile(this, this).execute(JSON_FILE);

        webView = findViewById(R.id.myapp);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        if (id == R.id.action_external_web) {
            Intent intent = new Intent(String.valueOf(MainActivity.class));

            return true;
        }

        if (id == R.id.action_internal_web) {
            Log.d("==>","Will display internal web page");
            Intent intent = new Intent(MainActivity.this, SegondActivity.class);
            startActivity(intent);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }



    @Override
    public void onPostExecute(String json) {
        Log.d("==>", json);

        Gson gson = new Gson();
        cars = gson.fromJson(json,Cars[].class);

        ArrayAdapter<Cars> arrayAdapter = new ArrayAdapter<>(this, R.layout.listview_item, R.id.item, cars);
        ListView listView = findViewById(R.id.list_wiew);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
           showExternalWebPage(position);
            }
        });


        for (int i = 0; i < cars.length; i++) {
            Log.d("MainActivity ==>","Hittade ett berg" +  cars[i].getName() + " " + cars[i].getAuxdata().getImg());


        }



    }
}
