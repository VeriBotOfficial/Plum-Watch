package com.wakeup.feature.newsdaily.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.newsdaily.R;

/* loaded from: classes3.dex */
public final class NewsDailyHomeToastBinding implements ViewBinding {
    public final FrameLayout newsDailyToastRoot;
    public final TextView newsDailyToastText;
    private final FrameLayout rootView;

    private NewsDailyHomeToastBinding(FrameLayout frameLayout, FrameLayout frameLayout2, TextView textView) {
        this.rootView = frameLayout;
        this.newsDailyToastRoot = frameLayout2;
        this.newsDailyToastText = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static NewsDailyHomeToastBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static NewsDailyHomeToastBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.news_daily_home_toast, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static NewsDailyHomeToastBinding bind(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = R.id.news_daily_toast_text;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            return new NewsDailyHomeToastBinding(frameLayout, frameLayout, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
