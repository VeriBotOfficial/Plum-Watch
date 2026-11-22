package io.livekit.android.webrtc;

import android.gov.nist.javax.sdp.fields.AttributeField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JainSdpUtils.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lio/livekit/android/webrtc/SdpFmtp;", "", "payload", "", "config", "", "(JLjava/lang/String;)V", "getConfig", "()Ljava/lang/String;", "getPayload", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toAttributeField", "Landroid/gov/nist/javax/sdp/fields/AttributeField;", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SdpFmtp {
    private final String config;
    private final long payload;

    public static /* synthetic */ SdpFmtp copy$default(SdpFmtp sdpFmtp, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sdpFmtp.payload;
        }
        if ((i & 2) != 0) {
            str = sdpFmtp.config;
        }
        return sdpFmtp.copy(j, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getPayload() {
        return this.payload;
    }

    /* renamed from: component2, reason: from getter */
    public final String getConfig() {
        return this.config;
    }

    public final SdpFmtp copy(long payload, String config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new SdpFmtp(payload, config);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdpFmtp)) {
            return false;
        }
        SdpFmtp sdpFmtp = (SdpFmtp) other;
        return this.payload == sdpFmtp.payload && Intrinsics.areEqual(this.config, sdpFmtp.config);
    }

    public int hashCode() {
        return (Long.hashCode(this.payload) * 31) + this.config.hashCode();
    }

    public String toString() {
        return "SdpFmtp(payload=" + this.payload + ", config=" + this.config + ')';
    }

    public SdpFmtp(long j, String config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.payload = j;
        this.config = config;
    }

    public final String getConfig() {
        return this.config;
    }

    public final long getPayload() {
        return this.payload;
    }

    public final AttributeField toAttributeField() {
        AttributeField attributeField = new AttributeField();
        attributeField.setName("fmtp");
        attributeField.setValue(this.payload + ' ' + this.config);
        return attributeField;
    }
}
