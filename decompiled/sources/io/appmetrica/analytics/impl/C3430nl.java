package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.nl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3430nl extends HashMap {
    public C3430nl() {
        put(EnumC3380ll.UNKNOWN, StartupParamsCallback.Reason.UNKNOWN);
        put(EnumC3380ll.NETWORK, StartupParamsCallback.Reason.NETWORK);
        put(EnumC3380ll.PARSE, StartupParamsCallback.Reason.INVALID_RESPONSE);
    }
}
