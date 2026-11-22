package com.wakeup.feature.weilife.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import com.wakeup.feature.weilife.R;

/* loaded from: classes3.dex */
public final class ItemBottomLinkBinding implements ViewBinding {
    public final AppCompatImageView itemBottomLinkLayout;
    private final AppCompatImageView rootView;

    private ItemBottomLinkBinding(AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.rootView = appCompatImageView;
        this.itemBottomLinkLayout = appCompatImageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AppCompatImageView getRoot() {
        return this.rootView;
    }

    public static ItemBottomLinkBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemBottomLinkBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_bottom_link, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemBottomLinkBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view;
        return new ItemBottomLinkBinding(appCompatImageView, appCompatImageView);
    }
}
