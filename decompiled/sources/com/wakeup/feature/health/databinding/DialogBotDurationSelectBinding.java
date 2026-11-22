package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aigestudio.wheelpicker.WheelPicker;
import com.google.android.material.button.MaterialButton;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class DialogBotDurationSelectBinding implements ViewBinding {
    public final MaterialButton btnCancel;
    public final MaterialButton btnOK;
    private final FrameLayout rootView;
    public final TextView tvTip;
    public final WheelPicker wheelPicker;

    private DialogBotDurationSelectBinding(FrameLayout frameLayout, MaterialButton materialButton, MaterialButton materialButton2, TextView textView, WheelPicker wheelPicker) {
        this.rootView = frameLayout;
        this.btnCancel = materialButton;
        this.btnOK = materialButton2;
        this.tvTip = textView;
        this.wheelPicker = wheelPicker;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static DialogBotDurationSelectBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogBotDurationSelectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_bot_duration_select, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogBotDurationSelectBinding bind(View view) {
        int i = R.id.btnCancel;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, i);
        if (materialButton != null) {
            i = R.id.btnOK;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, i);
            if (materialButton2 != null) {
                i = R.id.tvTip;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.wheelPicker;
                    WheelPicker wheelPicker = (WheelPicker) ViewBindings.findChildViewById(view, i);
                    if (wheelPicker != null) {
                        return new DialogBotDurationSelectBinding((FrameLayout) view, materialButton, materialButton2, textView, wheelPicker);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
