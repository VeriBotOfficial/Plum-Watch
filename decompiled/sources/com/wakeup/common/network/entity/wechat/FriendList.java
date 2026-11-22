package com.wakeup.common.network.entity.wechat;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GeWechatResult.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/wakeup/common/network/entity/wechat/FriendList;", "", "friends", "", "", "chatrooms", "ghs", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getFriends", "()Ljava/util/List;", "getChatrooms", "getGhs", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FriendList {
    private final List<String> chatrooms;
    private final List<String> friends;
    private final List<String> ghs;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FriendList copy$default(FriendList friendList, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = friendList.friends;
        }
        if ((i & 2) != 0) {
            list2 = friendList.chatrooms;
        }
        if ((i & 4) != 0) {
            list3 = friendList.ghs;
        }
        return friendList.copy(list, list2, list3);
    }

    public final List<String> component1() {
        return this.friends;
    }

    public final List<String> component2() {
        return this.chatrooms;
    }

    public final List<String> component3() {
        return this.ghs;
    }

    public final FriendList copy(List<String> friends, List<String> chatrooms, List<String> ghs) {
        Intrinsics.checkNotNullParameter(friends, "friends");
        Intrinsics.checkNotNullParameter(chatrooms, "chatrooms");
        Intrinsics.checkNotNullParameter(ghs, "ghs");
        return new FriendList(friends, chatrooms, ghs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FriendList)) {
            return false;
        }
        FriendList friendList = (FriendList) other;
        return Intrinsics.areEqual(this.friends, friendList.friends) && Intrinsics.areEqual(this.chatrooms, friendList.chatrooms) && Intrinsics.areEqual(this.ghs, friendList.ghs);
    }

    public int hashCode() {
        return (((this.friends.hashCode() * 31) + this.chatrooms.hashCode()) * 31) + this.ghs.hashCode();
    }

    public String toString() {
        return "FriendList(friends=" + this.friends + ", chatrooms=" + this.chatrooms + ", ghs=" + this.ghs + Separators.RPAREN;
    }

    public FriendList(List<String> friends, List<String> chatrooms, List<String> ghs) {
        Intrinsics.checkNotNullParameter(friends, "friends");
        Intrinsics.checkNotNullParameter(chatrooms, "chatrooms");
        Intrinsics.checkNotNullParameter(ghs, "ghs");
        this.friends = friends;
        this.chatrooms = chatrooms;
        this.ghs = ghs;
    }

    public final List<String> getFriends() {
        return this.friends;
    }

    public final List<String> getChatrooms() {
        return this.chatrooms;
    }

    public final List<String> getGhs() {
        return this.ghs;
    }
}
