package com.wakeup.feature.course.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.course.R;

/* loaded from: classes2.dex */
public final class AdapterPlanDetailLevel0Binding implements ViewBinding {
    public final TextView date;
    public final TextView name;
    private final ConstraintLayout rootView;
    public final ImageView status;
    public final TextView weekNumber;

    private AdapterPlanDetailLevel0Binding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, TextView textView3) {
        this.rootView = constraintLayout;
        this.date = textView;
        this.name = textView2;
        this.status = imageView;
        this.weekNumber = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static AdapterPlanDetailLevel0Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AdapterPlanDetailLevel0Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.adapter_plan_detail_level_0, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdapterPlanDetailLevel0Binding bind(View view) {
        int i = R.id.date;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.name;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.status;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.weekNumber;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        return new AdapterPlanDetailLevel0Binding((ConstraintLayout) view, textView, textView2, imageView, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
