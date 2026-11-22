package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class DialogSyBinding implements ViewBinding {
    public final ConstraintLayout clTitle;
    public final ConstraintLayout clTp;
    public final ImageButton ibClose;
    public final ImageView ivStatus;
    private final LinearLayout rootView;
    public final TextView tvOk;
    public final TextView tvTitle;

    private DialogSyBinding(LinearLayout linearLayout, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageButton imageButton, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.clTitle = constraintLayout;
        this.clTp = constraintLayout2;
        this.ibClose = imageButton;
        this.ivStatus = imageView;
        this.tvOk = textView;
        this.tvTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogSyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogSyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_sy, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogSyBinding bind(View view) {
        int i = R.id.cl_title;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.cl_tp;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null) {
                i = R.id.ib_close;
                ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
                if (imageButton != null) {
                    i = R.id.iv_status;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.tv_ok;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.tv_title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                return new DialogSyBinding((LinearLayout) view, constraintLayout, constraintLayout2, imageButton, imageView, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
