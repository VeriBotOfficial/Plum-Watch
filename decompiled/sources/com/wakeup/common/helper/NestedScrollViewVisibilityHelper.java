package com.wakeup.common.helper;

import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NestedScrollViewVisibilityHelper.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00070\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/wakeup/common/helper/NestedScrollViewVisibilityHelper;", "", "<init>", "()V", "TAG", "", "checkViewsVisibility", "", "view", "Landroid/view/View;", "scrollView", "Landroidx/core/widget/NestedScrollView;", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "visibleRatio", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NestedScrollViewVisibilityHelper {
    public static final NestedScrollViewVisibilityHelper INSTANCE = new NestedScrollViewVisibilityHelper();
    private static final String TAG = "NestedScrollViewVisibilityHelper";

    private NestedScrollViewVisibilityHelper() {
    }

    public final void checkViewsVisibility(View view, NestedScrollView scrollView, Function1<? super Float, Unit> callback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        Intrinsics.checkNotNullParameter(callback, "callback");
        boolean isShown = scrollView.isShown();
        Float valueOf = Float.valueOf(0.0f);
        if (!isShown || !view.isShown()) {
            callback.invoke(valueOf);
            return;
        }
        Rect rect = new Rect();
        scrollView.getHitRect(rect);
        Rect rect2 = new Rect();
        view.getGlobalVisibleRect(rect2);
        if (new Rect().setIntersect(rect, rect2)) {
            callback.invoke(Float.valueOf((r2.width() * r2.height()) / (view.getWidth() * view.getHeight())));
        } else {
            callback.invoke(valueOf);
        }
    }
}
