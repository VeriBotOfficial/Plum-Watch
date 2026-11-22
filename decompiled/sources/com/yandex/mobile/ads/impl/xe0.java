package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.vivo.push.PushClientConstants;
import com.yandex.mobile.ads.impl.jo1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xe0 {

    /* renamed from: a, reason: collision with root package name */
    private final jo1 f17330a;
    private final mc b;
    private final Context c;

    public /* synthetic */ xe0(Context context) {
        this(context, new jo1(), new mc());
    }

    public xe0(Context context, jo1 reflectHelper, mc advertisingInfoCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reflectHelper, "reflectHelper");
        Intrinsics.checkNotNullParameter(advertisingInfoCreator, "advertisingInfoCreator");
        this.f17330a = reflectHelper;
        this.b = advertisingInfoCreator;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.c = applicationContext;
    }

    public final lc a() {
        Class<?> cls;
        try {
            this.f17330a.getClass();
            Intrinsics.checkNotNullParameter("com.google.android.gms.ads.identifier.AdvertisingIdClient", PushClientConstants.TAG_CLASS_NAME);
            try {
                cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            } catch (Throwable unused) {
                sp0.c("com.google.android.gms.ads.identifier.AdvertisingIdClient");
                cls = null;
            }
            if (cls == null) {
                return null;
            }
            jo1 jo1Var = this.f17330a;
            Object[] objArr = {this.c};
            jo1Var.getClass();
            Object a2 = jo1.a(cls, "getAdvertisingIdInfo", objArr);
            if (a2 == null) {
                return null;
            }
            String str = (String) jo1.a.a(a2, "getId", new Object[0]);
            Boolean bool = (Boolean) jo1.a.a(a2, "isLimitAdTrackingEnabled", new Object[0]);
            this.b.getClass();
            if (bool == null || str == null) {
                return null;
            }
            return new lc(str, bool.booleanValue());
        } catch (Throwable unused2) {
            sp0.c(new Object[0]);
            return null;
        }
    }
}
