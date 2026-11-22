package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ItemMainAiBinding implements ViewBinding {
    public final AppCompatImageView icon;
    private final LinearLayoutCompat rootView;

    private ItemMainAiBinding(LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView) {
        this.rootView = linearLayoutCompat;
        this.icon = appCompatImageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ItemMainAiBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemMainAiBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_main_ai, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMainAiBinding bind(View view) {
        int i = R.id.icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            return new ItemMainAiBinding((LinearLayoutCompat) view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
