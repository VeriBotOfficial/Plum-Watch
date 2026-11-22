package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.contrarywind.view.WheelView;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class DialogTimeSelectLayoutBinding implements ViewBinding {
    public final WheelView mWheelView1;
    public final WheelView mWheelView2;
    public final WheelView mWheelView3;
    public final WheelView mWheelView4;
    private final LinearLayout rootView;
    public final TextView tvOk;

    private DialogTimeSelectLayoutBinding(LinearLayout linearLayout, WheelView wheelView, WheelView wheelView2, WheelView wheelView3, WheelView wheelView4, TextView textView) {
        this.rootView = linearLayout;
        this.mWheelView1 = wheelView;
        this.mWheelView2 = wheelView2;
        this.mWheelView3 = wheelView3;
        this.mWheelView4 = wheelView4;
        this.tvOk = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogTimeSelectLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogTimeSelectLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_time_select_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogTimeSelectLayoutBinding bind(View view) {
        int i = R.id.mWheelView1;
        WheelView wheelView = (WheelView) ViewBindings.findChildViewById(view, i);
        if (wheelView != null) {
            i = R.id.mWheelView2;
            WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(view, i);
            if (wheelView2 != null) {
                i = R.id.mWheelView3;
                WheelView wheelView3 = (WheelView) ViewBindings.findChildViewById(view, i);
                if (wheelView3 != null) {
                    i = R.id.mWheelView4;
                    WheelView wheelView4 = (WheelView) ViewBindings.findChildViewById(view, i);
                    if (wheelView4 != null) {
                        i = R.id.tv_ok;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            return new DialogTimeSelectLayoutBinding((LinearLayout) view, wheelView, wheelView2, wheelView3, wheelView4, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
