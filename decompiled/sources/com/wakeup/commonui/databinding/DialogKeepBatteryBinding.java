package com.wakeup.commonui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public final class DialogKeepBatteryBinding implements ViewBinding {
    public final AppCompatTextView btnCancel;
    public final AppCompatTextView btnConfirm;
    public final AppCompatTextView keepAliveTip;
    public final AppCompatTextView keepAliveTip2;
    private final LinearLayoutCompat rootView;

    private DialogKeepBatteryBinding(LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        this.rootView = linearLayoutCompat;
        this.btnCancel = appCompatTextView;
        this.btnConfirm = appCompatTextView2;
        this.keepAliveTip = appCompatTextView3;
        this.keepAliveTip2 = appCompatTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static DialogKeepBatteryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogKeepBatteryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_keep_battery, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogKeepBatteryBinding bind(View view) {
        int i = R.id.btn_cancel;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = R.id.btn_confirm;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView2 != null) {
                i = R.id.keep_alive_tip;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView3 != null) {
                    i = R.id.keep_alive_tip2;
                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView4 != null) {
                        return new DialogKeepBatteryBinding((LinearLayoutCompat) view, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
