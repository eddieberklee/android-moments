package com.compscieddy.moments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by elee on 6/13/16.
 */
public class DayFragment extends Fragment {

    private static final String TAB_INDEX_ARG = "tab_index_arg";
    @BindView(R.id.fragment_day_wakeUpTime)
    TextView wakeUpTime;
    private ViewGroup mRootView;
    private int tabIndex;
    private Unbinder unbinder;

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
        unbinder = ButterKnife.bind(DayFragment.this, mRootView);
        return mRootView;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //For fragment we have to unbind butterknife in on destroyview
        unbinder.unbind();
    }
}
