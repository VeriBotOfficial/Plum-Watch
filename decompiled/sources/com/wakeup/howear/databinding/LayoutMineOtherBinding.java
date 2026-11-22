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
public final class LayoutMineOtherBinding implements ViewBinding {
    public final ConstraintLayout llAdSet;
    public final ConstraintLayout llHelpCs;
    public final ConstraintLayout llMyAbout;
    public final LinearLayoutCompat llMyOtherContent;
    public final ConstraintLayout llMySetting;
    public final ConstraintLayout llMySuggest;
    public final TextView myOtherTv;
    private final ConstraintLayout rootView;

    private LayoutMineOtherBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, LinearLayoutCompat linearLayoutCompat, ConstraintLayout constraintLayout5, ConstraintLayout constraintLayout6, TextView textView) {
        this.rootView = constraintLayout;
        this.llAdSet = constraintLayout2;
        this.llHelpCs = constraintLayout3;
        this.llMyAbout = constraintLayout4;
        this.llMyOtherContent = linearLayoutCompat;
        this.llMySetting = constraintLayout5;
        this.llMySuggest = constraintLayout6;
        this.myOtherTv = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static LayoutMineOtherBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutMineOtherBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_mine_other, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutMineOtherBinding bind(View view) {
        int i = R.id.ll_ad_set;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.ll_help_cs;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null) {
                i = R.id.ll_my_about;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout3 != null) {
                    i = R.id.ll_myOtherContent;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = R.id.ll_my_setting;
                        ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout4 != null) {
                            i = R.id.ll_my_suggest;
                            ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout5 != null) {
                                i = R.id.my_other_tv;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    return new LayoutMineOtherBinding((ConstraintLayout) view, constraintLayout, constraintLayout2, constraintLayout3, linearLayoutCompat, constraintLayout4, constraintLayout5, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
