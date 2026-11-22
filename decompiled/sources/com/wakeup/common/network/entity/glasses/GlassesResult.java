package com.wakeup.common.network.entity.glasses;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesResult.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/glasses/GlassesResult;", "", "code", "", "msg", "", "traceId", "data", "Lcom/wakeup/common/network/entity/glasses/GlassesResultBean;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/wakeup/common/network/entity/glasses/GlassesResultBean;)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "getTraceId", "getData", "()Lcom/wakeup/common/network/entity/glasses/GlassesResultBean;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GlassesResult {
    private final int code;
    private final GlassesResultBean data;
    private final String msg;
    private final String traceId;

    public static /* synthetic */ GlassesResult copy$default(GlassesResult glassesResult, int i, String str, String str2, GlassesResultBean glassesResultBean, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = glassesResult.code;
        }
        if ((i2 & 2) != 0) {
            str = glassesResult.msg;
        }
        if ((i2 & 4) != 0) {
            str2 = glassesResult.traceId;
        }
        if ((i2 & 8) != 0) {
            glassesResultBean = glassesResult.data;
        }
        return glassesResult.copy(i, str, str2, glassesResultBean);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    /* renamed from: component4, reason: from getter */
    public final GlassesResultBean getData() {
        return this.data;
    }

    public final GlassesResult copy(int code, String msg, String traceId, GlassesResultBean data) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(data, "data");
        return new GlassesResult(code, msg, traceId, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlassesResult)) {
            return false;
        }
        GlassesResult glassesResult = (GlassesResult) other;
        return this.code == glassesResult.code && Intrinsics.areEqual(this.msg, glassesResult.msg) && Intrinsics.areEqual(this.traceId, glassesResult.traceId) && Intrinsics.areEqual(this.data, glassesResult.data);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.code) * 31) + this.msg.hashCode()) * 31) + this.traceId.hashCode()) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "GlassesResult(code=" + this.code + ", msg=" + this.msg + ", traceId=" + this.traceId + ", data=" + this.data + Separators.RPAREN;
    }

    public GlassesResult(int i, String msg, String traceId, GlassesResultBean data) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(data, "data");
        this.code = i;
        this.msg = msg;
        this.traceId = traceId;
        this.data = data;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public final GlassesResultBean getData() {
        return this.data;
    }
}
