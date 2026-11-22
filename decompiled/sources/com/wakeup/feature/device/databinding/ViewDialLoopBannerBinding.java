package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.device.R;
import com.wakeup.feature.device.dial.view.DialBannerLoopViewPager;

/* loaded from: classes3.dex */
public final class ViewDialLoopBannerBinding implements ViewBinding {
    public final LinearLayout llIndicator;
    private final View rootView;
    public final DialBannerLoopViewPager vpBanner;

    private ViewDialLoopBannerBinding(View view, LinearLayout linearLayout, DialBannerLoopViewPager dialBannerLoopViewPager) {
        this.rootView = view;
        this.llIndicator = linearLayout;
        this.vpBanner = dialBannerLoopViewPager;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static ViewDialLoopBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_dial_loop_banner, viewGroup);
        return bind(viewGroup);
    }

    public static ViewDialLoopBannerBinding bind(View view) {
        int i = R.id.ll_indicator;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.vp_banner;
            DialBannerLoopViewPager dialBannerLoopViewPager = (DialBannerLoopViewPager) ViewBindings.findChildViewById(view, i);
            if (dialBannerLoopViewPager != null) {
                return new ViewDialLoopBannerBinding(view, linearLayout, dialBannerLoopViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
