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


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.findRecipeButton) Button mFindRecipeButton;
    @BindView(R.id.cravingEditText) EditText mCravingEditText;
    @BindView(R.id.appNameTextView) TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mFindRecipeButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mFindRecipeButton) {
            String location = mCravingEditText.getText().toString();
            Intent intent = new Intent(MainActivity.this, RecipeActivity.class);
            intent.putExtra("location", location);
            startActivity(intent);
        }
    }
}
