package com.wakeup.common.network.entity.live;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LiveRoomEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/wakeup/common/network/entity/live/LiveRoomEntity;", "", "roomToken", "", "uidToken", "channelName", "userId", "", "shareUrl", "sign", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getRoomToken", "()Ljava/lang/String;", "getUidToken", "getChannelName", "getUserId", "()I", "getShareUrl", "getSign", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LiveRoomEntity {
    private final String channelName;
    private final String roomToken;
    private final String shareUrl;
    private final String sign;
    private final String uidToken;
    private final int userId;

    public static /* synthetic */ LiveRoomEntity copy$default(LiveRoomEntity liveRoomEntity, String str, String str2, String str3, int i, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = liveRoomEntity.roomToken;
        }
        if ((i2 & 2) != 0) {
            str2 = liveRoomEntity.uidToken;
        }
        if ((i2 & 4) != 0) {
            str3 = liveRoomEntity.channelName;
        }
        if ((i2 & 8) != 0) {
            i = liveRoomEntity.userId;
        }
        if ((i2 & 16) != 0) {
            str4 = liveRoomEntity.shareUrl;
        }
        if ((i2 & 32) != 0) {
            str5 = liveRoomEntity.sign;
        }
        String str6 = str4;
        String str7 = str5;
        return liveRoomEntity.copy(str, str2, str3, i, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRoomToken() {
        return this.roomToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUidToken() {
        return this.uidToken;
    }

    /* renamed from: component3, reason: from getter */
    public final String getChannelName() {
        return this.channelName;
    }

    /* renamed from: component4, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getShareUrl() {
        return this.shareUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSign() {
        return this.sign;
    }

    public final LiveRoomEntity copy(String roomToken, String uidToken, String channelName, int userId, String shareUrl, String sign) {
        Intrinsics.checkNotNullParameter(roomToken, "roomToken");
        Intrinsics.checkNotNullParameter(uidToken, "uidToken");
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        Intrinsics.checkNotNullParameter(shareUrl, "shareUrl");
        Intrinsics.checkNotNullParameter(sign, "sign");
        return new LiveRoomEntity(roomToken, uidToken, channelName, userId, shareUrl, sign);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveRoomEntity)) {
            return false;
        }
        LiveRoomEntity liveRoomEntity = (LiveRoomEntity) other;
        return Intrinsics.areEqual(this.roomToken, liveRoomEntity.roomToken) && Intrinsics.areEqual(this.uidToken, liveRoomEntity.uidToken) && Intrinsics.areEqual(this.channelName, liveRoomEntity.channelName) && this.userId == liveRoomEntity.userId && Intrinsics.areEqual(this.shareUrl, liveRoomEntity.shareUrl) && Intrinsics.areEqual(this.sign, liveRoomEntity.sign);
    }

    public int hashCode() {
        return (((((((((this.roomToken.hashCode() * 31) + this.uidToken.hashCode()) * 31) + this.channelName.hashCode()) * 31) + Integer.hashCode(this.userId)) * 31) + this.shareUrl.hashCode()) * 31) + this.sign.hashCode();
    }

    public String toString() {
        return "LiveRoomEntity(roomToken=" + this.roomToken + ", uidToken=" + this.uidToken + ", channelName=" + this.channelName + ", userId=" + this.userId + ", shareUrl=" + this.shareUrl + ", sign=" + this.sign + Separators.RPAREN;
    }

    public LiveRoomEntity(String roomToken, String uidToken, String channelName, int i, String shareUrl, String sign) {
        Intrinsics.checkNotNullParameter(roomToken, "roomToken");
        Intrinsics.checkNotNullParameter(uidToken, "uidToken");
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        Intrinsics.checkNotNullParameter(shareUrl, "shareUrl");
        Intrinsics.checkNotNullParameter(sign, "sign");
        this.roomToken = roomToken;
        this.uidToken = uidToken;
        this.channelName = channelName;
        this.userId = i;
        this.shareUrl = shareUrl;
        this.sign = sign;
    }

    public final String getRoomToken() {
        return this.roomToken;
    }

    public final String getUidToken() {
        return this.uidToken;
    }

    public final String getChannelName() {
        return this.channelName;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final String getShareUrl() {
        return this.shareUrl;
    }

    public final String getSign() {
        return this.sign;
    }
}
