package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class LayoutValidInfoBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView tv1;
    public final TextView tv2;
    public final TextView tv3;
    public final TextView tv4;

    private LayoutValidInfoBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.tv1 = textView;
        this.tv2 = textView2;
        this.tv3 = textView3;
        this.tv4 = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutValidInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutValidInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_valid_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutValidInfoBinding bind(View view) {
        int i = R.id.tv1;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.tv2;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.tv3;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = R.id.tv4;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        return new LayoutValidInfoBinding((LinearLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
