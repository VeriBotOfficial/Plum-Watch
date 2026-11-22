package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ActivityRegBinding implements ViewBinding {
    public final TextView btnLogin;
    public final Button btnNext;
    public final CheckBox cbOk;
    public final EditText etCode;
    public final EditText etPhone;
    public final ImageView ivLogo;
    public final LinearLayout llAgreement;
    public final RelativeLayout rlRegion;
    private final LinearLayout rootView;
    public final MyTitleBar topBar;
    public final TextView tvCode;
    public final TextView tvCountry;
    public final TextView tvTip;

    private ActivityRegBinding(LinearLayout linearLayout, TextView textView, Button button, CheckBox checkBox, EditText editText, EditText editText2, ImageView imageView, LinearLayout linearLayout2, RelativeLayout relativeLayout, MyTitleBar myTitleBar, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.btnLogin = textView;
        this.btnNext = button;
        this.cbOk = checkBox;
        this.etCode = editText;
        this.etPhone = editText2;
        this.ivLogo = imageView;
        this.llAgreement = linearLayout2;
        this.rlRegion = relativeLayout;
        this.topBar = myTitleBar;
        this.tvCode = textView2;
        this.tvCountry = textView3;
        this.tvTip = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityRegBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityRegBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_reg, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityRegBinding bind(View view) {
        int i = R.id.btnLogin;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.btnNext;
            Button button = (Button) ViewBindings.findChildViewById(view, i);
            if (button != null) {
                i = R.id.cbOk;
                CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i);
                if (checkBox != null) {
                    i = R.id.etCode;
                    EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                    if (editText != null) {
                        i = R.id.etPhone;
                        EditText editText2 = (EditText) ViewBindings.findChildViewById(view, i);
                        if (editText2 != null) {
                            i = R.id.ivLogo;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = R.id.llAgreement;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    i = R.id.rlRegion;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout != null) {
                                        i = R.id.topBar;
                                        MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                                        if (myTitleBar != null) {
                                            i = R.id.tv_code;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView2 != null) {
                                                i = R.id.tvCountry;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView3 != null) {
                                                    i = R.id.tvTip;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView4 != null) {
                                                        return new ActivityRegBinding((LinearLayout) view, textView, button, checkBox, editText, editText2, imageView, linearLayout, relativeLayout, myTitleBar, textView2, textView3, textView4);
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
