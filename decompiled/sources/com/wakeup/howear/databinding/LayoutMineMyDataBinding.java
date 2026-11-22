package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class LayoutMineMyDataBinding implements ViewBinding {
    public final ConstraintLayout llMyData;
    public final LinearLayoutCompat llMyDataContent;
    public final ConstraintLayout llMyRank;
    public final TextView myDataTv;
    private final ConstraintLayout rootView;

    private LayoutMineMyDataBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LinearLayoutCompat linearLayoutCompat, ConstraintLayout constraintLayout3, TextView textView) {
        this.rootView = constraintLayout;
        this.llMyData = constraintLayout2;
        this.llMyDataContent = linearLayoutCompat;
        this.llMyRank = constraintLayout3;
        this.myDataTv = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static LayoutMineMyDataBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutMineMyDataBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_mine_my_data, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutMineMyDataBinding bind(View view) {
        int i = R.id.ll_my_data;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.ll_myDataContent;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = R.id.ll_my_rank;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout2 != null) {
                    i = R.id.my_data_tv;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new LayoutMineMyDataBinding((ConstraintLayout) view, constraintLayout, linearLayoutCompat, constraintLayout2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
