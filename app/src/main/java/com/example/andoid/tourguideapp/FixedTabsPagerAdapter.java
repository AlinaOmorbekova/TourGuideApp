package com.example.andoid.tourguideapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.icu.text.CaseMap;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FixedTabsPagerAdapter extends FragmentStatePagerAdapter {
    private Context mContext;


    public FixedTabsPagerAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    public FixedTabsPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new Museums();
        } else if (position == 1){
            return new Parks();
        } else if (position == 2){
            return new Hotels();
        } else{
            return new Cafes();
        }


    }

    @Override
    public int getCount() {
        return 4;
    }

    @SuppressLint("StringFormatInvalid")
    @Override
    public CharSequence getPageTitle(int position){
        if (position == 0){
            return "Museums";
        } else if (position == 1){
            return "Parks";
        } else if (position == 2){
            return "Hotels";
        } else{
            return "Cafes";
        }
        
    }
}
