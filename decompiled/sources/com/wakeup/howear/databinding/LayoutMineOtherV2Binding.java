package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class LayoutMineOtherV2Binding implements ViewBinding {
    public final LinearLayoutCompat llAdSet;
    public final LinearLayoutCompat llHelpCs;
    public final LinearLayoutCompat llMyAbout;
    public final LinearLayoutCompat llMyOtherContent;
    public final LinearLayoutCompat llMySetting;
    public final LinearLayoutCompat llMySuggest;
    public final TextView myOtherTv;
    private final LinearLayoutCompat rootView;

    private LayoutMineOtherV2Binding(LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, LinearLayoutCompat linearLayoutCompat4, LinearLayoutCompat linearLayoutCompat5, LinearLayoutCompat linearLayoutCompat6, LinearLayoutCompat linearLayoutCompat7, TextView textView) {
        this.rootView = linearLayoutCompat;
        this.llAdSet = linearLayoutCompat2;
        this.llHelpCs = linearLayoutCompat3;
        this.llMyAbout = linearLayoutCompat4;
        this.llMyOtherContent = linearLayoutCompat5;
        this.llMySetting = linearLayoutCompat6;
        this.llMySuggest = linearLayoutCompat7;
        this.myOtherTv = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static LayoutMineOtherV2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutMineOtherV2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_mine_other_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutMineOtherV2Binding bind(View view) {
        int i = R.id.ll_ad_set;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.ll_help_cs;
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat2 != null) {
                i = R.id.ll_my_about;
                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat3 != null) {
                    i = R.id.ll_myOtherContent;
                    LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat4 != null) {
                        i = R.id.ll_my_setting;
                        LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat5 != null) {
                            i = R.id.ll_my_suggest;
                            LinearLayoutCompat linearLayoutCompat6 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat6 != null) {
                                i = R.id.my_other_tv;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    return new LayoutMineOtherV2Binding((LinearLayoutCompat) view, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, linearLayoutCompat5, linearLayoutCompat6, textView);
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
