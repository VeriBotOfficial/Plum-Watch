package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.flyco.tablayout.SlidingTabLayout;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.commonui.expand.NoScrollViewPager;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class LenovoActivitySleepBinding implements ViewBinding {
    public final MyTitleBar mTopBar;
    private final LinearLayoutCompat rootView;
    public final FrameLayout shareTabLayout;
    public final SlidingTabLayout tabLayout;
    public final NoScrollViewPager viewPage;

    private LenovoActivitySleepBinding(LinearLayoutCompat linearLayoutCompat, MyTitleBar myTitleBar, FrameLayout frameLayout, SlidingTabLayout slidingTabLayout, NoScrollViewPager noScrollViewPager) {
        this.rootView = linearLayoutCompat;
        this.mTopBar = myTitleBar;
        this.shareTabLayout = frameLayout;
        this.tabLayout = slidingTabLayout;
        this.viewPage = noScrollViewPager;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static LenovoActivitySleepBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LenovoActivitySleepBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.lenovo_activity_sleep, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LenovoActivitySleepBinding bind(View view) {
        int i = R.id.mTopBar;
        MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
        if (myTitleBar != null) {
            i = R.id.shareTabLayout;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.tabLayout;
                SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i);
                if (slidingTabLayout != null) {
                    i = R.id.viewPage;
                    NoScrollViewPager noScrollViewPager = (NoScrollViewPager) ViewBindings.findChildViewById(view, i);
                    if (noScrollViewPager != null) {
                        return new LenovoActivitySleepBinding((LinearLayoutCompat) view, myTitleBar, frameLayout, slidingTabLayout, noScrollViewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
