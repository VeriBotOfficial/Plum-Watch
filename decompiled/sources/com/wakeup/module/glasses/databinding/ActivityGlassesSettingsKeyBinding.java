package com.wakeup.module.glasses.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.module.glasses.R;

/* loaded from: classes4.dex */
public final class ActivityGlassesSettingsKeyBinding implements ViewBinding {
    public final LinearLayoutCompat llKeyDefine;
    public final LinearLayoutCompat llTouchpadGestures;
    private final LinearLayoutCompat rootView;
    public final MyTitleBar titleBar;

    private ActivityGlassesSettingsKeyBinding(LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, MyTitleBar myTitleBar) {
        this.rootView = linearLayoutCompat;
        this.llKeyDefine = linearLayoutCompat2;
        this.llTouchpadGestures = linearLayoutCompat3;
        this.titleBar = myTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ActivityGlassesSettingsKeyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityGlassesSettingsKeyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_glasses_settings_key, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityGlassesSettingsKeyBinding bind(View view) {
        int i = R.id.ll_key_define;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.ll_touchpad_gestures;
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat2 != null) {
                i = R.id.titleBar;
                MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                if (myTitleBar != null) {
                    return new ActivityGlassesSettingsKeyBinding((LinearLayoutCompat) view, linearLayoutCompat, linearLayoutCompat2, myTitleBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
