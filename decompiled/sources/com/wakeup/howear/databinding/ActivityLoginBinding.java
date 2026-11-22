package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ActivityLoginBinding implements ViewBinding {
    public final CheckBox agreeCheckBox;
    public final Button btnLogin;
    public final EditText etCode;
    public final EditText etPassword;
    public final EditText etPhone;
    public final ImageView ivBg;
    public final ImageView ivLogo;
    public final ImageView ivOperator;
    public final ImageView ivQQ;
    public final ImageView ivShowHidePw;
    public final ImageView ivWechat;
    public final FrameLayout layoutCheck;
    public final LinearLayout llAgreement;
    public final LinearLayout llCodeRow;
    public final LinearLayout llPasswordRow;
    private final RelativeLayout rootView;
    public final MyTitleBar topBar;
    public final TextView tvForgetPassword;
    public final TextView tvGetCode;
    public final TextView tvRegister;
    public final TextView tvSwitchLoginMode;
    public final TextView tvTip;

    private ActivityLoginBinding(RelativeLayout relativeLayout, CheckBox checkBox, Button button, EditText editText, EditText editText2, EditText editText3, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, FrameLayout frameLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, MyTitleBar myTitleBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = relativeLayout;
        this.agreeCheckBox = checkBox;
        this.btnLogin = button;
        this.etCode = editText;
        this.etPassword = editText2;
        this.etPhone = editText3;
        this.ivBg = imageView;
        this.ivLogo = imageView2;
        this.ivOperator = imageView3;
        this.ivQQ = imageView4;
        this.ivShowHidePw = imageView5;
        this.ivWechat = imageView6;
        this.layoutCheck = frameLayout;
        this.llAgreement = linearLayout;
        this.llCodeRow = linearLayout2;
        this.llPasswordRow = linearLayout3;
        this.topBar = myTitleBar;
        this.tvForgetPassword = textView;
        this.tvGetCode = textView2;
        this.tvRegister = textView3;
        this.tvSwitchLoginMode = textView4;
        this.tvTip = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityLoginBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityLoginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_login, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityLoginBinding bind(View view) {
        int i = R.id.agreeCheckBox;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i);
        if (checkBox != null) {
            i = R.id.btnLogin;
            Button button = (Button) ViewBindings.findChildViewById(view, i);
            if (button != null) {
                i = R.id.etCode;
                EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                if (editText != null) {
                    i = R.id.etPassword;
                    EditText editText2 = (EditText) ViewBindings.findChildViewById(view, i);
                    if (editText2 != null) {
                        i = R.id.etPhone;
                        EditText editText3 = (EditText) ViewBindings.findChildViewById(view, i);
                        if (editText3 != null) {
                            i = R.id.ivBg;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = R.id.ivLogo;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    i = R.id.ivOperator;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView3 != null) {
                                        i = R.id.ivQQ;
                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView4 != null) {
                                            i = R.id.ivShowHidePw;
                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView5 != null) {
                                                i = R.id.ivWechat;
                                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView6 != null) {
                                                    i = R.id.layout_check;
                                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                    if (frameLayout != null) {
                                                        i = R.id.llAgreement;
                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayout != null) {
                                                            i = R.id.llCodeRow;
                                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                            if (linearLayout2 != null) {
                                                                i = R.id.llPasswordRow;
                                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                if (linearLayout3 != null) {
                                                                    i = R.id.topBar;
                                                                    MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                                                                    if (myTitleBar != null) {
                                                                        i = R.id.tvForgetPassword;
                                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView != null) {
                                                                            i = R.id.tvGetCode;
                                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView2 != null) {
                                                                                i = R.id.tvRegister;
                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView3 != null) {
                                                                                    i = R.id.tvSwitchLoginMode;
                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView4 != null) {
                                                                                        i = R.id.tvTip;
                                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textView5 != null) {
                                                                                            return new ActivityLoginBinding((RelativeLayout) view, checkBox, button, editText, editText2, editText3, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, frameLayout, linearLayout, linearLayout2, linearLayout3, myTitleBar, textView, textView2, textView3, textView4, textView5);
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
