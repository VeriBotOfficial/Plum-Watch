package com.wakeup.feature.device.dial.adpater;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialRecommendAdapter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"DIAL_RECOMMEND_SPAN_COUNT", "", "expandRecommendGridHeight", "", "Landroidx/recyclerview/widget/RecyclerView;", "itemCount", "spanCount", "feature-device_overseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DialRecommendAdapterKt {
    public static final int DIAL_RECOMMEND_SPAN_COUNT = 3;

    public static /* synthetic */ void expandRecommendGridHeight$default(RecyclerView recyclerView, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 3;
        }
        expandRecommendGridHeight(recyclerView, i, i2);
    }

    public static final void expandRecommendGridHeight(final RecyclerView recyclerView, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        recyclerView.setNestedScrollingEnabled(false);
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        layoutParams.height = -2;
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.post(new Runnable() { // from class: com.wakeup.feature.device.dial.adpater.DialRecommendAdapterKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                DialRecommendAdapterKt.expandRecommendGridHeight$lambda$1(i, recyclerView, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void expandRecommendGridHeight$lambda$1(int i, RecyclerView recyclerView, int i2) {
        View childAt;
        if (i > 0 && (childAt = recyclerView.getChildAt(0)) != null) {
            int measuredHeight = (childAt.getMeasuredHeight() * (((i + i2) - 1) / i2)) + recyclerView.getPaddingTop() + recyclerView.getPaddingBottom();
            if (measuredHeight <= 0) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams.height != measuredHeight) {
                layoutParams.height = measuredHeight;
                recyclerView.setLayoutParams(layoutParams);
            }
        }
    }
}
