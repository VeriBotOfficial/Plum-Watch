package com.yandex.mobile.ads.impl;

import android.os.IBinder;
import android.os.IInterface;
import com.monetization.ads.core.identifiers.ad.gms.service.GmsServiceAdvertisingInfoReader;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class af0 {

    /* renamed from: a, reason: collision with root package name */
    private final mc f15003a;
    private final ve0 b;

    public final lc a(we0 connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        try {
            IBinder binder = connection.a();
            if (binder == null) {
                return null;
            }
            this.b.getClass();
            Intrinsics.checkNotNullParameter(binder, "binder");
            IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            rc rcVar = queryLocalInterface instanceof rc ? (rc) queryLocalInterface : null;
            if (rcVar == null) {
                rcVar = new GmsServiceAdvertisingInfoReader(binder);
            }
            String readAdvertisingId = rcVar.readAdvertisingId();
            Boolean readAdTrackingLimited = rcVar.readAdTrackingLimited();
            this.f15003a.getClass();
            lc lcVar = (readAdTrackingLimited == null || readAdvertisingId == null) ? null : new lc(readAdvertisingId, readAdTrackingLimited.booleanValue());
            sp0.a(new Object[0]);
            return lcVar;
        } catch (InterruptedException unused) {
            sp0.c(new Object[0]);
            return null;
        }
    }

    public /* synthetic */ af0() {
        this(new mc(), new ve0());
    }

    public af0(mc advertisingInfoCreator, ve0 gmsAdvertisingInfoReaderProvider) {
        Intrinsics.checkNotNullParameter(advertisingInfoCreator, "advertisingInfoCreator");
        Intrinsics.checkNotNullParameter(gmsAdvertisingInfoReaderProvider, "gmsAdvertisingInfoReaderProvider");
        this.f15003a = advertisingInfoCreator;
        this.b = gmsAdvertisingInfoReaderProvider;
    }
}
