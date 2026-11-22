package com.xmly.businesssdk.network.bean;

import com.xmly.businesssdk.config.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UploadRecordResult.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/xmly/businesssdk/network/bean/UploadRecordResult;", "", "code", "", "message", "", "(ILjava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UploadRecordResult {
    private final int code;
    private final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public UploadRecordResult() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public UploadRecordResult(int i, String str) {
        this.code = i;
        this.message = str;
    }

    public static /* synthetic */ UploadRecordResult copy$default(UploadRecordResult uploadRecordResult, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = uploadRecordResult.code;
        }
        if ((i2 & 2) != 0) {
            str = uploadRecordResult.message;
        }
        return uploadRecordResult.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final UploadRecordResult copy(int code, String message) {
        return new UploadRecordResult(code, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadRecordResult)) {
            return false;
        }
        UploadRecordResult uploadRecordResult = (UploadRecordResult) other;
        return this.code == uploadRecordResult.code && Intrinsics.areEqual(this.message, uploadRecordResult.message);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.code) * 31;
        String str = this.message;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return c.a(com.xmly.businesssdk.c.a("UploadRecordResult(code=").append(this.code).append(", message="), this.message, ')');
    }

    public /* synthetic */ UploadRecordResult(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }
}
