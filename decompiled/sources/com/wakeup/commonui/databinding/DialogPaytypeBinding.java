package com.wakeup.commonui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public final class DialogPaytypeBinding implements ViewBinding {
    public final View line1;
    public final View line2;
    public final View lineLast;
    public final LinearLayout llAlipay;
    public final LinearLayout llDialog;
    public final LinearLayout llPaypal;
    public final LinearLayout llRedemptionCode;
    public final LinearLayout llStripe;
    public final LinearLayout llWechat;
    private final LinearLayout rootView;
    public final TextView tv1;
    public final TextView tv2;

    private DialogPaytypeBinding(LinearLayout linearLayout, View view, View view2, View view3, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.line1 = view;
        this.line2 = view2;
        this.lineLast = view3;
        this.llAlipay = linearLayout2;
        this.llDialog = linearLayout3;
        this.llPaypal = linearLayout4;
        this.llRedemptionCode = linearLayout5;
        this.llStripe = linearLayout6;
        this.llWechat = linearLayout7;
        this.tv1 = textView;
        this.tv2 = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogPaytypeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogPaytypeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_paytype, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogPaytypeBinding bind(View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.line1;
        View findChildViewById3 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line2))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.line_last))) != null) {
            i = R.id.ll_alipay;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.ll_dialog;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.ll_paypal;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout3 != null) {
                        i = R.id.ll_redemption_code;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout4 != null) {
                            i = R.id.ll_stripe;
                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout5 != null) {
                                i = R.id.ll_wechat;
                                LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout6 != null) {
                                    i = R.id.tv1;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = R.id.tv2;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            return new DialogPaytypeBinding((LinearLayout) view, findChildViewById3, findChildViewById, findChildViewById2, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, textView, textView2);
                                        }
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
