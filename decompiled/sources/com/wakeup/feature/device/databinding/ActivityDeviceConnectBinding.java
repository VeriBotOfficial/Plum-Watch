package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ActivityDeviceConnectBinding implements ViewBinding {
    public final FrameLayout containerLayout;
    private final LinearLayoutCompat rootView;
    public final MyTitleBar titleBar;

    private ActivityDeviceConnectBinding(LinearLayoutCompat linearLayoutCompat, FrameLayout frameLayout, MyTitleBar myTitleBar) {
        this.rootView = linearLayoutCompat;
        this.containerLayout = frameLayout;
        this.titleBar = myTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ActivityDeviceConnectBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDeviceConnectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_device_connect, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityDeviceConnectBinding bind(View view) {
        int i = R.id.container_layout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.title_bar;
            MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
            if (myTitleBar != null) {
                return new ActivityDeviceConnectBinding((LinearLayoutCompat) view, frameLayout, myTitleBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
