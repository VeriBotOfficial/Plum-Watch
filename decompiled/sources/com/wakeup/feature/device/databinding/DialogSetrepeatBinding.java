package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class DialogSetrepeatBinding implements ViewBinding {
    public final CheckBox mCheckBox1;
    public final CheckBox mCheckBox2;
    public final CheckBox mCheckBox3;
    public final CheckBox mCheckBox4;
    public final CheckBox mCheckBox5;
    public final CheckBox mCheckBox6;
    public final CheckBox mCheckBox7;
    public final CheckBox mCheckBoxNone;
    private final LinearLayout rootView;
    public final TextView tvOk;

    private DialogSetrepeatBinding(LinearLayout linearLayout, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7, CheckBox checkBox8, TextView textView) {
        this.rootView = linearLayout;
        this.mCheckBox1 = checkBox;
        this.mCheckBox2 = checkBox2;
        this.mCheckBox3 = checkBox3;
        this.mCheckBox4 = checkBox4;
        this.mCheckBox5 = checkBox5;
        this.mCheckBox6 = checkBox6;
        this.mCheckBox7 = checkBox7;
        this.mCheckBoxNone = checkBox8;
        this.tvOk = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogSetrepeatBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogSetrepeatBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_setrepeat, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogSetrepeatBinding bind(View view) {
        int i = R.id.mCheckBox1;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i);
        if (checkBox != null) {
            i = R.id.mCheckBox2;
            CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(view, i);
            if (checkBox2 != null) {
                i = R.id.mCheckBox3;
                CheckBox checkBox3 = (CheckBox) ViewBindings.findChildViewById(view, i);
                if (checkBox3 != null) {
                    i = R.id.mCheckBox4;
                    CheckBox checkBox4 = (CheckBox) ViewBindings.findChildViewById(view, i);
                    if (checkBox4 != null) {
                        i = R.id.mCheckBox5;
                        CheckBox checkBox5 = (CheckBox) ViewBindings.findChildViewById(view, i);
                        if (checkBox5 != null) {
                            i = R.id.mCheckBox6;
                            CheckBox checkBox6 = (CheckBox) ViewBindings.findChildViewById(view, i);
                            if (checkBox6 != null) {
                                i = R.id.mCheckBox7;
                                CheckBox checkBox7 = (CheckBox) ViewBindings.findChildViewById(view, i);
                                if (checkBox7 != null) {
                                    i = R.id.mCheckBoxNone;
                                    CheckBox checkBox8 = (CheckBox) ViewBindings.findChildViewById(view, i);
                                    if (checkBox8 != null) {
                                        i = R.id.tv_ok;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView != null) {
                                            return new DialogSetrepeatBinding((LinearLayout) view, checkBox, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, textView);
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
