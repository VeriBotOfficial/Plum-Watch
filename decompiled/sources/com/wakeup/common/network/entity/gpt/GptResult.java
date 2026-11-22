package com.wakeup.common.network.entity.gpt;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GptResult.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/gpt/GptResult;", "", "code", "", "msg", "", "traceId", "data", "Lcom/wakeup/common/network/entity/gpt/GptResultData;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/wakeup/common/network/entity/gpt/GptResultData;)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "getTraceId", "getData", "()Lcom/wakeup/common/network/entity/gpt/GptResultData;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GptResult {
    private final int code;
    private final GptResultData data;
    private final String msg;
    private final String traceId;

    public static /* synthetic */ GptResult copy$default(GptResult gptResult, int i, String str, String str2, GptResultData gptResultData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = gptResult.code;
        }
        if ((i2 & 2) != 0) {
            str = gptResult.msg;
        }
        if ((i2 & 4) != 0) {
            str2 = gptResult.traceId;
        }
        if ((i2 & 8) != 0) {
            gptResultData = gptResult.data;
        }
        return gptResult.copy(i, str, str2, gptResultData);
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
    public final GptResultData getData() {
        return this.data;
    }

    public final GptResult copy(int code, String msg, String traceId, GptResultData data) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(data, "data");
        return new GptResult(code, msg, traceId, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GptResult)) {
            return false;
        }
        GptResult gptResult = (GptResult) other;
        return this.code == gptResult.code && Intrinsics.areEqual(this.msg, gptResult.msg) && Intrinsics.areEqual(this.traceId, gptResult.traceId) && Intrinsics.areEqual(this.data, gptResult.data);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.code) * 31) + this.msg.hashCode()) * 31) + this.traceId.hashCode()) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "GptResult(code=" + this.code + ", msg=" + this.msg + ", traceId=" + this.traceId + ", data=" + this.data + Separators.RPAREN;
    }

    public GptResult(int i, String msg, String traceId, GptResultData data) {
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

    public final GptResultData getData() {
        return this.data;
    }
}
