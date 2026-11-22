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
public final class LayoutMineMyDataV2Binding implements ViewBinding {
    public final LinearLayoutCompat llMyData;
    public final LinearLayoutCompat llMyDataContent;
    public final LinearLayoutCompat llMyRank;
    public final TextView myDataTv;
    private final LinearLayoutCompat rootView;

    private LayoutMineMyDataV2Binding(LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, LinearLayoutCompat linearLayoutCompat4, TextView textView) {
        this.rootView = linearLayoutCompat;
        this.llMyData = linearLayoutCompat2;
        this.llMyDataContent = linearLayoutCompat3;
        this.llMyRank = linearLayoutCompat4;
        this.myDataTv = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static LayoutMineMyDataV2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutMineMyDataV2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_mine_my_data_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutMineMyDataV2Binding bind(View view) {
        int i = R.id.ll_my_data;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.ll_myDataContent;
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat2 != null) {
                i = R.id.ll_my_rank;
                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat3 != null) {
                    i = R.id.my_data_tv;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new LayoutMineMyDataV2Binding((LinearLayoutCompat) view, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
