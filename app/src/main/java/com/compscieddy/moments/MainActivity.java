package com.compscieddy.moments;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

  @BindView(R.id.tab_layout) TabLayout mTabLayout;
  @BindView(R.id.view_pager) ViewPager mViewPager;
  private PagerAdapter mPagerAdapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    setupViewPager();
  }

  private void setupViewPager() {
    mPagerAdapter = new DaysPagerAdapter(getSupportFragmentManager(), MainActivity.this, mTabLayout.getTabCount());
    mViewPager.setAdapter(mPagerAdapter);
    mTabLayout.setupWithViewPager(mViewPager);
  }
}
