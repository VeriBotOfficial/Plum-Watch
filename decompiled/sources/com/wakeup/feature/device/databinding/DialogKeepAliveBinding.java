package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class DialogKeepAliveBinding implements ViewBinding {
    public final AppCompatTextView btnCancel;
    public final AppCompatTextView btnConfirm;
    public final AppCompatImageView keepAliveImg1;
    public final AppCompatImageView keepAliveImg2;
    public final AppCompatImageView keepAliveImg3;
    public final AppCompatTextView keepAliveTip;
    private final LinearLayoutCompat rootView;

    private DialogKeepAliveBinding(LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView3) {
        this.rootView = linearLayoutCompat;
        this.btnCancel = appCompatTextView;
        this.btnConfirm = appCompatTextView2;
        this.keepAliveImg1 = appCompatImageView;
        this.keepAliveImg2 = appCompatImageView2;
        this.keepAliveImg3 = appCompatImageView3;
        this.keepAliveTip = appCompatTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static DialogKeepAliveBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogKeepAliveBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_keep_alive, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogKeepAliveBinding bind(View view) {
        int i = R.id.btn_cancel;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = R.id.btn_confirm;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView2 != null) {
                i = R.id.keep_alive_img_1;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = R.id.keep_alive_img_2;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView2 != null) {
                        i = R.id.keep_alive_img_3;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView3 != null) {
                            i = R.id.keep_alive_tip;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView3 != null) {
                                return new DialogKeepAliveBinding((LinearLayoutCompat) view, appCompatTextView, appCompatTextView2, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
