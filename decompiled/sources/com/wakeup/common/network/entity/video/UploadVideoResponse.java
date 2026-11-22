package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UploadVideoResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/wakeup/common/network/entity/video/UploadVideoResponse;", "", "traceId", "", "status", "", "<init>", "(Ljava/lang/String;I)V", "getTraceId", "()Ljava/lang/String;", "setTraceId", "(Ljava/lang/String;)V", "getStatus", "()I", "setStatus", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UploadVideoResponse {
    private int status;
    private String traceId;

    public static /* synthetic */ UploadVideoResponse copy$default(UploadVideoResponse uploadVideoResponse, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = uploadVideoResponse.traceId;
        }
        if ((i2 & 2) != 0) {
            i = uploadVideoResponse.status;
        }
        return uploadVideoResponse.copy(str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public final UploadVideoResponse copy(String traceId, int status) {
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        return new UploadVideoResponse(traceId, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadVideoResponse)) {
            return false;
        }
        UploadVideoResponse uploadVideoResponse = (UploadVideoResponse) other;
        return Intrinsics.areEqual(this.traceId, uploadVideoResponse.traceId) && this.status == uploadVideoResponse.status;
    }

    public int hashCode() {
        return (this.traceId.hashCode() * 31) + Integer.hashCode(this.status);
    }

    public String toString() {
        return "UploadVideoResponse(traceId=" + this.traceId + ", status=" + this.status + Separators.RPAREN;
    }

    public UploadVideoResponse(String traceId, int i) {
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        this.traceId = traceId;
        this.status = i;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public final void setTraceId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.traceId = str;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void setStatus(int i) {
        this.status = i;
    }
}
