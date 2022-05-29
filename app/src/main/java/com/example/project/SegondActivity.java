package com.example.project;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class SegondActivity extends AppCompatActivity {

    public void showExternalWebPage(){

    }
    public void showInternalWebPage(){

    }


   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.content_main);
       Toolbar toolbar = findViewById(R.id.toolbar);
       setSupportActionBar(toolbar);





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
            Intent intent = new Intent(SegondActivity.this, MainActivity.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.action_internal_web) {
            Log.d("==>","Will display internal web page");

            return true;
        }


        return super.onOptionsItemSelected(item);
    }




}
