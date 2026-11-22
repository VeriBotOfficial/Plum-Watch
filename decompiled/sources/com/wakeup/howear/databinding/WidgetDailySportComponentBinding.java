package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class WidgetDailySportComponentBinding implements ViewBinding {
    private final FrameLayout rootView;
    public final TextView textViewCaloriesValueWidget;
    public final TextView textViewDurationValueWidget;
    public final TextView textViewSessionsValueWidget;
    public final TextView textViewStepsValueWidget;
    public final TextView tvTitle;
    public final FrameLayout widgetRoot;
    public final ProgressBar widgetStepProgress;
    public final TextView widgetStepTarget;

    private WidgetDailySportComponentBinding(FrameLayout frameLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, FrameLayout frameLayout2, ProgressBar progressBar, TextView textView6) {
        this.rootView = frameLayout;
        this.textViewCaloriesValueWidget = textView;
        this.textViewDurationValueWidget = textView2;
        this.textViewSessionsValueWidget = textView3;
        this.textViewStepsValueWidget = textView4;
        this.tvTitle = textView5;
        this.widgetRoot = frameLayout2;
        this.widgetStepProgress = progressBar;
        this.widgetStepTarget = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static WidgetDailySportComponentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static WidgetDailySportComponentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.widget_daily_sport_component, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static WidgetDailySportComponentBinding bind(View view) {
        int i = R.id.textView_calories_value_widget;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.textView_duration_value_widget;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.textView_sessions_value_widget;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = R.id.textView_steps_value_widget;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        i = R.id.tvTitle;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView5 != null) {
                            FrameLayout frameLayout = (FrameLayout) view;
                            i = R.id.widget_step_progress;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                            if (progressBar != null) {
                                i = R.id.widget_step_target;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView6 != null) {
                                    return new WidgetDailySportComponentBinding(frameLayout, textView, textView2, textView3, textView4, textView5, frameLayout, progressBar, textView6);
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
