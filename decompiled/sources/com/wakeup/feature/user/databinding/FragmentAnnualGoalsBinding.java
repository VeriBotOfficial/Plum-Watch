package com.wakeup.feature.user.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.user.R;

/* loaded from: classes3.dex */
public final class FragmentAnnualGoalsBinding implements ViewBinding {
    public final EditText annual1Edt;
    public final LinearLayoutCompat annual1Layout;
    public final EditText annual2Edt;
    public final LinearLayoutCompat annual2Layout;
    public final TextView annualTotalTv;
    public final AppCompatTextView annualYearTv;
    public final AppCompatTextView goalAchievementDesc;
    public final AppCompatTextView goalToLowTv;
    private final LinearLayoutCompat rootView;
    public final TextView tvAnnual1Desc;
    public final TextView tvAnnual1Unit;
    public final TextView tvAnnual2Desc;
    public final TextView tvAnnual2Unit;
    public final TextView tvSaveAnnual;

    private FragmentAnnualGoalsBinding(LinearLayoutCompat linearLayoutCompat, EditText editText, LinearLayoutCompat linearLayoutCompat2, EditText editText2, LinearLayoutCompat linearLayoutCompat3, TextView textView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = linearLayoutCompat;
        this.annual1Edt = editText;
        this.annual1Layout = linearLayoutCompat2;
        this.annual2Edt = editText2;
        this.annual2Layout = linearLayoutCompat3;
        this.annualTotalTv = textView;
        this.annualYearTv = appCompatTextView;
        this.goalAchievementDesc = appCompatTextView2;
        this.goalToLowTv = appCompatTextView3;
        this.tvAnnual1Desc = textView2;
        this.tvAnnual1Unit = textView3;
        this.tvAnnual2Desc = textView4;
        this.tvAnnual2Unit = textView5;
        this.tvSaveAnnual = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static FragmentAnnualGoalsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAnnualGoalsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_annual_goals, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentAnnualGoalsBinding bind(View view) {
        int i = R.id.annual1_edt;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
        if (editText != null) {
            i = R.id.annual1_layout;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = R.id.annual2_edt;
                EditText editText2 = (EditText) ViewBindings.findChildViewById(view, i);
                if (editText2 != null) {
                    i = R.id.annual2_layout;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat2 != null) {
                        i = R.id.annual_total_tv;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.annual_year_tv;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView != null) {
                                i = R.id.goal_achievement_desc;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView2 != null) {
                                    i = R.id.goal_to_low_tv;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView3 != null) {
                                        i = R.id.tv_annual1_desc;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            i = R.id.tv_annual1_unit;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null) {
                                                i = R.id.tv_annual2_desc;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView4 != null) {
                                                    i = R.id.tv_annual2_unit;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView5 != null) {
                                                        i = R.id.tv_save_annual;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView6 != null) {
                                                            return new FragmentAnnualGoalsBinding((LinearLayoutCompat) view, editText, linearLayoutCompat, editText2, linearLayoutCompat2, textView, appCompatTextView, appCompatTextView2, appCompatTextView3, textView2, textView3, textView4, textView5, textView6);
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
