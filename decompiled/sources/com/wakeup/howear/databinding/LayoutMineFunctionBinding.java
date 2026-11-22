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
public final class LayoutMineFunctionBinding implements ViewBinding {
    public final ConstraintLayout clHealthDiary;
    public final ConstraintLayout clHealthEwa;
    public final ConstraintLayout clHealthReport;
    public final ImageView ivHealthDiary;
    public final ImageView ivHealthEwa;
    public final ImageView ivHealthReport;
    private final ConstraintLayout rootView;
    public final TextView tvHealthDiaryDesc;
    public final TextView tvHealthDiaryTitle;
    public final TextView tvHealthReport;
    public final TextView tvMineHealthEwa;

    private LayoutMineFunctionBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.clHealthDiary = constraintLayout2;
        this.clHealthEwa = constraintLayout3;
        this.clHealthReport = constraintLayout4;
        this.ivHealthDiary = imageView;
        this.ivHealthEwa = imageView2;
        this.ivHealthReport = imageView3;
        this.tvHealthDiaryDesc = textView;
        this.tvHealthDiaryTitle = textView2;
        this.tvHealthReport = textView3;
        this.tvMineHealthEwa = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static LayoutMineFunctionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutMineFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_mine_function, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutMineFunctionBinding bind(View view) {
        int i = R.id.cl_health_diary;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.cl_health_ewa;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null) {
                i = R.id.cl_health_report;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout3 != null) {
                    i = R.id.iv_health_diary;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.iv_health_ewa;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.iv_health_report;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                i = R.id.tv_health_diary_desc;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = R.id.tv_health_diary_title;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = R.id.tv_health_report;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = R.id.tv_mine_health_ewa;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                return new LayoutMineFunctionBinding((ConstraintLayout) view, constraintLayout, constraintLayout2, constraintLayout3, imageView, imageView2, imageView3, textView, textView2, textView3, textView4);
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
