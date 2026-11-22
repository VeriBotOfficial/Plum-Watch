package com.wakeup.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.common.R;

/* loaded from: classes2.dex */
public final class ActivityChangeMiniAppBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView tvDefault;
    public final TextView tvDesc;
    public final TextView tvPro;
    public final TextView tvSit;
    public final TextView tvTitle;

    private ActivityChangeMiniAppBinding(LinearLayout rootView, TextView tvDefault, TextView tvDesc, TextView tvPro, TextView tvSit, TextView tvTitle) {
        this.rootView = rootView;
        this.tvDefault = tvDefault;
        this.tvDesc = tvDesc;
        this.tvPro = tvPro;
        this.tvSit = tvSit;
        this.tvTitle = tvTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityChangeMiniAppBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityChangeMiniAppBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_change_mini_app, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityChangeMiniAppBinding bind(View rootView) {
        int i = R.id.tvDefault;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.tvDesc;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = R.id.tvPro;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView3 != null) {
                    i = R.id.tvSit;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView4 != null) {
                        i = R.id.tvTitle;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView5 != null) {
                            return new ActivityChangeMiniAppBinding((LinearLayout) rootView, textView, textView2, textView3, textView4, textView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
