package io.livekit.android.webrtc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JainSdpUtils.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lio/livekit/android/webrtc/SdpRtp;", "", "payload", "", "codec", "", "rate", "encoding", "(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getCodec", "()Ljava/lang/String;", "getEncoding", "getPayload", "()J", "getRate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lio/livekit/android/webrtc/SdpRtp;", "equals", "", "other", "hashCode", "", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SdpRtp {
    private final String codec;
    private final String encoding;
    private final long payload;
    private final Long rate;

    public static /* synthetic */ SdpRtp copy$default(SdpRtp sdpRtp, long j, String str, Long l, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sdpRtp.payload;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = sdpRtp.codec;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            l = sdpRtp.rate;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            str2 = sdpRtp.encoding;
        }
        return sdpRtp.copy(j2, str3, l2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getPayload() {
        return this.payload;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCodec() {
        return this.codec;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getRate() {
        return this.rate;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEncoding() {
        return this.encoding;
    }

    public final SdpRtp copy(long payload, String codec, Long rate, String encoding) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        return new SdpRtp(payload, codec, rate, encoding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdpRtp)) {
            return false;
        }
        SdpRtp sdpRtp = (SdpRtp) other;
        return this.payload == sdpRtp.payload && Intrinsics.areEqual(this.codec, sdpRtp.codec) && Intrinsics.areEqual(this.rate, sdpRtp.rate) && Intrinsics.areEqual(this.encoding, sdpRtp.encoding);
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.payload) * 31) + this.codec.hashCode()) * 31;
        Long l = this.rate;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.encoding;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "SdpRtp(payload=" + this.payload + ", codec=" + this.codec + ", rate=" + this.rate + ", encoding=" + this.encoding + ')';
    }

    public SdpRtp(long j, String codec, Long l, String str) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.payload = j;
        this.codec = codec;
        this.rate = l;
        this.encoding = str;
    }

    public final String getCodec() {
        return this.codec;
    }

    public final String getEncoding() {
        return this.encoding;
    }

    public final long getPayload() {
        return this.payload;
    }

    public final Long getRate() {
        return this.rate;
    }
}
