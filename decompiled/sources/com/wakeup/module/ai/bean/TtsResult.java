package com.wakeup.module.ai.bean;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TSTBean.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/wakeup/module/ai/bean/TtsResult;", "", "audio", "", "<init>", "([B)V", "getAudio", "()[B", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TtsResult {
    private final byte[] audio;

    public static /* synthetic */ TtsResult copy$default(TtsResult ttsResult, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = ttsResult.audio;
        }
        return ttsResult.copy(bArr);
    }

    /* renamed from: component1, reason: from getter */
    public final byte[] getAudio() {
        return this.audio;
    }

    public final TtsResult copy(byte[] audio) {
        return new TtsResult(audio);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TtsResult) && Intrinsics.areEqual(this.audio, ((TtsResult) other).audio);
    }

    public int hashCode() {
        byte[] bArr = this.audio;
        if (bArr == null) {
            return 0;
        }
        return Arrays.hashCode(bArr);
    }

    public String toString() {
        return "TtsResult(audio=" + Arrays.toString(this.audio) + Separators.RPAREN;
    }

    public TtsResult(byte[] bArr) {
        this.audio = bArr;
    }

    public final byte[] getAudio() {
        return this.audio;
    }
}
