package com.rajesh.teacherassistant;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridView;
import java.util.ArrayList;

public class AppBase extends AppCompatActivity {

    ArrayList<String> basicFields;
    com.rajesh.teacherassistant.gridAdapter adapter;
    public static ArrayList<String> divisions ;
    GridView gridView;
    public static databaseHandler handler;
    public static Activity activity;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mai_menu, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_layout);
        basicFields = new ArrayList<>();
        handler = new databaseHandler(this);
        activity = this;

        getSupportActionBar().show();
        divisions = new ArrayList();
        divisions.add("FY");
        divisions.add("SY ");
        divisions.add("TY");
        gridView = (GridView)findViewById(R.id.grid);
        basicFields.add("ATTENDANCE");
        basicFields.add("SCHEDULER");
        basicFields.add("NOTES");
        basicFields.add("PROFILE");
        adapter = new gridAdapter(this,basicFields);
        gridView.setAdapter(adapter);
    }

    public void loadSettings(MenuItem item) {
        Intent launchIntent = new Intent(this,SettingsActivity.class);
        startActivity(launchIntent);
    }

    public void loadAbout(MenuItem item) {
        Intent launchIntent = new Intent(this,About.class);
        startActivity(launchIntent);
    }
}
