package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ActivityCommonProblemBinding implements ViewBinding {
    public final MyTitleBar mTopBar;
    private final LinearLayoutCompat rootView;

    private ActivityCommonProblemBinding(LinearLayoutCompat linearLayoutCompat, MyTitleBar myTitleBar) {
        this.rootView = linearLayoutCompat;
        this.mTopBar = myTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ActivityCommonProblemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityCommonProblemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_common_problem, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityCommonProblemBinding bind(View view) {
        int i = R.id.mTopBar;
        MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
        if (myTitleBar != null) {
            return new ActivityCommonProblemBinding((LinearLayoutCompat) view, myTitleBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
