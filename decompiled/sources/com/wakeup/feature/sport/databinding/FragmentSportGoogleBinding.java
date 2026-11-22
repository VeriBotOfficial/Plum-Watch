package com.wakeup.feature.sport.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.sport.R;

/* loaded from: classes3.dex */
public final class FragmentSportGoogleBinding implements ViewBinding {
    public final ImageView ivKmMark;
    public final ImageView ivMapType;
    public final ImageView ivResetLocation;
    public final ImageView ivShowMap;
    public final LinearLayoutCompat llFunctionBtn;
    private final ConstraintLayout rootView;

    private FragmentSportGoogleBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, LinearLayoutCompat linearLayoutCompat) {
        this.rootView = constraintLayout;
        this.ivKmMark = imageView;
        this.ivMapType = imageView2;
        this.ivResetLocation = imageView3;
        this.ivShowMap = imageView4;
        this.llFunctionBtn = linearLayoutCompat;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSportGoogleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSportGoogleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sport_google, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentSportGoogleBinding bind(View view) {
        int i = R.id.iv_km_mark;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.iv_map_type;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.iv_reset_location;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView3 != null) {
                    i = R.id.iv_show_map;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView4 != null) {
                        i = R.id.ll_function_btn;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null) {
                            return new FragmentSportGoogleBinding((ConstraintLayout) view, imageView, imageView2, imageView3, imageView4, linearLayoutCompat);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
