package com.xmly.businesssdk.network.bean;

import com.google.gson.annotations.SerializedName;
import com.xmly.businesssdk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnnouncerInfo.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/xmly/businesssdk/network/bean/AnnouncerInfo;", "", "id", "", "nickname", "", "avatar", "avatarUrl", "isVerified", "", "verifyType", "", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V", "getAvatar", "()Ljava/lang/String;", "getAvatarUrl", "getId", "()J", "()Z", "getNickname", "getVerifyType", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AnnouncerInfo {

    @SerializedName("avatar")
    private final String avatar;

    @SerializedName("avatar_url")
    private final String avatarUrl;

    @SerializedName("id")
    private final long id;

    @SerializedName("is_verified")
    private final boolean isVerified;

    @SerializedName("nickname")
    private final String nickname;

    @SerializedName("verify_type")
    private final int verifyType;

    public AnnouncerInfo() {
        this(0L, null, null, null, false, 0, 63, null);
    }

    public AnnouncerInfo(long j, String str, String str2, String str3, boolean z, int i) {
        this.id = j;
        this.nickname = str;
        this.avatar = str2;
        this.avatarUrl = str3;
        this.isVerified = z;
        this.verifyType = i;
    }

    public static /* synthetic */ AnnouncerInfo copy$default(AnnouncerInfo announcerInfo, long j, String str, String str2, String str3, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = announcerInfo.id;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = announcerInfo.nickname;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = announcerInfo.avatar;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = announcerInfo.avatarUrl;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            z = announcerInfo.isVerified;
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            i = announcerInfo.verifyType;
        }
        return announcerInfo.copy(j2, str4, str5, str6, z2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsVerified() {
        return this.isVerified;
    }

    /* renamed from: component6, reason: from getter */
    public final int getVerifyType() {
        return this.verifyType;
    }

    public final AnnouncerInfo copy(long id2, String nickname, String avatar, String avatarUrl, boolean isVerified, int verifyType) {
        return new AnnouncerInfo(id2, nickname, avatar, avatarUrl, isVerified, verifyType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnouncerInfo)) {
            return false;
        }
        AnnouncerInfo announcerInfo = (AnnouncerInfo) other;
        return this.id == announcerInfo.id && Intrinsics.areEqual(this.nickname, announcerInfo.nickname) && Intrinsics.areEqual(this.avatar, announcerInfo.avatar) && Intrinsics.areEqual(this.avatarUrl, announcerInfo.avatarUrl) && this.isVerified == announcerInfo.isVerified && this.verifyType == announcerInfo.verifyType;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final long getId() {
        return this.id;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final int getVerifyType() {
        return this.verifyType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.nickname;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatar;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatarUrl;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.isVerified;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return Integer.hashCode(this.verifyType) + ((hashCode4 + i) * 31);
    }

    public final boolean isVerified() {
        return this.isVerified;
    }

    public String toString() {
        return c.a("AnnouncerInfo(id=").append(this.id).append(", nickname=").append(this.nickname).append(", avatar=").append(this.avatar).append(", avatarUrl=").append(this.avatarUrl).append(", isVerified=").append(this.isVerified).append(", verifyType=").append(this.verifyType).append(')').toString();
    }

    public /* synthetic */ AnnouncerInfo(long j, String str, String str2, String str3, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? 0 : i);
    }
}
