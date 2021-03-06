package com.example.thunderclass;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SFragmentPagerAdapter extends FragmentPagerAdapter {
    private String[] mTitles = new String[]{"课件", "试题"};
    private int class_id;
    public SFragmentPagerAdapter(FragmentManager fm, int class_id) {
        super(fm);
        this.class_id = class_id;
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 1)
            return new s_test();
        return new s_ppt(class_id);
    }
    @Override
    public int getCount() {
        return mTitles.length;
    }
    //用来设置tab的标题
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
