package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ItemDialBitmapPickerBinding implements ViewBinding {
    public final CardView cardView;
    public final AppCompatImageView ivAdd;
    public final AppCompatImageView ivDel;
    public final AppCompatImageView ivImage;
    public final AppCompatImageView ivSelect;
    public final RelativeLayout rlMain;
    private final RelativeLayout rootView;

    private ItemDialBitmapPickerBinding(RelativeLayout relativeLayout, CardView cardView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.cardView = cardView;
        this.ivAdd = appCompatImageView;
        this.ivDel = appCompatImageView2;
        this.ivImage = appCompatImageView3;
        this.ivSelect = appCompatImageView4;
        this.rlMain = relativeLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ItemDialBitmapPickerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDialBitmapPickerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_dial_bitmap_picker, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemDialBitmapPickerBinding bind(View view) {
        int i = R.id.card_view;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.iv_add;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = R.id.iv_del;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView2 != null) {
                    i = R.id.iv_image;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView3 != null) {
                        i = R.id.iv_select;
                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView4 != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) view;
                            return new ItemDialBitmapPickerBinding(relativeLayout, cardView, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
