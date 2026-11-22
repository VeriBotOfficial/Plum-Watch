package com.wakeup.commonui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aigestudio.wheelpicker.WheelPicker;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public final class DialogTimePickerBinding implements ViewBinding {
    public final WheelPicker hourPicker;
    public final WheelPicker minutePicker;
    private final ConstraintLayout rootView;
    public final TextView tvCancel;
    public final TextView tvConfirm;

    private DialogTimePickerBinding(ConstraintLayout constraintLayout, WheelPicker wheelPicker, WheelPicker wheelPicker2, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.hourPicker = wheelPicker;
        this.minutePicker = wheelPicker2;
        this.tvCancel = textView;
        this.tvConfirm = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogTimePickerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogTimePickerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_time_picker, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogTimePickerBinding bind(View view) {
        int i = R.id.hour_picker;
        WheelPicker wheelPicker = (WheelPicker) ViewBindings.findChildViewById(view, i);
        if (wheelPicker != null) {
            i = R.id.minute_picker;
            WheelPicker wheelPicker2 = (WheelPicker) ViewBindings.findChildViewById(view, i);
            if (wheelPicker2 != null) {
                i = R.id.tv_cancel;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_confirm;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new DialogTimePickerBinding((ConstraintLayout) view, wheelPicker, wheelPicker2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
