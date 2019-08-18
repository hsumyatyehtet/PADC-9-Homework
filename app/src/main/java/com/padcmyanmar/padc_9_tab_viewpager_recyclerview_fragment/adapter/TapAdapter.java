package com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.fragment.FragmentOne;
import com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.fragment.FragmentThree;
import com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.fragment.FragmentTwo;

public class TapAdapter extends FragmentStatePagerAdapter {

    public TapAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FragmentOne();
        } else if (position == 1) {
            return new FragmentTwo();
        } else {
            return new FragmentThree();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Newest";
        } else if (position == 1) {
            return "Trending";
        } else {
            return "Most viewed";
        }
    }
}
