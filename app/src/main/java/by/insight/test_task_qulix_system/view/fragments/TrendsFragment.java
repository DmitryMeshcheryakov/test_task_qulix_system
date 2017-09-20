package by.insight.test_task_qulix_system.view.fragments;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Observable;
import java.util.Observer;

import by.insight.test_task_qulix_system.R;
import by.insight.test_task_qulix_system.databinding.TabTrendBinding;
import by.insight.test_task_qulix_system.tools.CustomItemDecoration;
import by.insight.test_task_qulix_system.view.adapter.GifAdapter;
import by.insight.test_task_qulix_system.viewmodel.TrendsViewModel;


public class TrendsFragment extends Fragment implements Observer{


    private LinearLayoutManager mLayoutManager;
    private GifAdapter mGifAdapter;
    private TabTrendBinding mBinding;
    private TrendsViewModel mTrendsViewModel;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.tab_trend, container, false);
        View view = mBinding.getRoot();
        return view;

    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mBinding.swipeRefreshLayout.setOnRefreshListener(mRefreshListener);
        initDataBinding();
        intiRecyclerView();
        setupObserver(mTrendsViewModel);
        mTrendsViewModel.loadTrendsGifList();
    }

    private void initDataBinding() {
        mTrendsViewModel = new TrendsViewModel(getContext());
        mBinding.setTrendsViewModel(mTrendsViewModel);
    }


    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof TrendsViewModel) {
            GifAdapter gifAdapter = (GifAdapter) mBinding.rvTrends.getAdapter();
            TrendsViewModel model = (TrendsViewModel) observable;
            gifAdapter.setGifList(model.getGifList());
        }

    }

    private void intiRecyclerView() {
        mLayoutManager = new LinearLayoutManager(getContext());
        mBinding.rvTrends.setLayoutManager(mLayoutManager);
        mGifAdapter = new GifAdapter();
        mBinding.rvTrends.setItemAnimator(new DefaultItemAnimator());
        mBinding.rvTrends.addItemDecoration(new CustomItemDecoration(getContext(), Color.BLACK, 2));
        mBinding.rvTrends.setHasFixedSize(true);
        mBinding.rvTrends.setAdapter(mGifAdapter);

    }

    public void setupObserver(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mTrendsViewModel.reset();
    }


    private void refresh() {
        mGifAdapter.clear();
        mTrendsViewModel.loadTrendsGifList();
        mBinding.swipeRefreshLayout.setRefreshing(false);
    }

    private SwipeRefreshLayout.OnRefreshListener mRefreshListener = () -> refresh();


}

