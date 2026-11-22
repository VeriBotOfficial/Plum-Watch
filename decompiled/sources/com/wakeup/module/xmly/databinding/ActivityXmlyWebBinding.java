package com.wakeup.module.xmly.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.module.xmly.R;

/* loaded from: classes4.dex */
public final class ActivityXmlyWebBinding implements ViewBinding {
    public final ProgressBar progressBar;
    private final LinearLayoutCompat rootView;
    public final MyTitleBar titleBar;
    public final FrameLayout webViewContainer;

    private ActivityXmlyWebBinding(LinearLayoutCompat linearLayoutCompat, ProgressBar progressBar, MyTitleBar myTitleBar, FrameLayout frameLayout) {
        this.rootView = linearLayoutCompat;
        this.progressBar = progressBar;
        this.titleBar = myTitleBar;
        this.webViewContainer = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ActivityXmlyWebBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityXmlyWebBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_xmly_web, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityXmlyWebBinding bind(View view) {
        int i = R.id.progressBar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
        if (progressBar != null) {
            i = R.id.title_bar;
            MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
            if (myTitleBar != null) {
                i = R.id.webViewContainer;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    return new ActivityXmlyWebBinding((LinearLayoutCompat) view, progressBar, myTitleBar, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
