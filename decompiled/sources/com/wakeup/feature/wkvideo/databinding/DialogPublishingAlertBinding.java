package com.wakeup.feature.wkvideo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.wkvideo.R;

/* loaded from: classes3.dex */
public final class DialogPublishingAlertBinding implements ViewBinding {
    private final LinearLayoutCompat rootView;
    public final AppCompatTextView tvConfirm;
    public final AppCompatTextView tvContent;

    private DialogPublishingAlertBinding(LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = linearLayoutCompat;
        this.tvConfirm = appCompatTextView;
        this.tvContent = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static DialogPublishingAlertBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogPublishingAlertBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_publishing_alert, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogPublishingAlertBinding bind(View view) {
        int i = R.id.tvConfirm;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = R.id.tvContent;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView2 != null) {
                return new DialogPublishingAlertBinding((LinearLayoutCompat) view, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
