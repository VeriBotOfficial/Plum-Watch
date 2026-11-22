package com.wakeup.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.common.R;

/* loaded from: classes2.dex */
public final class ActivityGlogSettingsBinding implements ViewBinding {
    public final Button btnGlogSettingsSave;
    public final ImageView ivGlogSettingsBack;
    public final LinearLayout layoutGlogSettings;
    private final LinearLayout rootView;

    private ActivityGlogSettingsBinding(LinearLayout rootView, Button btnGlogSettingsSave, ImageView ivGlogSettingsBack, LinearLayout layoutGlogSettings) {
        this.rootView = rootView;
        this.btnGlogSettingsSave = btnGlogSettingsSave;
        this.ivGlogSettingsBack = ivGlogSettingsBack;
        this.layoutGlogSettings = layoutGlogSettings;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityGlogSettingsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityGlogSettingsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_glog_settings, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityGlogSettingsBinding bind(View rootView) {
        int i = R.id.btn_glog_settings_save;
        Button button = (Button) ViewBindings.findChildViewById(rootView, i);
        if (button != null) {
            i = R.id.iv_glog_settings_back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView != null) {
                i = R.id.layout_glog_settings;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                if (linearLayout != null) {
                    return new ActivityGlogSettingsBinding((LinearLayout) rootView, button, imageView, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
