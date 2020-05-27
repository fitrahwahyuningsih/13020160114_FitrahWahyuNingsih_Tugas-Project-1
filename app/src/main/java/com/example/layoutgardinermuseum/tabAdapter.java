package com.example.layoutgardinermuseum;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class tabAdapter extends FragmentPagerAdapter {
    private Context context;
    private int totalTabs;

    public tabAdapter(Context c, FragmentManager fm, int totalTabs) {
        super(fm);
        context = c;
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                OverviewFragment overviewFragment = new OverviewFragment();
                return overviewFragment;
            case 1:
                OverviewFragment overviewFragment2= new OverviewFragment();
                return overviewFragment2;
            case 2:
                OverviewFragment overviewFragment3 = new OverviewFragment();
                return overviewFragment3;
            case 3:
                OverviewFragment overviewFragment4 = new OverviewFragment();
                return overviewFragment4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}

