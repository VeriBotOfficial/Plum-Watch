package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class FragmentBenefitsBinding implements ViewBinding {
    private final FrameLayout rootView;
    public final WebView webviewBenefits;

    private FragmentBenefitsBinding(FrameLayout frameLayout, WebView webView) {
        this.rootView = frameLayout;
        this.webviewBenefits = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBenefitsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBenefitsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_benefits, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentBenefitsBinding bind(View view) {
        int i = R.id.webview_benefits;
        WebView webView = (WebView) ViewBindings.findChildViewById(view, i);
        if (webView != null) {
            return new FragmentBenefitsBinding((FrameLayout) view, webView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
