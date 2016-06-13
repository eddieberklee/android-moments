package com.compscieddy.moments;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;

/**
 * Created by elee on 6/13/16.
 */
public class DaysPagerAdapter extends FragmentStatePagerAdapter {

  private final Context mContext;
  private int numTabs;
  List<String> mTitles = new ArrayList<>();
  private final LayoutInflater mLayoutInflater;

  public DaysPagerAdapter(FragmentManager fm, Context context, int numTabs) {
    super(fm);
    mContext = context;
    mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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

  public View getTabView(int position) {
    View customView = mLayoutInflater.inflate(R.layout.custom_tab, null);
    TextView title = ButterKnife.findById(customView, R.id.tab_title);
    title.setText(getPageTitle(position));
    return customView;
  }


}
