package com.example.viewpager;

import android.view.Display;

public enum Model {
    RED(R.string.red,R.layout.view_red),
    BLUE(R.string.blue,R.layout.view_blue),
    GREEN(R.string.green,R.layout.view_green);

    private int mTitleResId,mLayoutResId;

Model(int TitleResId,int LayoutResId){
    mLayoutResId= LayoutResId;
    mTitleResId=TitleResId;
}
    public int getmTitleResId() {
        return mTitleResId;
    }

    public int getmLayoutResId() {
        return mLayoutResId;
    }




}
