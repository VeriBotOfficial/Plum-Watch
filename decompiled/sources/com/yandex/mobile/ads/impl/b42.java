package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.amap.location.support.bean.location.AmapLocation;
import java.util.HashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b42 {
    private static final HashSet c = new HashSet(CollectionsKt.listOf("gps"));
    private static final HashSet d = new HashSet(CollectionsKt.listOf((Object[]) new String[]{"gps", AmapLocation.PASSIVE_PROVIDER}));

    /* renamed from: a, reason: collision with root package name */
    private final LocationManager f15071a;
    private final tg1 b;

    public final Location a(String locationProvider) {
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        boolean a2 = this.b.a();
        boolean b = this.b.b();
        boolean contains = c.contains(locationProvider);
        if (!d.contains(locationProvider) ? !(contains || !a2) : !(contains || !a2 || !b)) {
            try {
                LocationManager locationManager = this.f15071a;
                if (locationManager != null) {
                    Location lastKnownLocation = locationManager.getLastKnownLocation(locationProvider);
                    sp0.a(locationProvider, lastKnownLocation);
                    return lastKnownLocation;
                }
            } catch (Throwable unused) {
                sp0.b(new Object[0]);
            }
        }
        return null;
    }

    public /* synthetic */ b42(Context context, LocationManager locationManager) {
        this(context, locationManager, new tg1(context));
    }

    public b42(Context context, LocationManager locationManager, tg1 permissionExtractor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissionExtractor, "permissionExtractor");
        this.f15071a = locationManager;
        this.b = permissionExtractor;
    }
}
