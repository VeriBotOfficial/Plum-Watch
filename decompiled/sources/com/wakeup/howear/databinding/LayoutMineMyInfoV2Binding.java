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
public final class LayoutMineMyInfoV2Binding implements ViewBinding {
    public final LinearLayoutCompat llAuthentication;
    public final LinearLayoutCompat llMyAssets;
    public final LinearLayoutCompat llMyInfoContent;
    public final LinearLayoutCompat llMyIssue;
    public final LinearLayoutCompat llMyOrder;
    public final TextView myInfoTv;
    private final LinearLayoutCompat rootView;

    private LayoutMineMyInfoV2Binding(LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, LinearLayoutCompat linearLayoutCompat4, LinearLayoutCompat linearLayoutCompat5, LinearLayoutCompat linearLayoutCompat6, TextView textView) {
        this.rootView = linearLayoutCompat;
        this.llAuthentication = linearLayoutCompat2;
        this.llMyAssets = linearLayoutCompat3;
        this.llMyInfoContent = linearLayoutCompat4;
        this.llMyIssue = linearLayoutCompat5;
        this.llMyOrder = linearLayoutCompat6;
        this.myInfoTv = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static LayoutMineMyInfoV2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutMineMyInfoV2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_mine_my_info_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutMineMyInfoV2Binding bind(View view) {
        int i = R.id.ll_authentication;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.ll_my_assets;
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat2 != null) {
                i = R.id.ll_myInfoContent;
                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat3 != null) {
                    i = R.id.ll_my_issue;
                    LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat4 != null) {
                        i = R.id.ll_my_order;
                        LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat5 != null) {
                            i = R.id.my_info_tv;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                return new LayoutMineMyInfoV2Binding((LinearLayoutCompat) view, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, linearLayoutCompat5, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
