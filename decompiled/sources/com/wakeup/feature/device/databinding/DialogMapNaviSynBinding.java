package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class DialogMapNaviSynBinding implements ViewBinding {
    public final LinearLayoutCompat btnLayout;
    public final TextView btnLeft;
    public final TextView btnRight;
    public final RadioButton radioBtnMap;
    public final RadioButton radioBtnText;
    public final RadioGroup radioGroup;
    private final LinearLayoutCompat rootView;
    public final View space;
    public final AppCompatTextView tvTitle;

    private DialogMapNaviSynBinding(LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, TextView textView, TextView textView2, RadioButton radioButton, RadioButton radioButton2, RadioGroup radioGroup, View view, AppCompatTextView appCompatTextView) {
        this.rootView = linearLayoutCompat;
        this.btnLayout = linearLayoutCompat2;
        this.btnLeft = textView;
        this.btnRight = textView2;
        this.radioBtnMap = radioButton;
        this.radioBtnText = radioButton2;
        this.radioGroup = radioGroup;
        this.space = view;
        this.tvTitle = appCompatTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static DialogMapNaviSynBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogMapNaviSynBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_map_navi_syn, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogMapNaviSynBinding bind(View view) {
        View findChildViewById;
        int i = R.id.btn_layout;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.btn_left;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.btn_right;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.radio_btn_map;
                    RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i);
                    if (radioButton != null) {
                        i = R.id.radio_btn_text;
                        RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i);
                        if (radioButton2 != null) {
                            i = R.id.radio_group;
                            RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                            if (radioGroup != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.space))) != null) {
                                i = R.id.tv_title;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    return new DialogMapNaviSynBinding((LinearLayoutCompat) view, linearLayoutCompat, textView, textView2, radioButton, radioButton2, radioGroup, findChildViewById, appCompatTextView);
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
