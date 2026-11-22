package com.wakeup.feature.weilife.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.weilife.R;

/* loaded from: classes3.dex */
public final class DialogRemindSignInBinding implements ViewBinding {
    public final AppCompatImageView dialogSignInClose;
    public final AppCompatImageView dialogSignInGo;
    private final LinearLayoutCompat rootView;

    private DialogRemindSignInBinding(LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.rootView = linearLayoutCompat;
        this.dialogSignInClose = appCompatImageView;
        this.dialogSignInGo = appCompatImageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static DialogRemindSignInBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogRemindSignInBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_remind_sign_in, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogRemindSignInBinding bind(View view) {
        int i = R.id.dialog_sign_in_close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.dialog_sign_in_go;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                return new DialogRemindSignInBinding((LinearLayoutCompat) view, appCompatImageView, appCompatImageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
