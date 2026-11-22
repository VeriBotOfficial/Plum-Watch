package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.commonui.progress.CircleScaleProgressBar;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ActivityDeviceUpdateBinding implements ViewBinding {
    public final Button btnUpdata;
    public final ImageView ivDeviceImage;
    public final View line;
    public final LinearLayout llCurrentVersion;
    public final LinearLayout llMessage;
    public final LinearLayout llProgress;
    public final LinearLayout llValue;
    public final CircleScaleProgressBar mCircleScaleProgressBar;
    private final LinearLayout rootView;
    public final MyTitleBar titleBar;
    public final TextView tv1;
    public final TextView tv2;
    public final TextView tv3;
    public final TextView tvCurrentVersion;
    public final TextView tvFileMessage;
    public final TextView tvNewMessage;
    public final TextView tvNote;
    public final TextView tvProgress;
    public final TextView tvStatus;
    public final TextView tvTip;
    public final TextView tvValue;

    private ActivityDeviceUpdateBinding(LinearLayout linearLayout, Button button, ImageView imageView, View view, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, CircleScaleProgressBar circleScaleProgressBar, MyTitleBar myTitleBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11) {
        this.rootView = linearLayout;
        this.btnUpdata = button;
        this.ivDeviceImage = imageView;
        this.line = view;
        this.llCurrentVersion = linearLayout2;
        this.llMessage = linearLayout3;
        this.llProgress = linearLayout4;
        this.llValue = linearLayout5;
        this.mCircleScaleProgressBar = circleScaleProgressBar;
        this.titleBar = myTitleBar;
        this.tv1 = textView;
        this.tv2 = textView2;
        this.tv3 = textView3;
        this.tvCurrentVersion = textView4;
        this.tvFileMessage = textView5;
        this.tvNewMessage = textView6;
        this.tvNote = textView7;
        this.tvProgress = textView8;
        this.tvStatus = textView9;
        this.tvTip = textView10;
        this.tvValue = textView11;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDeviceUpdateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDeviceUpdateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_device_update, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityDeviceUpdateBinding bind(View view) {
        View findChildViewById;
        int i = R.id.btn_updata;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.iv_deviceImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line))) != null) {
                i = R.id.ll_current_version;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.ll_message;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = R.id.ll_progress;
                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout3 != null) {
                            i = R.id.llValue;
                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout4 != null) {
                                i = R.id.mCircleScaleProgressBar;
                                CircleScaleProgressBar circleScaleProgressBar = (CircleScaleProgressBar) ViewBindings.findChildViewById(view, i);
                                if (circleScaleProgressBar != null) {
                                    i = R.id.title_bar;
                                    MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                                    if (myTitleBar != null) {
                                        i = R.id.tv1;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView != null) {
                                            i = R.id.tv2;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView2 != null) {
                                                i = R.id.tv3;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView3 != null) {
                                                    i = R.id.tv_current_version;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView4 != null) {
                                                        i = R.id.tv_fileMessage;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView5 != null) {
                                                            i = R.id.tv_newMessage;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView6 != null) {
                                                                i = R.id.tv_note;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView7 != null) {
                                                                    i = R.id.tv_progress;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView8 != null) {
                                                                        i = R.id.tv_status;
                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView9 != null) {
                                                                            i = R.id.tv_tip;
                                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView10 != null) {
                                                                                i = R.id.tvValue;
                                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView11 != null) {
                                                                                    return new ActivityDeviceUpdateBinding((LinearLayout) view, button, imageView, findChildViewById, linearLayout, linearLayout2, linearLayout3, linearLayout4, circleScaleProgressBar, myTitleBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11);
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
