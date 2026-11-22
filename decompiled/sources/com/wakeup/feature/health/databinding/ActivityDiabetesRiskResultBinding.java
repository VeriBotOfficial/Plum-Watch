package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.health.R;
import com.wakeup.feature.health.bloodGlucose.diabetes.DiabetesMaxHeightScrollView;

/* loaded from: classes3.dex */
public final class ActivityDiabetesRiskResultBinding implements ViewBinding {
    public final TextView btnAskAi;
    public final TextView btnUnlockOverlay;
    public final TextView chipDiet;
    public final TextView chipExercise;
    public final TextView chipGlucose;
    public final LinearLayout layoutBottomBar;
    public final LinearLayout layoutChips;
    public final LinearLayout layoutThinking;
    public final FrameLayout layoutUnlockOverlay;
    public final ProgressBar progressStream;
    private final FrameLayout rootView;
    public final NestedScrollView scrollResult;
    public final DiabetesMaxHeightScrollView scrollThinking;
    public final MyTitleBar titleBar;
    public final TextView tvFreeTag;
    public final TextView tvHealthAdviceTitle;
    public final TextView tvResult;
    public final TextView tvThinking;

    private ActivityDiabetesRiskResultBinding(FrameLayout frameLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, FrameLayout frameLayout2, ProgressBar progressBar, NestedScrollView nestedScrollView, DiabetesMaxHeightScrollView diabetesMaxHeightScrollView, MyTitleBar myTitleBar, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.rootView = frameLayout;
        this.btnAskAi = textView;
        this.btnUnlockOverlay = textView2;
        this.chipDiet = textView3;
        this.chipExercise = textView4;
        this.chipGlucose = textView5;
        this.layoutBottomBar = linearLayout;
        this.layoutChips = linearLayout2;
        this.layoutThinking = linearLayout3;
        this.layoutUnlockOverlay = frameLayout2;
        this.progressStream = progressBar;
        this.scrollResult = nestedScrollView;
        this.scrollThinking = diabetesMaxHeightScrollView;
        this.titleBar = myTitleBar;
        this.tvFreeTag = textView6;
        this.tvHealthAdviceTitle = textView7;
        this.tvResult = textView8;
        this.tvThinking = textView9;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDiabetesRiskResultBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDiabetesRiskResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_diabetes_risk_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityDiabetesRiskResultBinding bind(View view) {
        int i = R.id.btn_ask_ai;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.btn_unlock_overlay;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.chip_diet;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = R.id.chip_exercise;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        i = R.id.chip_glucose;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView5 != null) {
                            i = R.id.layout_bottom_bar;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = R.id.layout_chips;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    i = R.id.layout_thinking;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout3 != null) {
                                        i = R.id.layout_unlock_overlay;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                        if (frameLayout != null) {
                                            i = R.id.progress_stream;
                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                                            if (progressBar != null) {
                                                i = R.id.scroll_result;
                                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                                if (nestedScrollView != null) {
                                                    i = R.id.scroll_thinking;
                                                    DiabetesMaxHeightScrollView diabetesMaxHeightScrollView = (DiabetesMaxHeightScrollView) ViewBindings.findChildViewById(view, i);
                                                    if (diabetesMaxHeightScrollView != null) {
                                                        i = R.id.title_bar;
                                                        MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                                                        if (myTitleBar != null) {
                                                            i = R.id.tv_free_tag;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView6 != null) {
                                                                i = R.id.tv_health_advice_title;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView7 != null) {
                                                                    i = R.id.tv_result;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView8 != null) {
                                                                        i = R.id.tv_thinking;
                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView9 != null) {
                                                                            return new ActivityDiabetesRiskResultBinding((FrameLayout) view, textView, textView2, textView3, textView4, textView5, linearLayout, linearLayout2, linearLayout3, frameLayout, progressBar, nestedScrollView, diabetesMaxHeightScrollView, myTitleBar, textView6, textView7, textView8, textView9);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
