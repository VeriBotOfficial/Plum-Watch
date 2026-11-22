package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ActivityAiCapacityBinding implements ViewBinding {
    public final LinearLayout lvRoot;
    private final LinearLayout rootView;
    public final MyTitleBar topBar;

    private ActivityAiCapacityBinding(LinearLayout linearLayout, LinearLayout linearLayout2, MyTitleBar myTitleBar) {
        this.rootView = linearLayout;
        this.lvRoot = linearLayout2;
        this.topBar = myTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityAiCapacityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityAiCapacityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_ai_capacity, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityAiCapacityBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.topBar;
        MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
        if (myTitleBar != null) {
            return new ActivityAiCapacityBinding(linearLayout, linearLayout, myTitleBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
