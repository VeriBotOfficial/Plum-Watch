package com.wakeup.module.h5.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.module.h5.R;

/* loaded from: classes4.dex */
public final class ActivityH5ContainerBinding implements ViewBinding {
    public final FrameLayout flVideo;
    public final FrameLayout pageLoading;
    public final View placeholderView;
    private final LinearLayoutCompat rootView;
    public final MyTitleBar titleBar;
    public final WebView webView;
    public final FrameLayout webViewContainer;

    private ActivityH5ContainerBinding(LinearLayoutCompat linearLayoutCompat, FrameLayout frameLayout, FrameLayout frameLayout2, View view, MyTitleBar myTitleBar, WebView webView, FrameLayout frameLayout3) {
        this.rootView = linearLayoutCompat;
        this.flVideo = frameLayout;
        this.pageLoading = frameLayout2;
        this.placeholderView = view;
        this.titleBar = myTitleBar;
        this.webView = webView;
        this.webViewContainer = frameLayout3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ActivityH5ContainerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityH5ContainerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_h5_container, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityH5ContainerBinding bind(View view) {
        View findChildViewById;
        int i = R.id.fl_video;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.pageLoading;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.placeholderView))) != null) {
                i = R.id.title_bar;
                MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                if (myTitleBar != null) {
                    i = R.id.webView;
                    WebView webView = (WebView) ViewBindings.findChildViewById(view, i);
                    if (webView != null) {
                        i = R.id.webViewContainer;
                        FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout3 != null) {
                            return new ActivityH5ContainerBinding((LinearLayoutCompat) view, frameLayout, frameLayout2, findChildViewById, myTitleBar, webView, frameLayout3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
