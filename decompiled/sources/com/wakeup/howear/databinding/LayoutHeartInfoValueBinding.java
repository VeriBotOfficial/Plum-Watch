package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class LayoutHeartInfoValueBinding implements ViewBinding {
    private final RelativeLayout rootView;

    /* renamed from: tv, reason: collision with root package name */
    public final TextView f14313tv;
    public final TextView tv10;
    public final TextView tv11;
    public final TextView tv13;
    public final TextView tv14;
    public final TextView tv15;
    public final TextView tv9;

    private LayoutHeartInfoValueBinding(RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.rootView = relativeLayout;
        this.f14313tv = textView;
        this.tv10 = textView2;
        this.tv11 = textView3;
        this.tv13 = textView4;
        this.tv14 = textView5;
        this.tv15 = textView6;
        this.tv9 = textView7;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static LayoutHeartInfoValueBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutHeartInfoValueBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_heart_info_value, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutHeartInfoValueBinding bind(View view) {
        int i = R.id.f14310tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.tv10;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.tv11;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = R.id.tv13;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        i = R.id.tv14;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView5 != null) {
                            i = R.id.tv15;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView6 != null) {
                                i = R.id.tv9;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView7 != null) {
                                    return new LayoutHeartInfoValueBinding((RelativeLayout) view, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
