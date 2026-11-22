package com.wakeup.module.wechat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.module.wechat.R;

/* loaded from: classes4.dex */
public final class DialogImgEmoBinding implements ViewBinding {
    public final ProgressBar progressBar;
    private final LinearLayoutCompat rootView;
    public final AppCompatTextView tvTitle;

    private DialogImgEmoBinding(LinearLayoutCompat linearLayoutCompat, ProgressBar progressBar, AppCompatTextView appCompatTextView) {
        this.rootView = linearLayoutCompat;
        this.progressBar = progressBar;
        this.tvTitle = appCompatTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static DialogImgEmoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogImgEmoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_img_emo, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogImgEmoBinding bind(View view) {
        int i = R.id.progress_bar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
        if (progressBar != null) {
            i = R.id.tv_title;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                return new DialogImgEmoBinding((LinearLayoutCompat) view, progressBar, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
