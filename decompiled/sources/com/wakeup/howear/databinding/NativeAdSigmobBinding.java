package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class NativeAdSigmobBinding implements ViewBinding {
    public final ImageView ivHomeFeedVideoAdIcon;
    public final ImageView ivHomeFeedVideoAdSign;
    public final ImageView ivHomeFeedVideoAdSignBaidu;
    public final ImageView ivHomeFeedVideoAdSignCsj;
    public final ConstraintLayout layoutHomeFeedVideoAdContainer;
    public final FrameLayout layoutHomeFeedVideoAdContent;
    private final FrameLayout rootView;
    public final TextView tvHomeFeedVideoAdCta;
    public final TextView tvHomeFeedVideoAdDomain;
    public final TextView tvHomeFeedVideoAdFrom;
    public final TextView tvHomeFeedVideoAdWarning;

    private NativeAdSigmobBinding(FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ConstraintLayout constraintLayout, FrameLayout frameLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = frameLayout;
        this.ivHomeFeedVideoAdIcon = imageView;
        this.ivHomeFeedVideoAdSign = imageView2;
        this.ivHomeFeedVideoAdSignBaidu = imageView3;
        this.ivHomeFeedVideoAdSignCsj = imageView4;
        this.layoutHomeFeedVideoAdContainer = constraintLayout;
        this.layoutHomeFeedVideoAdContent = frameLayout2;
        this.tvHomeFeedVideoAdCta = textView;
        this.tvHomeFeedVideoAdDomain = textView2;
        this.tvHomeFeedVideoAdFrom = textView3;
        this.tvHomeFeedVideoAdWarning = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static NativeAdSigmobBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static NativeAdSigmobBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.native_ad_sigmob, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static NativeAdSigmobBinding bind(View view) {
        int i = R.id.iv_home_feed_video_ad_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.iv_home_feed_video_ad_sign;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.iv_home_feed_video_ad_sign_baidu;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView3 != null) {
                    i = R.id.iv_home_feed_video_ad_sign_csj;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView4 != null) {
                        i = R.id.layout_home_feed_video_ad_container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.layout_home_feed_video_ad_content;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout != null) {
                                i = R.id.tv_home_feed_video_ad_cta;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = R.id.tv_home_feed_video_ad_domain;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = R.id.tv_home_feed_video_ad_from;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = R.id.tv_home_feed_video_ad_warning;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                return new NativeAdSigmobBinding((FrameLayout) view, imageView, imageView2, imageView3, imageView4, constraintLayout, frameLayout, textView, textView2, textView3, textView4);
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
