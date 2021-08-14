package com.example.viewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class CustomPagerAdapter extends PagerAdapter {
private Context mContext;

    public CustomPagerAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        Model modelObject=Model.values()[position];
        LayoutInflater inflater=LayoutInflater.from(mContext);

        ViewGroup layout=(ViewGroup)
                inflater.inflate(modelObject.getmLayoutResId(),collection,false);
        collection.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position,  Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return Model.values().length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        Model customPagerEnum =Model.values()[position];
        return mContext.getString(customPagerEnum.getmTitleResId());
    }
}
