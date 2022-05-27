package com.example.project;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener{
    private Cars[] cars;


    public void showInternalWebPage(){
        // TODO: Add your code for showing internal web page here
    }


    private final String JSON_FILE = "cars.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        new JsonFile(this, this).execute(JSON_FILE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        if (id == R.id.action_internal_web) {
            Log.d("==>","Will display internal web page");
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



        ListView listView = findViewById(R.id.list_wiew  );
        listView.setAdapter(arrayAdapter);

    }
}
