package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ActivityBindPhoneSecondBinding implements ViewBinding {
    public final Button btnOk;
    public final EditText etPassword;
    public final EditText etPassword2;
    public final ImageView ivShowHidePw;
    public final ImageView ivShowHidePw2;
    private final LinearLayout rootView;
    public final MyTitleBar topBar;

    private ActivityBindPhoneSecondBinding(LinearLayout linearLayout, Button button, EditText editText, EditText editText2, ImageView imageView, ImageView imageView2, MyTitleBar myTitleBar) {
        this.rootView = linearLayout;
        this.btnOk = button;
        this.etPassword = editText;
        this.etPassword2 = editText2;
        this.ivShowHidePw = imageView;
        this.ivShowHidePw2 = imageView2;
        this.topBar = myTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityBindPhoneSecondBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityBindPhoneSecondBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_bind_phone_second, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityBindPhoneSecondBinding bind(View view) {
        int i = R.id.btnOk;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.etPassword;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
            if (editText != null) {
                i = R.id.etPassword2;
                EditText editText2 = (EditText) ViewBindings.findChildViewById(view, i);
                if (editText2 != null) {
                    i = R.id.ivShowHidePw;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.ivShowHidePw2;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.topBar;
                            MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                            if (myTitleBar != null) {
                                return new ActivityBindPhoneSecondBinding((LinearLayout) view, button, editText, editText2, imageView, imageView2, myTitleBar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
