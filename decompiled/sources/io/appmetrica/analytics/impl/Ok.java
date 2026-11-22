package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import com.hjq.permissions.Permission;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* loaded from: classes6.dex */
public final class Ok implements FunctionWithThrowable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Pk f18002a;

    public Ok(Pk pk) {
        this.f18002a = pk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        Pk pk = this.f18002a;
        if (pk.b.hasPermission(pk.f18016a, Permission.READ_PHONE_STATE)) {
            return Boolean.valueOf(telephonyManager.isNetworkRoaming());
        }
        return null;
    }
}
