package by.insight.test_task_qulix_system.view.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import by.insight.test_task_qulix_system.R;
import by.insight.test_task_qulix_system.databinding.ActivityMainBinding;
import by.insight.test_task_qulix_system.view.activity.base.BaseActivity;
import by.insight.test_task_qulix_system.view.fragments.SearchFragment;
import by.insight.test_task_qulix_system.view.fragments.TrendsFragment;


public class MainActivity extends BaseActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(mBinding.toolbar);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                        .add("Trends", TrendsFragment.class)
                        .add("Search", SearchFragment.class)
                        .create());

        mBinding.viewpager.setAdapter(adapter);
        mBinding.viewpagertab.setViewPager(mBinding.viewpager);


    }

}
