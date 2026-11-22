package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aigestudio.wheelpicker.WheelPicker;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class ActivityBreathTrainConfigBinding implements ViewBinding {
    public final ImageView btnBack;
    public final ImageView btnMark;
    public final Button btnStart;
    public final ImageView imageView;
    public final ImageView ivCover;
    public final ImageFilterView ivCover2;
    public final ImageView ivSelect;
    private final ConstraintLayout rootView;
    public final TextView tvMusicName;
    public final TextView tvOpenVip;
    public final TextView tvTip;
    public final TextView tvTitle;
    public final TextView tvVipTip;
    public final WheelPicker wheelPicker;

    private ActivityBreathTrainConfigBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, Button button, ImageView imageView3, ImageView imageView4, ImageFilterView imageFilterView, ImageView imageView5, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, WheelPicker wheelPicker) {
        this.rootView = constraintLayout;
        this.btnBack = imageView;
        this.btnMark = imageView2;
        this.btnStart = button;
        this.imageView = imageView3;
        this.ivCover = imageView4;
        this.ivCover2 = imageFilterView;
        this.ivSelect = imageView5;
        this.tvMusicName = textView;
        this.tvOpenVip = textView2;
        this.tvTip = textView3;
        this.tvTitle = textView4;
        this.tvVipTip = textView5;
        this.wheelPicker = wheelPicker;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityBreathTrainConfigBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityBreathTrainConfigBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_breath_train_config, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityBreathTrainConfigBinding bind(View view) {
        int i = R.id.btnBack;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.btnMark;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.btnStart;
                Button button = (Button) ViewBindings.findChildViewById(view, i);
                if (button != null) {
                    i = R.id.imageView;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        i = R.id.ivCover;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView4 != null) {
                            i = R.id.ivCover2;
                            ImageFilterView imageFilterView = (ImageFilterView) ViewBindings.findChildViewById(view, i);
                            if (imageFilterView != null) {
                                i = R.id.ivSelect;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView5 != null) {
                                    i = R.id.tvMusicName;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = R.id.tvOpenVip;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            i = R.id.tvTip;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null) {
                                                i = R.id.tvTitle;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView4 != null) {
                                                    i = R.id.tvVipTip;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView5 != null) {
                                                        i = R.id.wheelPicker;
                                                        WheelPicker wheelPicker = (WheelPicker) ViewBindings.findChildViewById(view, i);
                                                        if (wheelPicker != null) {
                                                            return new ActivityBreathTrainConfigBinding((ConstraintLayout) view, imageView, imageView2, button, imageView3, imageView4, imageFilterView, imageView5, textView, textView2, textView3, textView4, textView5, wheelPicker);
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
