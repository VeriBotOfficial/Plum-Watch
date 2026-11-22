package com.wakeup.feature.wkvideo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.wkvideo.R;

/* loaded from: classes3.dex */
public final class ChildItemLayoutBinding implements ViewBinding {
    public final View blackLine;
    public final CheckBox childItemCheck;
    public final LinearLayout childLayout;
    public final TextView childTextView;
    private final LinearLayout rootView;

    private ChildItemLayoutBinding(LinearLayout linearLayout, View view, CheckBox checkBox, LinearLayout linearLayout2, TextView textView) {
        this.rootView = linearLayout;
        this.blackLine = view;
        this.childItemCheck = checkBox;
        this.childLayout = linearLayout2;
        this.childTextView = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ChildItemLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ChildItemLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.child_item_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ChildItemLayoutBinding bind(View view) {
        int i = R.id.black_line;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            i = R.id.child_item_check;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i);
            if (checkBox != null) {
                i = R.id.child_layout;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.childTextView;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new ChildItemLayoutBinding((LinearLayout) view, findChildViewById, checkBox, linearLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
