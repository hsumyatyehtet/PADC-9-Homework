package com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.view.holder;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.delegate.FragmentDelegate;

public class EventItemViewHolder extends RecyclerView.ViewHolder {

    private FragmentDelegate mFragmentDelegate;

    public EventItemViewHolder(View itemView, FragmentDelegate fragmentDelegate) {
        super(itemView);

        mFragmentDelegate = fragmentDelegate;

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFragmentDelegate.onTapDelegate();
            }
        });
    }
}
