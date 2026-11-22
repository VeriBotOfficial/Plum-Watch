package com.wakeup.feature.user.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.user.R;

/* loaded from: classes3.dex */
public final class ItemOverseasOrderDialBinding implements ViewBinding {
    public final TextView dialStatusIssued;
    public final TextView dialStatusReissue;
    public final View line;
    public final LinearLayoutCompat llOrder;
    public final FrameLayout orderDialStatusLayout;
    public final TextView orderName;
    public final TextView orderPrice;
    public final TextView orderStatus;
    public final TextView orderTime;
    private final ConstraintLayout rootView;

    private ItemOverseasOrderDialBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, View view, LinearLayoutCompat linearLayoutCompat, FrameLayout frameLayout, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = constraintLayout;
        this.dialStatusIssued = textView;
        this.dialStatusReissue = textView2;
        this.line = view;
        this.llOrder = linearLayoutCompat;
        this.orderDialStatusLayout = frameLayout;
        this.orderName = textView3;
        this.orderPrice = textView4;
        this.orderStatus = textView5;
        this.orderTime = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemOverseasOrderDialBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemOverseasOrderDialBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_overseas_order_dial, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemOverseasOrderDialBinding bind(View view) {
        View findChildViewById;
        int i = R.id.dial_status_issued;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.dial_status_reissue;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line))) != null) {
                i = R.id.ll_order;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = R.id.order_dial_status_layout;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout != null) {
                        i = R.id.order_name;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.order_price;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                i = R.id.order_status;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    i = R.id.order_time;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView6 != null) {
                                        return new ItemOverseasOrderDialBinding((ConstraintLayout) view, textView, textView2, findChildViewById, linearLayoutCompat, frameLayout, textView3, textView4, textView5, textView6);
                                    }
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
