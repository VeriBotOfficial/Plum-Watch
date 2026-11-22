package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ActivityMenuDetailLayoutBinding implements ViewBinding {
    public final TextView btnInstall;
    public final ImageView ivImage;
    public final MyTitleBar mTopBar;
    public final ProgressBar progressBar;
    private final LinearLayout rootView;
    public final TextView tvAttention;
    public final TextView tvAttentionContent;
    public final TextView tvBuyVip;
    public final TextView tvDialInstallNum;
    public final TextView tvDialName;
    public final TextView tvDialPrice;
    public final TextView tvDialSizes;
    public final TextView tvProgress;

    private ActivityMenuDetailLayoutBinding(LinearLayout linearLayout, TextView textView, ImageView imageView, MyTitleBar myTitleBar, ProgressBar progressBar, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.rootView = linearLayout;
        this.btnInstall = textView;
        this.ivImage = imageView;
        this.mTopBar = myTitleBar;
        this.progressBar = progressBar;
        this.tvAttention = textView2;
        this.tvAttentionContent = textView3;
        this.tvBuyVip = textView4;
        this.tvDialInstallNum = textView5;
        this.tvDialName = textView6;
        this.tvDialPrice = textView7;
        this.tvDialSizes = textView8;
        this.tvProgress = textView9;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMenuDetailLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMenuDetailLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_menu_detail_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityMenuDetailLayoutBinding bind(View view) {
        int i = R.id.btn_install;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.iv_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.mTopBar;
                MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                if (myTitleBar != null) {
                    i = R.id.progress_bar;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                    if (progressBar != null) {
                        i = R.id.tv_attention;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.tv_attention_content;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.tv_buy_vip;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    i = R.id.tv_dial_install_num;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView5 != null) {
                                        i = R.id.tv_dial_name;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView6 != null) {
                                            i = R.id.tv_dial_price;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView7 != null) {
                                                i = R.id.tv_dial_sizes;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView8 != null) {
                                                    i = R.id.tv_progress;
                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView9 != null) {
                                                        return new ActivityMenuDetailLayoutBinding((LinearLayout) view, textView, imageView, myTitleBar, progressBar, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
