package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ViewHomepageDeviceInfoBinding implements ViewBinding {
    public final View backgroundLayout;
    public final FrameLayout batteryLayout;
    public final FrameLayout connectLayout;
    public final View connectingImage;
    public final View connectingOverseasImage;
    public final LinearLayout deviceBattery;
    public final TextView deviceBatteryFlag1;
    public final TextView deviceBatteryFlag2;
    public final ImageView deviceBatteryImage;
    public final ImageView deviceBatteryImage2;
    public final TextView deviceBatteryText;
    public final LinearLayout deviceConnected;
    public final LinearLayout deviceConnecting;
    public final TextView deviceDesc;
    public final TextView deviceName;
    public final LinearLayout deviceOverseasConnected;
    public final LinearLayout deviceOverseasConnecting;
    public final TextView deviceOverseasReconnect;
    public final TextView deviceReconnect;
    public final LinearLayout earphoneBattery;
    public final TextView earphoneBatteryLeftText;
    public final TextView earphoneBatteryRightText;
    public final ImageView iconDevice;
    public final AppCompatImageView ivShareNetworkState;
    public final AppCompatImageView ivWifiState;
    public final LinearLayout llBroadcastBtn;
    public final FrameLayout overseasConnectLayout;
    private final ConstraintLayout rootView;
    public final TextView tvConnected;
    public final TextView tvConnectedOver;

    private ViewHomepageDeviceInfoBinding(ConstraintLayout constraintLayout, View view, FrameLayout frameLayout, FrameLayout frameLayout2, View view2, View view3, LinearLayout linearLayout, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2, TextView textView3, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView4, TextView textView5, LinearLayout linearLayout4, LinearLayout linearLayout5, TextView textView6, TextView textView7, LinearLayout linearLayout6, TextView textView8, TextView textView9, ImageView imageView3, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, LinearLayout linearLayout7, FrameLayout frameLayout3, TextView textView10, TextView textView11) {
        this.rootView = constraintLayout;
        this.backgroundLayout = view;
        this.batteryLayout = frameLayout;
        this.connectLayout = frameLayout2;
        this.connectingImage = view2;
        this.connectingOverseasImage = view3;
        this.deviceBattery = linearLayout;
        this.deviceBatteryFlag1 = textView;
        this.deviceBatteryFlag2 = textView2;
        this.deviceBatteryImage = imageView;
        this.deviceBatteryImage2 = imageView2;
        this.deviceBatteryText = textView3;
        this.deviceConnected = linearLayout2;
        this.deviceConnecting = linearLayout3;
        this.deviceDesc = textView4;
        this.deviceName = textView5;
        this.deviceOverseasConnected = linearLayout4;
        this.deviceOverseasConnecting = linearLayout5;
        this.deviceOverseasReconnect = textView6;
        this.deviceReconnect = textView7;
        this.earphoneBattery = linearLayout6;
        this.earphoneBatteryLeftText = textView8;
        this.earphoneBatteryRightText = textView9;
        this.iconDevice = imageView3;
        this.ivShareNetworkState = appCompatImageView;
        this.ivWifiState = appCompatImageView2;
        this.llBroadcastBtn = linearLayout7;
        this.overseasConnectLayout = frameLayout3;
        this.tvConnected = textView10;
        this.tvConnectedOver = textView11;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ViewHomepageDeviceInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewHomepageDeviceInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_homepage_device_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewHomepageDeviceInfoBinding bind(View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.background_layout;
        View findChildViewById3 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById3 != null) {
            i = R.id.battery_layout;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.connect_layout;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.connecting_image))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.connecting_overseas_image))) != null) {
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
                                            i = R.id.device_connected;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout2 != null) {
                                                i = R.id.device_connecting;
                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout3 != null) {
                                                    i = R.id.device_desc;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView4 != null) {
                                                        i = R.id.device_name;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView5 != null) {
                                                            i = R.id.device_overseas_connected;
                                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                            if (linearLayout4 != null) {
                                                                i = R.id.device_overseas_connecting;
                                                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                if (linearLayout5 != null) {
                                                                    i = R.id.device_overseas_reconnect;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView6 != null) {
                                                                        i = R.id.device_reconnect;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView7 != null) {
                                                                            i = R.id.earphone_battery;
                                                                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                            if (linearLayout6 != null) {
                                                                                i = R.id.earphone_battery_left_text;
                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView8 != null) {
                                                                                    i = R.id.earphone_battery_right_text;
                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView9 != null) {
                                                                                        i = R.id.icon_device;
                                                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                        if (imageView3 != null) {
                                                                                            i = R.id.iv_share_network_state;
                                                                                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                                                            if (appCompatImageView != null) {
                                                                                                i = R.id.iv_wifi_state;
                                                                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                                                                if (appCompatImageView2 != null) {
                                                                                                    i = R.id.ll_broadcast_btn;
                                                                                                    LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                    if (linearLayout7 != null) {
                                                                                                        i = R.id.overseas_connect_layout;
                                                                                                        FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                                        if (frameLayout3 != null) {
                                                                                                            i = R.id.tv_connected;
                                                                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (textView10 != null) {
                                                                                                                i = R.id.tv_connected_over;
                                                                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (textView11 != null) {
                                                                                                                    return new ViewHomepageDeviceInfoBinding((ConstraintLayout) view, findChildViewById3, frameLayout, frameLayout2, findChildViewById, findChildViewById2, linearLayout, textView, textView2, imageView, imageView2, textView3, linearLayout2, linearLayout3, textView4, textView5, linearLayout4, linearLayout5, textView6, textView7, linearLayout6, textView8, textView9, imageView3, appCompatImageView, appCompatImageView2, linearLayout7, frameLayout3, textView10, textView11);
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
