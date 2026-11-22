package com.wakeup.feature.friend.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FriendHomeFragmentEvent.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/wakeup/feature/friend/model/FriendHomeFragmentEvent;", "", "type", "", "data", "", "<init>", "(ILjava/lang/String;)V", "getType", "()I", "setType", "(I)V", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "feature-friend_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FriendHomeFragmentEvent {
    private String data;
    private int type;

    public static /* synthetic */ FriendHomeFragmentEvent copy$default(FriendHomeFragmentEvent friendHomeFragmentEvent, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = friendHomeFragmentEvent.type;
        }
        if ((i2 & 2) != 0) {
            str = friendHomeFragmentEvent.data;
        }
        return friendHomeFragmentEvent.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getData() {
        return this.data;
    }

    public final FriendHomeFragmentEvent copy(int type, String data) {
        return new FriendHomeFragmentEvent(type, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FriendHomeFragmentEvent)) {
            return false;
        }
        FriendHomeFragmentEvent friendHomeFragmentEvent = (FriendHomeFragmentEvent) other;
        return this.type == friendHomeFragmentEvent.type && Intrinsics.areEqual(this.data, friendHomeFragmentEvent.data);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.type) * 31;
        String str = this.data;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FriendHomeFragmentEvent(type=" + this.type + ", data=" + this.data + Separators.RPAREN;
    }

    public FriendHomeFragmentEvent(int i, String str) {
        this.type = i;
        this.data = str;
    }

    public final String getData() {
        return this.data;
    }

    public final int getType() {
        return this.type;
    }

    public final void setData(String str) {
        this.data = str;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
