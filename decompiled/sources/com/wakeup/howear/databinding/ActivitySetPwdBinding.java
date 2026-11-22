package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ActivitySetPwdBinding implements ViewBinding {
    public final Button btnOk;
    public final EditText etPassword;
    public final EditText etPassword2;
    public final ImageView ivLogo;
    public final ImageView ivShowHidePw;
    public final ImageView ivShowHidePw2;
    private final LinearLayout rootView;
    public final MyTitleBar topBar;
    public final AppCompatTextView tvTitle;

    private ActivitySetPwdBinding(LinearLayout linearLayout, Button button, EditText editText, EditText editText2, ImageView imageView, ImageView imageView2, ImageView imageView3, MyTitleBar myTitleBar, AppCompatTextView appCompatTextView) {
        this.rootView = linearLayout;
        this.btnOk = button;
        this.etPassword = editText;
        this.etPassword2 = editText2;
        this.ivLogo = imageView;
        this.ivShowHidePw = imageView2;
        this.ivShowHidePw2 = imageView3;
        this.topBar = myTitleBar;
        this.tvTitle = appCompatTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySetPwdBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySetPwdBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_set_pwd, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivitySetPwdBinding bind(View view) {
        int i = R.id.btnOk;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.etPassword;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
            if (editText != null) {
                i = R.id.etPassword2;
                EditText editText2 = (EditText) ViewBindings.findChildViewById(view, i);
                if (editText2 != null) {
                    i = R.id.ivLogo;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.ivShowHidePw;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.ivShowHidePw2;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                i = R.id.topBar;
                                MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                                if (myTitleBar != null) {
                                    i = R.id.tv_title;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView != null) {
                                        return new ActivitySetPwdBinding((LinearLayout) view, button, editText, editText2, imageView, imageView2, imageView3, myTitleBar, appCompatTextView);
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
