package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import com.wakeup.common.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PublisherListItemRemoteEntity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/wakeup/common/network/entity/video/PublisherListItemRemoteEntity;", "Ljava/io/Serializable;", "id", "", Constants.BundleKey.NICKNAME, "avatar", "updatePushNum", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/String;", "getNickName", "getAvatar", "getUpdatePushNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/wakeup/common/network/entity/video/PublisherListItemRemoteEntity;", "equals", "", "other", "", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PublisherListItemRemoteEntity implements Serializable {
    private final String avatar;
    private final String id;
    private final String nickName;
    private final Integer updatePushNum;

    public static /* synthetic */ PublisherListItemRemoteEntity copy$default(PublisherListItemRemoteEntity publisherListItemRemoteEntity, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = publisherListItemRemoteEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = publisherListItemRemoteEntity.nickName;
        }
        if ((i & 4) != 0) {
            str3 = publisherListItemRemoteEntity.avatar;
        }
        if ((i & 8) != 0) {
            num = publisherListItemRemoteEntity.updatePushNum;
        }
        return publisherListItemRemoteEntity.copy(str, str2, str3, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getUpdatePushNum() {
        return this.updatePushNum;
    }

    public final PublisherListItemRemoteEntity copy(String id2, String nickName, String avatar, Integer updatePushNum) {
        return new PublisherListItemRemoteEntity(id2, nickName, avatar, updatePushNum);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublisherListItemRemoteEntity)) {
            return false;
        }
        PublisherListItemRemoteEntity publisherListItemRemoteEntity = (PublisherListItemRemoteEntity) other;
        return Intrinsics.areEqual(this.id, publisherListItemRemoteEntity.id) && Intrinsics.areEqual(this.nickName, publisherListItemRemoteEntity.nickName) && Intrinsics.areEqual(this.avatar, publisherListItemRemoteEntity.avatar) && Intrinsics.areEqual(this.updatePushNum, publisherListItemRemoteEntity.updatePushNum);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nickName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatar;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.updatePushNum;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "PublisherListItemRemoteEntity(id=" + this.id + ", nickName=" + this.nickName + ", avatar=" + this.avatar + ", updatePushNum=" + this.updatePushNum + Separators.RPAREN;
    }

    public PublisherListItemRemoteEntity(String str, String str2, String str3, Integer num) {
        this.id = str;
        this.nickName = str2;
        this.avatar = str3;
        this.updatePushNum = num;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final Integer getUpdatePushNum() {
        return this.updatePushNum;
    }
}
