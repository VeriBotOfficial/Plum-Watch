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
public final class ActivityHealthwarningServiceOpenBinding implements ViewBinding {
    public final ImageView ivAnnotation;
    public final ImageView ivAnnotation2;
    public final LinearLayout llPaid;
    public final LinearLayout llTrial;
    public final MyTitleBar mTopBar;
    private final LinearLayout rootView;
    public final TextView tv1;
    public final TextView tv2;
    public final TextView tv3;
    public final TextView tv4;
    public final TextView tvAddGuardianCount;
    public final TextView tvFamilyCount;
    public final TextView tvGuardianCount;
    public final TextView tvLastGuardianCount;
    public final TextView tvLastTrialCount;
    public final TextView tvTotal;
    public final TextView tvTrialCount;

    private ActivityHealthwarningServiceOpenBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, LinearLayout linearLayout3, MyTitleBar myTitleBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11) {
        this.rootView = linearLayout;
        this.ivAnnotation = imageView;
        this.ivAnnotation2 = imageView2;
        this.llPaid = linearLayout2;
        this.llTrial = linearLayout3;
        this.mTopBar = myTitleBar;
        this.tv1 = textView;
        this.tv2 = textView2;
        this.tv3 = textView3;
        this.tv4 = textView4;
        this.tvAddGuardianCount = textView5;
        this.tvFamilyCount = textView6;
        this.tvGuardianCount = textView7;
        this.tvLastGuardianCount = textView8;
        this.tvLastTrialCount = textView9;
        this.tvTotal = textView10;
        this.tvTrialCount = textView11;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityHealthwarningServiceOpenBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityHealthwarningServiceOpenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_healthwarning_service_open, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityHealthwarningServiceOpenBinding bind(View view) {
        int i = R.id.iv_annotation;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.iv_annotation2;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.ll_paid;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.ll_trial;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = R.id.mTopBar;
                        MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                        if (myTitleBar != null) {
                            i = R.id.tv1;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = R.id.tv2;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = R.id.tv3;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = R.id.tv4;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            i = R.id.tv_addGuardianCount;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView5 != null) {
                                                i = R.id.tv_familyCount;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView6 != null) {
                                                    i = R.id.tv_guardianCount;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView7 != null) {
                                                        i = R.id.tv_lastGuardianCount;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView8 != null) {
                                                            i = R.id.tv_lastTrialCount;
                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView9 != null) {
                                                                i = R.id.tv_total;
                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView10 != null) {
                                                                    i = R.id.tv_trialCount;
                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView11 != null) {
                                                                        return new ActivityHealthwarningServiceOpenBinding((LinearLayout) view, imageView, imageView2, linearLayout, linearLayout2, myTitleBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
