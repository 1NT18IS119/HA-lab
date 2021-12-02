package com.example.listviewshanmukh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
ListView mylist;
String[] countryList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    mylist = findViewById(R.id.list);
    countryList= getResources().getStringArray(R.array.country);
        ArrayAdapter<String> myadapter= new ArrayAdapter<String>(this,R.layout.country,countryList);
        mylist.setAdapter(myadapter);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "you have clicked:"+parent.getItemAtPosition(i), Toast.LENGTH_SHORT).show();

            }
        });
    }
}