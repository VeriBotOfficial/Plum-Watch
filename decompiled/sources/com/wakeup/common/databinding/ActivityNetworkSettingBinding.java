package com.wakeup.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.common.R;

/* loaded from: classes2.dex */
public final class ActivityNetworkSettingBinding implements ViewBinding {
    public final Button btnNetworkSettingsSave;
    public final CheckBox cbNetworkSettingsRequestBody;
    public final CheckBox cbNetworkSettingsRequestBodyFormat;
    public final CheckBox cbNetworkSettingsRequestHeaders;
    public final CheckBox cbNetworkSettingsResponseBody;
    public final CheckBox cbNetworkSettingsResponseBodyFormat;
    public final CheckBox cbNetworkSettingsResponseHeaders;
    public final ImageView ivNetworkSettingsBack;
    private final LinearLayout rootView;

    private ActivityNetworkSettingBinding(LinearLayout rootView, Button btnNetworkSettingsSave, CheckBox cbNetworkSettingsRequestBody, CheckBox cbNetworkSettingsRequestBodyFormat, CheckBox cbNetworkSettingsRequestHeaders, CheckBox cbNetworkSettingsResponseBody, CheckBox cbNetworkSettingsResponseBodyFormat, CheckBox cbNetworkSettingsResponseHeaders, ImageView ivNetworkSettingsBack) {
        this.rootView = rootView;
        this.btnNetworkSettingsSave = btnNetworkSettingsSave;
        this.cbNetworkSettingsRequestBody = cbNetworkSettingsRequestBody;
        this.cbNetworkSettingsRequestBodyFormat = cbNetworkSettingsRequestBodyFormat;
        this.cbNetworkSettingsRequestHeaders = cbNetworkSettingsRequestHeaders;
        this.cbNetworkSettingsResponseBody = cbNetworkSettingsResponseBody;
        this.cbNetworkSettingsResponseBodyFormat = cbNetworkSettingsResponseBodyFormat;
        this.cbNetworkSettingsResponseHeaders = cbNetworkSettingsResponseHeaders;
        this.ivNetworkSettingsBack = ivNetworkSettingsBack;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityNetworkSettingBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityNetworkSettingBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_network_setting, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityNetworkSettingBinding bind(View rootView) {
        int i = R.id.btn_network_settings_save;
        Button button = (Button) ViewBindings.findChildViewById(rootView, i);
        if (button != null) {
            i = R.id.cb_network_settings_request_body;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(rootView, i);
            if (checkBox != null) {
                i = R.id.cb_network_settings_request_body_format;
                CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(rootView, i);
                if (checkBox2 != null) {
                    i = R.id.cb_network_settings_request_headers;
                    CheckBox checkBox3 = (CheckBox) ViewBindings.findChildViewById(rootView, i);
                    if (checkBox3 != null) {
                        i = R.id.cb_network_settings_response_body;
                        CheckBox checkBox4 = (CheckBox) ViewBindings.findChildViewById(rootView, i);
                        if (checkBox4 != null) {
                            i = R.id.cb_network_settings_response_body_format;
                            CheckBox checkBox5 = (CheckBox) ViewBindings.findChildViewById(rootView, i);
                            if (checkBox5 != null) {
                                i = R.id.cb_network_settings_response_headers;
                                CheckBox checkBox6 = (CheckBox) ViewBindings.findChildViewById(rootView, i);
                                if (checkBox6 != null) {
                                    i = R.id.iv_network_settings_back;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                    if (imageView != null) {
                                        return new ActivityNetworkSettingBinding((LinearLayout) rootView, button, checkBox, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, imageView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
