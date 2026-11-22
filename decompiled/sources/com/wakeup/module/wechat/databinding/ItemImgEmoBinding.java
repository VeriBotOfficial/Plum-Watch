package com.wakeup.module.wechat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.module.wechat.R;

/* loaded from: classes4.dex */
public final class ItemImgEmoBinding implements ViewBinding {
    public final AppCompatImageView itemImgDel;
    public final AppCompatImageView itemImgEmo;
    public final AppCompatImageView itemImgState;
    private final ConstraintLayout rootView;

    private ItemImgEmoBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3) {
        this.rootView = constraintLayout;
        this.itemImgDel = appCompatImageView;
        this.itemImgEmo = appCompatImageView2;
        this.itemImgState = appCompatImageView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemImgEmoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemImgEmoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_img_emo, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemImgEmoBinding bind(View view) {
        int i = R.id.item_img_del;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.item_img_emo;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                i = R.id.item_img_state;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView3 != null) {
                    return new ItemImgEmoBinding((ConstraintLayout) view, appCompatImageView, appCompatImageView2, appCompatImageView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
