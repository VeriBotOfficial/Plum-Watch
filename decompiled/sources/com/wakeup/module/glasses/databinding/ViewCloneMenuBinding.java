package com.wakeup.module.glasses.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.module.glasses.R;

/* loaded from: classes4.dex */
public final class ViewCloneMenuBinding implements ViewBinding {
    public final LinearLayoutCompat llDel;
    public final LinearLayoutCompat llEdit;
    private final CardView rootView;
    public final View vLine;

    private ViewCloneMenuBinding(CardView cardView, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, View view) {
        this.rootView = cardView;
        this.llDel = linearLayoutCompat;
        this.llEdit = linearLayoutCompat2;
        this.vLine = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CardView getRoot() {
        return this.rootView;
    }

    public static ViewCloneMenuBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewCloneMenuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_clone_menu, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewCloneMenuBinding bind(View view) {
        View findChildViewById;
        int i = R.id.ll_del;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.ll_edit;
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.v_line))) != null) {
                return new ViewCloneMenuBinding((CardView) view, linearLayoutCompat, linearLayoutCompat2, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
