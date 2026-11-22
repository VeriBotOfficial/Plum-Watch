package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ItemHomepageDeviceListBinding implements ViewBinding {
    public final FrameLayout batteryLayout;
    public final View connectingImage;
    public final LinearLayout deviceBattery;
    public final TextView deviceBatteryFlag1;
    public final TextView deviceBatteryFlag2;
    public final ImageView deviceBatteryImage;
    public final ImageView deviceBatteryImage2;
    public final TextView deviceBatteryText;
    public final TextView deviceConnectText;
    public final LinearLayout deviceConnecting;
    public final ImageView deviceImage;
    public final TextView deviceModel;
    public final TextView deviceName;
    public final LinearLayout earphoneBattery;
    public final TextView earphoneBatteryLeftText;
    public final TextView earphoneBatteryRightText;
    public final LinearLayout ll4gStatus;
    private final ConstraintLayout rootView;

    private ItemHomepageDeviceListBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, View view, LinearLayout linearLayout, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2, TextView textView3, TextView textView4, LinearLayout linearLayout2, ImageView imageView3, TextView textView5, TextView textView6, LinearLayout linearLayout3, TextView textView7, TextView textView8, LinearLayout linearLayout4) {
        this.rootView = constraintLayout;
        this.batteryLayout = frameLayout;
        this.connectingImage = view;
        this.deviceBattery = linearLayout;
        this.deviceBatteryFlag1 = textView;
        this.deviceBatteryFlag2 = textView2;
        this.deviceBatteryImage = imageView;
        this.deviceBatteryImage2 = imageView2;
        this.deviceBatteryText = textView3;
        this.deviceConnectText = textView4;
        this.deviceConnecting = linearLayout2;
        this.deviceImage = imageView3;
        this.deviceModel = textView5;
        this.deviceName = textView6;
        this.earphoneBattery = linearLayout3;
        this.earphoneBatteryLeftText = textView7;
        this.earphoneBatteryRightText = textView8;
        this.ll4gStatus = linearLayout4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemHomepageDeviceListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemHomepageDeviceListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_homepage_device_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemHomepageDeviceListBinding bind(View view) {
        View findChildViewById;
        int i = R.id.battery_layout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.connecting_image))) != null) {
            i = R.id.device_battery;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.device_battery_flag1;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.device_battery_flag2;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.device_battery_image;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.device_battery_image2;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = R.id.device_battery_text;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = R.id.device_connect_text;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        i = R.id.device_connecting;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout2 != null) {
                                            i = R.id.device_image;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView3 != null) {
                                                i = R.id.device_model;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView5 != null) {
                                                    i = R.id.device_name;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView6 != null) {
                                                        i = R.id.earphone_battery;
                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayout3 != null) {
                                                            i = R.id.earphone_battery_left_text;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView7 != null) {
                                                                i = R.id.earphone_battery_right_text;
                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView8 != null) {
                                                                    i = R.id.ll_4g_status;
                                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (linearLayout4 != null) {
                                                                        return new ItemHomepageDeviceListBinding((ConstraintLayout) view, frameLayout, findChildViewById, linearLayout, textView, textView2, imageView, imageView2, textView3, textView4, linearLayout2, imageView3, textView5, textView6, linearLayout3, textView7, textView8, linearLayout4);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
