package com.wakeup.common.network.entity.whatsapp;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import com.umeng.analytics.pro.ak;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WhatsAppEntity.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J±\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016¨\u0006;"}, d2 = {"Lcom/wakeup/common/network/entity/whatsapp/WhatsAppAccount;", "", "avatar", "", "avatarErrorCode", "avatarStatus", "contact", "Lcom/wakeup/common/network/entity/whatsapp/Contact;", "deviceId", "displayName", "ownerContext", "Lcom/wakeup/common/network/entity/whatsapp/OwnerContext;", "phone", "pushName", JsonStorageKeyNames.SESSION_ID_KEY, "status", "statusText", "updatedAt", "waJid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/common/network/entity/whatsapp/Contact;Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/common/network/entity/whatsapp/OwnerContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getAvatarErrorCode", "getAvatarStatus", "getContact", "()Lcom/wakeup/common/network/entity/whatsapp/Contact;", "getDeviceId", "getDisplayName", "getOwnerContext", "()Lcom/wakeup/common/network/entity/whatsapp/OwnerContext;", "getPhone", "getPushName", "getSessionId", "getStatus", "getStatusText", "getUpdatedAt", "getWaJid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WhatsAppAccount {
    private final String avatar;

    @SerializedName("avatar_error_code")
    private final String avatarErrorCode;

    @SerializedName("avatar_status")
    private final String avatarStatus;
    private final Contact contact;

    @SerializedName("device_id")
    private final String deviceId;

    @SerializedName(ak.s)
    private final String displayName;

    @SerializedName("owner_context")
    private final OwnerContext ownerContext;
    private final String phone;

    @SerializedName("push_name")
    private final String pushName;

    @SerializedName("session_id")
    private final String sessionId;
    private final String status;

    @SerializedName("status_text")
    private final String statusText;

    @SerializedName("updated_at")
    private final String updatedAt;

    @SerializedName("wa_jid")
    private final String waJid;

    public WhatsAppAccount() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* renamed from: component10, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component11, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component12, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    /* renamed from: component13, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component14, reason: from getter */
    public final String getWaJid() {
        return this.waJid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAvatarErrorCode() {
        return this.avatarErrorCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatarStatus() {
        return this.avatarStatus;
    }

    /* renamed from: component4, reason: from getter */
    public final Contact getContact() {
        return this.contact;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component7, reason: from getter */
    public final OwnerContext getOwnerContext() {
        return this.ownerContext;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPushName() {
        return this.pushName;
    }

    public final WhatsAppAccount copy(String avatar, String avatarErrorCode, String avatarStatus, Contact contact, String deviceId, String displayName, OwnerContext ownerContext, String phone, String pushName, String sessionId, String status, String statusText, String updatedAt, String waJid) {
        return new WhatsAppAccount(avatar, avatarErrorCode, avatarStatus, contact, deviceId, displayName, ownerContext, phone, pushName, sessionId, status, statusText, updatedAt, waJid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhatsAppAccount)) {
            return false;
        }
        WhatsAppAccount whatsAppAccount = (WhatsAppAccount) other;
        return Intrinsics.areEqual(this.avatar, whatsAppAccount.avatar) && Intrinsics.areEqual(this.avatarErrorCode, whatsAppAccount.avatarErrorCode) && Intrinsics.areEqual(this.avatarStatus, whatsAppAccount.avatarStatus) && Intrinsics.areEqual(this.contact, whatsAppAccount.contact) && Intrinsics.areEqual(this.deviceId, whatsAppAccount.deviceId) && Intrinsics.areEqual(this.displayName, whatsAppAccount.displayName) && Intrinsics.areEqual(this.ownerContext, whatsAppAccount.ownerContext) && Intrinsics.areEqual(this.phone, whatsAppAccount.phone) && Intrinsics.areEqual(this.pushName, whatsAppAccount.pushName) && Intrinsics.areEqual(this.sessionId, whatsAppAccount.sessionId) && Intrinsics.areEqual(this.status, whatsAppAccount.status) && Intrinsics.areEqual(this.statusText, whatsAppAccount.statusText) && Intrinsics.areEqual(this.updatedAt, whatsAppAccount.updatedAt) && Intrinsics.areEqual(this.waJid, whatsAppAccount.waJid);
    }

    public int hashCode() {
        String str = this.avatar;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.avatarErrorCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatarStatus;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Contact contact = this.contact;
        int hashCode4 = (hashCode3 + (contact == null ? 0 : contact.hashCode())) * 31;
        String str4 = this.deviceId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.displayName;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        OwnerContext ownerContext = this.ownerContext;
        int hashCode7 = (hashCode6 + (ownerContext == null ? 0 : ownerContext.hashCode())) * 31;
        String str6 = this.phone;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.pushName;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.sessionId;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.status;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.statusText;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.updatedAt;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.waJid;
        return hashCode13 + (str12 != null ? str12.hashCode() : 0);
    }

    public String toString() {
        return "WhatsAppAccount(avatar=" + this.avatar + ", avatarErrorCode=" + this.avatarErrorCode + ", avatarStatus=" + this.avatarStatus + ", contact=" + this.contact + ", deviceId=" + this.deviceId + ", displayName=" + this.displayName + ", ownerContext=" + this.ownerContext + ", phone=" + this.phone + ", pushName=" + this.pushName + ", sessionId=" + this.sessionId + ", status=" + this.status + ", statusText=" + this.statusText + ", updatedAt=" + this.updatedAt + ", waJid=" + this.waJid + Separators.RPAREN;
    }

    public WhatsAppAccount(String str, String str2, String str3, Contact contact, String str4, String str5, OwnerContext ownerContext, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.avatar = str;
        this.avatarErrorCode = str2;
        this.avatarStatus = str3;
        this.contact = contact;
        this.deviceId = str4;
        this.displayName = str5;
        this.ownerContext = ownerContext;
        this.phone = str6;
        this.pushName = str7;
        this.sessionId = str8;
        this.status = str9;
        this.statusText = str10;
        this.updatedAt = str11;
        this.waJid = str12;
    }

    public /* synthetic */ WhatsAppAccount(String str, String str2, String str3, Contact contact, String str4, String str5, OwnerContext ownerContext, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : contact, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : ownerContext, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getAvatarErrorCode() {
        return this.avatarErrorCode;
    }

    public final String getAvatarStatus() {
        return this.avatarStatus;
    }

    public final Contact getContact() {
        return this.contact;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final OwnerContext getOwnerContext() {
        return this.ownerContext;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPushName() {
        return this.pushName;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStatusText() {
        return this.statusText;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getWaJid() {
        return this.waJid;
    }
}
