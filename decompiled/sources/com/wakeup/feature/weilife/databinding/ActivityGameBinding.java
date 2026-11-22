package com.wakeup.feature.weilife.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.weilife.R;

/* loaded from: classes3.dex */
public final class ActivityGameBinding implements ViewBinding {
    public final AppCompatImageView ivClose;
    public final RelativeLayout rlTips;
    private final LinearLayout rootView;
    public final MyTitleBar titleBarGame;
    public final WebView webviewGame;

    private ActivityGameBinding(LinearLayout linearLayout, AppCompatImageView appCompatImageView, RelativeLayout relativeLayout, MyTitleBar myTitleBar, WebView webView) {
        this.rootView = linearLayout;
        this.ivClose = appCompatImageView;
        this.rlTips = relativeLayout;
        this.titleBarGame = myTitleBar;
        this.webviewGame = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityGameBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityGameBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_game, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityGameBinding bind(View view) {
        int i = R.id.iv_close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.rl_tips;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.titleBar_game;
                MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                if (myTitleBar != null) {
                    i = R.id.webview_game;
                    WebView webView = (WebView) ViewBindings.findChildViewById(view, i);
                    if (webView != null) {
                        return new ActivityGameBinding((LinearLayout) view, appCompatImageView, relativeLayout, myTitleBar, webView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
