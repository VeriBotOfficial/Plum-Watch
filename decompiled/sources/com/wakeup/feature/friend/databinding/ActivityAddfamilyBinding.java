package com.wakeup.feature.friend.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.friend.R;

/* loaded from: classes3.dex */
public final class ActivityAddfamilyBinding implements ViewBinding {
    public final LinearLayout llAccount;
    public final LinearLayout llContacts;
    public final LinearLayout llScan;
    public final LinearLayout llThird;
    public final MyTitleBar mTopBar;
    private final LinearLayout rootView;

    private ActivityAddfamilyBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, MyTitleBar myTitleBar) {
        this.rootView = linearLayout;
        this.llAccount = linearLayout2;
        this.llContacts = linearLayout3;
        this.llScan = linearLayout4;
        this.llThird = linearLayout5;
        this.mTopBar = myTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityAddfamilyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityAddfamilyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_addfamily, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityAddfamilyBinding bind(View view) {
        int i = R.id.ll_account;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.ll_contacts;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.ll_scan;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout3 != null) {
                    i = R.id.ll_third;
                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout4 != null) {
                        i = R.id.mTopBar;
                        MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                        if (myTitleBar != null) {
                            return new ActivityAddfamilyBinding((LinearLayout) view, linearLayout, linearLayout2, linearLayout3, linearLayout4, myTitleBar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
