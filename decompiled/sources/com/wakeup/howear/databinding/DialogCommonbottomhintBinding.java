package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class DialogCommonbottomhintBinding implements ViewBinding {
    public final View line1;
    public final View line2;
    public final RelativeLayout rlTitle;
    private final LinearLayout rootView;
    public final TextView tvBlue;
    public final TextView tvContent;
    public final TextView tvTitle;

    private DialogCommonbottomhintBinding(LinearLayout linearLayout, View view, View view2, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.line1 = view;
        this.line2 = view2;
        this.rlTitle = relativeLayout;
        this.tvBlue = textView;
        this.tvContent = textView2;
        this.tvTitle = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogCommonbottomhintBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogCommonbottomhintBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_commonbottomhint, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogCommonbottomhintBinding bind(View view) {
        View findChildViewById;
        int i = R.id.line1;
        View findChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line2))) != null) {
            i = R.id.rl_title;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.tvBlue;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_content;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.tv_title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            return new DialogCommonbottomhintBinding((LinearLayout) view, findChildViewById2, findChildViewById, relativeLayout, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
