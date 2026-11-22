package com.xmly.businesssdk.network.bean;

import com.google.gson.annotations.SerializedName;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.db.entity.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003JU\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006\""}, d2 = {"Lcom/xmly/businesssdk/network/bean/Profile;", "", "avatarUrl", "", "kind", "isVip", "", "nickname", "vipExpiredAt", "", "id", "isVerified", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JJZ)V", "getAvatarUrl", "()Ljava/lang/String;", "getId", "()J", "()Z", "getKind", "getNickname", "getVipExpiredAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Profile {

    @SerializedName("avatar_url")
    private final String avatarUrl;
    private final long id;

    @SerializedName("is_verified")
    private final boolean isVerified;

    @SerializedName("is_vip")
    private final boolean isVip;
    private final String kind;
    private final String nickname;

    @SerializedName("vip_expired_at")
    private final long vipExpiredAt;

    public Profile() {
        this(null, null, false, null, 0L, 0L, false, 127, null);
    }

    public Profile(String str, String str2, boolean z, String str3, long j, long j2, boolean z2) {
        this.avatarUrl = str;
        this.kind = str2;
        this.isVip = z;
        this.nickname = str3;
        this.vipExpiredAt = j;
        this.id = j2;
        this.isVerified = z2;
    }

    public static /* synthetic */ Profile copy$default(Profile profile, String str, String str2, boolean z, String str3, long j, long j2, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profile.avatarUrl;
        }
        if ((i & 2) != 0) {
            str2 = profile.kind;
        }
        if ((i & 4) != 0) {
            z = profile.isVip;
        }
        if ((i & 8) != 0) {
            str3 = profile.nickname;
        }
        if ((i & 16) != 0) {
            j = profile.vipExpiredAt;
        }
        if ((i & 32) != 0) {
            j2 = profile.id;
        }
        if ((i & 64) != 0) {
            z2 = profile.isVerified;
        }
        boolean z3 = z2;
        long j3 = j2;
        long j4 = j;
        return profile.copy(str, str2, z, str3, j4, j3, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsVip() {
        return this.isVip;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component5, reason: from getter */
    public final long getVipExpiredAt() {
        return this.vipExpiredAt;
    }

    /* renamed from: component6, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsVerified() {
        return this.isVerified;
    }

    public final Profile copy(String avatarUrl, String kind, boolean isVip, String nickname, long vipExpiredAt, long id2, boolean isVerified) {
        return new Profile(avatarUrl, kind, isVip, nickname, vipExpiredAt, id2, isVerified);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) other;
        return Intrinsics.areEqual(this.avatarUrl, profile.avatarUrl) && Intrinsics.areEqual(this.kind, profile.kind) && this.isVip == profile.isVip && Intrinsics.areEqual(this.nickname, profile.nickname) && this.vipExpiredAt == profile.vipExpiredAt && this.id == profile.id && this.isVerified == profile.isVerified;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final long getId() {
        return this.id;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final long getVipExpiredAt() {
        return this.vipExpiredAt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.avatarUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.kind;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.isVip;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        String str3 = this.nickname;
        int a2 = a.a(this.id, a.a(this.vipExpiredAt, (i2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31);
        boolean z2 = this.isVerified;
        return a2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean isVerified() {
        return this.isVerified;
    }

    public final boolean isVip() {
        return this.isVip;
    }

    public String toString() {
        return c.a("Profile(avatarUrl=").append(this.avatarUrl).append(", kind=").append(this.kind).append(", isVip=").append(this.isVip).append(", nickname=").append(this.nickname).append(", vipExpiredAt=").append(this.vipExpiredAt).append(", id=").append(this.id).append(", isVerified=").append(this.isVerified).append(')').toString();
    }

    public /* synthetic */ Profile(String str, String str2, boolean z, String str3, long j, long j2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? 0L : j2, (i & 64) != 0 ? false : z2);
    }
}
