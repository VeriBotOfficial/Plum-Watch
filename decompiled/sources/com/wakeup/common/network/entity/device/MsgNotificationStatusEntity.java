package com.wakeup.common.network.entity.device;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MsgNotificationStatusEntity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/wakeup/common/network/entity/device/MsgNotificationStatusEntity;", "", "msgNotificationStatus", "", "<init>", "(Ljava/lang/Integer;)V", "getMsgNotificationStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/wakeup/common/network/entity/device/MsgNotificationStatusEntity;", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MsgNotificationStatusEntity {
    private final Integer msgNotificationStatus;

    public static /* synthetic */ MsgNotificationStatusEntity copy$default(MsgNotificationStatusEntity msgNotificationStatusEntity, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = msgNotificationStatusEntity.msgNotificationStatus;
        }
        return msgNotificationStatusEntity.copy(num);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getMsgNotificationStatus() {
        return this.msgNotificationStatus;
    }

    public final MsgNotificationStatusEntity copy(Integer msgNotificationStatus) {
        return new MsgNotificationStatusEntity(msgNotificationStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MsgNotificationStatusEntity) && Intrinsics.areEqual(this.msgNotificationStatus, ((MsgNotificationStatusEntity) other).msgNotificationStatus);
    }

    public int hashCode() {
        Integer num = this.msgNotificationStatus;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return "MsgNotificationStatusEntity(msgNotificationStatus=" + this.msgNotificationStatus + Separators.RPAREN;
    }

    public MsgNotificationStatusEntity(Integer num) {
        this.msgNotificationStatus = num;
    }

    public final Integer getMsgNotificationStatus() {
        return this.msgNotificationStatus;
    }
}
