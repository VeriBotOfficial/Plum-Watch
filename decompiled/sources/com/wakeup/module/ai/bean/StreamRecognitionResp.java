package com.wakeup.module.ai.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StreamAsrResp.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/wakeup/module/ai/bean/StreamRecognitionResp;", "", "index", "", "asrText", "", "finalFlag", "", "<init>", "(ILjava/lang/String;Z)V", "getIndex", "()I", "getAsrText", "()Ljava/lang/String;", "getFinalFlag", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StreamRecognitionResp {
    private final String asrText;
    private final boolean finalFlag;
    private final int index;

    public StreamRecognitionResp() {
        this(0, null, false, 7, null);
    }

    public static /* synthetic */ StreamRecognitionResp copy$default(StreamRecognitionResp streamRecognitionResp, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = streamRecognitionResp.index;
        }
        if ((i2 & 2) != 0) {
            str = streamRecognitionResp.asrText;
        }
        if ((i2 & 4) != 0) {
            z = streamRecognitionResp.finalFlag;
        }
        return streamRecognitionResp.copy(i, str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAsrText() {
        return this.asrText;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getFinalFlag() {
        return this.finalFlag;
    }

    public final StreamRecognitionResp copy(int index, String asrText, boolean finalFlag) {
        return new StreamRecognitionResp(index, asrText, finalFlag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreamRecognitionResp)) {
            return false;
        }
        StreamRecognitionResp streamRecognitionResp = (StreamRecognitionResp) other;
        return this.index == streamRecognitionResp.index && Intrinsics.areEqual(this.asrText, streamRecognitionResp.asrText) && this.finalFlag == streamRecognitionResp.finalFlag;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.index) * 31;
        String str = this.asrText;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.finalFlag);
    }

    public String toString() {
        return "StreamRecognitionResp(index=" + this.index + ", asrText=" + this.asrText + ", finalFlag=" + this.finalFlag + Separators.RPAREN;
    }

    public StreamRecognitionResp(int i, String str, boolean z) {
        this.index = i;
        this.asrText = str;
        this.finalFlag = z;
    }

    public /* synthetic */ StreamRecognitionResp(int i, String str, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? false : z);
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getAsrText() {
        return this.asrText;
    }

    public final boolean getFinalFlag() {
        return this.finalFlag;
    }
}
