package com.example.yucheng.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by yucheng on 2018/3/30.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

//    @Override
//    protected int getLayoutResId() {
//        return R.layout.activity_twopane;
//    }
}
