package com.shirajsayed.foodrecipe.requests.reponses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.shirajsayed.foodrecipe.model.Recipe;

import java.util.ArrayList;

/**
 * @author Shiraj Sayed
 */
public class RecipeSearchResponse {

    @SerializedName("count")
    @Expose
    private int count;

    @SerializedName("recipes")
    @Expose
    private ArrayList<Recipe> recipes;

    public int getCount() {
        return count;
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    @Override
    public String toString() {
        return "RecipeSearchResponse{" +
                "count=" + count +
                ", recipes=" + recipes +
                '}';
    }
}
