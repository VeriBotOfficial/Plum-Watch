package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class DialogDeviceAddBinding implements ViewBinding {
    public final LinearLayout addDevice;
    private final FrameLayout rootView;
    public final LinearLayout scanDevice;
    public final View viewClick;

    private DialogDeviceAddBinding(FrameLayout frameLayout, LinearLayout linearLayout, LinearLayout linearLayout2, View view) {
        this.rootView = frameLayout;
        this.addDevice = linearLayout;
        this.scanDevice = linearLayout2;
        this.viewClick = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static DialogDeviceAddBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogDeviceAddBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_device_add, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogDeviceAddBinding bind(View view) {
        View findChildViewById;
        int i = R.id.add_device;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.scan_device;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view_click))) != null) {
                return new DialogDeviceAddBinding((FrameLayout) view, linearLayout, linearLayout2, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
