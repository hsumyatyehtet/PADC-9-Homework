package com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.R;
import com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.delegate.FragmentDelegate;
import com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.view.holder.EventItemViewHolder;

public class FragmentThreeListAdapter extends RecyclerView.Adapter {

    private FragmentDelegate mFragmentDelegate;

    public FragmentThreeListAdapter(FragmentDelegate mFragmentDelegate) {
        this.mFragmentDelegate = mFragmentDelegate;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_three_card_view, viewGroup, false);
        return new EventItemViewHolder(itemView, mFragmentDelegate);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
