package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class FragmentMineAdsBinding implements ViewBinding {
    private final RecyclerView rootView;
    public final RecyclerView rvAds;

    private FragmentMineAdsBinding(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.rvAds = recyclerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RecyclerView getRoot() {
        return this.rootView;
    }

    public static FragmentMineAdsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMineAdsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mine_ads, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentMineAdsBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new FragmentMineAdsBinding(recyclerView, recyclerView);
    }
}
