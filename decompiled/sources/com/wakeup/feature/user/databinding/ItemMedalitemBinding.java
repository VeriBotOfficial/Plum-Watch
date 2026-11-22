package com.wakeup.feature.user.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.user.R;

/* loaded from: classes3.dex */
public final class ItemMedalitemBinding implements ViewBinding {
    public final AppCompatImageView ivImage;
    public final LinearLayout llMain;
    private final LinearLayout rootView;
    public final AppCompatTextView tvName;

    private ItemMedalitemBinding(LinearLayout linearLayout, AppCompatImageView appCompatImageView, LinearLayout linearLayout2, AppCompatTextView appCompatTextView) {
        this.rootView = linearLayout;
        this.ivImage = appCompatImageView;
        this.llMain = linearLayout2;
        this.tvName = appCompatTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemMedalitemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemMedalitemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_medalitem, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMedalitemBinding bind(View view) {
        int i = R.id.iv_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i2 = R.id.tv_name;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i2);
            if (appCompatTextView != null) {
                return new ItemMedalitemBinding(linearLayout, appCompatImageView, linearLayout, appCompatTextView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
