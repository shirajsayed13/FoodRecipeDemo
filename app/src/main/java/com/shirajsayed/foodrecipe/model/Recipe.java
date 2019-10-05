package com.shirajsayed.foodrecipe.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Arrays;

/**
 * @author Shiraj Sayed
 */
public class Recipe implements Parcelable {

    private String publisher;
    private String f2f_url;
    private String[] ingredients;
    private String source_url;
    private String recipe_id;
    private String image_url;
    private float social_rank;
    private String publisher_url;
    private String title;

    public Recipe(String publisher, String f2f_url, String[] ingredients, String source_url,
                  String recipe_id, String image_url, float social_rank, String publisher_url, String title) {
        this.publisher = publisher;
        this.f2f_url = f2f_url;
        this.ingredients = ingredients;
        this.source_url = source_url;
        this.recipe_id = recipe_id;
        this.image_url = image_url;
        this.social_rank = social_rank;
        this.publisher_url = publisher_url;
        this.title = title;
    }

    public Recipe() {
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getF2f_url() {
        return f2f_url;
    }

    public void setF2f_url(String f2f_url) {
        this.f2f_url = f2f_url;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String getSource_url() {
        return source_url;
    }

    public void setSource_url(String source_url) {
        this.source_url = source_url;
    }

    public String getRecipe_id() {
        return recipe_id;
    }

    public void setRecipe_id(String recipe_id) {
        this.recipe_id = recipe_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public float getSocial_rank() {
        return social_rank;
    }

    public void setSocial_rank(float social_rank) {
        this.social_rank = social_rank;
    }

    public String getPublisher_url() {
        return publisher_url;
    }

    public void setPublisher_url(String publisher_url) {
        this.publisher_url = publisher_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "publisher='" + publisher + '\'' +
                ", f2f_url='" + f2f_url + '\'' +
                ", ingredients=" + Arrays.toString(ingredients) +
                ", source_url='" + source_url + '\'' +
                ", recipe_id='" + recipe_id + '\'' +
                ", image_url='" + image_url + '\'' +
                ", social_rank=" + social_rank +
                ", publisher_url='" + publisher_url + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    protected Recipe(Parcel in) {
        publisher = in.readString();
        f2f_url = in.readString();
        ingredients = in.createStringArray();
        source_url = in.readString();
        recipe_id = in.readString();
        image_url = in.readString();
        social_rank = in.readFloat();
        publisher_url = in.readString();
        title = in.readString();
    }

    public static final Creator<Recipe> CREATOR = new Creator<Recipe>() {
        @Override
        public Recipe createFromParcel(Parcel in) {
            return new Recipe(in);
        }

        @Override
        public Recipe[] newArray(int size) {
            return new Recipe[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(publisher);
        parcel.writeString(f2f_url);
        parcel.writeStringArray(ingredients);
        parcel.writeString(source_url);
        parcel.writeString(recipe_id);
        parcel.writeString(image_url);
        parcel.writeFloat(social_rank);
        parcel.writeString(publisher_url);
        parcel.writeString(title);
    }
}
