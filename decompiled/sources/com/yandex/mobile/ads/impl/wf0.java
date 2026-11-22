package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wf0 {

    /* renamed from: a, reason: collision with root package name */
    private final mc f17245a;

    public final lc a(com.monetization.ads.core.identifiers.ad.huawei.a serviceConnection) {
        Intrinsics.checkNotNullParameter(serviceConnection, "serviceConnection");
        try {
            OpenDeviceIdentifierService a2 = serviceConnection.a();
            if (a2 != null) {
                String oaid = a2.getOaid();
                boolean oaidTrackLimited = a2.getOaidTrackLimited();
                this.f17245a.getClass();
                if (oaid != null) {
                    return new lc(oaid, oaidTrackLimited);
                }
            }
            return null;
        } catch (Exception unused) {
            sp0.c(new Object[0]);
            return null;
        }
    }

    public /* synthetic */ wf0() {
        this(new mc());
    }

    public wf0(mc advertisingInfoCreator) {
        Intrinsics.checkNotNullParameter(advertisingInfoCreator, "advertisingInfoCreator");
        this.f17245a = advertisingInfoCreator;
    }
}
