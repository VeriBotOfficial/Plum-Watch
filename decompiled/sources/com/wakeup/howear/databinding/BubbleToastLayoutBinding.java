package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class BubbleToastLayoutBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView toastText;

    private BubbleToastLayoutBinding(LinearLayout linearLayout, TextView textView) {
        this.rootView = linearLayout;
        this.toastText = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static BubbleToastLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BubbleToastLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.bubble_toast_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static BubbleToastLayoutBinding bind(View view) {
        int i = R.id.toast_text;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            return new BubbleToastLayoutBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
