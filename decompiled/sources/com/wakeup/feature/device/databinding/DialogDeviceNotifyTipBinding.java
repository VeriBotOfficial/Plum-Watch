package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class DialogDeviceNotifyTipBinding implements ViewBinding {
    public final AppCompatTextView btnConfirm;
    private final LinearLayoutCompat rootView;

    private DialogDeviceNotifyTipBinding(LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView) {
        this.rootView = linearLayoutCompat;
        this.btnConfirm = appCompatTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static DialogDeviceNotifyTipBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogDeviceNotifyTipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_device_notify_tip, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogDeviceNotifyTipBinding bind(View view) {
        int i = R.id.btn_confirm;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            return new DialogDeviceNotifyTipBinding((LinearLayoutCompat) view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
