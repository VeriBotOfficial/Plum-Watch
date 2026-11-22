package com.wakeup.howear.view.home.connectivity;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.javax.sip.header.SubscriptionStateHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OfflineConfirmationGate.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\r"}, d2 = {"Lcom/wakeup/howear/view/home/connectivity/OfflineConfirmationGate;", "T", "", "<init>", "()V", SubscriptionStateHeader.PENDING, "", "candidate", "Ljava/lang/Object;", "begin", "(Ljava/lang/Object;)Z", SDPKeywords.CLEAR, "", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OfflineConfirmationGate<T> {
    private T candidate;
    private boolean pending;

    public final boolean begin(T candidate) {
        if (this.pending && Intrinsics.areEqual(this.candidate, candidate)) {
            return false;
        }
        this.pending = true;
        this.candidate = candidate;
        return true;
    }

    public final void clear() {
        this.pending = false;
        this.candidate = null;
    }
}
