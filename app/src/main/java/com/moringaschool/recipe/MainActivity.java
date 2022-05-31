package com.moringaschool.recipe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity  extends AppCompatActivity implements View.OnClickListener{
    private Button mFindRecipeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFindRecipeButton = (Button) findViewById(R.id.findRecipeButton);
        mFindRecipeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "We ensure you get your craving", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, RecipeActivity.class);
                startActivity(intent);
             }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
