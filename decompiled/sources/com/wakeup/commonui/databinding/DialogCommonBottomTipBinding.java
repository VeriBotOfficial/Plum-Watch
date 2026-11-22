package com.wakeup.commonui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public final class DialogCommonBottomTipBinding implements ViewBinding {
    public final TextView btnLeft;
    public final TextView btnRight;
    public final ImageView iv1;
    public final ImageView iv2;
    public final LinearLayoutCompat llIv;
    private final LinearLayout rootView;
    public final View space;
    public final TextView tvContent;
    public final TextView tvTip;
    public final TextView tvTitle;

    private DialogCommonBottomTipBinding(LinearLayout linearLayout, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2, LinearLayoutCompat linearLayoutCompat, View view, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.btnLeft = textView;
        this.btnRight = textView2;
        this.iv1 = imageView;
        this.iv2 = imageView2;
        this.llIv = linearLayoutCompat;
        this.space = view;
        this.tvContent = textView3;
        this.tvTip = textView4;
        this.tvTitle = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogCommonBottomTipBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogCommonBottomTipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_common_bottom_tip, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogCommonBottomTipBinding bind(View view) {
        View findChildViewById;
        int i = R.id.btn_left;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.btn_right;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.iv_1;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.iv_2;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.ll_iv;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.space))) != null) {
                            i = R.id.tv_content;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.tv_tip;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    i = R.id.tv_title;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView5 != null) {
                                        return new DialogCommonBottomTipBinding((LinearLayout) view, textView, textView2, imageView, imageView2, linearLayoutCompat, findChildViewById, textView3, textView4, textView5);
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
