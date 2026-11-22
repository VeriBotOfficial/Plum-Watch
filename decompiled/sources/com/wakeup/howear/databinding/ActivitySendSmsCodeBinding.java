package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ActivitySendSmsCodeBinding implements ViewBinding {
    public final Button btnNext;
    public final EditText etCode;
    public final EditText etPhone;
    public final ImageView ivLogo;
    private final LinearLayout rootView;
    public final MyTitleBar topBar;
    public final TextView tvCode;
    public final AppCompatTextView viewTitle;

    private ActivitySendSmsCodeBinding(LinearLayout linearLayout, Button button, EditText editText, EditText editText2, ImageView imageView, MyTitleBar myTitleBar, TextView textView, AppCompatTextView appCompatTextView) {
        this.rootView = linearLayout;
        this.btnNext = button;
        this.etCode = editText;
        this.etPhone = editText2;
        this.ivLogo = imageView;
        this.topBar = myTitleBar;
        this.tvCode = textView;
        this.viewTitle = appCompatTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySendSmsCodeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySendSmsCodeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_send_sms_code, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivitySendSmsCodeBinding bind(View view) {
        int i = R.id.btnNext;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.etCode;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
            if (editText != null) {
                i = R.id.etPhone;
                EditText editText2 = (EditText) ViewBindings.findChildViewById(view, i);
                if (editText2 != null) {
                    i = R.id.ivLogo;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.topBar;
                        MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                        if (myTitleBar != null) {
                            i = R.id.tvCode;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = R.id.view_title;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    return new ActivitySendSmsCodeBinding((LinearLayout) view, button, editText, editText2, imageView, myTitleBar, textView, appCompatTextView);
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
