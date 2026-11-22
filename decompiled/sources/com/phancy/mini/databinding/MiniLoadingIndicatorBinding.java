package com.phancy.mini.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.phancy.mini.R;
import com.phancy.mini.widget.CircleImageView;

/* loaded from: classes17.dex */
public final class MiniLoadingIndicatorBinding implements ViewBinding {
    public final CircleImageView indicatorIcon;
    public final ProgressBar indicatorRing;
    public final TextView indicatorTitle;
    private final RelativeLayout rootView;

    private MiniLoadingIndicatorBinding(RelativeLayout relativeLayout, CircleImageView circleImageView, ProgressBar progressBar, TextView textView) {
        this.rootView = relativeLayout;
        this.indicatorIcon = circleImageView;
        this.indicatorRing = progressBar;
        this.indicatorTitle = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static MiniLoadingIndicatorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MiniLoadingIndicatorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.mini_loading_indicator, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static MiniLoadingIndicatorBinding bind(View view) {
        int i = R.id.indicator_icon;
        CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(view, i);
        if (circleImageView != null) {
            i = R.id.indicator_ring;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
            if (progressBar != null) {
                i = R.id.indicator_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new MiniLoadingIndicatorBinding((RelativeLayout) view, circleImageView, progressBar, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
