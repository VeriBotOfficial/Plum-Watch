package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* loaded from: classes6.dex */
public final class C5 {
    public final EnumC3597ue a(Context context) {
        SafePackageManager safePackageManager = AbstractC3622ve.f18551a;
        return (EnumC3597ue) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", EnumC3597ue.UNDEFINED, new C3572te());
    }
}
