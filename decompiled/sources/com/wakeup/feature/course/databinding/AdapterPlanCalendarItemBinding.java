package com.wakeup.feature.course.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.course.R;

/* loaded from: classes2.dex */
public final class AdapterPlanCalendarItemBinding implements ViewBinding {
    public final View bgView;
    public final View normalBgView;
    private final RelativeLayout rootView;
    public final View smallBgView;
    public final TextView text;

    private AdapterPlanCalendarItemBinding(RelativeLayout relativeLayout, View view, View view2, View view3, TextView textView) {
        this.rootView = relativeLayout;
        this.bgView = view;
        this.normalBgView = view2;
        this.smallBgView = view3;
        this.text = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static AdapterPlanCalendarItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AdapterPlanCalendarItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.adapter_plan_calendar_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdapterPlanCalendarItemBinding bind(View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.bgView;
        View findChildViewById3 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.normalBgView))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.smallBgView))) != null) {
            i = R.id.text;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new AdapterPlanCalendarItemBinding((RelativeLayout) view, findChildViewById3, findChildViewById, findChildViewById2, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
