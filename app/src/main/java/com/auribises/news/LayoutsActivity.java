package com.auribises.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LayoutsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lRef;
    ArrayAdapter<String> adapter;
    void initViews(){

        lRef = findViewById(R.id.listView);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        adapter.add("Zee News"); // 0
        adapter.add("NDTV");      // 1
        adapter.add("Aaj Tak");  // 2
        adapter.add("ABP");      // 3
        adapter.add("BBC");      // 4
        adapter.add("News18");   // 5

        lRef.setAdapter(adapter);
        lRef.setOnItemClickListener(this);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        getSupportActionBar().setTitle("News");
        initViews();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        if(position == 0){
            String url = "https://zeenews.india.com";
            Intent intent = new Intent(LayoutsActivity.this, NewsActivity.class);
            intent.putExtra("keyUrl", url);
            startActivity(intent);
        }
        else if(position == 1){
            String url = "https://www.ndtv.com";
            Intent intent = new Intent(LayoutsActivity.this, NewsActivity.class);
            intent.putExtra("keyUrl", url);
            startActivity(intent);
        }
        else if(position == 2){
            String url = "https://aajtak.intoday.in/";
            Intent intent = new Intent(LayoutsActivity.this, NewsActivity.class);
            intent.putExtra("keyUrl", url);
            startActivity(intent);
        }
        else if(position == 3){
            String url = "https://abpnews.abplive.in/";
            Intent intent = new Intent(LayoutsActivity.this, NewsActivity.class);
            intent.putExtra("keyUrl", url);
            startActivity(intent);
        }
        else if(position == 4){
            String url = "https://www.bbc.com";
            Intent intent = new Intent(LayoutsActivity.this, NewsActivity.class);
            intent.putExtra("keyUrl", url);
            startActivity(intent);
        }
        else {
            String url = "https://www.news18.com/";
            Intent intent = new Intent(LayoutsActivity.this, NewsActivity.class);
            intent.putExtra("keyUrl", url);
            startActivity(intent);
        }

    }
}
