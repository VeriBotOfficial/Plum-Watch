package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ViewWatchConnectCardBinding implements ViewBinding {
    public final FrameLayout connectLayout;
    public final View connectingImage;
    public final LinearLayout deviceConnected;
    public final LinearLayout deviceConnecting;
    public final TextView deviceReconnect;
    public final ImageView ivBattery;
    public final ImageView ivWatchFace;
    public final LinearLayout llDailySport;
    public final LinearLayout llDeviceNameRow;
    public final LinearLayout llMetrics;
    public final LinearLayout llRecoveryScore;
    private final ConstraintLayout rootView;
    public final ViewWatchConnectMetricRowBinding rowKcal;
    public final ViewWatchConnectMetricRowBinding rowSport;
    public final ViewWatchConnectMetricRowBinding rowStep;
    public final Space spaceDialTag;
    public final TextView tvBattery;
    public final TextView tvConnected;
    public final TextView tvDeviceName;
    public final TextView tvDialMarket;
    public final TextView tvDialSlogan;
    public final TextView tvRecoveryLabel;
    public final TextView tvRecoveryScore;

    private ViewWatchConnectCardBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, View view, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, ImageView imageView, ImageView imageView2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, ViewWatchConnectMetricRowBinding viewWatchConnectMetricRowBinding, ViewWatchConnectMetricRowBinding viewWatchConnectMetricRowBinding2, ViewWatchConnectMetricRowBinding viewWatchConnectMetricRowBinding3, Space space, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.rootView = constraintLayout;
        this.connectLayout = frameLayout;
        this.connectingImage = view;
        this.deviceConnected = linearLayout;
        this.deviceConnecting = linearLayout2;
        this.deviceReconnect = textView;
        this.ivBattery = imageView;
        this.ivWatchFace = imageView2;
        this.llDailySport = linearLayout3;
        this.llDeviceNameRow = linearLayout4;
        this.llMetrics = linearLayout5;
        this.llRecoveryScore = linearLayout6;
        this.rowKcal = viewWatchConnectMetricRowBinding;
        this.rowSport = viewWatchConnectMetricRowBinding2;
        this.rowStep = viewWatchConnectMetricRowBinding3;
        this.spaceDialTag = space;
        this.tvBattery = textView2;
        this.tvConnected = textView3;
        this.tvDeviceName = textView4;
        this.tvDialMarket = textView5;
        this.tvDialSlogan = textView6;
        this.tvRecoveryLabel = textView7;
        this.tvRecoveryScore = textView8;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ViewWatchConnectCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewWatchConnectCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_watch_connect_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewWatchConnectCardBinding bind(View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.connect_layout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.connecting_image))) != null) {
            i = R.id.device_connected;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.device_connecting;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.device_reconnect;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.iv_battery;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.iv_watch_face;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = R.id.ll_daily_sport;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout3 != null) {
                                    i = R.id.ll_device_name_row;
                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout4 != null) {
                                        i = R.id.ll_metrics;
                                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout5 != null) {
                                            i = R.id.ll_recovery_score;
                                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout6 != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.row_kcal))) != null) {
                                                ViewWatchConnectMetricRowBinding bind = ViewWatchConnectMetricRowBinding.bind(findChildViewById2);
                                                i = R.id.row_sport;
                                                View findChildViewById3 = ViewBindings.findChildViewById(view, i);
                                                if (findChildViewById3 != null) {
                                                    ViewWatchConnectMetricRowBinding bind2 = ViewWatchConnectMetricRowBinding.bind(findChildViewById3);
                                                    i = R.id.row_step;
                                                    View findChildViewById4 = ViewBindings.findChildViewById(view, i);
                                                    if (findChildViewById4 != null) {
                                                        ViewWatchConnectMetricRowBinding bind3 = ViewWatchConnectMetricRowBinding.bind(findChildViewById4);
                                                        i = R.id.space_dial_tag;
                                                        Space space = (Space) ViewBindings.findChildViewById(view, i);
                                                        if (space != null) {
                                                            i = R.id.tv_battery;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView2 != null) {
                                                                i = R.id.tv_connected;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView3 != null) {
                                                                    i = R.id.tv_device_name;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView4 != null) {
                                                                        i = R.id.tv_dial_market;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView5 != null) {
                                                                            i = R.id.tv_dial_slogan;
                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView6 != null) {
                                                                                i = R.id.tv_recovery_label;
                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView7 != null) {
                                                                                    i = R.id.tv_recovery_score;
                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView8 != null) {
                                                                                        return new ViewWatchConnectCardBinding((ConstraintLayout) view, frameLayout, findChildViewById, linearLayout, linearLayout2, textView, imageView, imageView2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, bind, bind2, bind3, space, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
