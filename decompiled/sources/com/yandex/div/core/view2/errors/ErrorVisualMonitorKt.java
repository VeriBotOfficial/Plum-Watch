package com.yandex.div.core.view2.errors;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorVisualMonitor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"SHOW_LIMIT", "", "fullStackMessage", "", "", "getFullStackMessage", "(Ljava/lang/Throwable;)Ljava/lang/String;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ErrorVisualMonitorKt {
    private static final int SHOW_LIMIT = 25;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getFullStackMessage(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(th.getMessage());
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            sb.append('\n');
            sb.append(cause.getMessage());
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "result.toString()");
        return sb2;
    }
}
