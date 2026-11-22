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
public final class DialogFriendSingleUserBinding implements ViewBinding {
    public final LinearLayout llDelete;
    public final LinearLayout llEdit;
    public final RelativeLayout rlMain;
    private final RelativeLayout rootView;
    public final TextView tv1;
    public final TextView tv2;

    private DialogFriendSingleUserBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout2, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.llDelete = linearLayout;
        this.llEdit = linearLayout2;
        this.rlMain = relativeLayout2;
        this.tv1 = textView;
        this.tv2 = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static DialogFriendSingleUserBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogFriendSingleUserBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_friend_single_user, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogFriendSingleUserBinding bind(View view) {
        int i = R.id.llDelete;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.llEdit;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i = R.id.tv1;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv2;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new DialogFriendSingleUserBinding(relativeLayout, linearLayout, linearLayout2, relativeLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
