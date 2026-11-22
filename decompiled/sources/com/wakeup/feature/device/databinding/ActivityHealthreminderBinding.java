package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ActivityHealthreminderBinding implements ViewBinding {
    public final RelativeLayout banner;
    public final LinearLayout llBook;
    public final LinearLayout llBookRepeat;
    public final LinearLayout llDrink;
    public final LinearLayout llEat;
    public final LinearLayout llEatRepeat;
    public final LinearLayout llEndDrink;
    public final LinearLayout llEndSit;
    public final LinearLayout llHr;
    public final LinearLayout llIntervalBook;
    public final LinearLayout llIntervalDrink;
    public final LinearLayout llIntervalEat;
    public final LinearLayout llIntervalHr;
    public final LinearLayout llIntervalLook;
    public final LinearLayout llIntervalSit;
    public final LinearLayout llIntervalSport;
    public final LinearLayout llIntervalWalk;
    public final LinearLayout llLook;
    public final LinearLayout llSport;
    public final LinearLayout llSportRepeat;
    public final LinearLayout llStartDrink;
    public final LinearLayout llStartSit;
    public final LinearLayout llWalk;
    public final LinearLayout llWalkRepeat;
    public final Switch mSwitchBook;
    public final Switch mSwitchDrink;
    public final Switch mSwitchEat;
    public final Switch mSwitchHr;
    public final Switch mSwitchLook;
    public final Switch mSwitchSit;
    public final Switch mSwitchSport;
    public final Switch mSwitchWalk;
    public final MyTitleBar mTopBar;
    private final RelativeLayout rootView;
    public final TextView tv1;
    public final TextView tv10;
    public final TextView tv11;
    public final TextView tv12;
    public final TextView tv13;
    public final TextView tv14;
    public final TextView tv15;
    public final TextView tv16;
    public final TextView tv17;
    public final TextView tv18;
    public final TextView tv19;
    public final TextView tv2;
    public final TextView tv20;
    public final TextView tv21;
    public final TextView tv22;
    public final TextView tv23;
    public final TextView tv24;
    public final TextView tv3;
    public final TextView tv4;
    public final TextView tv5;
    public final TextView tv6;
    public final TextView tv7;
    public final TextView tv8;
    public final TextView tv9;
    public final TextView tvEndDrink;
    public final TextView tvEndSit;
    public final TextView tvIntervalBook;
    public final TextView tvIntervalDrink;
    public final TextView tvIntervalEat;
    public final TextView tvIntervalHr;
    public final TextView tvIntervalLook;
    public final TextView tvIntervalSit;
    public final TextView tvIntervalSport;
    public final TextView tvIntervalWalk;
    public final TextView tvRepeatBook;
    public final TextView tvRepeatEat;
    public final TextView tvRepeatSport;
    public final TextView tvRepeatWalk;
    public final TextView tvStartDrink;
    public final TextView tvStartSit;

    private ActivityHealthreminderBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, LinearLayout linearLayout11, LinearLayout linearLayout12, LinearLayout linearLayout13, LinearLayout linearLayout14, LinearLayout linearLayout15, LinearLayout linearLayout16, LinearLayout linearLayout17, LinearLayout linearLayout18, LinearLayout linearLayout19, LinearLayout linearLayout20, LinearLayout linearLayout21, LinearLayout linearLayout22, LinearLayout linearLayout23, Switch r26, Switch r27, Switch r28, Switch r29, Switch r30, Switch r31, Switch r32, Switch r33, MyTitleBar myTitleBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24, TextView textView25, TextView textView26, TextView textView27, TextView textView28, TextView textView29, TextView textView30, TextView textView31, TextView textView32, TextView textView33, TextView textView34, TextView textView35, TextView textView36, TextView textView37, TextView textView38, TextView textView39, TextView textView40) {
        this.rootView = relativeLayout;
        this.banner = relativeLayout2;
        this.llBook = linearLayout;
        this.llBookRepeat = linearLayout2;
        this.llDrink = linearLayout3;
        this.llEat = linearLayout4;
        this.llEatRepeat = linearLayout5;
        this.llEndDrink = linearLayout6;
        this.llEndSit = linearLayout7;
        this.llHr = linearLayout8;
        this.llIntervalBook = linearLayout9;
        this.llIntervalDrink = linearLayout10;
        this.llIntervalEat = linearLayout11;
        this.llIntervalHr = linearLayout12;
        this.llIntervalLook = linearLayout13;
        this.llIntervalSit = linearLayout14;
        this.llIntervalSport = linearLayout15;
        this.llIntervalWalk = linearLayout16;
        this.llLook = linearLayout17;
        this.llSport = linearLayout18;
        this.llSportRepeat = linearLayout19;
        this.llStartDrink = linearLayout20;
        this.llStartSit = linearLayout21;
        this.llWalk = linearLayout22;
        this.llWalkRepeat = linearLayout23;
        this.mSwitchBook = r26;
        this.mSwitchDrink = r27;
        this.mSwitchEat = r28;
        this.mSwitchHr = r29;
        this.mSwitchLook = r30;
        this.mSwitchSit = r31;
        this.mSwitchSport = r32;
        this.mSwitchWalk = r33;
        this.mTopBar = myTitleBar;
        this.tv1 = textView;
        this.tv10 = textView2;
        this.tv11 = textView3;
        this.tv12 = textView4;
        this.tv13 = textView5;
        this.tv14 = textView6;
        this.tv15 = textView7;
        this.tv16 = textView8;
        this.tv17 = textView9;
        this.tv18 = textView10;
        this.tv19 = textView11;
        this.tv2 = textView12;
        this.tv20 = textView13;
        this.tv21 = textView14;
        this.tv22 = textView15;
        this.tv23 = textView16;
        this.tv24 = textView17;
        this.tv3 = textView18;
        this.tv4 = textView19;
        this.tv5 = textView20;
        this.tv6 = textView21;
        this.tv7 = textView22;
        this.tv8 = textView23;
        this.tv9 = textView24;
        this.tvEndDrink = textView25;
        this.tvEndSit = textView26;
        this.tvIntervalBook = textView27;
        this.tvIntervalDrink = textView28;
        this.tvIntervalEat = textView29;
        this.tvIntervalHr = textView30;
        this.tvIntervalLook = textView31;
        this.tvIntervalSit = textView32;
        this.tvIntervalSport = textView33;
        this.tvIntervalWalk = textView34;
        this.tvRepeatBook = textView35;
        this.tvRepeatEat = textView36;
        this.tvRepeatSport = textView37;
        this.tvRepeatWalk = textView38;
        this.tvStartDrink = textView39;
        this.tvStartSit = textView40;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityHealthreminderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityHealthreminderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_healthreminder, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityHealthreminderBinding bind(View view) {
        int i = R.id.banner;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.ll_book;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.ll_bookRepeat;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.ll_drink;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout3 != null) {
                        i = R.id.ll_eat;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout4 != null) {
                            i = R.id.ll_eatRepeat;
                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout5 != null) {
                                i = R.id.ll_endDrink;
                                LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout6 != null) {
                                    i = R.id.ll_endSit;
                                    LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout7 != null) {
                                        i = R.id.ll_hr;
                                        LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout8 != null) {
                                            i = R.id.ll_intervalBook;
                                            LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout9 != null) {
                                                i = R.id.ll_intervalDrink;
                                                LinearLayout linearLayout10 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout10 != null) {
                                                    i = R.id.ll_intervalEat;
                                                    LinearLayout linearLayout11 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout11 != null) {
                                                        i = R.id.ll_intervalHr;
                                                        LinearLayout linearLayout12 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayout12 != null) {
                                                            i = R.id.ll_intervalLook;
                                                            LinearLayout linearLayout13 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                            if (linearLayout13 != null) {
                                                                i = R.id.ll_intervalSit;
                                                                LinearLayout linearLayout14 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                if (linearLayout14 != null) {
                                                                    i = R.id.ll_intervalSport;
                                                                    LinearLayout linearLayout15 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (linearLayout15 != null) {
                                                                        i = R.id.ll_intervalWalk;
                                                                        LinearLayout linearLayout16 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                        if (linearLayout16 != null) {
                                                                            i = R.id.ll_look;
                                                                            LinearLayout linearLayout17 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                            if (linearLayout17 != null) {
                                                                                i = R.id.ll_sport;
                                                                                LinearLayout linearLayout18 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                if (linearLayout18 != null) {
                                                                                    i = R.id.ll_sportRepeat;
                                                                                    LinearLayout linearLayout19 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                    if (linearLayout19 != null) {
                                                                                        i = R.id.ll_startDrink;
                                                                                        LinearLayout linearLayout20 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                        if (linearLayout20 != null) {
                                                                                            i = R.id.ll_startSit;
                                                                                            LinearLayout linearLayout21 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                            if (linearLayout21 != null) {
                                                                                                i = R.id.ll_walk;
                                                                                                LinearLayout linearLayout22 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                if (linearLayout22 != null) {
                                                                                                    i = R.id.ll_walkRepeat;
                                                                                                    LinearLayout linearLayout23 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                    if (linearLayout23 != null) {
                                                                                                        i = R.id.mSwitchBook;
                                                                                                        Switch r29 = (Switch) ViewBindings.findChildViewById(view, i);
                                                                                                        if (r29 != null) {
                                                                                                            i = R.id.mSwitchDrink;
                                                                                                            Switch r30 = (Switch) ViewBindings.findChildViewById(view, i);
                                                                                                            if (r30 != null) {
                                                                                                                i = R.id.mSwitchEat;
                                                                                                                Switch r31 = (Switch) ViewBindings.findChildViewById(view, i);
                                                                                                                if (r31 != null) {
                                                                                                                    i = R.id.mSwitchHr;
                                                                                                                    Switch r32 = (Switch) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (r32 != null) {
                                                                                                                        i = R.id.mSwitchLook;
                                                                                                                        Switch r33 = (Switch) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (r33 != null) {
                                                                                                                            i = R.id.mSwitchSit;
                                                                                                                            Switch r34 = (Switch) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (r34 != null) {
                                                                                                                                i = R.id.mSwitchSport;
                                                                                                                                Switch r35 = (Switch) ViewBindings.findChildViewById(view, i);
                                                                                                                                if (r35 != null) {
                                                                                                                                    i = R.id.mSwitchWalk;
                                                                                                                                    Switch r36 = (Switch) ViewBindings.findChildViewById(view, i);
                                                                                                                                    if (r36 != null) {
                                                                                                                                        i = R.id.mTopBar;
                                                                                                                                        MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                                                                                                                                        if (myTitleBar != null) {
                                                                                                                                            i = R.id.tv1;
                                                                                                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                            if (textView != null) {
                                                                                                                                                i = R.id.tv10;
                                                                                                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                if (textView2 != null) {
                                                                                                                                                    i = R.id.tv11;
                                                                                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                    if (textView3 != null) {
                                                                                                                                                        i = R.id.tv12;
                                                                                                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                        if (textView4 != null) {
                                                                                                                                                            i = R.id.tv13;
                                                                                                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                            if (textView5 != null) {
                                                                                                                                                                i = R.id.tv14;
                                                                                                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                if (textView6 != null) {
                                                                                                                                                                    i = R.id.tv15;
                                                                                                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                    if (textView7 != null) {
                                                                                                                                                                        i = R.id.tv16;
                                                                                                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                        if (textView8 != null) {
                                                                                                                                                                            i = R.id.tv17;
                                                                                                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                            if (textView9 != null) {
                                                                                                                                                                                i = R.id.tv18;
                                                                                                                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                if (textView10 != null) {
                                                                                                                                                                                    i = R.id.tv19;
                                                                                                                                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                    if (textView11 != null) {
                                                                                                                                                                                        i = R.id.tv2;
                                                                                                                                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                        if (textView12 != null) {
                                                                                                                                                                                            i = R.id.tv20;
                                                                                                                                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                            if (textView13 != null) {
                                                                                                                                                                                                i = R.id.tv21;
                                                                                                                                                                                                TextView textView14 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                if (textView14 != null) {
                                                                                                                                                                                                    i = R.id.tv22;
                                                                                                                                                                                                    TextView textView15 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                    if (textView15 != null) {
                                                                                                                                                                                                        i = R.id.tv23;
                                                                                                                                                                                                        TextView textView16 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                        if (textView16 != null) {
                                                                                                                                                                                                            i = R.id.tv24;
                                                                                                                                                                                                            TextView textView17 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                            if (textView17 != null) {
                                                                                                                                                                                                                i = R.id.tv3;
                                                                                                                                                                                                                TextView textView18 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                if (textView18 != null) {
                                                                                                                                                                                                                    i = R.id.tv4;
                                                                                                                                                                                                                    TextView textView19 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                    if (textView19 != null) {
                                                                                                                                                                                                                        i = R.id.tv5;
                                                                                                                                                                                                                        TextView textView20 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                        if (textView20 != null) {
                                                                                                                                                                                                                            i = R.id.tv6;
                                                                                                                                                                                                                            TextView textView21 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                            if (textView21 != null) {
                                                                                                                                                                                                                                i = R.id.tv7;
                                                                                                                                                                                                                                TextView textView22 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                if (textView22 != null) {
                                                                                                                                                                                                                                    i = R.id.tv8;
                                                                                                                                                                                                                                    TextView textView23 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                    if (textView23 != null) {
                                                                                                                                                                                                                                        i = R.id.tv9;
                                                                                                                                                                                                                                        TextView textView24 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                        if (textView24 != null) {
                                                                                                                                                                                                                                            i = R.id.tv_endDrink;
                                                                                                                                                                                                                                            TextView textView25 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                            if (textView25 != null) {
                                                                                                                                                                                                                                                i = R.id.tv_endSit;
                                                                                                                                                                                                                                                TextView textView26 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                if (textView26 != null) {
                                                                                                                                                                                                                                                    i = R.id.tv_intervalBook;
                                                                                                                                                                                                                                                    TextView textView27 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                    if (textView27 != null) {
                                                                                                                                                                                                                                                        i = R.id.tv_intervalDrink;
                                                                                                                                                                                                                                                        TextView textView28 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                        if (textView28 != null) {
                                                                                                                                                                                                                                                            i = R.id.tv_intervalEat;
                                                                                                                                                                                                                                                            TextView textView29 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                            if (textView29 != null) {
                                                                                                                                                                                                                                                                i = R.id.tv_intervalHr;
                                                                                                                                                                                                                                                                TextView textView30 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                if (textView30 != null) {
                                                                                                                                                                                                                                                                    i = R.id.tv_intervalLook;
                                                                                                                                                                                                                                                                    TextView textView31 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                    if (textView31 != null) {
                                                                                                                                                                                                                                                                        i = R.id.tv_intervalSit;
                                                                                                                                                                                                                                                                        TextView textView32 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                        if (textView32 != null) {
                                                                                                                                                                                                                                                                            i = R.id.tv_intervalSport;
                                                                                                                                                                                                                                                                            TextView textView33 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                            if (textView33 != null) {
                                                                                                                                                                                                                                                                                i = R.id.tv_intervalWalk;
                                                                                                                                                                                                                                                                                TextView textView34 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                if (textView34 != null) {
                                                                                                                                                                                                                                                                                    i = R.id.tv_repeatBook;
                                                                                                                                                                                                                                                                                    TextView textView35 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                    if (textView35 != null) {
                                                                                                                                                                                                                                                                                        i = R.id.tv_repeatEat;
                                                                                                                                                                                                                                                                                        TextView textView36 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                        if (textView36 != null) {
                                                                                                                                                                                                                                                                                            i = R.id.tv_repeatSport;
                                                                                                                                                                                                                                                                                            TextView textView37 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                            if (textView37 != null) {
                                                                                                                                                                                                                                                                                                i = R.id.tv_repeatWalk;
                                                                                                                                                                                                                                                                                                TextView textView38 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                                if (textView38 != null) {
                                                                                                                                                                                                                                                                                                    i = R.id.tv_startDrink;
                                                                                                                                                                                                                                                                                                    TextView textView39 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                                    if (textView39 != null) {
                                                                                                                                                                                                                                                                                                        i = R.id.tv_startSit;
                                                                                                                                                                                                                                                                                                        TextView textView40 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                                        if (textView40 != null) {
                                                                                                                                                                                                                                                                                                            return new ActivityHealthreminderBinding((RelativeLayout) view, relativeLayout, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, linearLayout11, linearLayout12, linearLayout13, linearLayout14, linearLayout15, linearLayout16, linearLayout17, linearLayout18, linearLayout19, linearLayout20, linearLayout21, linearLayout22, linearLayout23, r29, r30, r31, r32, r33, r34, r35, r36, myTitleBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28, textView29, textView30, textView31, textView32, textView33, textView34, textView35, textView36, textView37, textView38, textView39, textView40);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
