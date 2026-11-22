package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ActivityDialmarketbizBinding implements ViewBinding {
    public final Button btnStart;
    private final LinearLayout rootView;

    private ActivityDialmarketbizBinding(LinearLayout linearLayout, Button button) {
        this.rootView = linearLayout;
        this.btnStart = button;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDialmarketbizBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDialmarketbizBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_dialmarketbiz, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityDialmarketbizBinding bind(View view) {
        int i = R.id.btn_start;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            return new ActivityDialmarketbizBinding((LinearLayout) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
