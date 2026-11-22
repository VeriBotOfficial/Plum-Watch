package com.wakeup.common.network.entity.wechat;

import android.gov.nist.core.Separators;
import androidx.browser.customtabs.CustomTabsCallback;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GeWechatResult.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017Jh\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006("}, d2 = {"Lcom/wakeup/common/network/entity/wechat/LoginQrCode;", "", "qrData", "", CommonUrlParts.UUID, "tokenId", "type", "ipadAppId", "macAppId", "qrImgBase64", CustomTabsCallback.ONLINE_EXTRAS_KEY, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getQrData", "()Ljava/lang/String;", "getUuid", "getTokenId", "getType", "getIpadAppId", "getMacAppId", "getQrImgBase64", "getOnline", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/wakeup/common/network/entity/wechat/LoginQrCode;", "equals", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LoginQrCode {
    private final String ipadAppId;
    private final String macAppId;
    private final Boolean online;
    private final String qrData;
    private final String qrImgBase64;
    private final String tokenId;
    private final String type;
    private final String uuid;

    public static /* synthetic */ LoginQrCode copy$default(LoginQrCode loginQrCode, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loginQrCode.qrData;
        }
        if ((i & 2) != 0) {
            str2 = loginQrCode.uuid;
        }
        if ((i & 4) != 0) {
            str3 = loginQrCode.tokenId;
        }
        if ((i & 8) != 0) {
            str4 = loginQrCode.type;
        }
        if ((i & 16) != 0) {
            str5 = loginQrCode.ipadAppId;
        }
        if ((i & 32) != 0) {
            str6 = loginQrCode.macAppId;
        }
        if ((i & 64) != 0) {
            str7 = loginQrCode.qrImgBase64;
        }
        if ((i & 128) != 0) {
            bool = loginQrCode.online;
        }
        String str8 = str7;
        Boolean bool2 = bool;
        String str9 = str5;
        String str10 = str6;
        return loginQrCode.copy(str, str2, str3, str4, str9, str10, str8, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQrData() {
        return this.qrData;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTokenId() {
        return this.tokenId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIpadAppId() {
        return this.ipadAppId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMacAppId() {
        return this.macAppId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getQrImgBase64() {
        return this.qrImgBase64;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getOnline() {
        return this.online;
    }

    public final LoginQrCode copy(String qrData, String uuid, String tokenId, String type, String ipadAppId, String macAppId, String qrImgBase64, Boolean online) {
        Intrinsics.checkNotNullParameter(qrData, "qrData");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        return new LoginQrCode(qrData, uuid, tokenId, type, ipadAppId, macAppId, qrImgBase64, online);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginQrCode)) {
            return false;
        }
        LoginQrCode loginQrCode = (LoginQrCode) other;
        return Intrinsics.areEqual(this.qrData, loginQrCode.qrData) && Intrinsics.areEqual(this.uuid, loginQrCode.uuid) && Intrinsics.areEqual(this.tokenId, loginQrCode.tokenId) && Intrinsics.areEqual(this.type, loginQrCode.type) && Intrinsics.areEqual(this.ipadAppId, loginQrCode.ipadAppId) && Intrinsics.areEqual(this.macAppId, loginQrCode.macAppId) && Intrinsics.areEqual(this.qrImgBase64, loginQrCode.qrImgBase64) && Intrinsics.areEqual(this.online, loginQrCode.online);
    }

    public int hashCode() {
        int hashCode = ((((this.qrData.hashCode() * 31) + this.uuid.hashCode()) * 31) + this.tokenId.hashCode()) * 31;
        String str = this.type;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ipadAppId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.macAppId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.qrImgBase64;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.online;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "LoginQrCode(qrData=" + this.qrData + ", uuid=" + this.uuid + ", tokenId=" + this.tokenId + ", type=" + this.type + ", ipadAppId=" + this.ipadAppId + ", macAppId=" + this.macAppId + ", qrImgBase64=" + this.qrImgBase64 + ", online=" + this.online + Separators.RPAREN;
    }

    public LoginQrCode(String qrData, String uuid, String tokenId, String str, String str2, String str3, String str4, Boolean bool) {
        Intrinsics.checkNotNullParameter(qrData, "qrData");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        this.qrData = qrData;
        this.uuid = uuid;
        this.tokenId = tokenId;
        this.type = str;
        this.ipadAppId = str2;
        this.macAppId = str3;
        this.qrImgBase64 = str4;
        this.online = bool;
    }

    public /* synthetic */ LoginQrCode(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : bool);
    }

    public final String getQrData() {
        return this.qrData;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final String getTokenId() {
        return this.tokenId;
    }

    public final String getType() {
        return this.type;
    }

    public final String getIpadAppId() {
        return this.ipadAppId;
    }

    public final String getMacAppId() {
        return this.macAppId;
    }

    public final String getQrImgBase64() {
        return this.qrImgBase64;
    }

    public final Boolean getOnline() {
        return this.online;
    }
}
