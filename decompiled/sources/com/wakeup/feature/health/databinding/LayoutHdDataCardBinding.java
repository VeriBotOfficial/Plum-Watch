package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class LayoutHdDataCardBinding implements ViewBinding {
    public final LinearLayout card;
    public final View fill;
    public final TextView icon;
    public final TextView label;
    private final LinearLayout rootView;
    public final TextView sub;
    public final FrameLayout track;
    public final TextView unit;
    public final TextView value;

    private LayoutHdDataCardBinding(LinearLayout linearLayout, LinearLayout linearLayout2, View view, TextView textView, TextView textView2, TextView textView3, FrameLayout frameLayout, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.card = linearLayout2;
        this.fill = view;
        this.icon = textView;
        this.label = textView2;
        this.sub = textView3;
        this.track = frameLayout;
        this.unit = textView4;
        this.value = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutHdDataCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutHdDataCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_hd_data_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutHdDataCardBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.fill;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            i = R.id.icon;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.label;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.sub;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.track;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            i = R.id.unit;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                i = R.id.value;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    return new LayoutHdDataCardBinding(linearLayout, linearLayout, findChildViewById, textView, textView2, textView3, frameLayout, textView4, textView5);
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
