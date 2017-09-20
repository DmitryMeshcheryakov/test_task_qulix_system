package by.insight.test_task_qulix_system.view.fragments;

import android.animation.LayoutTransition;
import android.app.SearchManager;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Observable;
import java.util.Observer;

import by.insight.test_task_qulix_system.R;
import by.insight.test_task_qulix_system.databinding.TabSearchBinding;
import by.insight.test_task_qulix_system.tools.CustomItemDecoration;
import by.insight.test_task_qulix_system.view.adapter.GifAdapter;
import by.insight.test_task_qulix_system.viewmodel.SearchViewModel;


public class SearchFragment extends Fragment implements Observer {

    private LinearLayoutManager mLayoutManager;
    private GifAdapter mGifAdapter;
    private TabSearchBinding mBinding;
    private SearchViewModel mSearchViewModel;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.tab_search, container, false);
        View view = mBinding.getRoot();
        setHasOptionsMenu(true);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initDataBinding();
        intiRecyclerView();
        setupObserver(mSearchViewModel);

    }

    private void initDataBinding() {
        mSearchViewModel = new SearchViewModel(getContext());
        mBinding.setSearchViewModel(mSearchViewModel);
    }


    private void intiRecyclerView() {
        mLayoutManager = new LinearLayoutManager(getContext());
        mBinding.rvSearch.setLayoutManager(mLayoutManager);
        mGifAdapter = new GifAdapter();
        mBinding.rvSearch.setItemAnimator(new DefaultItemAnimator());
        mBinding.rvSearch.addItemDecoration(new CustomItemDecoration(getContext(), Color.BLACK, 3));
        mBinding.rvSearch.setHasFixedSize(true);
        mBinding.rvSearch.setAdapter(mGifAdapter);

    }

    public void setupObserver(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mSearchViewModel.reset();
    }


    @Override
    public void update(Observable observable, Object o) {

        if (observable instanceof SearchViewModel) {
            GifAdapter gifAdapter = (GifAdapter) mBinding.rvSearch.getAdapter();
            SearchViewModel model = (SearchViewModel) observable;
            gifAdapter.setGifList(model.getSearchGifList());
        }

    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_search, menu);
        try {
            SearchManager searchManager =
                    (SearchManager) getActivity().getSystemService(Context.SEARCH_SERVICE);
            SearchView searchView =
                    (SearchView) menu.findItem(R.id.action_search).getActionView();
            searchView.setSearchableInfo(
                    searchManager.getSearchableInfo(getActivity().getComponentName()));
            searchView.setQueryHint("Search...");

            searchView.setLayoutTransition(new LayoutTransition());
            searchView.animate().setDuration(300);
            mSearchViewModel.searchGifList(searchView);

        }catch(Exception e){e.printStackTrace();}
    }

}
