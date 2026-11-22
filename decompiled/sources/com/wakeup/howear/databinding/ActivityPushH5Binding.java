package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ActivityPushH5Binding implements ViewBinding {
    public final WebView pushH5WebView;
    private final LinearLayoutCompat rootView;
    public final MyTitleBar titleBarPushH5;

    private ActivityPushH5Binding(LinearLayoutCompat linearLayoutCompat, WebView webView, MyTitleBar myTitleBar) {
        this.rootView = linearLayoutCompat;
        this.pushH5WebView = webView;
        this.titleBarPushH5 = myTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ActivityPushH5Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPushH5Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_push_h5, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityPushH5Binding bind(View view) {
        int i = R.id.push_h5_web_view;
        WebView webView = (WebView) ViewBindings.findChildViewById(view, i);
        if (webView != null) {
            i = R.id.titleBar_push_h5;
            MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
            if (myTitleBar != null) {
                return new ActivityPushH5Binding((LinearLayoutCompat) view, webView, myTitleBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
