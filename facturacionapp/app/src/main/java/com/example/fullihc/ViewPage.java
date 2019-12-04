package com.example.fullihc;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPage extends FragmentPagerAdapter {

    private Context mContext;
    private String tabTitles[];

    public ViewPage(FragmentManager fm, Context ct) {
        super(fm);
        this.mContext = ct;
        tabTitles = new String[]{
                mContext.getResources().getString(R.string.un1),
                mContext.getResources().getString(R.string.un2),
                mContext.getResources().getString(R.string.un3),

        };
    }

    @Override
    public Fragment getItem(int i) {
      /*  DemoFra demo = new DemoFra();
        i=i+1;
        Bundle bundle = new Bundle();
        bundle.putString("message","Fragment :"+i);
        demo.setArguments(bundle);

        return demo;*/

      Fragment fragment = null;

      switch (i){

          case 0:
              fragment = new Frag1();
              break;

          case 1:
              fragment = new Frag2();
              break;
          case 2:
              fragment = new Frag3();
              break;
          case 3:
              fragment = new Frag3();
              break;
      }
      return fragment;
    }

    @Override
    public int getCount() {

        return 3;
    }
    public CharSequence getPageTitle(int position){

        return tabTitles[position];
    }
}
