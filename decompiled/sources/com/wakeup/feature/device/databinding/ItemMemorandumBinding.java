package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ItemMemorandumBinding implements ViewBinding {
    public final AppCompatImageView ivMemorandumMore;
    public final View lineView;
    private final FrameLayout rootView;
    public final AppCompatTextView tvMemorandumDuration;
    public final AppCompatTextView tvMemorandumSaveTime;
    public final AppCompatTextView tvMemorandumTitle;

    private ItemMemorandumBinding(FrameLayout frameLayout, AppCompatImageView appCompatImageView, View view, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.rootView = frameLayout;
        this.ivMemorandumMore = appCompatImageView;
        this.lineView = view;
        this.tvMemorandumDuration = appCompatTextView;
        this.tvMemorandumSaveTime = appCompatTextView2;
        this.tvMemorandumTitle = appCompatTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ItemMemorandumBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemMemorandumBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_memorandum, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMemorandumBinding bind(View view) {
        View findChildViewById;
        int i = R.id.iv_memorandum_more;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line_view))) != null) {
            i = R.id.tv_memorandum_duration;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = R.id.tv_memorandum_save_time;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null) {
                    i = R.id.tv_memorandum_title;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView3 != null) {
                        return new ItemMemorandumBinding((FrameLayout) view, appCompatImageView, findChildViewById, appCompatTextView, appCompatTextView2, appCompatTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
