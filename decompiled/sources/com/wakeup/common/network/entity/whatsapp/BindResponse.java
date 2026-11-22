package com.wakeup.common.network.entity.whatsapp;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WhatsAppEntity.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006*"}, d2 = {"Lcom/wakeup/common/network/entity/whatsapp/BindResponse;", "", "bindingId", "", "deviceId", "expiresAt", "ownerContext", "Lcom/wakeup/common/network/entity/whatsapp/OwnerContext;", "qrCode", JsonStorageKeyNames.SESSION_ID_KEY, "status", "phone", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/common/network/entity/whatsapp/OwnerContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBindingId", "()Ljava/lang/String;", "getDeviceId", "getExpiresAt", "getOwnerContext", "()Lcom/wakeup/common/network/entity/whatsapp/OwnerContext;", "getQrCode", "getSessionId", "getStatus", "getPhone", "getError", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BindResponse {

    @SerializedName("binding_id")
    private final String bindingId;

    @SerializedName("device_id")
    private final String deviceId;
    private final String error;

    @SerializedName("expires_at")
    private final String expiresAt;

    @SerializedName("owner_context")
    private final OwnerContext ownerContext;
    private final String phone;

    @SerializedName("qr_code")
    private final String qrCode;

    @SerializedName("session_id")
    private final String sessionId;
    private final String status;

    public static /* synthetic */ BindResponse copy$default(BindResponse bindResponse, String str, String str2, String str3, OwnerContext ownerContext, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bindResponse.bindingId;
        }
        if ((i & 2) != 0) {
            str2 = bindResponse.deviceId;
        }
        if ((i & 4) != 0) {
            str3 = bindResponse.expiresAt;
        }
        if ((i & 8) != 0) {
            ownerContext = bindResponse.ownerContext;
        }
        if ((i & 16) != 0) {
            str4 = bindResponse.qrCode;
        }
        if ((i & 32) != 0) {
            str5 = bindResponse.sessionId;
        }
        if ((i & 64) != 0) {
            str6 = bindResponse.status;
        }
        if ((i & 128) != 0) {
            str7 = bindResponse.phone;
        }
        if ((i & 256) != 0) {
            str8 = bindResponse.error;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        String str13 = str4;
        String str14 = str3;
        return bindResponse.copy(str, str2, str14, ownerContext, str13, str11, str12, str9, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBindingId() {
        return this.bindingId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getExpiresAt() {
        return this.expiresAt;
    }

    /* renamed from: component4, reason: from getter */
    public final OwnerContext getOwnerContext() {
        return this.ownerContext;
    }

    /* renamed from: component5, reason: from getter */
    public final String getQrCode() {
        return this.qrCode;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component9, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final BindResponse copy(String bindingId, String deviceId, String expiresAt, OwnerContext ownerContext, String qrCode, String sessionId, String status, String phone, String error) {
        Intrinsics.checkNotNullParameter(bindingId, "bindingId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(expiresAt, "expiresAt");
        Intrinsics.checkNotNullParameter(ownerContext, "ownerContext");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(status, "status");
        return new BindResponse(bindingId, deviceId, expiresAt, ownerContext, qrCode, sessionId, status, phone, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindResponse)) {
            return false;
        }
        BindResponse bindResponse = (BindResponse) other;
        return Intrinsics.areEqual(this.bindingId, bindResponse.bindingId) && Intrinsics.areEqual(this.deviceId, bindResponse.deviceId) && Intrinsics.areEqual(this.expiresAt, bindResponse.expiresAt) && Intrinsics.areEqual(this.ownerContext, bindResponse.ownerContext) && Intrinsics.areEqual(this.qrCode, bindResponse.qrCode) && Intrinsics.areEqual(this.sessionId, bindResponse.sessionId) && Intrinsics.areEqual(this.status, bindResponse.status) && Intrinsics.areEqual(this.phone, bindResponse.phone) && Intrinsics.areEqual(this.error, bindResponse.error);
    }

    public int hashCode() {
        int hashCode = ((((((this.bindingId.hashCode() * 31) + this.deviceId.hashCode()) * 31) + this.expiresAt.hashCode()) * 31) + this.ownerContext.hashCode()) * 31;
        String str = this.qrCode;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.sessionId.hashCode()) * 31) + this.status.hashCode()) * 31;
        String str2 = this.phone;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.error;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "BindResponse(bindingId=" + this.bindingId + ", deviceId=" + this.deviceId + ", expiresAt=" + this.expiresAt + ", ownerContext=" + this.ownerContext + ", qrCode=" + this.qrCode + ", sessionId=" + this.sessionId + ", status=" + this.status + ", phone=" + this.phone + ", error=" + this.error + Separators.RPAREN;
    }

    public BindResponse(String bindingId, String deviceId, String expiresAt, OwnerContext ownerContext, String str, String sessionId, String status, String str2, String str3) {
        Intrinsics.checkNotNullParameter(bindingId, "bindingId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(expiresAt, "expiresAt");
        Intrinsics.checkNotNullParameter(ownerContext, "ownerContext");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(status, "status");
        this.bindingId = bindingId;
        this.deviceId = deviceId;
        this.expiresAt = expiresAt;
        this.ownerContext = ownerContext;
        this.qrCode = str;
        this.sessionId = sessionId;
        this.status = status;
        this.phone = str2;
        this.error = str3;
    }

    public /* synthetic */ BindResponse(String str, String str2, String str3, OwnerContext ownerContext, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, ownerContext, (i & 16) != 0 ? null : str4, str5, str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8);
    }

    public final String getBindingId() {
        return this.bindingId;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getExpiresAt() {
        return this.expiresAt;
    }

    public final OwnerContext getOwnerContext() {
        return this.ownerContext;
    }

    public final String getQrCode() {
        return this.qrCode;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getError() {
        return this.error;
    }
}
