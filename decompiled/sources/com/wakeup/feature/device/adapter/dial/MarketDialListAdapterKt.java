package com.wakeup.feature.device.adapter.dial;

import kotlin.Metadata;

/* compiled from: MarketDialListAdapter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0004"}, d2 = {"EPSILON", "", "isPositive", "", "feature-device_overseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MarketDialListAdapterKt {
    private static final double EPSILON = 1.0E-10d;

    public static final boolean isPositive(double d) {
        return (Double.isInfinite(d) || Double.isNaN(d) || d <= EPSILON) ? false : true;
    }
}
