package com.wakeup.feature.friend.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* compiled from: FriendStateChangeEvent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/wakeup/feature/friend/model/FriendStateChangeEvent;", "", "type", "", "userId", "", "<init>", "(IJ)V", "getType", "()I", "getUserId", "()J", "setUserId", "(J)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-friend_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FriendStateChangeEvent {
    private final int type;
    private long userId;

    public static /* synthetic */ FriendStateChangeEvent copy$default(FriendStateChangeEvent friendStateChangeEvent, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = friendStateChangeEvent.type;
        }
        if ((i2 & 2) != 0) {
            j = friendStateChangeEvent.userId;
        }
        return friendStateChangeEvent.copy(i, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    public final FriendStateChangeEvent copy(int type, long userId) {
        return new FriendStateChangeEvent(type, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FriendStateChangeEvent)) {
            return false;
        }
        FriendStateChangeEvent friendStateChangeEvent = (FriendStateChangeEvent) other;
        return this.type == friendStateChangeEvent.type && this.userId == friendStateChangeEvent.userId;
    }

    public int hashCode() {
        return (Integer.hashCode(this.type) * 31) + Long.hashCode(this.userId);
    }

    public String toString() {
        return "FriendStateChangeEvent(type=" + this.type + ", userId=" + this.userId + Separators.RPAREN;
    }

    public FriendStateChangeEvent(int i, long j) {
        this.type = i;
        this.userId = j;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }
}
