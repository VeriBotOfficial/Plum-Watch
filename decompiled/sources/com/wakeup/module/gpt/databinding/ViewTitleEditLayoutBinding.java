package com.wakeup.module.gpt.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.module.gpt.R;

/* loaded from: classes4.dex */
public final class ViewTitleEditLayoutBinding implements ViewBinding {
    public final EditText etGptContent;
    private final LinearLayoutCompat rootView;
    public final TextView tvClear;
    public final TextView tvGptContentNum;
    public final TextView tvTips;
    public final TextView tvTitle;

    private ViewTitleEditLayoutBinding(LinearLayoutCompat linearLayoutCompat, EditText editText, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayoutCompat;
        this.etGptContent = editText;
        this.tvClear = textView;
        this.tvGptContentNum = textView2;
        this.tvTips = textView3;
        this.tvTitle = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ViewTitleEditLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewTitleEditLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_title_edit_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewTitleEditLayoutBinding bind(View view) {
        int i = R.id.et_gpt_content;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
        if (editText != null) {
            i = R.id.tv_clear;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.tv_gpt_content_num;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.tv_tips;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.tv_title;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            return new ViewTitleEditLayoutBinding((LinearLayoutCompat) view, editText, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
