package com.example.inflater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<students> st = new ArrayList<students>();
        st.add(new students("ali", "Asdf", "Alpha",R.drawable.apple));

        lst = findViewById(R.id.listview);

        MyAdaptor ad = new MyAdaptor(this, st);

        lst.setAdapter(ad);

    }
}