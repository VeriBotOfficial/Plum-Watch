package com.yandex.div.core.view2.errors;

import android.os.TransactionTooLargeException;
import kotlin.Metadata;

/* compiled from: ErrorView.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"causedByTransactionTooLargeException", "", "", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ErrorViewKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean causedByTransactionTooLargeException(Throwable th) {
        Throwable cause;
        return (th instanceof TransactionTooLargeException) || ((cause = th.getCause()) != null && causedByTransactionTooLargeException(cause));
    }
}
