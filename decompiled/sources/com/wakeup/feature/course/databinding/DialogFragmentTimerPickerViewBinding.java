package com.wakeup.feature.course.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aigestudio.wheelpicker.WheelPicker;
import com.wakeup.feature.course.R;

/* loaded from: classes2.dex */
public final class DialogFragmentTimerPickerViewBinding implements ViewBinding {
    public final View guideLine;
    private final LinearLayoutCompat rootView;
    public final TextView tvCancel;
    public final TextView tvOk;
    public final WheelPicker wheelPicker2;
    public final WheelPicker wheelPicker3;

    private DialogFragmentTimerPickerViewBinding(LinearLayoutCompat linearLayoutCompat, View view, TextView textView, TextView textView2, WheelPicker wheelPicker, WheelPicker wheelPicker2) {
        this.rootView = linearLayoutCompat;
        this.guideLine = view;
        this.tvCancel = textView;
        this.tvOk = textView2;
        this.wheelPicker2 = wheelPicker;
        this.wheelPicker3 = wheelPicker2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static DialogFragmentTimerPickerViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogFragmentTimerPickerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_fragment_timer_picker_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogFragmentTimerPickerViewBinding bind(View view) {
        int i = R.id.guideLine;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            i = R.id.tvCancel;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.tvOk;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.wheelPicker2;
                    WheelPicker wheelPicker = (WheelPicker) ViewBindings.findChildViewById(view, i);
                    if (wheelPicker != null) {
                        i = R.id.wheelPicker3;
                        WheelPicker wheelPicker2 = (WheelPicker) ViewBindings.findChildViewById(view, i);
                        if (wheelPicker2 != null) {
                            return new DialogFragmentTimerPickerViewBinding((LinearLayoutCompat) view, findChildViewById, textView, textView2, wheelPicker, wheelPicker2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
