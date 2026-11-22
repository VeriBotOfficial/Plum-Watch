package com.wakeup.feature.friend.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.friend.R;

/* loaded from: classes3.dex */
public final class DialogAddnewmembermenuBinding implements ViewBinding {
    public final LinearLayout llMyCard;
    public final RelativeLayout rlMain;
    private final RelativeLayout rootView;
    public final TextView tv3;

    private DialogAddnewmembermenuBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, RelativeLayout relativeLayout2, TextView textView) {
        this.rootView = relativeLayout;
        this.llMyCard = linearLayout;
        this.rlMain = relativeLayout2;
        this.tv3 = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static DialogAddnewmembermenuBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogAddnewmembermenuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_addnewmembermenu, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogAddnewmembermenuBinding bind(View view) {
        int i = R.id.llMyCard;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            int i2 = R.id.tv3;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
            if (textView != null) {
                return new DialogAddnewmembermenuBinding(relativeLayout, linearLayout, relativeLayout, textView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
