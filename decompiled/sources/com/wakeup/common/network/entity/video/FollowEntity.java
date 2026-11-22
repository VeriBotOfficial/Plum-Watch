package com.wakeup.common.network.entity.video;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FollowEntity.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/video/FollowEntity;", "", "id", "", "userId", "pushId", "categoryId", "", "pushName", "pushAvatar", "attentionStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/String;", "getUserId", "getPushId", "getCategoryId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPushName", "getPushAvatar", "getAttentionStatus", "setAttentionStatus", "(Ljava/lang/Integer;)V", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FollowEntity {
    private Integer attentionStatus;
    private final Integer categoryId;
    private final String id;
    private final String pushAvatar;
    private final String pushId;
    private final String pushName;
    private final String userId;

    public FollowEntity(String id2, String str, String str2, Integer num, String str3, String str4, Integer num2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.userId = str;
        this.pushId = str2;
        this.categoryId = num;
        this.pushName = str3;
        this.pushAvatar = str4;
        this.attentionStatus = num2;
    }

    public final String getId() {
        return this.id;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getPushId() {
        return this.pushId;
    }

    public final Integer getCategoryId() {
        return this.categoryId;
    }

    public final String getPushName() {
        return this.pushName;
    }

    public final String getPushAvatar() {
        return this.pushAvatar;
    }

    public final Integer getAttentionStatus() {
        return this.attentionStatus;
    }

    public final void setAttentionStatus(Integer num) {
        this.attentionStatus = num;
    }
}
