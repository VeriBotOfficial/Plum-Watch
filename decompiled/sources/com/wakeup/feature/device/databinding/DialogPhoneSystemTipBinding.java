package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class DialogPhoneSystemTipBinding implements ViewBinding {
    public final AppCompatButton btCompleteSetting;
    public final AppCompatButton btSetting;
    private final LinearLayoutCompat rootView;

    private DialogPhoneSystemTipBinding(LinearLayoutCompat linearLayoutCompat, AppCompatButton appCompatButton, AppCompatButton appCompatButton2) {
        this.rootView = linearLayoutCompat;
        this.btCompleteSetting = appCompatButton;
        this.btSetting = appCompatButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static DialogPhoneSystemTipBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogPhoneSystemTipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_phone_system_tip, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogPhoneSystemTipBinding bind(View view) {
        int i = R.id.bt_complete_setting;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
        if (appCompatButton != null) {
            i = R.id.bt_setting;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(view, i);
            if (appCompatButton2 != null) {
                return new DialogPhoneSystemTipBinding((LinearLayoutCompat) view, appCompatButton, appCompatButton2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
