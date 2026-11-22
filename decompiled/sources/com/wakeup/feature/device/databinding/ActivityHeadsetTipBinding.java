package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ActivityHeadsetTipBinding implements ViewBinding {
    public final AppCompatImageView ivTip1;
    public final AppCompatImageView ivTip2;
    private final LinearLayoutCompat rootView;
    public final MyTitleBar titleBar;
    public final TextView tvFind;
    public final TextView tvOpenBt;

    private ActivityHeadsetTipBinding(LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, MyTitleBar myTitleBar, TextView textView, TextView textView2) {
        this.rootView = linearLayoutCompat;
        this.ivTip1 = appCompatImageView;
        this.ivTip2 = appCompatImageView2;
        this.titleBar = myTitleBar;
        this.tvFind = textView;
        this.tvOpenBt = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ActivityHeadsetTipBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityHeadsetTipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_headset_tip, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityHeadsetTipBinding bind(View view) {
        int i = R.id.iv_tip1;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.iv_tip2;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                i = R.id.title_bar;
                MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                if (myTitleBar != null) {
                    i = R.id.tv_find;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.tv_open_bt;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            return new ActivityHeadsetTipBinding((LinearLayoutCompat) view, appCompatImageView, appCompatImageView2, myTitleBar, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
