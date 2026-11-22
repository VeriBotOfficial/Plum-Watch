package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ActivityScheduleReminderBinding implements ViewBinding {
    public final MyTitleBar mTopBar;
    public final RadioButton radio1;
    public final RadioButton radio10;
    public final RadioButton radio2;
    public final RadioButton radio3;
    public final RadioButton radio4;
    public final RadioButton radio5;
    public final RadioButton radio6;
    public final RadioButton radio7;
    public final RadioButton radio8;
    public final RadioButton radio9;
    public final RadioGroup radioGroup;
    private final LinearLayoutCompat rootView;
    public final View view6;
    public final View view7;
    public final View view8;

    private ActivityScheduleReminderBinding(LinearLayoutCompat linearLayoutCompat, MyTitleBar myTitleBar, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, RadioButton radioButton5, RadioButton radioButton6, RadioButton radioButton7, RadioButton radioButton8, RadioButton radioButton9, RadioButton radioButton10, RadioGroup radioGroup, View view, View view2, View view3) {
        this.rootView = linearLayoutCompat;
        this.mTopBar = myTitleBar;
        this.radio1 = radioButton;
        this.radio10 = radioButton2;
        this.radio2 = radioButton3;
        this.radio3 = radioButton4;
        this.radio4 = radioButton5;
        this.radio5 = radioButton6;
        this.radio6 = radioButton7;
        this.radio7 = radioButton8;
        this.radio8 = radioButton9;
        this.radio9 = radioButton10;
        this.radioGroup = radioGroup;
        this.view6 = view;
        this.view7 = view2;
        this.view8 = view3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ActivityScheduleReminderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityScheduleReminderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_schedule_reminder, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityScheduleReminderBinding bind(View view) {
        View findChildViewById;
        View findChildViewById2;
        View findChildViewById3;
        int i = R.id.mTopBar;
        MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
        if (myTitleBar != null) {
            i = R.id.radio_1;
            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i);
            if (radioButton != null) {
                i = R.id.radio_10;
                RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i);
                if (radioButton2 != null) {
                    i = R.id.radio_2;
                    RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, i);
                    if (radioButton3 != null) {
                        i = R.id.radio_3;
                        RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(view, i);
                        if (radioButton4 != null) {
                            i = R.id.radio_4;
                            RadioButton radioButton5 = (RadioButton) ViewBindings.findChildViewById(view, i);
                            if (radioButton5 != null) {
                                i = R.id.radio_5;
                                RadioButton radioButton6 = (RadioButton) ViewBindings.findChildViewById(view, i);
                                if (radioButton6 != null) {
                                    i = R.id.radio_6;
                                    RadioButton radioButton7 = (RadioButton) ViewBindings.findChildViewById(view, i);
                                    if (radioButton7 != null) {
                                        i = R.id.radio_7;
                                        RadioButton radioButton8 = (RadioButton) ViewBindings.findChildViewById(view, i);
                                        if (radioButton8 != null) {
                                            i = R.id.radio_8;
                                            RadioButton radioButton9 = (RadioButton) ViewBindings.findChildViewById(view, i);
                                            if (radioButton9 != null) {
                                                i = R.id.radio_9;
                                                RadioButton radioButton10 = (RadioButton) ViewBindings.findChildViewById(view, i);
                                                if (radioButton10 != null) {
                                                    i = R.id.radio_group;
                                                    RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                                                    if (radioGroup != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view_6))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.view_7))) != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.view_8))) != null) {
                                                        return new ActivityScheduleReminderBinding((LinearLayoutCompat) view, myTitleBar, radioButton, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6, radioButton7, radioButton8, radioButton9, radioButton10, radioGroup, findChildViewById, findChildViewById2, findChildViewById3);
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
