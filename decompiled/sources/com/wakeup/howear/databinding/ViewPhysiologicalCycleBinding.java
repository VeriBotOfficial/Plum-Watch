package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ViewPhysiologicalCycleBinding implements ViewBinding {
    public final AppCompatImageView ivAdd;
    public final LinearLayoutCompat ivData;
    public final AppCompatImageView ivDel;
    public final LinearLayoutCompat ivEmpty;
    public final AppCompatImageView ivPhysiologicalTag;
    public final LinearLayoutCompat llPhysiologicalCycle;
    private final FrameLayout rootView;
    public final TextView tvPhysiologicalCycleTime;
    public final TextView tvPhysiologicalText1;
    public final TextView tvPhysiologicalText2;
    public final TextView tvPhysiologicalValue1;
    public final TextView tvPhysiologicalValue2;

    private ViewPhysiologicalCycleBinding(FrameLayout frameLayout, AppCompatImageView appCompatImageView, LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView2, LinearLayoutCompat linearLayoutCompat2, AppCompatImageView appCompatImageView3, LinearLayoutCompat linearLayoutCompat3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = frameLayout;
        this.ivAdd = appCompatImageView;
        this.ivData = linearLayoutCompat;
        this.ivDel = appCompatImageView2;
        this.ivEmpty = linearLayoutCompat2;
        this.ivPhysiologicalTag = appCompatImageView3;
        this.llPhysiologicalCycle = linearLayoutCompat3;
        this.tvPhysiologicalCycleTime = textView;
        this.tvPhysiologicalText1 = textView2;
        this.tvPhysiologicalText2 = textView3;
        this.tvPhysiologicalValue1 = textView4;
        this.tvPhysiologicalValue2 = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ViewPhysiologicalCycleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewPhysiologicalCycleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_physiological_cycle, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewPhysiologicalCycleBinding bind(View view) {
        int i = R.id.iv_add;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.iv_data;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = R.id.iv_del;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView2 != null) {
                    i = R.id.iv_empty;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat2 != null) {
                        i = R.id.iv_physiological_tag;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView3 != null) {
                            i = R.id.ll_physiological_cycle;
                            LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat3 != null) {
                                i = R.id.tv_physiological_cycle_time;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = R.id.tv_physiological_text_1;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = R.id.tv_physiological_text_2;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = R.id.tv_physiological_value_1;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                i = R.id.tv_physiological_value_2;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView5 != null) {
                                                    return new ViewPhysiologicalCycleBinding((FrameLayout) view, appCompatImageView, linearLayoutCompat, appCompatImageView2, linearLayoutCompat2, appCompatImageView3, linearLayoutCompat3, textView, textView2, textView3, textView4, textView5);
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
