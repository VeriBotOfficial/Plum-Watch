package com.phancy.mini.core.web;

import android.content.Context;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: X5SwipeLayout.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/phancy/mini/core/web/X5SwipeLayout;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "canChildScrollUp", "", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public class X5SwipeLayout extends SwipeRefreshLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X5SwipeLayout(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public boolean canChildScrollUp() {
        View childAt = getChildCount() > 0 ? getChildAt(0) : null;
        if (childAt != null && (childAt instanceof MiniWebView)) {
            MiniWebView miniWebView = (MiniWebView) childAt;
            View childAt2 = miniWebView.getChildCount() > 0 ? miniWebView.getChildAt(0) : null;
            if (childAt2 != null) {
                return childAt2.getScrollY() != 0;
            }
        }
        return super.canChildScrollUp();
    }
}
