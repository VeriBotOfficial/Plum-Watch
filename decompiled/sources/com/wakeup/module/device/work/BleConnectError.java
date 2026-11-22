package com.wakeup.module.device.work;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BleConnectErrorMapper.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/wakeup/module/device/work/BleConnectError;", "", "errorCode", "", "errorReason", "failStage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getErrorReason", "getFailStage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BleConnectError {
    private final String errorCode;
    private final String errorReason;
    private final String failStage;

    public static /* synthetic */ BleConnectError copy$default(BleConnectError bleConnectError, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bleConnectError.errorCode;
        }
        if ((i & 2) != 0) {
            str2 = bleConnectError.errorReason;
        }
        if ((i & 4) != 0) {
            str3 = bleConnectError.failStage;
        }
        return bleConnectError.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getErrorReason() {
        return this.errorReason;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFailStage() {
        return this.failStage;
    }

    public final BleConnectError copy(String errorCode, String errorReason, String failStage) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        Intrinsics.checkNotNullParameter(failStage, "failStage");
        return new BleConnectError(errorCode, errorReason, failStage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BleConnectError)) {
            return false;
        }
        BleConnectError bleConnectError = (BleConnectError) other;
        return Intrinsics.areEqual(this.errorCode, bleConnectError.errorCode) && Intrinsics.areEqual(this.errorReason, bleConnectError.errorReason) && Intrinsics.areEqual(this.failStage, bleConnectError.failStage);
    }

    public int hashCode() {
        return (((this.errorCode.hashCode() * 31) + this.errorReason.hashCode()) * 31) + this.failStage.hashCode();
    }

    public String toString() {
        return "BleConnectError(errorCode=" + this.errorCode + ", errorReason=" + this.errorReason + ", failStage=" + this.failStage + Separators.RPAREN;
    }

    public BleConnectError(String errorCode, String errorReason, String failStage) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        Intrinsics.checkNotNullParameter(failStage, "failStage");
        this.errorCode = errorCode;
        this.errorReason = errorReason;
        this.failStage = failStage;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorReason() {
        return this.errorReason;
    }

    public final String getFailStage() {
        return this.failStage;
    }
}
