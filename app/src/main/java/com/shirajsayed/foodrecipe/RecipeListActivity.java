package com.shirajsayed.foodrecipe;

import android.os.Bundle;
import android.view.View;

public class RecipeListActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list);

        findViewById(R.id.hello).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mProgressBar.getVisibility() == View.VISIBLE) {
                    showProgressBar(false);
                } else showProgressBar(true);
            }
        });
    }
}
