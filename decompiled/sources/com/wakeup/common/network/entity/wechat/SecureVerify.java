package com.wakeup.common.network.entity.wechat;

import android.gov.nist.core.Separators;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GeWechatResult.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\nHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/wakeup/common/network/entity/wechat/SecureVerify;", "", "_created_at", "", "callback_url", "ccd", "ua", "url", CommonUrlParts.UUID, "version", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "get_created_at", "()Ljava/lang/String;", "getCallback_url", "getCcd", "getUa", "setUa", "(Ljava/lang/String;)V", "getUrl", "getUuid", MobileAdsBridge.versionMethodName, "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SecureVerify {
    private final String _created_at;
    private final String callback_url;
    private final String ccd;
    private String ua;
    private final String url;
    private final String uuid;
    private final int version;

    public static /* synthetic */ SecureVerify copy$default(SecureVerify secureVerify, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = secureVerify._created_at;
        }
        if ((i2 & 2) != 0) {
            str2 = secureVerify.callback_url;
        }
        if ((i2 & 4) != 0) {
            str3 = secureVerify.ccd;
        }
        if ((i2 & 8) != 0) {
            str4 = secureVerify.ua;
        }
        if ((i2 & 16) != 0) {
            str5 = secureVerify.url;
        }
        if ((i2 & 32) != 0) {
            str6 = secureVerify.uuid;
        }
        if ((i2 & 64) != 0) {
            i = secureVerify.version;
        }
        String str7 = str6;
        int i3 = i;
        String str8 = str5;
        String str9 = str3;
        return secureVerify.copy(str, str2, str9, str4, str8, str7, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final String get_created_at() {
        return this._created_at;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCallback_url() {
        return this.callback_url;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCcd() {
        return this.ccd;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUa() {
        return this.ua;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component6, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component7, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final SecureVerify copy(String _created_at, String callback_url, String ccd, String ua, String url, String uuid, int version) {
        Intrinsics.checkNotNullParameter(_created_at, "_created_at");
        Intrinsics.checkNotNullParameter(callback_url, "callback_url");
        Intrinsics.checkNotNullParameter(ccd, "ccd");
        Intrinsics.checkNotNullParameter(ua, "ua");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new SecureVerify(_created_at, callback_url, ccd, ua, url, uuid, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecureVerify)) {
            return false;
        }
        SecureVerify secureVerify = (SecureVerify) other;
        return Intrinsics.areEqual(this._created_at, secureVerify._created_at) && Intrinsics.areEqual(this.callback_url, secureVerify.callback_url) && Intrinsics.areEqual(this.ccd, secureVerify.ccd) && Intrinsics.areEqual(this.ua, secureVerify.ua) && Intrinsics.areEqual(this.url, secureVerify.url) && Intrinsics.areEqual(this.uuid, secureVerify.uuid) && this.version == secureVerify.version;
    }

    public int hashCode() {
        return (((((((((((this._created_at.hashCode() * 31) + this.callback_url.hashCode()) * 31) + this.ccd.hashCode()) * 31) + this.ua.hashCode()) * 31) + this.url.hashCode()) * 31) + this.uuid.hashCode()) * 31) + Integer.hashCode(this.version);
    }

    public String toString() {
        return "SecureVerify(_created_at=" + this._created_at + ", callback_url=" + this.callback_url + ", ccd=" + this.ccd + ", ua=" + this.ua + ", url=" + this.url + ", uuid=" + this.uuid + ", version=" + this.version + Separators.RPAREN;
    }

    public SecureVerify(String _created_at, String callback_url, String ccd, String ua, String url, String uuid, int i) {
        Intrinsics.checkNotNullParameter(_created_at, "_created_at");
        Intrinsics.checkNotNullParameter(callback_url, "callback_url");
        Intrinsics.checkNotNullParameter(ccd, "ccd");
        Intrinsics.checkNotNullParameter(ua, "ua");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this._created_at = _created_at;
        this.callback_url = callback_url;
        this.ccd = ccd;
        this.ua = ua;
        this.url = url;
        this.uuid = uuid;
        this.version = i;
    }

    public final String get_created_at() {
        return this._created_at;
    }

    public final String getCallback_url() {
        return this.callback_url;
    }

    public final String getCcd() {
        return this.ccd;
    }

    public final String getUa() {
        return this.ua;
    }

    public final void setUa(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ua = str;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final int getVersion() {
        return this.version;
    }
}
