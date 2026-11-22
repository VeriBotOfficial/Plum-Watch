package com.wakeup.feature.course.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.progress.CircleProgressBar;
import com.wakeup.feature.course.R;

/* loaded from: classes2.dex */
public final class LayoutTrainRestPopBinding implements ViewBinding {
    public final RelativeLayout restRoot;
    private final RelativeLayout rootView;
    public final AppCompatTextView trainResetBtn;
    public final CircleProgressBar trainResetCircleProgress;
    public final RelativeLayout trainResetProgressLayout;
    public final AppCompatTextView trainResetText;
    public final AppCompatTextView trainResetTip;

    private LayoutTrainRestPopBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, AppCompatTextView appCompatTextView, CircleProgressBar circleProgressBar, RelativeLayout relativeLayout3, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.rootView = relativeLayout;
        this.restRoot = relativeLayout2;
        this.trainResetBtn = appCompatTextView;
        this.trainResetCircleProgress = circleProgressBar;
        this.trainResetProgressLayout = relativeLayout3;
        this.trainResetText = appCompatTextView2;
        this.trainResetTip = appCompatTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static LayoutTrainRestPopBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutTrainRestPopBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_train_rest_pop, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutTrainRestPopBinding bind(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i = R.id.trainResetBtn;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = R.id.train_reset_circle_progress;
            CircleProgressBar circleProgressBar = (CircleProgressBar) ViewBindings.findChildViewById(view, i);
            if (circleProgressBar != null) {
                i = R.id.train_reset_progress_layout;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout2 != null) {
                    i = R.id.train_reset_text;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView2 != null) {
                        i = R.id.trainResetTip;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView3 != null) {
                            return new LayoutTrainRestPopBinding(relativeLayout, relativeLayout, appCompatTextView, circleProgressBar, relativeLayout2, appCompatTextView2, appCompatTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
