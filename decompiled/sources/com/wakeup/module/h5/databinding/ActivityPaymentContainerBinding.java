package com.wakeup.module.h5.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.module.h5.R;

/* loaded from: classes4.dex */
public final class ActivityPaymentContainerBinding implements ViewBinding {
    public final View placeholderView;
    private final LinearLayoutCompat rootView;
    public final MyTitleBar titleBar;
    public final WebView webView;

    private ActivityPaymentContainerBinding(LinearLayoutCompat linearLayoutCompat, View view, MyTitleBar myTitleBar, WebView webView) {
        this.rootView = linearLayoutCompat;
        this.placeholderView = view;
        this.titleBar = myTitleBar;
        this.webView = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ActivityPaymentContainerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPaymentContainerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_payment_container, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityPaymentContainerBinding bind(View view) {
        int i = R.id.placeholderView;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            i = R.id.title_bar;
            MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
            if (myTitleBar != null) {
                i = R.id.webView;
                WebView webView = (WebView) ViewBindings.findChildViewById(view, i);
                if (webView != null) {
                    return new ActivityPaymentContainerBinding((LinearLayoutCompat) view, findChildViewById, myTitleBar, webView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
