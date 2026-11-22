package io.livekit.android.webrtc;

import android.gov.nist.javax.sdp.fields.AttributeField;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JainSdpUtils.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lio/livekit/android/webrtc/SdpExt;", "", "value", "", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "", "encryptUri", "uri", "config", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConfig", "()Ljava/lang/String;", "getDirection", "getEncryptUri", "getUri", "getValue", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toAttributeField", "Landroid/gov/nist/javax/sdp/fields/AttributeField;", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SdpExt {
    private final String config;
    private final String direction;
    private final String encryptUri;
    private final String uri;
    private final long value;

    public static /* synthetic */ SdpExt copy$default(SdpExt sdpExt, long j, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sdpExt.value;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = sdpExt.direction;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = sdpExt.encryptUri;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = sdpExt.uri;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = sdpExt.config;
        }
        return sdpExt.copy(j2, str5, str6, str7, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEncryptUri() {
        return this.encryptUri;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* renamed from: component5, reason: from getter */
    public final String getConfig() {
        return this.config;
    }

    public final SdpExt copy(long value, String direction, String encryptUri, String uri, String config) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return new SdpExt(value, direction, encryptUri, uri, config);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdpExt)) {
            return false;
        }
        SdpExt sdpExt = (SdpExt) other;
        return this.value == sdpExt.value && Intrinsics.areEqual(this.direction, sdpExt.direction) && Intrinsics.areEqual(this.encryptUri, sdpExt.encryptUri) && Intrinsics.areEqual(this.uri, sdpExt.uri) && Intrinsics.areEqual(this.config, sdpExt.config);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.value) * 31;
        String str = this.direction;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.encryptUri;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.uri.hashCode()) * 31;
        String str3 = this.config;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SdpExt(value=" + this.value + ", direction=" + this.direction + ", encryptUri=" + this.encryptUri + ", uri=" + this.uri + ", config=" + this.config + ')';
    }

    public SdpExt(long j, String str, String str2, String uri, String str3) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.value = j;
        this.direction = str;
        this.encryptUri = str2;
        this.uri = uri;
        this.config = str3;
    }

    public final String getConfig() {
        return this.config;
    }

    public final String getDirection() {
        return this.direction;
    }

    public final String getEncryptUri() {
        return this.encryptUri;
    }

    public final String getUri() {
        return this.uri;
    }

    public final long getValue() {
        return this.value;
    }

    public final AttributeField toAttributeField() {
        AttributeField attributeField = new AttributeField();
        attributeField.setName("extmap");
        StringBuilder sb = new StringBuilder();
        sb.append(this.value);
        if (this.direction != null) {
            sb.append(" " + this.direction);
        }
        if (this.encryptUri != null) {
            sb.append(" " + this.encryptUri);
        }
        sb.append(" " + this.uri);
        if (this.config != null) {
            sb.append(" " + this.config);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        attributeField.setValue(sb2);
        return attributeField;
    }
}
