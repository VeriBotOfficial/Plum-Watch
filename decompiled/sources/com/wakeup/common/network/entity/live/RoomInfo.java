package com.wakeup.common.network.entity.live;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: RoomInfo.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/live/RoomInfo;", "", "channel_exist", "", DOMConstants.ATTR_MODE, "", "total", "users", "", "<init>", "(ZIILjava/util/List;)V", "getChannel_exist", "()Z", "getMode", "()I", "getTotal", "getUsers", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RoomInfo {
    private final boolean channel_exist;
    private final int mode;
    private final int total;
    private final List<Integer> users;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RoomInfo copy$default(RoomInfo roomInfo, boolean z, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = roomInfo.channel_exist;
        }
        if ((i3 & 2) != 0) {
            i = roomInfo.mode;
        }
        if ((i3 & 4) != 0) {
            i2 = roomInfo.total;
        }
        if ((i3 & 8) != 0) {
            list = roomInfo.users;
        }
        return roomInfo.copy(z, i, i2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getChannel_exist() {
        return this.channel_exist;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    public final List<Integer> component4() {
        return this.users;
    }

    public final RoomInfo copy(boolean channel_exist, int mode, int total, List<Integer> users) {
        return new RoomInfo(channel_exist, mode, total, users);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoomInfo)) {
            return false;
        }
        RoomInfo roomInfo = (RoomInfo) other;
        return this.channel_exist == roomInfo.channel_exist && this.mode == roomInfo.mode && this.total == roomInfo.total && Intrinsics.areEqual(this.users, roomInfo.users);
    }

    public int hashCode() {
        int hashCode = ((((Boolean.hashCode(this.channel_exist) * 31) + Integer.hashCode(this.mode)) * 31) + Integer.hashCode(this.total)) * 31;
        List<Integer> list = this.users;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "RoomInfo(channel_exist=" + this.channel_exist + ", mode=" + this.mode + ", total=" + this.total + ", users=" + this.users + Separators.RPAREN;
    }

    public RoomInfo(boolean z, int i, int i2, List<Integer> list) {
        this.channel_exist = z;
        this.mode = i;
        this.total = i2;
        this.users = list;
    }

    public final boolean getChannel_exist() {
        return this.channel_exist;
    }

    public final int getMode() {
        return this.mode;
    }

    public final int getTotal() {
        return this.total;
    }

    public final List<Integer> getUsers() {
        return this.users;
    }
}
