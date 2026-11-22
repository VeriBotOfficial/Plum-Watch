package com.wakeup.module.gpt.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.module.gpt.R;
import com.zhy.view.flowlayout.TagFlowLayout;

/* loaded from: classes4.dex */
public final class ViewFlowLayoutBinding implements ViewBinding {
    private final LinearLayoutCompat rootView;
    public final TagFlowLayout tagFlow;
    public final TextView tvFlowTitle;

    private ViewFlowLayoutBinding(LinearLayoutCompat linearLayoutCompat, TagFlowLayout tagFlowLayout, TextView textView) {
        this.rootView = linearLayoutCompat;
        this.tagFlow = tagFlowLayout;
        this.tvFlowTitle = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ViewFlowLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewFlowLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_flow_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewFlowLayoutBinding bind(View view) {
        int i = R.id.tag_flow;
        TagFlowLayout tagFlowLayout = (TagFlowLayout) ViewBindings.findChildViewById(view, i);
        if (tagFlowLayout != null) {
            i = R.id.tv_flow_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new ViewFlowLayoutBinding((LinearLayoutCompat) view, tagFlowLayout, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
