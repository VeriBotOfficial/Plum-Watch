package com.wakeup.module.wechat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.module.wechat.R;

/* loaded from: classes4.dex */
public final class ActivityWxH5Binding implements ViewBinding {
    private final LinearLayoutCompat rootView;
    public final MyTitleBar titleBar;
    public final WebView webView;

    private ActivityWxH5Binding(LinearLayoutCompat linearLayoutCompat, MyTitleBar myTitleBar, WebView webView) {
        this.rootView = linearLayoutCompat;
        this.titleBar = myTitleBar;
        this.webView = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ActivityWxH5Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityWxH5Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_wx_h5, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityWxH5Binding bind(View view) {
        int i = R.id.title_bar;
        MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
        if (myTitleBar != null) {
            i = R.id.webView;
            WebView webView = (WebView) ViewBindings.findChildViewById(view, i);
            if (webView != null) {
                return new ActivityWxH5Binding((LinearLayoutCompat) view, myTitleBar, webView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
