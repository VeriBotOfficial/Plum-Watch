package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.jf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3324jf {

    /* renamed from: a, reason: collision with root package name */
    public final C3225ff f18344a;

    public C3324jf(PreloadInfo preloadInfo, PublicLogger publicLogger, boolean z) {
        if (preloadInfo != null) {
            if (TextUtils.isEmpty(preloadInfo.getTrackingId())) {
                publicLogger.error("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.", new Object[0]);
            } else {
                this.f18344a = new C3225ff(preloadInfo.getTrackingId(), new JSONObject(preloadInfo.getAdditionalParams()), true, z, X7.c);
            }
        }
    }
}
