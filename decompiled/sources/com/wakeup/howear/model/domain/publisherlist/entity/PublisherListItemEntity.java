package com.wakeup.howear.model.domain.publisherlist.entity;

import android.gov.nist.core.Separators;
import com.wakeup.common.Constants;
import com.wakeup.common.common.constants.publishlist.PublisherListItemTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PublisherListItemEntity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\tHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/wakeup/howear/model/domain/publisherlist/entity/PublisherListItemEntity;", "", "type", "Lcom/wakeup/common/common/constants/publishlist/PublisherListItemTypes;", Constants.BundleKey.NICKNAME, "", "avatarUrl", "userId", "unreadCount", "", "<init>", "(Lcom/wakeup/common/common/constants/publishlist/PublisherListItemTypes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getType", "()Lcom/wakeup/common/common/constants/publishlist/PublisherListItemTypes;", "getNickName", "()Ljava/lang/String;", "getAvatarUrl", "getUserId", "getUnreadCount", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PublisherListItemEntity {
    private final String avatarUrl;
    private final String nickName;
    private final PublisherListItemTypes type;
    private final int unreadCount;
    private final String userId;

    public static /* synthetic */ PublisherListItemEntity copy$default(PublisherListItemEntity publisherListItemEntity, PublisherListItemTypes publisherListItemTypes, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            publisherListItemTypes = publisherListItemEntity.type;
        }
        if ((i2 & 2) != 0) {
            str = publisherListItemEntity.nickName;
        }
        if ((i2 & 4) != 0) {
            str2 = publisherListItemEntity.avatarUrl;
        }
        if ((i2 & 8) != 0) {
            str3 = publisherListItemEntity.userId;
        }
        if ((i2 & 16) != 0) {
            i = publisherListItemEntity.unreadCount;
        }
        int i3 = i;
        String str4 = str2;
        return publisherListItemEntity.copy(publisherListItemTypes, str, str4, str3, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final PublisherListItemTypes getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public final PublisherListItemEntity copy(PublisherListItemTypes type, String nickName, String avatarUrl, String userId, int unreadCount) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new PublisherListItemEntity(type, nickName, avatarUrl, userId, unreadCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublisherListItemEntity)) {
            return false;
        }
        PublisherListItemEntity publisherListItemEntity = (PublisherListItemEntity) other;
        return this.type == publisherListItemEntity.type && Intrinsics.areEqual(this.nickName, publisherListItemEntity.nickName) && Intrinsics.areEqual(this.avatarUrl, publisherListItemEntity.avatarUrl) && Intrinsics.areEqual(this.userId, publisherListItemEntity.userId) && this.unreadCount == publisherListItemEntity.unreadCount;
    }

    public int hashCode() {
        return (((((((this.type.hashCode() * 31) + this.nickName.hashCode()) * 31) + this.avatarUrl.hashCode()) * 31) + this.userId.hashCode()) * 31) + Integer.hashCode(this.unreadCount);
    }

    public String toString() {
        return "PublisherListItemEntity(type=" + this.type + ", nickName=" + this.nickName + ", avatarUrl=" + this.avatarUrl + ", userId=" + this.userId + ", unreadCount=" + this.unreadCount + Separators.RPAREN;
    }

    public PublisherListItemEntity(PublisherListItemTypes type, String nickName, String avatarUrl, String userId, int i) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.type = type;
        this.nickName = nickName;
        this.avatarUrl = avatarUrl;
        this.userId = userId;
        this.unreadCount = i;
    }

    public final PublisherListItemTypes getType() {
        return this.type;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }
}
