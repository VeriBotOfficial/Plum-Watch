package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class DialogSplashPrivacyBinding implements ViewBinding {
    public final TextView btnAgree;
    public final TextView btnCancel;
    public final NestedScrollView privacyScroll;
    private final FrameLayout rootView;
    public final TextView tvContent;
    public final TextView tvTitle;

    private DialogSplashPrivacyBinding(FrameLayout frameLayout, TextView textView, TextView textView2, NestedScrollView nestedScrollView, TextView textView3, TextView textView4) {
        this.rootView = frameLayout;
        this.btnAgree = textView;
        this.btnCancel = textView2;
        this.privacyScroll = nestedScrollView;
        this.tvContent = textView3;
        this.tvTitle = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static DialogSplashPrivacyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogSplashPrivacyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_splash_privacy, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogSplashPrivacyBinding bind(View view) {
        int i = R.id.btn_agree;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.btn_cancel;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.privacy_scroll;
                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                if (nestedScrollView != null) {
                    i = R.id.tv_content;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.tv_title;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            return new DialogSplashPrivacyBinding((FrameLayout) view, textView, textView2, nestedScrollView, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
