package com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.R;
import com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.activity.FragmentThreeDetailActivity;
import com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.adapter.FragmentThreeListAdapter;
import com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.delegate.FragmentDelegate;

public class FragmentThree extends Fragment implements FragmentDelegate {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.rv_fragment_three);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));

        FragmentThreeListAdapter adapter = new FragmentThreeListAdapter(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onTapDelegate() {
        startActivity(new Intent(this.getContext(), FragmentThreeDetailActivity.class));
    }
}
