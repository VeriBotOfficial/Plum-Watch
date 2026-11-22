package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ViewDeviceFunctionalComponentBinding implements ViewBinding {
    public final ImageView ivAction;
    public final ImageView ivComponentIcon;
    private final ConstraintLayout rootView;
    public final TextView tvComponentName;
    public final TextView tvComponentSubtitileName;
    public final TextView tvComponentValue;
    public final TextView tvOverseasComponentName;
    public final TextView tvSecondComponentValue;
    public final TextView tvSecondValueUnit;
    public final ConstraintLayout tvSubtitleLayout;
    public final TextView tvValueUnit;

    private ViewDeviceFunctionalComponentBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, ConstraintLayout constraintLayout2, TextView textView7) {
        this.rootView = constraintLayout;
        this.ivAction = imageView;
        this.ivComponentIcon = imageView2;
        this.tvComponentName = textView;
        this.tvComponentSubtitileName = textView2;
        this.tvComponentValue = textView3;
        this.tvOverseasComponentName = textView4;
        this.tvSecondComponentValue = textView5;
        this.tvSecondValueUnit = textView6;
        this.tvSubtitleLayout = constraintLayout2;
        this.tvValueUnit = textView7;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ViewDeviceFunctionalComponentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewDeviceFunctionalComponentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_device_functional_component, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewDeviceFunctionalComponentBinding bind(View view) {
        int i = R.id.iv_action;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.iv_component_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.tv_component_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_component_subtitile_name;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.tv_component_value;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.tv_overseas_component_name;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                i = R.id.tv_second_component_value;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    i = R.id.tv_second_value_unit;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView6 != null) {
                                        i = R.id.tv_subtitle_layout;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout != null) {
                                            i = R.id.tv_value_unit;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView7 != null) {
                                                return new ViewDeviceFunctionalComponentBinding((ConstraintLayout) view, imageView, imageView2, textView, textView2, textView3, textView4, textView5, textView6, constraintLayout, textView7);
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
