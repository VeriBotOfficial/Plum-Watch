package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.flyco.tablayout.SlidingTabLayout;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.commonui.expand.NoScrollViewPager;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class ActivityActiveTimeBinding implements ViewBinding {
    public final TextView descTitle;
    public final MyTitleBar mTopBar;
    private final LinearLayoutCompat rootView;
    public final SlidingTabLayout tabLayout;
    public final NoScrollViewPager viewPage;

    private ActivityActiveTimeBinding(LinearLayoutCompat linearLayoutCompat, TextView textView, MyTitleBar myTitleBar, SlidingTabLayout slidingTabLayout, NoScrollViewPager noScrollViewPager) {
        this.rootView = linearLayoutCompat;
        this.descTitle = textView;
        this.mTopBar = myTitleBar;
        this.tabLayout = slidingTabLayout;
        this.viewPage = noScrollViewPager;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ActivityActiveTimeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityActiveTimeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_active_time, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityActiveTimeBinding bind(View view) {
        int i = R.id.desc_title;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.mTopBar;
            MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
            if (myTitleBar != null) {
                i = R.id.tabLayout;
                SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i);
                if (slidingTabLayout != null) {
                    i = R.id.viewPage;
                    NoScrollViewPager noScrollViewPager = (NoScrollViewPager) ViewBindings.findChildViewById(view, i);
                    if (noScrollViewPager != null) {
                        return new ActivityActiveTimeBinding((LinearLayoutCompat) view, textView, myTitleBar, slidingTabLayout, noScrollViewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
