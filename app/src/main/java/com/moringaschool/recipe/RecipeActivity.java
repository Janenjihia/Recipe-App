package com.moringaschool.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.ButterKnife;


public class RecipeActivity extends AppCompatActivity {
    private TextView mLocationTextView;
    private ListView mListView;
    private String[] recipes = new String[]{"Chicken Curry", "Pasta", "Fried Beef", "mixed veg Rice",
            "Chinese rice", "Meat roll", "Pilau", "Tuna", "Mashed potatoes", "Pizza", " Mixed veges", "baked beans",
            "Beef Tacos", "grilled chicken"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        ButterKnife.bind(this);


        mListView = findViewById(R.id.listView);
        mLocationTextView = (TextView) findViewById(R.id.locationTextView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, recipes);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String restaurant = ((TextView)view).getText().toString();
            }
        });

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("Here are all the recipes: " + location);


    }
}