package com.shirajsayed.foodrecipe;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RecipeListActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list);

        findViewById(R.id.test_progress_bar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RecipeListActivity.this, "CHECK PROGRESS BAR", Toast.LENGTH_SHORT).show();
                if (mProgressBar.getVisibility() == View.VISIBLE) {
                    showProgressBar(false);
                } else showProgressBar(true);
            }
        });
    }
}
