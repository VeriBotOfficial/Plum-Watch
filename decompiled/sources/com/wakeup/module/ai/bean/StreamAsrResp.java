package com.wakeup.module.ai.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StreamAsrResp.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003JH\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/wakeup/module/ai/bean/StreamAsrResp;", "", "code", "", "msg", "", "traceId", "operationType", "data", "Lcom/wakeup/module/ai/bean/StreamRecognitionResp;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/wakeup/module/ai/bean/StreamRecognitionResp;)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "getTraceId", "getOperationType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getData", "()Lcom/wakeup/module/ai/bean/StreamRecognitionResp;", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/wakeup/module/ai/bean/StreamRecognitionResp;)Lcom/wakeup/module/ai/bean/StreamAsrResp;", "equals", "", "other", "hashCode", "toString", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StreamAsrResp {
    private final int code;
    private final StreamRecognitionResp data;
    private final String msg;
    private final Integer operationType;
    private final String traceId;

    public StreamAsrResp() {
        this(0, null, null, null, null, 31, null);
    }

    public static /* synthetic */ StreamAsrResp copy$default(StreamAsrResp streamAsrResp, int i, String str, String str2, Integer num, StreamRecognitionResp streamRecognitionResp, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = streamAsrResp.code;
        }
        if ((i2 & 2) != 0) {
            str = streamAsrResp.msg;
        }
        if ((i2 & 4) != 0) {
            str2 = streamAsrResp.traceId;
        }
        if ((i2 & 8) != 0) {
            num = streamAsrResp.operationType;
        }
        if ((i2 & 16) != 0) {
            streamRecognitionResp = streamAsrResp.data;
        }
        StreamRecognitionResp streamRecognitionResp2 = streamRecognitionResp;
        String str3 = str2;
        return streamAsrResp.copy(i, str, str3, num, streamRecognitionResp2);
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
    public final Integer getOperationType() {
        return this.operationType;
    }

    /* renamed from: component5, reason: from getter */
    public final StreamRecognitionResp getData() {
        return this.data;
    }

    public final StreamAsrResp copy(int code, String msg, String traceId, Integer operationType, StreamRecognitionResp data) {
        return new StreamAsrResp(code, msg, traceId, operationType, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreamAsrResp)) {
            return false;
        }
        StreamAsrResp streamAsrResp = (StreamAsrResp) other;
        return this.code == streamAsrResp.code && Intrinsics.areEqual(this.msg, streamAsrResp.msg) && Intrinsics.areEqual(this.traceId, streamAsrResp.traceId) && Intrinsics.areEqual(this.operationType, streamAsrResp.operationType) && Intrinsics.areEqual(this.data, streamAsrResp.data);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.code) * 31;
        String str = this.msg;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.traceId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.operationType;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        StreamRecognitionResp streamRecognitionResp = this.data;
        return hashCode4 + (streamRecognitionResp != null ? streamRecognitionResp.hashCode() : 0);
    }

    public String toString() {
        return "StreamAsrResp(code=" + this.code + ", msg=" + this.msg + ", traceId=" + this.traceId + ", operationType=" + this.operationType + ", data=" + this.data + Separators.RPAREN;
    }

    public StreamAsrResp(int i, String str, String str2, Integer num, StreamRecognitionResp streamRecognitionResp) {
        this.code = i;
        this.msg = str;
        this.traceId = str2;
        this.operationType = num;
        this.data = streamRecognitionResp;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ StreamAsrResp(int r2, java.lang.String r3, java.lang.String r4, java.lang.Integer r5, com.wakeup.module.ai.bean.StreamRecognitionResp r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            r2 = 200(0xc8, float:2.8E-43)
        L6:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            r4 = r0
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L16
            r5 = r0
        L16:
            r7 = r7 & 16
            if (r7 == 0) goto L21
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L27
        L21:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L27:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.ai.bean.StreamAsrResp.<init>(int, java.lang.String, java.lang.String, java.lang.Integer, com.wakeup.module.ai.bean.StreamRecognitionResp, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
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

    public final Integer getOperationType() {
        return this.operationType;
    }

    public final StreamRecognitionResp getData() {
        return this.data;
    }
}
