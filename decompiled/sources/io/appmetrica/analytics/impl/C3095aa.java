package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.livekit.android.room.util.MediaConstraintKeys;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.aa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3095aa {

    /* renamed from: a, reason: collision with root package name */
    public final C3629vl f18181a = new C3629vl();
    public C3145ca b = new C3145ca();

    public final synchronized void a(C3145ca c3145ca) {
        this.b = c3145ca;
    }

    public final synchronized void a(List list, HashMap hashMap) {
        Boolean bool;
        String str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual((String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.b.f18212a) != null) {
                boolean booleanValue = bool.booleanValue();
                C3145ca c3145ca = this.b;
                IdentifierStatus identifierStatus = c3145ca.b;
                String str2 = c3145ca.c;
                if (booleanValue) {
                    str = MediaConstraintKeys.TRUE;
                } else {
                    if (booleanValue) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "false";
                }
                hashMap.put("appmetrica_lib_ssl_enabled", this.f18181a.a(new IdentifiersResult(str, identifierStatus, str2)));
            }
        }
    }
}
