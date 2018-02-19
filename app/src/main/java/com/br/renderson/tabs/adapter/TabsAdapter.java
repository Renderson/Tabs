package com.br.renderson.tabs.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.br.renderson.tabs.fragments.FragmentA;
import com.br.renderson.tabs.fragments.FragmentB;

/**
 * Created by renderson.silva on 16/02/2018.
 */

public class TabsAdapter extends FragmentStatePagerAdapter {

    private String[] mTabTitles;

    public TabsAdapter(FragmentManager fm, String[] mTabTitles) {
        super(fm);
        this.mTabTitles = mTabTitles;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentA();

            case 1:
                return new FragmentB();
                default:
                    return null;
        }

    }

    @Override
    public int getCount() {
        return this.mTabTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this.mTabTitles[position];
    }
}
