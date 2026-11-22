package com.wakeup.module.ai.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ASRBean.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003Jn\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0006HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001d¨\u00060"}, d2 = {"Lcom/wakeup/module/ai/bean/SpeechIdentifyCallbackData;", "", "meetingId", "", "traceId", "operationType", "", "msg", "result", "Lcom/wakeup/module/ai/bean/BilingualResult;", "error", "Lcom/wakeup/module/ai/bean/SpeechIdentifyError;", "closeCode", "closeReason", "dataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/wakeup/module/ai/bean/BilingualResult;Lcom/wakeup/module/ai/bean/SpeechIdentifyError;ILjava/lang/String;I)V", "getMeetingId", "()Ljava/lang/String;", "getTraceId", "getOperationType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMsg", "getResult", "()Lcom/wakeup/module/ai/bean/BilingualResult;", "getError", "()Lcom/wakeup/module/ai/bean/SpeechIdentifyError;", "getCloseCode", "()I", "getCloseReason", "getDataType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/wakeup/module/ai/bean/BilingualResult;Lcom/wakeup/module/ai/bean/SpeechIdentifyError;ILjava/lang/String;I)Lcom/wakeup/module/ai/bean/SpeechIdentifyCallbackData;", "equals", "", "other", "hashCode", "toString", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SpeechIdentifyCallbackData {
    private final int closeCode;
    private final String closeReason;
    private final int dataType;
    private final SpeechIdentifyError error;
    private final String meetingId;
    private final String msg;
    private final Integer operationType;
    private final BilingualResult result;
    private final String traceId;

    public SpeechIdentifyCallbackData() {
        this(null, null, null, null, null, null, 0, null, 0, 511, null);
    }

    public static /* synthetic */ SpeechIdentifyCallbackData copy$default(SpeechIdentifyCallbackData speechIdentifyCallbackData, String str, String str2, Integer num, String str3, BilingualResult bilingualResult, SpeechIdentifyError speechIdentifyError, int i, String str4, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = speechIdentifyCallbackData.meetingId;
        }
        if ((i3 & 2) != 0) {
            str2 = speechIdentifyCallbackData.traceId;
        }
        if ((i3 & 4) != 0) {
            num = speechIdentifyCallbackData.operationType;
        }
        if ((i3 & 8) != 0) {
            str3 = speechIdentifyCallbackData.msg;
        }
        if ((i3 & 16) != 0) {
            bilingualResult = speechIdentifyCallbackData.result;
        }
        if ((i3 & 32) != 0) {
            speechIdentifyError = speechIdentifyCallbackData.error;
        }
        if ((i3 & 64) != 0) {
            i = speechIdentifyCallbackData.closeCode;
        }
        if ((i3 & 128) != 0) {
            str4 = speechIdentifyCallbackData.closeReason;
        }
        if ((i3 & 256) != 0) {
            i2 = speechIdentifyCallbackData.dataType;
        }
        String str5 = str4;
        int i4 = i2;
        SpeechIdentifyError speechIdentifyError2 = speechIdentifyError;
        int i5 = i;
        BilingualResult bilingualResult2 = bilingualResult;
        Integer num2 = num;
        return speechIdentifyCallbackData.copy(str, str2, num2, str3, bilingualResult2, speechIdentifyError2, i5, str5, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMeetingId() {
        return this.meetingId;
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
    public final BilingualResult getResult() {
        return this.result;
    }

    /* renamed from: component6, reason: from getter */
    public final SpeechIdentifyError getError() {
        return this.error;
    }

    /* renamed from: component7, reason: from getter */
    public final int getCloseCode() {
        return this.closeCode;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCloseReason() {
        return this.closeReason;
    }

    /* renamed from: component9, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    public final SpeechIdentifyCallbackData copy(String meetingId, String traceId, Integer operationType, String msg, BilingualResult result, SpeechIdentifyError error, int closeCode, String closeReason, int dataType) {
        Intrinsics.checkNotNullParameter(meetingId, "meetingId");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(closeReason, "closeReason");
        return new SpeechIdentifyCallbackData(meetingId, traceId, operationType, msg, result, error, closeCode, closeReason, dataType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpeechIdentifyCallbackData)) {
            return false;
        }
        SpeechIdentifyCallbackData speechIdentifyCallbackData = (SpeechIdentifyCallbackData) other;
        return Intrinsics.areEqual(this.meetingId, speechIdentifyCallbackData.meetingId) && Intrinsics.areEqual(this.traceId, speechIdentifyCallbackData.traceId) && Intrinsics.areEqual(this.operationType, speechIdentifyCallbackData.operationType) && Intrinsics.areEqual(this.msg, speechIdentifyCallbackData.msg) && Intrinsics.areEqual(this.result, speechIdentifyCallbackData.result) && Intrinsics.areEqual(this.error, speechIdentifyCallbackData.error) && this.closeCode == speechIdentifyCallbackData.closeCode && Intrinsics.areEqual(this.closeReason, speechIdentifyCallbackData.closeReason) && this.dataType == speechIdentifyCallbackData.dataType;
    }

    public int hashCode() {
        int hashCode = ((this.meetingId.hashCode() * 31) + this.traceId.hashCode()) * 31;
        Integer num = this.operationType;
        int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.msg.hashCode()) * 31;
        BilingualResult bilingualResult = this.result;
        int hashCode3 = (hashCode2 + (bilingualResult == null ? 0 : bilingualResult.hashCode())) * 31;
        SpeechIdentifyError speechIdentifyError = this.error;
        return ((((((hashCode3 + (speechIdentifyError != null ? speechIdentifyError.hashCode() : 0)) * 31) + Integer.hashCode(this.closeCode)) * 31) + this.closeReason.hashCode()) * 31) + Integer.hashCode(this.dataType);
    }

    public String toString() {
        return "SpeechIdentifyCallbackData(meetingId=" + this.meetingId + ", traceId=" + this.traceId + ", operationType=" + this.operationType + ", msg=" + this.msg + ", result=" + this.result + ", error=" + this.error + ", closeCode=" + this.closeCode + ", closeReason=" + this.closeReason + ", dataType=" + this.dataType + Separators.RPAREN;
    }

    public SpeechIdentifyCallbackData(String meetingId, String traceId, Integer num, String msg, BilingualResult bilingualResult, SpeechIdentifyError speechIdentifyError, int i, String closeReason, int i2) {
        Intrinsics.checkNotNullParameter(meetingId, "meetingId");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(closeReason, "closeReason");
        this.meetingId = meetingId;
        this.traceId = traceId;
        this.operationType = num;
        this.msg = msg;
        this.result = bilingualResult;
        this.error = speechIdentifyError;
        this.closeCode = i;
        this.closeReason = closeReason;
        this.dataType = i2;
    }

    public /* synthetic */ SpeechIdentifyCallbackData(String str, String str2, Integer num, String str3, BilingualResult bilingualResult, SpeechIdentifyError speechIdentifyError, int i, String str4, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? null : bilingualResult, (i3 & 32) != 0 ? null : speechIdentifyError, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? "" : str4, (i3 & 256) != 0 ? 4 : i2);
    }

    public final String getMeetingId() {
        return this.meetingId;
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

    public final BilingualResult getResult() {
        return this.result;
    }

    public final SpeechIdentifyError getError() {
        return this.error;
    }

    public final int getCloseCode() {
        return this.closeCode;
    }

    public final String getCloseReason() {
        return this.closeReason;
    }

    public final int getDataType() {
        return this.dataType;
    }
}
