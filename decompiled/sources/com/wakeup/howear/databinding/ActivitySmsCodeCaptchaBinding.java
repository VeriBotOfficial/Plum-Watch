package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ActivitySmsCodeCaptchaBinding implements ViewBinding {
    public final Button btnNext;
    public final EditText etCode;
    public final EditText etImageCode;
    public final EditText etPhone;
    public final ImageView ivImage;
    private final LinearLayout rootView;
    public final MyTitleBar topBar;
    public final TextView tvCode;

    private ActivitySmsCodeCaptchaBinding(LinearLayout linearLayout, Button button, EditText editText, EditText editText2, EditText editText3, ImageView imageView, MyTitleBar myTitleBar, TextView textView) {
        this.rootView = linearLayout;
        this.btnNext = button;
        this.etCode = editText;
        this.etImageCode = editText2;
        this.etPhone = editText3;
        this.ivImage = imageView;
        this.topBar = myTitleBar;
        this.tvCode = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySmsCodeCaptchaBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySmsCodeCaptchaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_sms_code_captcha, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivitySmsCodeCaptchaBinding bind(View view) {
        int i = R.id.btnNext;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.etCode;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
            if (editText != null) {
                i = R.id.etImageCode;
                EditText editText2 = (EditText) ViewBindings.findChildViewById(view, i);
                if (editText2 != null) {
                    i = R.id.etPhone;
                    EditText editText3 = (EditText) ViewBindings.findChildViewById(view, i);
                    if (editText3 != null) {
                        i = R.id.ivImage;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.topBar;
                            MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                            if (myTitleBar != null) {
                                i = R.id.tvCode;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    return new ActivitySmsCodeCaptchaBinding((LinearLayout) view, button, editText, editText2, editText3, imageView, myTitleBar, textView);
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
