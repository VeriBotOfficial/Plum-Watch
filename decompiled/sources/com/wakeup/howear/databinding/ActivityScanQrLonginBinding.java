package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ActivityScanQrLonginBinding implements ViewBinding {
    public final ImageView ivLogin;
    private final LinearLayout rootView;
    public final MyTitleBar topBar;
    public final TextView tvDismiss;
    public final TextView tvHint;
    public final TextView tvSureLogin;

    private ActivityScanQrLonginBinding(LinearLayout linearLayout, ImageView imageView, MyTitleBar myTitleBar, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.ivLogin = imageView;
        this.topBar = myTitleBar;
        this.tvDismiss = textView;
        this.tvHint = textView2;
        this.tvSureLogin = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityScanQrLonginBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityScanQrLonginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_scan_qr_longin, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityScanQrLonginBinding bind(View view) {
        int i = R.id.iv_login;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.topBar;
            MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
            if (myTitleBar != null) {
                i = R.id.tv_dismiss;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_hint;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.tv_sure_login;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            return new ActivityScanQrLonginBinding((LinearLayout) view, imageView, myTitleBar, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
