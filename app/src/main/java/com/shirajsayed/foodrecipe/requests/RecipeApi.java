package com.shirajsayed.foodrecipe.requests;

import com.shirajsayed.foodrecipe.requests.reponses.RecipeResponse;
import com.shirajsayed.foodrecipe.requests.reponses.RecipeSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author Shiraj Sayed
 */
public interface RecipeApi {

    //Search
    @GET("api/search")
    Call<RecipeSearchResponse> searchRecipe(
            @Query("key") String key,
            @Query("q") String query,
            @Query("page") String page
    );

    // GET RECIPE REQUEST
    @GET("api/get")
    Call<RecipeResponse> recipe(
            @Query("key") String key,
            @Query("rId") String id
    );
}
