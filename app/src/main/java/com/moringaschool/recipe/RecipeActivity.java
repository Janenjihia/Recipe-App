package com.moringaschool.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;


public class RecipeActivity extends AppCompatActivity {


    @BindView(R.id.cravingTextView) TextView mCravingTextView;
    @BindView(R.id.listView) ListView mListView;

    private String[] recipes = new String[]{"Chicken Curry", "Pasta", "Fried Beef", "mixed veg Rice",
            "Chinese rice", "Meat roll", "Pilau", "Tuna", "Mashed potatoes", "Pizza", " Mixed veges", "baked beans",
            "Beef Tacos", "grilled chicken"};
    private String[] cuisines = new String[] {"Vegan Food", "Breakfast", "Fishs Dishs", "Scandinavian", "Coffee",
            "English Food", "Burgers", "Fast Food", "Noodle Soups", "Mexican", "BBQ", "Cuban", "Bar Food", "Sports Bar",
            "Breakfast", "Mexican" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        ButterKnife.bind(this);

//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, recipes);
//        mListView.setAdapter(adapter);
        MyRecipesArrayAdapter adapter = new MyRecipesArrayAdapter(this, android.R.layout.simple_list_item_1, recipes, cuisines);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String recipe = ((TextView)view).getText().toString();
                Toast.makeText(RecipeActivity.this, recipe, Toast.LENGTH_SHORT).show();
            }
        });

        mCravingTextView.setText("Here are all the recipes: " + craving);
        Log.d("RestaurantsActivity", "In the onCreate method!");
    }

        Intent intent = getIntent();
        String craving = intent.getStringExtra("craving");


    }
