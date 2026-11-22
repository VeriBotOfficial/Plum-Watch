package com.wakeup.commonui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public final class LayoutSaveVideoProgressBinding implements ViewBinding {
    public final ImageView ivIcon;
    public final ImageView ivSaveVideoSuccess;
    public final LinearLayoutCompat layoutSaveVideo;
    public final RelativeLayout layoutSaveVideoContainer;
    public final LinearLayoutCompat layoutSaveVideoShare;
    public final ProgressBar pbSaveVideo;
    private final RelativeLayout rootView;
    public final TextView tvSaveVideoCancel;
    public final TextView tvSaveVideoProgress;
    public final TextView tvText;

    private LayoutSaveVideoProgressBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, LinearLayoutCompat linearLayoutCompat, RelativeLayout relativeLayout2, LinearLayoutCompat linearLayoutCompat2, ProgressBar progressBar, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = relativeLayout;
        this.ivIcon = imageView;
        this.ivSaveVideoSuccess = imageView2;
        this.layoutSaveVideo = linearLayoutCompat;
        this.layoutSaveVideoContainer = relativeLayout2;
        this.layoutSaveVideoShare = linearLayoutCompat2;
        this.pbSaveVideo = progressBar;
        this.tvSaveVideoCancel = textView;
        this.tvSaveVideoProgress = textView2;
        this.tvText = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static LayoutSaveVideoProgressBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutSaveVideoProgressBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_save_video_progress, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutSaveVideoProgressBinding bind(View view) {
        int i = R.id.iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.iv_save_video_success;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.layout_save_video;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i = R.id.layout_save_video_share;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat2 != null) {
                        i = R.id.pb_save_video;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                        if (progressBar != null) {
                            i = R.id.tv_save_video_cancel;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = R.id.tv_save_video_progress;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = R.id.tv_text;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        return new LayoutSaveVideoProgressBinding(relativeLayout, imageView, imageView2, linearLayoutCompat, relativeLayout, linearLayoutCompat2, progressBar, textView, textView2, textView3);
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
