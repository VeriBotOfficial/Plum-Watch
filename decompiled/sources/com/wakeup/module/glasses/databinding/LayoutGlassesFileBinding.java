package com.wakeup.module.glasses.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.module.glasses.R;

/* loaded from: classes4.dex */
public final class LayoutGlassesFileBinding implements ViewBinding {
    public final FrameLayout flFileImplProgress;
    public final LinearLayoutCompat llFileImp;
    public final ProgressBar pbFileImplProgress;
    private final LinearLayoutCompat rootView;
    public final TextView tvFileImplProgress;
    public final AppCompatTextView tvFileImplStart;
    public final AppCompatTextView tvFileImplTip;

    private LayoutGlassesFileBinding(LinearLayoutCompat linearLayoutCompat, FrameLayout frameLayout, LinearLayoutCompat linearLayoutCompat2, ProgressBar progressBar, TextView textView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = linearLayoutCompat;
        this.flFileImplProgress = frameLayout;
        this.llFileImp = linearLayoutCompat2;
        this.pbFileImplProgress = progressBar;
        this.tvFileImplProgress = textView;
        this.tvFileImplStart = appCompatTextView;
        this.tvFileImplTip = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static LayoutGlassesFileBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutGlassesFileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_glasses_file, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutGlassesFileBinding bind(View view) {
        int i = R.id.fl_file_impl_progress;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
            i = R.id.pb_file_impl_progress;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
            if (progressBar != null) {
                i = R.id.tv_file_impl_progress;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_file_impl_start;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = R.id.tv_file_impl_tip;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            return new LayoutGlassesFileBinding(linearLayoutCompat, frameLayout, linearLayoutCompat, progressBar, textView, appCompatTextView, appCompatTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
