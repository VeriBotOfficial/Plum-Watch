package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class DialogAiInstallBinding implements ViewBinding {
    public final Button aiBtnInstall;
    public final ProgressBar aiProgressBar;
    public final AppCompatImageView dialogAiLoading;
    private final LinearLayoutCompat rootView;

    private DialogAiInstallBinding(LinearLayoutCompat linearLayoutCompat, Button button, ProgressBar progressBar, AppCompatImageView appCompatImageView) {
        this.rootView = linearLayoutCompat;
        this.aiBtnInstall = button;
        this.aiProgressBar = progressBar;
        this.dialogAiLoading = appCompatImageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static DialogAiInstallBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogAiInstallBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_ai_install, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogAiInstallBinding bind(View view) {
        int i = R.id.ai_btn_install;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.ai_progressBar;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
            if (progressBar != null) {
                i = R.id.dialog_ai_loading;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    return new DialogAiInstallBinding((LinearLayoutCompat) view, button, progressBar, appCompatImageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
