package com.wakeup.commonui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.contrarywind.view.WheelView;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public final class DialogSethrBinding implements ViewBinding {
    public final WheelView mWheelView1;
    private final LinearLayout rootView;
    public final TextView tvOk;
    public final TextView tvUnit;

    private DialogSethrBinding(LinearLayout linearLayout, WheelView wheelView, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.mWheelView1 = wheelView;
        this.tvOk = textView;
        this.tvUnit = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogSethrBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogSethrBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_sethr, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogSethrBinding bind(View view) {
        int i = R.id.mWheelView1;
        WheelView wheelView = (WheelView) ViewBindings.findChildViewById(view, i);
        if (wheelView != null) {
            i = R.id.tv_ok;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.tv_unit;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new DialogSethrBinding((LinearLayout) view, wheelView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
