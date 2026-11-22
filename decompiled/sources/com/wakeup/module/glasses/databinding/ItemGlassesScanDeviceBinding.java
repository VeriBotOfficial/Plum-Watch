package com.wakeup.module.glasses.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.module.glasses.R;

/* loaded from: classes4.dex */
public final class ItemGlassesScanDeviceBinding implements ViewBinding {
    public final AppCompatTextView deviceScanConnect;
    public final AppCompatImageView deviceScanIcon;
    public final AppCompatTextView deviceScanMac;
    public final AppCompatTextView deviceScanName;
    private final FrameLayout rootView;

    private ItemGlassesScanDeviceBinding(FrameLayout frameLayout, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.rootView = frameLayout;
        this.deviceScanConnect = appCompatTextView;
        this.deviceScanIcon = appCompatImageView;
        this.deviceScanMac = appCompatTextView2;
        this.deviceScanName = appCompatTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ItemGlassesScanDeviceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemGlassesScanDeviceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_glasses_scan_device, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemGlassesScanDeviceBinding bind(View view) {
        int i = R.id.device_scan_connect;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = R.id.device_scan_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = R.id.device_scan_mac;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null) {
                    i = R.id.device_scan_name;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView3 != null) {
                        return new ItemGlassesScanDeviceBinding((FrameLayout) view, appCompatTextView, appCompatImageView, appCompatTextView2, appCompatTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
