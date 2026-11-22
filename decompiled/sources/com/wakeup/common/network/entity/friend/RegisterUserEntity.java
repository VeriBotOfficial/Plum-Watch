package com.wakeup.common.network.entity.friend;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RegisterUserEntity.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/friend/RegisterUserEntity;", "Ljava/io/Serializable;", "userId", "", "avatar", "", "nickname", "phone", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserId", "()J", "getAvatar", "()Ljava/lang/String;", "getNickname", "getPhone", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RegisterUserEntity implements Serializable {
    private final String avatar;
    private final String nickname;
    private final String phone;
    private final long userId;

    public RegisterUserEntity() {
        this(0L, null, null, null, 15, null);
    }

    public static /* synthetic */ RegisterUserEntity copy$default(RegisterUserEntity registerUserEntity, long j, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = registerUserEntity.userId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = registerUserEntity.avatar;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = registerUserEntity.nickname;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = registerUserEntity.phone;
        }
        return registerUserEntity.copy(j2, str4, str5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public final RegisterUserEntity copy(long userId, String avatar, String nickname, String phone) {
        return new RegisterUserEntity(userId, avatar, nickname, phone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegisterUserEntity)) {
            return false;
        }
        RegisterUserEntity registerUserEntity = (RegisterUserEntity) other;
        return this.userId == registerUserEntity.userId && Intrinsics.areEqual(this.avatar, registerUserEntity.avatar) && Intrinsics.areEqual(this.nickname, registerUserEntity.nickname) && Intrinsics.areEqual(this.phone, registerUserEntity.phone);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.userId) * 31;
        String str = this.avatar;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nickname;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "RegisterUserEntity(userId=" + this.userId + ", avatar=" + this.avatar + ", nickname=" + this.nickname + ", phone=" + this.phone + Separators.RPAREN;
    }

    public RegisterUserEntity(long j, String str, String str2, String str3) {
        this.userId = j;
        this.avatar = str;
        this.nickname = str2;
        this.phone = str3;
    }

    public /* synthetic */ RegisterUserEntity(long j, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public final long getUserId() {
        return this.userId;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getPhone() {
        return this.phone;
    }
}
