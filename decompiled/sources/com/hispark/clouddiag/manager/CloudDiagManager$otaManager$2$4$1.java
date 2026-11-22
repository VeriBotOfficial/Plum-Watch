package com.hispark.clouddiag.manager;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CloudDiagManager.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class CloudDiagManager$otaManager$2$4$1 extends FunctionReferenceImpl implements Function1<String, String> {
    CloudDiagManager$otaManager$2$4$1(Object obj) {
        super(1, obj, DeviceIdentityIndex.class, "resolve", "resolve(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((DeviceIdentityIndex) this.receiver).resolve(p0);
    }
}
