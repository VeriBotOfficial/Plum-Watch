package com.wakeup.module.gpt.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.module.gpt.R;

/* loaded from: classes4.dex */
public final class ViewInputTitleBinding implements ViewBinding {
    public final EditText etContent;
    private final ConstraintLayout rootView;
    public final TextView tvClear;
    public final TextView tvPre;

    private ViewInputTitleBinding(ConstraintLayout constraintLayout, EditText editText, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.etContent = editText;
        this.tvClear = textView;
        this.tvPre = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ViewInputTitleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewInputTitleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_input_title, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewInputTitleBinding bind(View view) {
        int i = R.id.et_content;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
        if (editText != null) {
            i = R.id.tv_clear;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.tv_pre;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new ViewInputTitleBinding((ConstraintLayout) view, editText, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
