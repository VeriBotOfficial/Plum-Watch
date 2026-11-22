package com.wakeup.module.ai.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.module.ai.R;

/* loaded from: classes4.dex */
public final class DialogRecordEditBinding implements ViewBinding {
    public final TextView btnLeft;
    public final TextView btnRight;
    public final ImageView iv1;
    public final ImageView iv2;
    public final LinearLayoutCompat llIv;
    private final LinearLayoutCompat rootView;
    public final View space;
    public final EditText tvContent;
    public final AppCompatTextView tvLimit;
    public final TextView tvTip;
    public final AppCompatTextView tvTitle;

    private DialogRecordEditBinding(LinearLayoutCompat linearLayoutCompat, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2, LinearLayoutCompat linearLayoutCompat2, View view, EditText editText, AppCompatTextView appCompatTextView, TextView textView3, AppCompatTextView appCompatTextView2) {
        this.rootView = linearLayoutCompat;
        this.btnLeft = textView;
        this.btnRight = textView2;
        this.iv1 = imageView;
        this.iv2 = imageView2;
        this.llIv = linearLayoutCompat2;
        this.space = view;
        this.tvContent = editText;
        this.tvLimit = appCompatTextView;
        this.tvTip = textView3;
        this.tvTitle = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static DialogRecordEditBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogRecordEditBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_record_edit, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogRecordEditBinding bind(View view) {
        View findChildViewById;
        int i = R.id.btn_left;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.btn_right;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.iv_1;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.iv_2;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.ll_iv;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.space))) != null) {
                            i = R.id.tv_content;
                            EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                            if (editText != null) {
                                i = R.id.tv_limit;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    i = R.id.tv_tip;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = R.id.tv_title;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView2 != null) {
                                            return new DialogRecordEditBinding((LinearLayoutCompat) view, textView, textView2, imageView, imageView2, linearLayoutCompat, findChildViewById, editText, appCompatTextView, textView3, appCompatTextView2);
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
