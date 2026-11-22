package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Switch;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ActivityAdSetBinding implements ViewBinding {
    public final MyTitleBar myTitleBar;
    private final LinearLayout rootView;
    public final Switch switchAd;

    private ActivityAdSetBinding(LinearLayout linearLayout, MyTitleBar myTitleBar, Switch r3) {
        this.rootView = linearLayout;
        this.myTitleBar = myTitleBar;
        this.switchAd = r3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityAdSetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityAdSetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_ad_set, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityAdSetBinding bind(View view) {
        int i = R.id.myTitleBar;
        MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
        if (myTitleBar != null) {
            i = R.id.switch_ad;
            Switch r2 = (Switch) ViewBindings.findChildViewById(view, i);
            if (r2 != null) {
                return new ActivityAdSetBinding((LinearLayout) view, myTitleBar, r2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
