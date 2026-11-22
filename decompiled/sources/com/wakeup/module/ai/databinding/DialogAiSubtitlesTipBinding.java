package com.wakeup.module.ai.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.module.ai.R;

/* loaded from: classes4.dex */
public final class DialogAiSubtitlesTipBinding implements ViewBinding {
    public final LinearLayoutCompat llTip;
    private final FrameLayout rootView;
    public final AppCompatTextView tvCancel;
    public final AppCompatTextView tvDesc;
    public final AppCompatTextView tvSure;
    public final AppCompatTextView tvTip2;
    public final AppCompatTextView tvTitle;

    private DialogAiSubtitlesTipBinding(FrameLayout frameLayout, LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5) {
        this.rootView = frameLayout;
        this.llTip = linearLayoutCompat;
        this.tvCancel = appCompatTextView;
        this.tvDesc = appCompatTextView2;
        this.tvSure = appCompatTextView3;
        this.tvTip2 = appCompatTextView4;
        this.tvTitle = appCompatTextView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static DialogAiSubtitlesTipBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogAiSubtitlesTipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_ai_subtitles_tip, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogAiSubtitlesTipBinding bind(View view) {
        int i = R.id.ll_tip;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.tv_cancel;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = R.id.tv_desc;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null) {
                    i = R.id.tv_sure;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView3 != null) {
                        i = R.id.tv_tip2;
                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView4 != null) {
                            i = R.id.tv_title;
                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView5 != null) {
                                return new DialogAiSubtitlesTipBinding((FrameLayout) view, linearLayoutCompat, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
