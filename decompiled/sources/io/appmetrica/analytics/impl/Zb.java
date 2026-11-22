package io.appmetrica.analytics.impl;

import com.hjq.permissions.Permission;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes6.dex */
public final class Zb implements PermissionStrategy, LocationControllerObserver {
    public static final Yb b = new Yb();
    public static final List c = CollectionsKt.listOf((Object[]) new String[]{Permission.ACCESS_FINE_LOCATION, Permission.ACCESS_COARSE_LOCATION});

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f18167a;

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(String str) {
        if (c.contains(str)) {
            return !this.f18167a;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.f18167a = true;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.f18167a = false;
    }

    public final String toString() {
        return "LocationFlagStrategy(enabled=" + this.f18167a + ", locationPermissions=" + c + ')';
    }
}
