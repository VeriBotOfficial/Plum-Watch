package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class FragmentCollectListBinding implements ViewBinding {
    public final RecyclerView recyclerview;
    private final RecyclerView rootView;

    private FragmentCollectListBinding(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.recyclerview = recyclerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RecyclerView getRoot() {
        return this.rootView;
    }

    public static FragmentCollectListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCollectListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_collect_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentCollectListBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new FragmentCollectListBinding(recyclerView, recyclerView);
    }
}
