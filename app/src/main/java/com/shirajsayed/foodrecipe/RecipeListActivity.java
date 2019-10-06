package com.shirajsayed.foodrecipe;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.shirajsayed.foodrecipe.model.Recipe;
import com.shirajsayed.foodrecipe.requests.RecipeApi;
import com.shirajsayed.foodrecipe.requests.ServiceGenerator;
import com.shirajsayed.foodrecipe.requests.reponses.RecipeResponse;
import com.shirajsayed.foodrecipe.requests.reponses.RecipeSearchResponse;
import com.shirajsayed.foodrecipe.utils.Constant;

import java.io.IOException;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RecipeListActivity extends BaseActivity {
    private static final String TAG = "RecipeListActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list);

        findViewById(R.id.test_progress_bar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //testRecipeSearchRequest();
                testRecipeGetRequest();
            }
        });
    }

    private void testRecipeSearchRequest() {
        final RecipeApi recipeApi = ServiceGenerator.getRecipeApi();
        Call<RecipeSearchResponse> searchResponseCall = recipeApi.searchRecipe(
                Constant.API_KEY,
                "chicken breast",
                "1"
        );

        searchResponseCall.enqueue(new Callback<RecipeSearchResponse>() {
            @Override
            public void onResponse(Call<RecipeSearchResponse> call, Response<RecipeSearchResponse> response) {
                Log.e(TAG, "onResponse: COMPLETE BODY " + response.body().toString());
                if (response.code() == 200) {
                    Log.e(TAG, "onResponse: RECIPES " + response.body().getRecipes());
                    ArrayList<Recipe> recipes = new ArrayList<>(response.body().getRecipes());
                    for (Recipe recipe : recipes) {
                        Log.e(TAG, "onResponse: ONLY RECIPE TITLE " + recipe.getTitle());
                    }

                } else {
                    try {
                        Log.e(TAG, "onResponse: " + response.errorBody().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<RecipeSearchResponse> call, Throwable t) {

            }
        });

    }

    private void testRecipeGetRequest() {
        final RecipeApi recipeApi = ServiceGenerator.getRecipeApi();
        Call<RecipeResponse> recipeResponseCall = recipeApi.recipe(
                Constant.API_KEY,
                "8c0314"
        );

        recipeResponseCall.enqueue(new Callback<RecipeResponse>() {
            @Override
            public void onResponse(Call<RecipeResponse> call, Response<RecipeResponse> response) {
                Log.e(TAG, "onResponse: COMPLETE BODY " + response.toString());
                if (response.code() == 200) {
                    Log.e(TAG, "onResponse: RESPONSE BODY " + response.body().toString());
                    Recipe recipe = response.body().getRecipe();
                    Log.e(TAG, "onResponse: RECIPE " + recipe);

                } else {
                    Log.e(TAG, "onResponse: ERROR BODY " + response.errorBody().toString());
                }
            }

            @Override
            public void onFailure(Call<RecipeResponse> call, Throwable t) {

            }
        });

    }
}
