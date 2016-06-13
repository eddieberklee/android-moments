package com.compscieddy.moments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by elee on 6/13/16.
 */
public class DayFragment extends Fragment {

  private ViewGroup mRootView;
  private int tabIndex;
  private static final String TAB_INDEX_ARG = "tab_index_arg";

  public static DayFragment newInstance(int tabIndex) {
    Bundle args = new Bundle();
    args.putInt(TAB_INDEX_ARG, tabIndex);
    DayFragment fragment = new DayFragment();
    fragment.setArguments(args);
    return fragment;
  }

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    Bundle args = getArguments();
    this.tabIndex = args.getInt(TAB_INDEX_ARG, -1);
    mRootView = (ViewGroup) inflater.inflate(R.layout.fragment_day, container, false);
    ButterKnife.bind(DayFragment.this, mRootView);
    return mRootView;
  }
}
