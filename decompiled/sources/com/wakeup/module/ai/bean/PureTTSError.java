package com.wakeup.module.ai.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TTSBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J8\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/wakeup/module/ai/bean/PureTTSError;", "", "code", "", "traceId", "", "msg", "operationType", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getCode", "()I", "getTraceId", "()Ljava/lang/String;", "getMsg", "getOperationType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/wakeup/module/ai/bean/PureTTSError;", "equals", "", "other", "hashCode", "toString", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PureTTSError {
    private final int code;
    private final String msg;
    private final Integer operationType;
    private final String traceId;

    public static /* synthetic */ PureTTSError copy$default(PureTTSError pureTTSError, int i, String str, String str2, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pureTTSError.code;
        }
        if ((i2 & 2) != 0) {
            str = pureTTSError.traceId;
        }
        if ((i2 & 4) != 0) {
            str2 = pureTTSError.msg;
        }
        if ((i2 & 8) != 0) {
            num = pureTTSError.operationType;
        }
        return pureTTSError.copy(i, str, str2, num);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getOperationType() {
        return this.operationType;
    }

    public final PureTTSError copy(int code, String traceId, String msg, Integer operationType) {
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(msg, "msg");
        return new PureTTSError(code, traceId, msg, operationType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PureTTSError)) {
            return false;
        }
        PureTTSError pureTTSError = (PureTTSError) other;
        return this.code == pureTTSError.code && Intrinsics.areEqual(this.traceId, pureTTSError.traceId) && Intrinsics.areEqual(this.msg, pureTTSError.msg) && Intrinsics.areEqual(this.operationType, pureTTSError.operationType);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.code) * 31) + this.traceId.hashCode()) * 31) + this.msg.hashCode()) * 31;
        Integer num = this.operationType;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "PureTTSError(code=" + this.code + ", traceId=" + this.traceId + ", msg=" + this.msg + ", operationType=" + this.operationType + Separators.RPAREN;
    }

    public PureTTSError(int i, String traceId, String msg, Integer num) {
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.code = i;
        this.traceId = traceId;
        this.msg = msg;
        this.operationType = num;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final Integer getOperationType() {
        return this.operationType;
    }
}
