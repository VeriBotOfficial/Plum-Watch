package com.wakeup.feature.health.dashboard;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthDashboardHost.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"attachHealthDashboardBanner", "", "Landroid/widget/FrameLayout;", "view", "Landroid/view/View;", "feature-health_overseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthDashboardHostKt {
    public static final void attachHealthDashboardBanner(FrameLayout frameLayout, View view) {
        Intrinsics.checkNotNullParameter(frameLayout, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        frameLayout.removeAllViews();
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -2));
        frameLayout.setVisibility(0);
    }
}
