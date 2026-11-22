package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ItemHelpAdReasonBinding implements ViewBinding {
    public final AppCompatCheckBox cbReason;
    public final LinearLayout llMain;
    private final LinearLayout rootView;
    public final TextView tvReason;

    private ItemHelpAdReasonBinding(LinearLayout linearLayout, AppCompatCheckBox appCompatCheckBox, LinearLayout linearLayout2, TextView textView) {
        this.rootView = linearLayout;
        this.cbReason = appCompatCheckBox;
        this.llMain = linearLayout2;
        this.tvReason = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemHelpAdReasonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemHelpAdReasonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_help_ad_reason, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemHelpAdReasonBinding bind(View view) {
        int i = R.id.cb_reason;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, i);
        if (appCompatCheckBox != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i2 = R.id.tv_reason;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
            if (textView != null) {
                return new ItemHelpAdReasonBinding(linearLayout, appCompatCheckBox, linearLayout, textView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
