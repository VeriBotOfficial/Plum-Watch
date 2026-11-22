package com.wakeup.feature.user.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.user.R;

/* loaded from: classes3.dex */
public final class ActivityOrderdetailsBinding implements ViewBinding {
    public final MyTitleBar mTopBar;
    private final LinearLayout rootView;
    public final TextView tvAmount;
    public final TextView tvDate;
    public final TextView tvMethod;
    public final TextView tvOrderItem;
    public final TextView tvOrderNum;
    public final TextView tvStatus;
    public final TextView tvSync;

    private ActivityOrderdetailsBinding(LinearLayout linearLayout, MyTitleBar myTitleBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.rootView = linearLayout;
        this.mTopBar = myTitleBar;
        this.tvAmount = textView;
        this.tvDate = textView2;
        this.tvMethod = textView3;
        this.tvOrderItem = textView4;
        this.tvOrderNum = textView5;
        this.tvStatus = textView6;
        this.tvSync = textView7;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityOrderdetailsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityOrderdetailsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_orderdetails, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityOrderdetailsBinding bind(View view) {
        int i = R.id.mTopBar;
        MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
        if (myTitleBar != null) {
            i = R.id.tv_amount;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.tv_date;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.tv_method;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.tv_orderItem;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = R.id.tv_orderNum;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView5 != null) {
                                i = R.id.tv_status;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView6 != null) {
                                    i = R.id.tv_sync;
                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView7 != null) {
                                        return new ActivityOrderdetailsBinding((LinearLayout) view, myTitleBar, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
