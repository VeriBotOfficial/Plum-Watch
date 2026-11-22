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
public final class DialogSetheightBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView tv2;
    public final TextView tvConfirm;
    public final WheelView wheelView;

    private DialogSetheightBinding(LinearLayout linearLayout, TextView textView, TextView textView2, WheelView wheelView) {
        this.rootView = linearLayout;
        this.tv2 = textView;
        this.tvConfirm = textView2;
        this.wheelView = wheelView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogSetheightBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogSetheightBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_setheight, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogSetheightBinding bind(View view) {
        int i = R.id.tv2;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.tv_confirm;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.wheel_view;
                WheelView wheelView = (WheelView) ViewBindings.findChildViewById(view, i);
                if (wheelView != null) {
                    return new DialogSetheightBinding((LinearLayout) view, textView, textView2, wheelView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
