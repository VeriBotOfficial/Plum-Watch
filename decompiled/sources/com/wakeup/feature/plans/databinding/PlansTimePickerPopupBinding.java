package com.wakeup.feature.plans.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.plans.R;

/* loaded from: classes3.dex */
public final class PlansTimePickerPopupBinding implements ViewBinding {
    public final TextView btnWheelConfirm;
    public final RecyclerView lvHour;
    public final RecyclerView lvMinute;
    private final LinearLayout rootView;
    public final View selectionHighlight;
    public final LinearLayout timePickerColumns;
    public final FrameLayout timePickerWheel;

    private PlansTimePickerPopupBinding(LinearLayout linearLayout, TextView textView, RecyclerView recyclerView, RecyclerView recyclerView2, View view, LinearLayout linearLayout2, FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.btnWheelConfirm = textView;
        this.lvHour = recyclerView;
        this.lvMinute = recyclerView2;
        this.selectionHighlight = view;
        this.timePickerColumns = linearLayout2;
        this.timePickerWheel = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static PlansTimePickerPopupBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PlansTimePickerPopupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.plans_time_picker_popup, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static PlansTimePickerPopupBinding bind(View view) {
        View findChildViewById;
        int i = R.id.btnWheelConfirm;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.lvHour;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.lvMinute;
                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.selectionHighlight))) != null) {
                    i = R.id.timePickerColumns;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.timePickerWheel;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            return new PlansTimePickerPopupBinding((LinearLayout) view, textView, recyclerView, recyclerView2, findChildViewById, linearLayout, frameLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
