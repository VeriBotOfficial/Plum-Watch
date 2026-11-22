package com.wakeup.howear.rn.utils;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PromiseExtensions.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"resolveOK", "", "Lcom/facebook/react/bridge/Promise;", "feature-rn_overseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PromiseExtensionsKt {
    public static final void resolveOK(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "<this>");
        promise.resolve(Arguments.createMap());
    }
}
