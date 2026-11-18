package com.anythink.core.common.v.a;

import android.view.View;

/* JADX INFO: loaded from: classes16.dex */
public interface b {
    int getImpressionMinPercentageViewed();

    int getImpressionMinTimeViewed();

    Integer getImpressionMinVisiblePx();

    boolean isImpressionRecorded();

    void recordImpression(View view);

    void setImpressionRecorded();
}
