package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class LayoutPublisherListContainerBinding implements ViewBinding {
    public final LinearLayout layoutPublisherListContainer;
    private final LinearLayout rootView;
    public final RecyclerView rvPublisherList;
    public final TextView tvPublisherListContainerTitle;

    private LayoutPublisherListContainerBinding(LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, TextView textView) {
        this.rootView = linearLayout;
        this.layoutPublisherListContainer = linearLayout2;
        this.rvPublisherList = recyclerView;
        this.tvPublisherListContainerTitle = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutPublisherListContainerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutPublisherListContainerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_publisher_list_container, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutPublisherListContainerBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.rv_publisher_list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R.id.tv_publisher_list_container_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new LayoutPublisherListContainerBinding(linearLayout, linearLayout, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
