package com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.R;
import com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.activity.FragmentOneDetailActivity;
import com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.adapter.FragmentOneListAdapter;
import com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.delegate.FragmentDelegate;

public class FragmentOne extends Fragment implements FragmentDelegate {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.rv_fragment_one);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));

        FragmentOneListAdapter adapter = new FragmentOneListAdapter(this);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onTapDelegate() {
        startActivity(new Intent(this.getContext(), FragmentOneDetailActivity.class));
    }
}
