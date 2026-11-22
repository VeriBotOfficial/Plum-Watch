package com.wakeup.feature.course.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.course.R;

/* loaded from: classes2.dex */
public final class DialogCommonMenuBinding implements ViewBinding {
    public final RecyclerView recyclerview;
    private final RelativeLayout rootView;

    private DialogCommonMenuBinding(RelativeLayout relativeLayout, RecyclerView recyclerView) {
        this.rootView = relativeLayout;
        this.recyclerview = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static DialogCommonMenuBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogCommonMenuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_common_menu, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogCommonMenuBinding bind(View view) {
        int i = R.id.recyclerview;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new DialogCommonMenuBinding((RelativeLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
