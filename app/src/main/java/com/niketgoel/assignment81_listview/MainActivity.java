package com.niketgoel.assignment81_listview;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ListView lst;
    //ArrayAdapter object
    ArrayAdapter adapter;
    //Array containg the months name
    String[] arr = {"Sun",
            "Mercury ",
            "Venus ",
            "Earth",
            "Mars",
            "Juptier",
            "Neputne",
            "Pluto"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initiling the listview_1
        lst = (ListView) findViewById(R.id.listview_1);
        //Initilazing the ArrayAdapter
        adapter= new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,arr);
        lst.setAdapter(adapter);

    }
    //ButtonA it handles the ascending order by clicking this button
    //It shows a toast aslo
    public void buttonasc(View view) {
        Arrays.sort(arr);
        adapter.notifyDataSetChanged();
        Toast.makeText(this, "Planets in ascending order", Toast.LENGTH_LONG).show();
    }
    //ButtonD it handles the descending order by clicking this button
    //It shows a toast aslo
    public void buttondsc(View view) {
        Arrays.sort(arr, Collections.<String>reverseOrder());
        adapter.notifyDataSetChanged();
        Toast.makeText(this, "Planets in descending order", Toast.LENGTH_LONG).show();
    }
}






