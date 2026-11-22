package com.wakeup.howear.view.home;

import android.view.View;
import android.view.ViewGroup;
import com.scwang.smart.refresh.layout.api.RefreshHeader;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.simple.SimpleMultiListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeRefreshHeaderClip.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"hideIdleRefreshHeader", "", "Lcom/scwang/smart/refresh/layout/api/RefreshLayout;", "app_wpOverseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeRefreshHeaderClipKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void hideIdleRefreshHeader(final RefreshLayout refreshLayout) {
        Intrinsics.checkNotNullParameter(refreshLayout, "<this>");
        final ViewGroup viewGroup = refreshLayout instanceof ViewGroup ? (ViewGroup) refreshLayout : null;
        if (viewGroup == null) {
            return;
        }
        hideIdleRefreshHeader$clip(viewGroup);
        viewGroup.post(new Runnable() { // from class: com.wakeup.howear.view.home.HomeRefreshHeaderClipKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                HomeRefreshHeaderClipKt.hideIdleRefreshHeader$lambda$0(RefreshLayout.this, viewGroup);
            }
        });
        refreshLayout.setOnMultiListener(new SimpleMultiListener() { // from class: com.wakeup.howear.view.home.HomeRefreshHeaderClipKt$hideIdleRefreshHeader$2
            @Override // com.scwang.smart.refresh.layout.simple.SimpleMultiListener, com.scwang.smart.refresh.layout.listener.OnMultiListener
            public void onHeaderMoving(RefreshHeader header, boolean isDragging, float percent, int offset, int headerHeight, int maxDragHeight) {
                View view;
                if (header == null || (view = header.getView()) == null) {
                    return;
                }
                view.setAlpha(offset > 2 ? 1.0f : 0.0f);
            }

            @Override // com.scwang.smart.refresh.layout.simple.SimpleMultiListener, com.scwang.smart.refresh.layout.listener.OnMultiListener
            public void onHeaderFinish(RefreshHeader header, boolean success) {
                View view;
                if (header == null || (view = header.getView()) == null) {
                    return;
                }
                view.setAlpha(0.0f);
            }
        });
    }

    private static final void hideIdleRefreshHeader$clip(ViewGroup viewGroup) {
        viewGroup.setClipChildren(true);
        viewGroup.setClipToPadding(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideIdleRefreshHeader$lambda$0(RefreshLayout refreshLayout, ViewGroup viewGroup) {
        View view;
        hideIdleRefreshHeader$clip(viewGroup);
        RefreshHeader refreshHeader = refreshLayout.getRefreshHeader();
        if (refreshHeader == null || (view = refreshHeader.getView()) == null) {
            return;
        }
        view.setAlpha(0.0f);
    }
}
