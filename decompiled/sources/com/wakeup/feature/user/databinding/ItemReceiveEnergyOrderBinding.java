package com.wakeup.feature.user.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.user.R;

/* loaded from: classes3.dex */
public final class ItemReceiveEnergyOrderBinding implements ViewBinding {
    public final AppCompatImageView ivCopy;
    public final View line;
    private final FrameLayout rootView;
    public final AppCompatTextView tvEnergy;
    public final AppCompatTextView tvEnergyFlag;
    public final AppCompatTextView tvOrderNo;
    public final AppCompatTextView tvProjects;
    public final AppCompatTextView tvRange;
    public final AppCompatTextView tvRangeFlag;
    public final AppCompatTextView tvTime;

    private ItemReceiveEnergyOrderBinding(FrameLayout frameLayout, AppCompatImageView appCompatImageView, View view, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7) {
        this.rootView = frameLayout;
        this.ivCopy = appCompatImageView;
        this.line = view;
        this.tvEnergy = appCompatTextView;
        this.tvEnergyFlag = appCompatTextView2;
        this.tvOrderNo = appCompatTextView3;
        this.tvProjects = appCompatTextView4;
        this.tvRange = appCompatTextView5;
        this.tvRangeFlag = appCompatTextView6;
        this.tvTime = appCompatTextView7;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ItemReceiveEnergyOrderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemReceiveEnergyOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_receive_energy_order, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemReceiveEnergyOrderBinding bind(View view) {
        View findChildViewById;
        int i = R.id.iv_copy;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line))) != null) {
            i = R.id.tv_energy;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = R.id.tv_energy_flag;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null) {
                    i = R.id.tv_order_no;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView3 != null) {
                        i = R.id.tv_projects;
                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView4 != null) {
                            i = R.id.tv_range;
                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView5 != null) {
                                i = R.id.tv_range_flag;
                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView6 != null) {
                                    i = R.id.tv_time;
                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView7 != null) {
                                        return new ItemReceiveEnergyOrderBinding((FrameLayout) view, appCompatImageView, findChildViewById, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
