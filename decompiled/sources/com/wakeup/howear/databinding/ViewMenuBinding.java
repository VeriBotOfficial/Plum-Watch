package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ViewMenuBinding implements ViewBinding {
    public final LinearLayoutCompat llDel;
    public final LinearLayoutCompat llEdit;
    private final LinearLayout rootView;
    public final View vLine;

    private ViewMenuBinding(LinearLayout linearLayout, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, View view) {
        this.rootView = linearLayout;
        this.llDel = linearLayoutCompat;
        this.llEdit = linearLayoutCompat2;
        this.vLine = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ViewMenuBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewMenuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_menu, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewMenuBinding bind(View view) {
        View findChildViewById;
        int i = R.id.ll_del;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.ll_edit;
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.v_line))) != null) {
                return new ViewMenuBinding((LinearLayout) view, linearLayoutCompat, linearLayoutCompat2, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
