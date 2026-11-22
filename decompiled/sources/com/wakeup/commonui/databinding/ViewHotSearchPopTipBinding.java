package com.wakeup.commonui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.R;
import com.wakeup.commonui.view.CustomTextBannerView;

/* loaded from: classes2.dex */
public final class ViewHotSearchPopTipBinding implements ViewBinding {
    public final CustomTextBannerView hotSearchTextBanner;
    private final ConstraintLayout rootView;
    public final ImageView searchGuideTop;

    private ViewHotSearchPopTipBinding(ConstraintLayout constraintLayout, CustomTextBannerView customTextBannerView, ImageView imageView) {
        this.rootView = constraintLayout;
        this.hotSearchTextBanner = customTextBannerView;
        this.searchGuideTop = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ViewHotSearchPopTipBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewHotSearchPopTipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_hot_search_pop_tip, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewHotSearchPopTipBinding bind(View view) {
        int i = R.id.hot_search_text_banner;
        CustomTextBannerView customTextBannerView = (CustomTextBannerView) ViewBindings.findChildViewById(view, i);
        if (customTextBannerView != null) {
            i = R.id.search_guide_top;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                return new ViewHotSearchPopTipBinding((ConstraintLayout) view, customTextBannerView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
