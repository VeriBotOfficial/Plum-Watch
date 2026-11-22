package com.wakeup.feature.aimusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.aimusic.R;

/* loaded from: classes2.dex */
public final class AimSheetPlayOptionsBinding implements ViewBinding {
    public final ImageView ivOptOrder;
    public final ImageView ivOptSingle;
    public final LinearLayout llTimerChips;
    public final LinearLayout optOrder;
    public final FrameLayout optOrderIconBox;
    public final LinearLayout optSingle;
    public final FrameLayout optSingleIconBox;
    private final LinearLayout rootView;
    public final View switchThumb;
    public final FrameLayout switchTimer;
    public final TextView tvLastTimer;
    public final TextView tvOptOrder;
    public final TextView tvOptSingle;

    private AimSheetPlayOptionsBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, LinearLayout linearLayout3, FrameLayout frameLayout, LinearLayout linearLayout4, FrameLayout frameLayout2, View view, FrameLayout frameLayout3, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.ivOptOrder = imageView;
        this.ivOptSingle = imageView2;
        this.llTimerChips = linearLayout2;
        this.optOrder = linearLayout3;
        this.optOrderIconBox = frameLayout;
        this.optSingle = linearLayout4;
        this.optSingleIconBox = frameLayout2;
        this.switchThumb = view;
        this.switchTimer = frameLayout3;
        this.tvLastTimer = textView;
        this.tvOptOrder = textView2;
        this.tvOptSingle = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static AimSheetPlayOptionsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AimSheetPlayOptionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.aim_sheet_play_options, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AimSheetPlayOptionsBinding bind(View view) {
        View findChildViewById;
        int i = R.id.ivOptOrder;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.ivOptSingle;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.llTimerChips;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.optOrder;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = R.id.optOrderIconBox;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            i = R.id.optSingle;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout3 != null) {
                                i = R.id.optSingleIconBox;
                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.switchThumb))) != null) {
                                    i = R.id.switchTimer;
                                    FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout3 != null) {
                                        i = R.id.tvLastTimer;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView != null) {
                                            i = R.id.tvOptOrder;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView2 != null) {
                                                i = R.id.tvOptSingle;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView3 != null) {
                                                    return new AimSheetPlayOptionsBinding((LinearLayout) view, imageView, imageView2, linearLayout, linearLayout2, frameLayout, linearLayout3, frameLayout2, findChildViewById, frameLayout3, textView, textView2, textView3);
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
