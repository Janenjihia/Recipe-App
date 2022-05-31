package com.moringaschool.recipe;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity  extends AppCompatActivity {
//    @BindView(R.id.findRecipeButton) Button mFindRecipeButton;
//    @BindView(R.id.appNameTextView) TextView mAppNameTextView;
////    @BindView(R.id.locationEditText) EditText mLocationEditText;
//    private EditText mLocationEditText;
//
//    public static final String TAG = MainActivity.class.getSimpleName();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        ButterKnife.bind(this);
//
//        mFindRecipeButton = (Button) findViewById(R.id.findRecipeButton);
//        mFindRecipeButton.setOnClickListener(new View.OnClickListener() {
//
//
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "We ensure you get your craving", Toast.LENGTH_LONG).show();
//                Intent intent = new Intent(MainActivity.this, RecipeActivity.class);
//                startActivity(intent);
//            }
//        });
//    }
//
//    @Override
//    public void onClick(View v) {
//        String location = mLocationEditText.getText().toString();
//        Intent intent = new Intent(MainActivity.this, RecipeActivity.class);
//        intent.putExtra("location", location);
//        startActivity(intent);
//    }
@BindView(R.id.findRecipeButton) Button mFindRestaurantsButton;
    @BindView(R.id.cravingEditText) EditText mCravingEditText;
    @BindView(R.id.appNameTextView) TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mFindRestaurantsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location = mCravingEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, RecipeActivity.class);
                intent.putExtra("location", location);
                startActivity(intent);
            }
        });
    }
}
