package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ActivityAdseysTestBinding implements ViewBinding {
    public final CardView cardViewHomeFeedVideoAd;
    public final ConstraintLayout clAd;
    public final FrameLayout flHomeFeedVideoLogo;
    public final FrameLayout flHomeFeedVideoLogoContainer;
    public final ImageView ivClose;
    public final ImageView ivHomeFeedVideoAdSign;
    public final ImageView ivHomeFeedVideoAdSignBaidu;
    public final ImageView ivHomeFeedVideoAdSignCsj;
    public final FrameLayout layoutHomeFeedBg;
    public final ConstraintLayout layoutHomeFeedVideoAdContainer;
    public final FrameLayout layoutHomeFeedVideoAdContent;
    public final FrameLayout layoutHomeFeedVideoAdIcon;
    private final ConstraintLayout rootView;
    public final TextView tvHomeFeedVideoAdCta;
    public final TextView tvHomeFeedVideoAdDesc;
    public final TextView tvHomeFeedVideoAdDomain;
    public final TextView tvHomeFeedVideoAdFrom;
    public final TextView tvHomeFeedVideoAdTitle;
    public final TextView tvHomeFeedVideoAdWarning;

    private ActivityAdseysTestBinding(ConstraintLayout constraintLayout, CardView cardView, ConstraintLayout constraintLayout2, FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, FrameLayout frameLayout3, ConstraintLayout constraintLayout3, FrameLayout frameLayout4, FrameLayout frameLayout5, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = constraintLayout;
        this.cardViewHomeFeedVideoAd = cardView;
        this.clAd = constraintLayout2;
        this.flHomeFeedVideoLogo = frameLayout;
        this.flHomeFeedVideoLogoContainer = frameLayout2;
        this.ivClose = imageView;
        this.ivHomeFeedVideoAdSign = imageView2;
        this.ivHomeFeedVideoAdSignBaidu = imageView3;
        this.ivHomeFeedVideoAdSignCsj = imageView4;
        this.layoutHomeFeedBg = frameLayout3;
        this.layoutHomeFeedVideoAdContainer = constraintLayout3;
        this.layoutHomeFeedVideoAdContent = frameLayout4;
        this.layoutHomeFeedVideoAdIcon = frameLayout5;
        this.tvHomeFeedVideoAdCta = textView;
        this.tvHomeFeedVideoAdDesc = textView2;
        this.tvHomeFeedVideoAdDomain = textView3;
        this.tvHomeFeedVideoAdFrom = textView4;
        this.tvHomeFeedVideoAdTitle = textView5;
        this.tvHomeFeedVideoAdWarning = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityAdseysTestBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityAdseysTestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_adseys_test, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityAdseysTestBinding bind(View view) {
        int i = R.id.card_view_home_feed_video_ad;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.fl_home_feed_video_logo;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.fl_home_feed_video_logo_container;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    i = R.id.iv_close;
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
                                    i = R.id.layout_home_feed_bg;
                                    FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout3 != null) {
                                        i = R.id.layout_home_feed_video_ad_container;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout2 != null) {
                                            i = R.id.layout_home_feed_video_ad_content;
                                            FrameLayout frameLayout4 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                            if (frameLayout4 != null) {
                                                i = R.id.layout_home_feed_video_ad_icon;
                                                FrameLayout frameLayout5 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                if (frameLayout5 != null) {
                                                    i = R.id.tv_home_feed_video_ad_cta;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView != null) {
                                                        i = R.id.tv_home_feed_video_ad_desc;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView2 != null) {
                                                            i = R.id.tv_home_feed_video_ad_domain;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView3 != null) {
                                                                i = R.id.tv_home_feed_video_ad_from;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView4 != null) {
                                                                    i = R.id.tv_home_feed_video_ad_title;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView5 != null) {
                                                                        i = R.id.tv_home_feed_video_ad_warning;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView6 != null) {
                                                                            return new ActivityAdseysTestBinding(constraintLayout, cardView, constraintLayout, frameLayout, frameLayout2, imageView, imageView2, imageView3, imageView4, frameLayout3, constraintLayout2, frameLayout4, frameLayout5, textView, textView2, textView3, textView4, textView5, textView6);
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
