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
public final class DialogHealthwarningservicemenuBinding implements ViewBinding {
    public final View lineAdd;
    public final LinearLayout llAboutService;
    public final LinearLayout llCloseService;
    public final LinearLayout llModifyContact;
    public final RelativeLayout rlMain;
    private final RelativeLayout rootView;
    public final TextView tv1;
    public final TextView tv2;
    public final TextView tv3;

    private DialogHealthwarningservicemenuBinding(RelativeLayout relativeLayout, View view, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = relativeLayout;
        this.lineAdd = view;
        this.llAboutService = linearLayout;
        this.llCloseService = linearLayout2;
        this.llModifyContact = linearLayout3;
        this.rlMain = relativeLayout2;
        this.tv1 = textView;
        this.tv2 = textView2;
        this.tv3 = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static DialogHealthwarningservicemenuBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogHealthwarningservicemenuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_healthwarningservicemenu, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogHealthwarningservicemenuBinding bind(View view) {
        int i = R.id.lineAdd;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            i = R.id.ll_aboutService;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.ll_closeService;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.ll_modifyContact;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout3 != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i = R.id.tv1;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.tv2;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.tv3;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    return new DialogHealthwarningservicemenuBinding(relativeLayout, findChildViewById, linearLayout, linearLayout2, linearLayout3, relativeLayout, textView, textView2, textView3);
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
