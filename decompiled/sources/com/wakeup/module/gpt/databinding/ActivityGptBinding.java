package com.wakeup.module.gpt.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.wakeup.module.gpt.R;

/* loaded from: classes4.dex */
public final class ActivityGptBinding implements ViewBinding {
    private final LinearLayoutCompat rootView;
    public final ViewPager2 viewPager;

    private ActivityGptBinding(LinearLayoutCompat linearLayoutCompat, ViewPager2 viewPager2) {
        this.rootView = linearLayoutCompat;
        this.viewPager = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ActivityGptBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityGptBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_gpt, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityGptBinding bind(View view) {
        int i = R.id.view_pager;
        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
        if (viewPager2 != null) {
            return new ActivityGptBinding((LinearLayoutCompat) view, viewPager2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
