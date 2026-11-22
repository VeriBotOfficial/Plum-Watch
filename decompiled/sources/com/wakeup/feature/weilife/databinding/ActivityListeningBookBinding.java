package com.wakeup.feature.weilife.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.weilife.R;

/* loaded from: classes3.dex */
public final class ActivityListeningBookBinding implements ViewBinding {
    public final WebView listenBookWebView;
    private final LinearLayoutCompat rootView;
    public final MyTitleBar titleBarBook;

    private ActivityListeningBookBinding(LinearLayoutCompat linearLayoutCompat, WebView webView, MyTitleBar myTitleBar) {
        this.rootView = linearLayoutCompat;
        this.listenBookWebView = webView;
        this.titleBarBook = myTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ActivityListeningBookBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityListeningBookBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_listening_book, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityListeningBookBinding bind(View view) {
        int i = R.id.listen_book_web_view;
        WebView webView = (WebView) ViewBindings.findChildViewById(view, i);
        if (webView != null) {
            i = R.id.titleBar_book;
            MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
            if (myTitleBar != null) {
                return new ActivityListeningBookBinding((LinearLayoutCompat) view, webView, myTitleBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
