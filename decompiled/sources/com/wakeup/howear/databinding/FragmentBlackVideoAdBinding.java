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
public final class FragmentBlackVideoAdBinding implements ViewBinding {
    public final ImageView ivBlackVideoAdSign;
    public final ImageView ivBlackVideoAdSignBaidu;
    public final ImageView ivBlackVideoAdSignCsj;
    public final ConstraintLayout layoutBlackVideoAdContainer;
    public final FrameLayout layoutBlackVideoAdContent;
    public final FrameLayout layoutBlackVideoAdIcon;
    public final ConstraintLayout layoutBlackVideoAdRoot;
    private final ConstraintLayout rootView;
    public final TextView tvBlackVideoAdCta;
    public final TextView tvBlackVideoAdDomain;
    public final TextView tvBlackVideoAdFrom;
    public final TextView tvBlackVideoAdWarning;

    private FragmentBlackVideoAdBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout2, FrameLayout frameLayout, FrameLayout frameLayout2, ConstraintLayout constraintLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.ivBlackVideoAdSign = imageView;
        this.ivBlackVideoAdSignBaidu = imageView2;
        this.ivBlackVideoAdSignCsj = imageView3;
        this.layoutBlackVideoAdContainer = constraintLayout2;
        this.layoutBlackVideoAdContent = frameLayout;
        this.layoutBlackVideoAdIcon = frameLayout2;
        this.layoutBlackVideoAdRoot = constraintLayout3;
        this.tvBlackVideoAdCta = textView;
        this.tvBlackVideoAdDomain = textView2;
        this.tvBlackVideoAdFrom = textView3;
        this.tvBlackVideoAdWarning = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBlackVideoAdBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBlackVideoAdBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_black_video_ad, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentBlackVideoAdBinding bind(View view) {
        int i = R.id.iv_black_video_ad_sign;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.iv_black_video_ad_sign_baidu;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.iv_black_video_ad_sign_csj;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView3 != null) {
                    i = R.id.layout_black_video_ad_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R.id.layout_black_video_ad_content;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            i = R.id.layout_black_video_ad_icon;
                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout2 != null) {
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                i = R.id.tv_black_video_ad_cta;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = R.id.tv_black_video_ad_domain;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = R.id.tv_black_video_ad_from;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = R.id.tv_black_video_ad_warning;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                return new FragmentBlackVideoAdBinding(constraintLayout2, imageView, imageView2, imageView3, constraintLayout, frameLayout, frameLayout2, constraintLayout2, textView, textView2, textView3, textView4);
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
