package com.moringaschool.recipe;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyRecipesArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mRecipes;
    private String[] mCuisines;
    public MyRecipesArrayAdapter(Context mContext, int resource, String[] mRecipes, String[] mCuisines) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mRecipes = mRecipes;
        this.mCuisines = mCuisines;
    }

    @Override
    public Object getItem(int position) {
        String recipe = mRecipes[position];
        String cuisine = mCuisines[position];
        return String.format("%s \nServes great: %s", recipe, cuisine);
    }

    @Override
    public int getCount() {
        return mRecipes.length;
    }
}
