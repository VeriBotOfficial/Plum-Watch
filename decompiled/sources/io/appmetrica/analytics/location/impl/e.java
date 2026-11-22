package io.appmetrica.analytics.location.impl;

import com.hjq.permissions.Permission;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;

/* loaded from: classes6.dex */
public final class e implements s {
    @Override // io.appmetrica.analytics.location.impl.s
    public final PermissionResolutionStrategy a(PermissionExtractor permissionExtractor) {
        return new SinglePermissionStrategy(permissionExtractor, Permission.ACCESS_FINE_LOCATION);
    }
}
