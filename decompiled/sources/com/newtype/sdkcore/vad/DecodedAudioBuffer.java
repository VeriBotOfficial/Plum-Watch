package com.newtype.sdkcore.vad;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LiveKitVadAudioProcessor.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/newtype/sdkcore/vad/DecodedAudioBuffer;", "", "samples", "", "decodeType", "", "<init>", "([FLjava/lang/String;)V", "getSamples", "()[F", "getDecodeType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "newtypesdkcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
final /* data */ class DecodedAudioBuffer {
    private final String decodeType;
    private final float[] samples;

    public static /* synthetic */ DecodedAudioBuffer copy$default(DecodedAudioBuffer decodedAudioBuffer, float[] fArr, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            fArr = decodedAudioBuffer.samples;
        }
        if ((i & 2) != 0) {
            str = decodedAudioBuffer.decodeType;
        }
        return decodedAudioBuffer.copy(fArr, str);
    }

    /* renamed from: component1, reason: from getter */
    public final float[] getSamples() {
        return this.samples;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDecodeType() {
        return this.decodeType;
    }

    public final DecodedAudioBuffer copy(float[] samples, String decodeType) {
        Intrinsics.checkNotNullParameter(samples, "samples");
        Intrinsics.checkNotNullParameter(decodeType, "decodeType");
        return new DecodedAudioBuffer(samples, decodeType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DecodedAudioBuffer)) {
            return false;
        }
        DecodedAudioBuffer decodedAudioBuffer = (DecodedAudioBuffer) other;
        return Intrinsics.areEqual(this.samples, decodedAudioBuffer.samples) && Intrinsics.areEqual(this.decodeType, decodedAudioBuffer.decodeType);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.samples) * 31) + this.decodeType.hashCode();
    }

    public String toString() {
        return "DecodedAudioBuffer(samples=" + Arrays.toString(this.samples) + ", decodeType=" + this.decodeType + Separators.RPAREN;
    }

    public DecodedAudioBuffer(float[] samples, String decodeType) {
        Intrinsics.checkNotNullParameter(samples, "samples");
        Intrinsics.checkNotNullParameter(decodeType, "decodeType");
        this.samples = samples;
        this.decodeType = decodeType;
    }

    public final float[] getSamples() {
        return this.samples;
    }

    public final String getDecodeType() {
        return this.decodeType;
    }
}
