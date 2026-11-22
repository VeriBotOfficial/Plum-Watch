package com.wakeup.module.step.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.module.step.R;

/* loaded from: classes4.dex */
public final class LayoutNotificationViewBinding implements ViewBinding {
    public final ImageView btn;
    public final TextView distance;
    public final TextView distanceUnit;
    public final TextView duration;
    public final ImageView ivLogo;
    public final TextView kcal;
    public final TextView kcalUnit;
    public final RelativeLayout rlStepNotifyRoot;
    private final RelativeLayout rootView;
    public final TextView tvTitle;

    private LayoutNotificationViewBinding(RelativeLayout relativeLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, ImageView imageView2, TextView textView4, TextView textView5, RelativeLayout relativeLayout2, TextView textView6) {
        this.rootView = relativeLayout;
        this.btn = imageView;
        this.distance = textView;
        this.distanceUnit = textView2;
        this.duration = textView3;
        this.ivLogo = imageView2;
        this.kcal = textView4;
        this.kcalUnit = textView5;
        this.rlStepNotifyRoot = relativeLayout2;
        this.tvTitle = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static LayoutNotificationViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutNotificationViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_notification_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutNotificationViewBinding bind(View view) {
        int i = R.id.btn;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.distance;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.distance_unit;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.duration;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.iv_logo;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.kcal;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                i = R.id.kcal_unit;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    RelativeLayout relativeLayout = (RelativeLayout) view;
                                    i = R.id.tv_title;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView6 != null) {
                                        return new LayoutNotificationViewBinding(relativeLayout, imageView, textView, textView2, textView3, imageView2, textView4, textView5, relativeLayout, textView6);
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
