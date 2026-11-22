package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ViewWatchConnectMetricRowBinding implements ViewBinding {
    public final ImageView ivIcon;
    private final LinearLayout rootView;
    public final TextView tvGoal;
    public final TextView tvLabel;
    public final TextView tvValue;
    public final View viewProgress;

    private ViewWatchConnectMetricRowBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, View view) {
        this.rootView = linearLayout;
        this.ivIcon = imageView;
        this.tvGoal = textView;
        this.tvLabel = textView2;
        this.tvValue = textView3;
        this.viewProgress = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ViewWatchConnectMetricRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewWatchConnectMetricRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_watch_connect_metric_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewWatchConnectMetricRowBinding bind(View view) {
        View findChildViewById;
        int i = R.id.iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.tv_goal;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.tv_label;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.tv_value;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view_progress))) != null) {
                        return new ViewWatchConnectMetricRowBinding((LinearLayout) view, imageView, textView, textView2, textView3, findChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
