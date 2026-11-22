package com.wakeup.feature.wkvideo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.progress.CircleProgressBar;
import com.wakeup.feature.wkvideo.R;

/* loaded from: classes3.dex */
public final class LayoutCoinRewardFloatBinding implements ViewBinding {
    public final View coinRewardBg;
    public final TextView coinRewardCount;
    public final ImageView coinRewardPiggy;
    public final CircleProgressBar coinRewardRing;
    private final View rootView;

    private LayoutCoinRewardFloatBinding(View view, View view2, TextView textView, ImageView imageView, CircleProgressBar circleProgressBar) {
        this.rootView = view;
        this.coinRewardBg = view2;
        this.coinRewardCount = textView;
        this.coinRewardPiggy = imageView;
        this.coinRewardRing = circleProgressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static LayoutCoinRewardFloatBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.layout_coin_reward_float, viewGroup);
        return bind(viewGroup);
    }

    public static LayoutCoinRewardFloatBinding bind(View view) {
        int i = R.id.coinRewardBg;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            i = R.id.coinRewardCount;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.coinRewardPiggy;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.coinRewardRing;
                    CircleProgressBar circleProgressBar = (CircleProgressBar) ViewBindings.findChildViewById(view, i);
                    if (circleProgressBar != null) {
                        return new LayoutCoinRewardFloatBinding(view, findChildViewById, textView, imageView, circleProgressBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
