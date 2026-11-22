package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ActivityUnitBinding implements ViewBinding {
    public final ImageView ivItem1;
    public final ImageView ivItem2;
    public final ImageView ivItem3;
    public final ImageView ivItem4;
    public final ImageView ivItem5;
    public final LinearLayout llEnergyUnit;
    public final LinearLayout llItem1;
    public final LinearLayout llItem2;
    public final LinearLayout llItem5;
    public final LinearLayout llItem6;
    public final LinearLayout llItem7;
    public final LinearLayout llMotorUnit;
    private final LinearLayout rootView;
    public final MyTitleBar topBar;
    public final TextView tv6;

    private ActivityUnitBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, MyTitleBar myTitleBar, TextView textView) {
        this.rootView = linearLayout;
        this.ivItem1 = imageView;
        this.ivItem2 = imageView2;
        this.ivItem3 = imageView3;
        this.ivItem4 = imageView4;
        this.ivItem5 = imageView5;
        this.llEnergyUnit = linearLayout2;
        this.llItem1 = linearLayout3;
        this.llItem2 = linearLayout4;
        this.llItem5 = linearLayout5;
        this.llItem6 = linearLayout6;
        this.llItem7 = linearLayout7;
        this.llMotorUnit = linearLayout8;
        this.topBar = myTitleBar;
        this.tv6 = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityUnitBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityUnitBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_unit, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityUnitBinding bind(View view) {
        int i = R.id.ivItem1;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.ivItem2;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.ivItem3;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView3 != null) {
                    i = R.id.ivItem4;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView4 != null) {
                        i = R.id.ivItem5;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView5 != null) {
                            i = R.id.ll_energy_unit;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = R.id.llItem1;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    i = R.id.llItem2;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout3 != null) {
                                        i = R.id.llItem5;
                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout4 != null) {
                                            i = R.id.llItem6;
                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout5 != null) {
                                                i = R.id.llItem7;
                                                LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout6 != null) {
                                                    i = R.id.ll_motor_unit;
                                                    LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout7 != null) {
                                                        i = R.id.topBar;
                                                        MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                                                        if (myTitleBar != null) {
                                                            i = R.id.tv6;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView != null) {
                                                                return new ActivityUnitBinding((LinearLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, myTitleBar, textView);
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
