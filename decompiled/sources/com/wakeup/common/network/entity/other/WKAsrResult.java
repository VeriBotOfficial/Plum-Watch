package com.wakeup.common.network.entity.other;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WKAsrResult.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/wakeup/common/network/entity/other/WKAsrResult;", "", "status", "", "result", "", "message", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getStatus", "()I", "getResult", "()Ljava/lang/String;", "getMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WKAsrResult {
    private final String message;
    private final String result;
    private final int status;

    public static /* synthetic */ WKAsrResult copy$default(WKAsrResult wKAsrResult, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wKAsrResult.status;
        }
        if ((i2 & 2) != 0) {
            str = wKAsrResult.result;
        }
        if ((i2 & 4) != 0) {
            str2 = wKAsrResult.message;
        }
        return wKAsrResult.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final WKAsrResult copy(int status, String result, String message) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(message, "message");
        return new WKAsrResult(status, result, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WKAsrResult)) {
            return false;
        }
        WKAsrResult wKAsrResult = (WKAsrResult) other;
        return this.status == wKAsrResult.status && Intrinsics.areEqual(this.result, wKAsrResult.result) && Intrinsics.areEqual(this.message, wKAsrResult.message);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.status) * 31) + this.result.hashCode()) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "WKAsrResult(status=" + this.status + ", result=" + this.result + ", message=" + this.message + Separators.RPAREN;
    }

    public WKAsrResult(int i, String result, String message) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(message, "message");
        this.status = i;
        this.result = result;
        this.message = message;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getResult() {
        return this.result;
    }

    public final String getMessage() {
        return this.message;
    }
}
