package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PusherInfo.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/video/PusherInfo;", "", "id", "", "nickname", "", "avatar", "introduction", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getNickname", "()Ljava/lang/String;", "getAvatar", "getIntroduction", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PusherInfo {
    private final String avatar;
    private final int id;
    private final String introduction;
    private final String nickname;

    public static /* synthetic */ PusherInfo copy$default(PusherInfo pusherInfo, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pusherInfo.id;
        }
        if ((i2 & 2) != 0) {
            str = pusherInfo.nickname;
        }
        if ((i2 & 4) != 0) {
            str2 = pusherInfo.avatar;
        }
        if ((i2 & 8) != 0) {
            str3 = pusherInfo.introduction;
        }
        return pusherInfo.copy(i, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
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
    public final String getIntroduction() {
        return this.introduction;
    }

    public final PusherInfo copy(int id2, String nickname, String avatar, String introduction) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        return new PusherInfo(id2, nickname, avatar, introduction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PusherInfo)) {
            return false;
        }
        PusherInfo pusherInfo = (PusherInfo) other;
        return this.id == pusherInfo.id && Intrinsics.areEqual(this.nickname, pusherInfo.nickname) && Intrinsics.areEqual(this.avatar, pusherInfo.avatar) && Intrinsics.areEqual(this.introduction, pusherInfo.introduction);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.id) * 31) + this.nickname.hashCode()) * 31) + this.avatar.hashCode()) * 31) + this.introduction.hashCode();
    }

    public String toString() {
        return "PusherInfo(id=" + this.id + ", nickname=" + this.nickname + ", avatar=" + this.avatar + ", introduction=" + this.introduction + Separators.RPAREN;
    }

    public PusherInfo(int i, String nickname, String avatar, String introduction) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        this.id = i;
        this.nickname = nickname;
        this.avatar = avatar;
        this.introduction = introduction;
    }

    public final int getId() {
        return this.id;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getIntroduction() {
        return this.introduction;
    }
}
