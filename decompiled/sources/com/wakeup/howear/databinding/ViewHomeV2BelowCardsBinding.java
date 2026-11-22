package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;
import com.wakeup.howear.view.home.device.view.HomeV2DietArcView;

/* loaded from: classes3.dex */
public final class ViewHomeV2BelowCardsBinding implements ViewBinding {
    public final ConstraintLayout cardDiet;
    public final LinearLayout cardFunctionBoard;
    public final LinearLayout cardFunctionEmpty;
    public final LinearLayout cardHealthBoard;
    public final ConstraintLayout cardSleep;
    public final FrameLayout flCombinedFunctionItems;
    public final FrameLayout flDietArc;
    public final FrameLayout flFunctionItems;
    public final HorizontalScrollView hsvHealthMetrics;
    public final ImageView ivBoardFunction;
    public final ImageView ivBoardHealth;
    public final ImageView ivDietFlame;
    public final ImageView ivSleepDelta;
    public final ImageView ivSleepMoon;
    public final LinearLayout llBoardSwitch;
    public final LinearLayout llCombinedFunctionEmpty;
    public final LinearLayout llHealthMetrics;
    public final LinearLayout llSleepDelta;
    public final LinearLayout llSleepValue;
    private final LinearLayout rootView;
    public final TextView tvBoardTitle;
    public final TextView tvDietGoal;
    public final TextView tvDietIntakeLabel;
    public final TextView tvDietRemain;
    public final TextView tvDietTitle;
    public final TextView tvFunctionMore;
    public final TextView tvHealthMore;
    public final TextView tvHealthSync;
    public final TextView tvSleepDelta;
    public final TextView tvSleepHour;
    public final TextView tvSleepHourUnit;
    public final LinearLayout tvSleepInput;
    public final TextView tvSleepMinute;
    public final TextView tvSleepMinuteUnit;
    public final TextView tvSleepTitle;
    public final HomeV2DietArcView vDietArc;

    private ViewHomeV2BelowCardsBinding(LinearLayout linearLayout, ConstraintLayout constraintLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, ConstraintLayout constraintLayout2, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, HorizontalScrollView horizontalScrollView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, LinearLayout linearLayout10, TextView textView12, TextView textView13, TextView textView14, HomeV2DietArcView homeV2DietArcView) {
        this.rootView = linearLayout;
        this.cardDiet = constraintLayout;
        this.cardFunctionBoard = linearLayout2;
        this.cardFunctionEmpty = linearLayout3;
        this.cardHealthBoard = linearLayout4;
        this.cardSleep = constraintLayout2;
        this.flCombinedFunctionItems = frameLayout;
        this.flDietArc = frameLayout2;
        this.flFunctionItems = frameLayout3;
        this.hsvHealthMetrics = horizontalScrollView;
        this.ivBoardFunction = imageView;
        this.ivBoardHealth = imageView2;
        this.ivDietFlame = imageView3;
        this.ivSleepDelta = imageView4;
        this.ivSleepMoon = imageView5;
        this.llBoardSwitch = linearLayout5;
        this.llCombinedFunctionEmpty = linearLayout6;
        this.llHealthMetrics = linearLayout7;
        this.llSleepDelta = linearLayout8;
        this.llSleepValue = linearLayout9;
        this.tvBoardTitle = textView;
        this.tvDietGoal = textView2;
        this.tvDietIntakeLabel = textView3;
        this.tvDietRemain = textView4;
        this.tvDietTitle = textView5;
        this.tvFunctionMore = textView6;
        this.tvHealthMore = textView7;
        this.tvHealthSync = textView8;
        this.tvSleepDelta = textView9;
        this.tvSleepHour = textView10;
        this.tvSleepHourUnit = textView11;
        this.tvSleepInput = linearLayout10;
        this.tvSleepMinute = textView12;
        this.tvSleepMinuteUnit = textView13;
        this.tvSleepTitle = textView14;
        this.vDietArc = homeV2DietArcView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ViewHomeV2BelowCardsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewHomeV2BelowCardsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_home_v2_below_cards, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewHomeV2BelowCardsBinding bind(View view) {
        int i = R.id.card_diet;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.card_function_board;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.card_function_empty;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.card_health_board;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout3 != null) {
                        i = R.id.card_sleep;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout2 != null) {
                            i = R.id.fl_combined_function_items;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout != null) {
                                i = R.id.fl_diet_arc;
                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout2 != null) {
                                    i = R.id.fl_function_items;
                                    FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout3 != null) {
                                        i = R.id.hsv_health_metrics;
                                        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i);
                                        if (horizontalScrollView != null) {
                                            i = R.id.iv_board_function;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView != null) {
                                                i = R.id.iv_board_health;
                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView2 != null) {
                                                    i = R.id.iv_diet_flame;
                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView3 != null) {
                                                        i = R.id.iv_sleep_delta;
                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                        if (imageView4 != null) {
                                                            i = R.id.iv_sleep_moon;
                                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                            if (imageView5 != null) {
                                                                i = R.id.ll_board_switch;
                                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                if (linearLayout4 != null) {
                                                                    i = R.id.ll_combined_function_empty;
                                                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (linearLayout5 != null) {
                                                                        i = R.id.ll_health_metrics;
                                                                        LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                        if (linearLayout6 != null) {
                                                                            i = R.id.ll_sleep_delta;
                                                                            LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                            if (linearLayout7 != null) {
                                                                                i = R.id.ll_sleep_value;
                                                                                LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                if (linearLayout8 != null) {
                                                                                    i = R.id.tv_board_title;
                                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView != null) {
                                                                                        i = R.id.tv_diet_goal;
                                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textView2 != null) {
                                                                                            i = R.id.tv_diet_intake_label;
                                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (textView3 != null) {
                                                                                                i = R.id.tv_diet_remain;
                                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (textView4 != null) {
                                                                                                    i = R.id.tv_diet_title;
                                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (textView5 != null) {
                                                                                                        i = R.id.tv_function_more;
                                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (textView6 != null) {
                                                                                                            i = R.id.tv_health_more;
                                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (textView7 != null) {
                                                                                                                i = R.id.tv_health_sync;
                                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (textView8 != null) {
                                                                                                                    i = R.id.tv_sleep_delta;
                                                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (textView9 != null) {
                                                                                                                        i = R.id.tv_sleep_hour;
                                                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (textView10 != null) {
                                                                                                                            i = R.id.tv_sleep_hour_unit;
                                                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (textView11 != null) {
                                                                                                                                i = R.id.tv_sleep_input;
                                                                                                                                LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                if (linearLayout9 != null) {
                                                                                                                                    i = R.id.tv_sleep_minute;
                                                                                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                    if (textView12 != null) {
                                                                                                                                        i = R.id.tv_sleep_minute_unit;
                                                                                                                                        TextView textView13 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                        if (textView13 != null) {
                                                                                                                                            i = R.id.tv_sleep_title;
                                                                                                                                            TextView textView14 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                            if (textView14 != null) {
                                                                                                                                                i = R.id.v_diet_arc;
                                                                                                                                                HomeV2DietArcView homeV2DietArcView = (HomeV2DietArcView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                if (homeV2DietArcView != null) {
                                                                                                                                                    return new ViewHomeV2BelowCardsBinding((LinearLayout) view, constraintLayout, linearLayout, linearLayout2, linearLayout3, constraintLayout2, frameLayout, frameLayout2, frameLayout3, horizontalScrollView, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, linearLayout9, textView12, textView13, textView14, homeV2DietArcView);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
