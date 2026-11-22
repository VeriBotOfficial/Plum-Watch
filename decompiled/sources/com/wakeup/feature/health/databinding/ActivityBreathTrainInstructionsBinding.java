package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class ActivityBreathTrainInstructionsBinding implements ViewBinding {
    public final ImageView imageView;
    public final LinearLayoutCompat llContent;
    private final LinearLayoutCompat rootView;
    public final MyTitleBar titleBar;
    public final TextView tvIntroduce;

    private ActivityBreathTrainInstructionsBinding(LinearLayoutCompat linearLayoutCompat, ImageView imageView, LinearLayoutCompat linearLayoutCompat2, MyTitleBar myTitleBar, TextView textView) {
        this.rootView = linearLayoutCompat;
        this.imageView = imageView;
        this.llContent = linearLayoutCompat2;
        this.titleBar = myTitleBar;
        this.tvIntroduce = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ActivityBreathTrainInstructionsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityBreathTrainInstructionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_breath_train_instructions, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityBreathTrainInstructionsBinding bind(View view) {
        int i = R.id.imageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.llContent;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = R.id.titleBar;
                MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                if (myTitleBar != null) {
                    i = R.id.tvIntroduce;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new ActivityBreathTrainInstructionsBinding((LinearLayoutCompat) view, imageView, linearLayoutCompat, myTitleBar, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
