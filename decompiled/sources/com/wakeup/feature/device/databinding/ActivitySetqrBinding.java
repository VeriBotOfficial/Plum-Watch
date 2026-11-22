package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ActivitySetqrBinding implements ViewBinding {
    public final Button btnNext;
    public final ImageView ivQr;
    public final MyTitleBar mTopBar;
    public final RelativeLayout rlImage;
    private final LinearLayout rootView;
    public final TextView tv1;
    public final TextView tv3;
    public final TextView tv4;

    private ActivitySetqrBinding(LinearLayout linearLayout, Button button, ImageView imageView, MyTitleBar myTitleBar, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.btnNext = button;
        this.ivQr = imageView;
        this.mTopBar = myTitleBar;
        this.rlImage = relativeLayout;
        this.tv1 = textView;
        this.tv3 = textView2;
        this.tv4 = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySetqrBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySetqrBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_setqr, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivitySetqrBinding bind(View view) {
        int i = R.id.btn_next;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.iv_qr;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.mTopBar;
                MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                if (myTitleBar != null) {
                    i = R.id.rl_image;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = R.id.tv1;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.tv3;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.tv4;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    return new ActivitySetqrBinding((LinearLayout) view, button, imageView, myTitleBar, relativeLayout, textView, textView2, textView3);
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
