package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class LayoutAiVipV2Binding implements ViewBinding {
    public final ImageView ivAiArrow;
    public final ImageView ivIconVip;
    public final LinearLayoutCompat llFragmentVip;
    private final ConstraintLayout rootView;
    public final TextView tvVipDesc;
    public final TextView tvVipTitle;

    private LayoutAiVipV2Binding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, LinearLayoutCompat linearLayoutCompat, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.ivAiArrow = imageView;
        this.ivIconVip = imageView2;
        this.llFragmentVip = linearLayoutCompat;
        this.tvVipDesc = textView;
        this.tvVipTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static LayoutAiVipV2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutAiVipV2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_ai_vip_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutAiVipV2Binding bind(View view) {
        int i = R.id.iv_ai_arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.iv_icon_vip;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.ll_fragment_vip;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = R.id.tv_vip_desc;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.tv_vip_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            return new LayoutAiVipV2Binding((ConstraintLayout) view, imageView, imageView2, linearLayoutCompat, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
