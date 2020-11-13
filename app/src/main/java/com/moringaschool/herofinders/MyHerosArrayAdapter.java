package com.moringaschool.herofinders;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyHerosArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mHeros;
    private String[] mCultureherosmythology ;

    public MyHerosArrayAdapter (Context mContext, int resource, String[] mHeros, String[] mCultureherosmythology){
        super(mContext, resource);
        this.mContext = mContext;
        this.mCultureherosmythology = mCultureherosmythology;
        this.mHeros  = mHeros;
    }

    @Override
    public Object getItem(int position){
        String cultureherosmythology = mCultureherosmythology[position];
        String heros = mHeros[position];
        return String.format("%s \n The best worderful heros: %s", heros, cultureherosmythology);
    }

    @Override
    public int getCount(){
        return mHeros.length;
    }
}
//
//    private Context mContext;
//    private String[] mParks;
//    private String[] mAnimals;
//
//    public MyWildlifesArrayAdapter (Context mContext, int resource, String[] mParks, String[] mAnimals){
//        super(mContext, resource);
//        this.mContext = mContext;
//        this.mAnimals = mAnimals;
//        this.mParks = mParks;
//    }
//
//    @Override
//    public Object getItem(int position){
//        String parks = mParks[position];
//        String animal = mAnimals[position];
//        return String.format("%s \n Some wonderful are wildlife here: %s", parks, animal);
//    }
//
//    @Override
//    public int getCount(){
//        return mAnimals.length;
//    }
//}
