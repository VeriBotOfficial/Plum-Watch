package com.wakeup.module.ai.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TTSBean.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\u008c\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0006HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b \u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001e¨\u00069"}, d2 = {"Lcom/wakeup/module/ai/bean/PureTTSCallbackData;", "", "ttsMeetingId", "", "traceId", "operationType", "", "msg", "error", "Lcom/wakeup/module/ai/bean/PureTTSError;", "closeCode", "closeReason", "audioFrameType", "audioTimestamp", "", "audioPayloadSize", "acceptedTextCount", "completedAudioCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/wakeup/module/ai/bean/PureTTSError;ILjava/lang/String;Ljava/lang/Integer;JIII)V", "getTtsMeetingId", "()Ljava/lang/String;", "getTraceId", "getOperationType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMsg", "getError", "()Lcom/wakeup/module/ai/bean/PureTTSError;", "getCloseCode", "()I", "getCloseReason", "getAudioFrameType", "getAudioTimestamp", "()J", "getAudioPayloadSize", "getAcceptedTextCount", "getCompletedAudioCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/wakeup/module/ai/bean/PureTTSError;ILjava/lang/String;Ljava/lang/Integer;JIII)Lcom/wakeup/module/ai/bean/PureTTSCallbackData;", "equals", "", "other", "hashCode", "toString", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PureTTSCallbackData {
    private final int acceptedTextCount;
    private final Integer audioFrameType;
    private final int audioPayloadSize;
    private final long audioTimestamp;
    private final int closeCode;
    private final String closeReason;
    private final int completedAudioCount;
    private final PureTTSError error;
    private final String msg;
    private final Integer operationType;
    private final String traceId;
    private final String ttsMeetingId;

    public PureTTSCallbackData() {
        this(null, null, null, null, null, 0, null, null, 0L, 0, 0, 0, 4095, null);
    }

    public static /* synthetic */ PureTTSCallbackData copy$default(PureTTSCallbackData pureTTSCallbackData, String str, String str2, Integer num, String str3, PureTTSError pureTTSError, int i, String str4, Integer num2, long j, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = pureTTSCallbackData.ttsMeetingId;
        }
        return pureTTSCallbackData.copy(str, (i5 & 2) != 0 ? pureTTSCallbackData.traceId : str2, (i5 & 4) != 0 ? pureTTSCallbackData.operationType : num, (i5 & 8) != 0 ? pureTTSCallbackData.msg : str3, (i5 & 16) != 0 ? pureTTSCallbackData.error : pureTTSError, (i5 & 32) != 0 ? pureTTSCallbackData.closeCode : i, (i5 & 64) != 0 ? pureTTSCallbackData.closeReason : str4, (i5 & 128) != 0 ? pureTTSCallbackData.audioFrameType : num2, (i5 & 256) != 0 ? pureTTSCallbackData.audioTimestamp : j, (i5 & 512) != 0 ? pureTTSCallbackData.audioPayloadSize : i2, (i5 & 1024) != 0 ? pureTTSCallbackData.acceptedTextCount : i3, (i5 & 2048) != 0 ? pureTTSCallbackData.completedAudioCount : i4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTtsMeetingId() {
        return this.ttsMeetingId;
    }

    /* renamed from: component10, reason: from getter */
    public final int getAudioPayloadSize() {
        return this.audioPayloadSize;
    }

    /* renamed from: component11, reason: from getter */
    public final int getAcceptedTextCount() {
        return this.acceptedTextCount;
    }

    /* renamed from: component12, reason: from getter */
    public final int getCompletedAudioCount() {
        return this.completedAudioCount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getOperationType() {
        return this.operationType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* renamed from: component5, reason: from getter */
    public final PureTTSError getError() {
        return this.error;
    }

    /* renamed from: component6, reason: from getter */
    public final int getCloseCode() {
        return this.closeCode;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCloseReason() {
        return this.closeReason;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getAudioFrameType() {
        return this.audioFrameType;
    }

    /* renamed from: component9, reason: from getter */
    public final long getAudioTimestamp() {
        return this.audioTimestamp;
    }

    public final PureTTSCallbackData copy(String ttsMeetingId, String traceId, Integer operationType, String msg, PureTTSError error, int closeCode, String closeReason, Integer audioFrameType, long audioTimestamp, int audioPayloadSize, int acceptedTextCount, int completedAudioCount) {
        Intrinsics.checkNotNullParameter(ttsMeetingId, "ttsMeetingId");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(closeReason, "closeReason");
        return new PureTTSCallbackData(ttsMeetingId, traceId, operationType, msg, error, closeCode, closeReason, audioFrameType, audioTimestamp, audioPayloadSize, acceptedTextCount, completedAudioCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PureTTSCallbackData)) {
            return false;
        }
        PureTTSCallbackData pureTTSCallbackData = (PureTTSCallbackData) other;
        return Intrinsics.areEqual(this.ttsMeetingId, pureTTSCallbackData.ttsMeetingId) && Intrinsics.areEqual(this.traceId, pureTTSCallbackData.traceId) && Intrinsics.areEqual(this.operationType, pureTTSCallbackData.operationType) && Intrinsics.areEqual(this.msg, pureTTSCallbackData.msg) && Intrinsics.areEqual(this.error, pureTTSCallbackData.error) && this.closeCode == pureTTSCallbackData.closeCode && Intrinsics.areEqual(this.closeReason, pureTTSCallbackData.closeReason) && Intrinsics.areEqual(this.audioFrameType, pureTTSCallbackData.audioFrameType) && this.audioTimestamp == pureTTSCallbackData.audioTimestamp && this.audioPayloadSize == pureTTSCallbackData.audioPayloadSize && this.acceptedTextCount == pureTTSCallbackData.acceptedTextCount && this.completedAudioCount == pureTTSCallbackData.completedAudioCount;
    }

    public int hashCode() {
        int hashCode = ((this.ttsMeetingId.hashCode() * 31) + this.traceId.hashCode()) * 31;
        Integer num = this.operationType;
        int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.msg.hashCode()) * 31;
        PureTTSError pureTTSError = this.error;
        int hashCode3 = (((((hashCode2 + (pureTTSError == null ? 0 : pureTTSError.hashCode())) * 31) + Integer.hashCode(this.closeCode)) * 31) + this.closeReason.hashCode()) * 31;
        Integer num2 = this.audioFrameType;
        return ((((((((hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31) + Long.hashCode(this.audioTimestamp)) * 31) + Integer.hashCode(this.audioPayloadSize)) * 31) + Integer.hashCode(this.acceptedTextCount)) * 31) + Integer.hashCode(this.completedAudioCount);
    }

    public String toString() {
        return "PureTTSCallbackData(ttsMeetingId=" + this.ttsMeetingId + ", traceId=" + this.traceId + ", operationType=" + this.operationType + ", msg=" + this.msg + ", error=" + this.error + ", closeCode=" + this.closeCode + ", closeReason=" + this.closeReason + ", audioFrameType=" + this.audioFrameType + ", audioTimestamp=" + this.audioTimestamp + ", audioPayloadSize=" + this.audioPayloadSize + ", acceptedTextCount=" + this.acceptedTextCount + ", completedAudioCount=" + this.completedAudioCount + Separators.RPAREN;
    }

    public PureTTSCallbackData(String ttsMeetingId, String traceId, Integer num, String msg, PureTTSError pureTTSError, int i, String closeReason, Integer num2, long j, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(ttsMeetingId, "ttsMeetingId");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(closeReason, "closeReason");
        this.ttsMeetingId = ttsMeetingId;
        this.traceId = traceId;
        this.operationType = num;
        this.msg = msg;
        this.error = pureTTSError;
        this.closeCode = i;
        this.closeReason = closeReason;
        this.audioFrameType = num2;
        this.audioTimestamp = j;
        this.audioPayloadSize = i2;
        this.acceptedTextCount = i3;
        this.completedAudioCount = i4;
    }

    public /* synthetic */ PureTTSCallbackData(String str, String str2, Integer num, String str3, PureTTSError pureTTSError, int i, String str4, Integer num2, long j, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? null : num, (i5 & 8) != 0 ? "" : str3, (i5 & 16) != 0 ? null : pureTTSError, (i5 & 32) != 0 ? 0 : i, (i5 & 64) == 0 ? str4 : "", (i5 & 128) == 0 ? num2 : null, (i5 & 256) != 0 ? 0L : j, (i5 & 512) != 0 ? 0 : i2, (i5 & 1024) != 0 ? 0 : i3, (i5 & 2048) != 0 ? 0 : i4);
    }

    public final String getTtsMeetingId() {
        return this.ttsMeetingId;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public final Integer getOperationType() {
        return this.operationType;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final PureTTSError getError() {
        return this.error;
    }

    public final int getCloseCode() {
        return this.closeCode;
    }

    public final String getCloseReason() {
        return this.closeReason;
    }

    public final Integer getAudioFrameType() {
        return this.audioFrameType;
    }

    public final long getAudioTimestamp() {
        return this.audioTimestamp;
    }

    public final int getAudioPayloadSize() {
        return this.audioPayloadSize;
    }

    public final int getAcceptedTextCount() {
        return this.acceptedTextCount;
    }

    public final int getCompletedAudioCount() {
        return this.completedAudioCount;
    }
}
