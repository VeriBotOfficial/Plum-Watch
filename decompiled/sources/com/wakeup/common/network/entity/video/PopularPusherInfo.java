package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PopularPusherInfo.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013JB\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/wakeup/common/network/entity/video/PopularPusherInfo;", "", "id", "", "nickname", "", "avatar", "introduction", "attentionStatus", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getId", "()J", "getNickname", "()Ljava/lang/String;", "getAvatar", "getIntroduction", "getAttentionStatus", "()Ljava/lang/Boolean;", "setAttentionStatus", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/wakeup/common/network/entity/video/PopularPusherInfo;", "equals", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PopularPusherInfo {
    private Boolean attentionStatus;
    private final String avatar;
    private final long id;
    private final String introduction;
    private final String nickname;

    public static /* synthetic */ PopularPusherInfo copy$default(PopularPusherInfo popularPusherInfo, long j, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            j = popularPusherInfo.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = popularPusherInfo.nickname;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = popularPusherInfo.avatar;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = popularPusherInfo.introduction;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            bool = popularPusherInfo.attentionStatus;
        }
        return popularPusherInfo.copy(j2, str4, str5, str6, bool);
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
    public final String getIntroduction() {
        return this.introduction;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getAttentionStatus() {
        return this.attentionStatus;
    }

    public final PopularPusherInfo copy(long id2, String nickname, String avatar, String introduction, Boolean attentionStatus) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        return new PopularPusherInfo(id2, nickname, avatar, introduction, attentionStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PopularPusherInfo)) {
            return false;
        }
        PopularPusherInfo popularPusherInfo = (PopularPusherInfo) other;
        return this.id == popularPusherInfo.id && Intrinsics.areEqual(this.nickname, popularPusherInfo.nickname) && Intrinsics.areEqual(this.avatar, popularPusherInfo.avatar) && Intrinsics.areEqual(this.introduction, popularPusherInfo.introduction) && Intrinsics.areEqual(this.attentionStatus, popularPusherInfo.attentionStatus);
    }

    public int hashCode() {
        int hashCode = ((((((Long.hashCode(this.id) * 31) + this.nickname.hashCode()) * 31) + this.avatar.hashCode()) * 31) + this.introduction.hashCode()) * 31;
        Boolean bool = this.attentionStatus;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "PopularPusherInfo(id=" + this.id + ", nickname=" + this.nickname + ", avatar=" + this.avatar + ", introduction=" + this.introduction + ", attentionStatus=" + this.attentionStatus + Separators.RPAREN;
    }

    public PopularPusherInfo(long j, String nickname, String avatar, String introduction, Boolean bool) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        this.id = j;
        this.nickname = nickname;
        this.avatar = avatar;
        this.introduction = introduction;
        this.attentionStatus = bool;
    }

    public final long getId() {
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

    public /* synthetic */ PopularPusherInfo(long j, String str, String str2, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, (i & 16) != 0 ? false : bool);
    }

    public final Boolean getAttentionStatus() {
        return this.attentionStatus;
    }

    public final void setAttentionStatus(Boolean bool) {
        this.attentionStatus = bool;
    }
}
