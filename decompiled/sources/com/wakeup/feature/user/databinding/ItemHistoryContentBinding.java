package com.wakeup.feature.user.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.user.R;

/* loaded from: classes3.dex */
public final class ItemHistoryContentBinding implements ViewBinding {
    public final TextView itemTvTitle;
    private final LinearLayoutCompat rootView;
    public final View viewLine;

    private ItemHistoryContentBinding(LinearLayoutCompat linearLayoutCompat, TextView textView, View view) {
        this.rootView = linearLayoutCompat;
        this.itemTvTitle = textView;
        this.viewLine = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ItemHistoryContentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemHistoryContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_history_content, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemHistoryContentBinding bind(View view) {
        View findChildViewById;
        int i = R.id.item_tv_title;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view_line))) != null) {
            return new ItemHistoryContentBinding((LinearLayoutCompat) view, textView, findChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
