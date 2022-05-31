package com.moringaschool.recipe;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity  extends AppCompatActivity implements View.OnClickListener {
    private Button mFindRecipeButton;
    public static final String TAG = MainActivity.class.getSimpleName();
    private EditText mLocationEditText;


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
        String location = mLocationEditText.getText().toString();
        Log.d(TAG, location);
        Intent intent = new Intent(MainActivity.this, RecipeActivity.class);
        startActivity(intent);Toast.makeText(MainActivity.this, location, Toast.LENGTH_LONG).show();

    }
}
