package com.wakeup.module.glasses.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import com.wakeup.module.glasses.R;

/* loaded from: classes4.dex */
public final class ItemViewTvBinding implements ViewBinding {
    public final AppCompatTextView itemTagText;
    private final AppCompatTextView rootView;

    private ItemViewTvBinding(AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = appCompatTextView;
        this.itemTagText = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AppCompatTextView getRoot() {
        return this.rootView;
    }

    public static ItemViewTvBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemViewTvBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_view_tv, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemViewTvBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) view;
        return new ItemViewTvBinding(appCompatTextView, appCompatTextView);
    }
}
