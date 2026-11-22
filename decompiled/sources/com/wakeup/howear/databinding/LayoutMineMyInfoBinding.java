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
public final class LayoutMineMyInfoBinding implements ViewBinding {
    public final ConstraintLayout llAuthentication;
    public final ConstraintLayout llMyAssets;
    public final LinearLayoutCompat llMyInfoContent;
    public final ConstraintLayout llMyIssue;
    public final ConstraintLayout llMyOrder;
    public final TextView myInfoTv;
    private final ConstraintLayout rootView;

    private LayoutMineMyInfoBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, LinearLayoutCompat linearLayoutCompat, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, TextView textView) {
        this.rootView = constraintLayout;
        this.llAuthentication = constraintLayout2;
        this.llMyAssets = constraintLayout3;
        this.llMyInfoContent = linearLayoutCompat;
        this.llMyIssue = constraintLayout4;
        this.llMyOrder = constraintLayout5;
        this.myInfoTv = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static LayoutMineMyInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutMineMyInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_mine_my_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutMineMyInfoBinding bind(View view) {
        int i = R.id.ll_authentication;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.ll_my_assets;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null) {
                i = R.id.ll_myInfoContent;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = R.id.ll_my_issue;
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout3 != null) {
                        i = R.id.ll_my_order;
                        ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout4 != null) {
                            i = R.id.my_info_tv;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                return new LayoutMineMyInfoBinding((ConstraintLayout) view, constraintLayout, constraintLayout2, linearLayoutCompat, constraintLayout3, constraintLayout4, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
