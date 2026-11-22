package com.wakeup.module.glasses.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.module.glasses.R;

/* loaded from: classes4.dex */
public final class DialogGlassesWifiTip2Binding implements ViewBinding {
    public final FrameLayout flClose;
    private final ConstraintLayout rootView;
    public final ScrollView svDesc;
    public final AppCompatTextView tvDesc;
    public final AppCompatTextView tvSure;
    public final AppCompatTextView tvTip;

    private DialogGlassesWifiTip2Binding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ScrollView scrollView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.rootView = constraintLayout;
        this.flClose = frameLayout;
        this.svDesc = scrollView;
        this.tvDesc = appCompatTextView;
        this.tvSure = appCompatTextView2;
        this.tvTip = appCompatTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogGlassesWifiTip2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogGlassesWifiTip2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_glasses_wifi_tip2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogGlassesWifiTip2Binding bind(View view) {
        int i = R.id.fl_close;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.sv_desc;
            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
            if (scrollView != null) {
                i = R.id.tv_desc;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = R.id.tv_sure;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView2 != null) {
                        i = R.id.tv_tip;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView3 != null) {
                            return new DialogGlassesWifiTip2Binding((ConstraintLayout) view, frameLayout, scrollView, appCompatTextView, appCompatTextView2, appCompatTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
