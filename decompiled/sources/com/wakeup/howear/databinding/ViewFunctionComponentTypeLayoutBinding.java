package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ViewFunctionComponentTypeLayoutBinding implements ViewBinding {
    public final TextView componentTypeName;
    private final FrameLayout rootView;
    public final RecyclerView rvFunctionComponent;

    private ViewFunctionComponentTypeLayoutBinding(FrameLayout frameLayout, TextView textView, RecyclerView recyclerView) {
        this.rootView = frameLayout;
        this.componentTypeName = textView;
        this.rvFunctionComponent = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ViewFunctionComponentTypeLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewFunctionComponentTypeLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_function_component_type_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewFunctionComponentTypeLayoutBinding bind(View view) {
        int i = R.id.component_type_name;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.rv_function_component;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                return new ViewFunctionComponentTypeLayoutBinding((FrameLayout) view, textView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
