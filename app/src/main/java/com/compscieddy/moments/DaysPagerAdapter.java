package com.compscieddy.moments;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by elee on 6/13/16.
 */
public class DaysPagerAdapter extends FragmentStatePagerAdapter {

  private final Context mContext;
  private int numTabs;
  List<String> mTitles = new ArrayList<>();

  public DaysPagerAdapter(FragmentManager fm, Context context, int numTabs) {
    super(fm);
    mContext = context;
    this.numTabs = numTabs;
    mTitles.add("Mon");
    mTitles.add("Tue");
    mTitles.add("Wed");
    mTitles.add("Thu");
    mTitles.add("Fri");
    mTitles.add("Sat");
    mTitles.add("Sun");
  }

  @Override
  public int getCount() {
    return numTabs;
  }

  @Override
  public Fragment getItem(int position) {
    return DayFragment.newInstance(position);
  }

  @Override
  public CharSequence getPageTitle(int position) {
    return mTitles.get(position);
  }
}
