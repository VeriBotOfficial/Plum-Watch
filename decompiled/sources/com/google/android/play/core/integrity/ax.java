package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
/* loaded from: classes16.dex */
final class ax {

    /* renamed from: a, reason: collision with root package name */
    private static aw f10017a;

    static synchronized aw a(Context context) {
        aw awVar;
        synchronized (ax.class) {
            if (f10017a == null) {
                u uVar = new u(null);
                uVar.a(com.google.android.play.integrity.internal.ag.a(context));
                f10017a = uVar.b();
            }
            awVar = f10017a;
        }
        return awVar;
    }
}
