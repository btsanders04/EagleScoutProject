package com.brandon.myapplication;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Brandon on 7/2/2016.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {
    int mNumOfTabs;

    public ViewPagerAdapter(FragmentManager fm){
        super(fm);
//        this.mNumOfTabs = NumOfTabs;
    }
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Trees tab1 = new Trees();
                return tab1;
            case 1:
                FragmentTwo tab2 = new FragmentTwo();
                return tab2;
            case 2:
//                FragmentThree tab3 = new FragmentThree();
//                return tab3;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
