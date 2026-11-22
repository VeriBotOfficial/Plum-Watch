package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ActivityDeviceDetailBinding implements ViewBinding {
    public final FrameLayout fragmentContainer;
    private final LinearLayout rootView;
    public final MyTitleBar topBar;

    private ActivityDeviceDetailBinding(LinearLayout linearLayout, FrameLayout frameLayout, MyTitleBar myTitleBar) {
        this.rootView = linearLayout;
        this.fragmentContainer = frameLayout;
        this.topBar = myTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDeviceDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDeviceDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_device_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityDeviceDetailBinding bind(View view) {
        int i = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.topBar;
            MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
            if (myTitleBar != null) {
                return new ActivityDeviceDetailBinding((LinearLayout) view, frameLayout, myTitleBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
