package com.nikosval.aepp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabFragmentAdapter extends FragmentStatePagerAdapter {
    public TabFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        TabFragment tabfragment=new TabFragment();
        Bundle bundle=new Bundle();
        position=position+1;
        bundle.putString("message","Hello from page: "+position);
        tabfragment.setArguments(bundle);
        return tabfragment;
    }

    @Override
    public int getCount() {
        return 1;
    }
}
