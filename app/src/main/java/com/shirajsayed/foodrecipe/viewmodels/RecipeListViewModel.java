package com.shirajsayed.foodrecipe.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.shirajsayed.foodrecipe.model.Recipe;

import java.util.List;

/**
 * @author Shiraj Sayed
 */
public class RecipeListViewModel extends ViewModel {

    private MutableLiveData<List<Recipe>> mRecipes = new MutableLiveData<>();

    public RecipeListViewModel() {
    }

    public LiveData<List<Recipe>> getRecipes() {
        return mRecipes;
    }

}
