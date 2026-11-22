package com.wakeup.common.network.entity.friend;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddOrEditFriend.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/friend/AddOrEditFriend;", "", "dataFunctionIds", "", "relativesFriendsRemarks", "relativesFriendsUserId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDataFunctionIds", "()Ljava/lang/String;", "getRelativesFriendsRemarks", "getRelativesFriendsUserId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AddOrEditFriend {
    private final String dataFunctionIds;
    private final String relativesFriendsRemarks;
    private final String relativesFriendsUserId;

    public static /* synthetic */ AddOrEditFriend copy$default(AddOrEditFriend addOrEditFriend, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addOrEditFriend.dataFunctionIds;
        }
        if ((i & 2) != 0) {
            str2 = addOrEditFriend.relativesFriendsRemarks;
        }
        if ((i & 4) != 0) {
            str3 = addOrEditFriend.relativesFriendsUserId;
        }
        return addOrEditFriend.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDataFunctionIds() {
        return this.dataFunctionIds;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRelativesFriendsRemarks() {
        return this.relativesFriendsRemarks;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRelativesFriendsUserId() {
        return this.relativesFriendsUserId;
    }

    public final AddOrEditFriend copy(String dataFunctionIds, String relativesFriendsRemarks, String relativesFriendsUserId) {
        Intrinsics.checkNotNullParameter(dataFunctionIds, "dataFunctionIds");
        Intrinsics.checkNotNullParameter(relativesFriendsUserId, "relativesFriendsUserId");
        return new AddOrEditFriend(dataFunctionIds, relativesFriendsRemarks, relativesFriendsUserId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddOrEditFriend)) {
            return false;
        }
        AddOrEditFriend addOrEditFriend = (AddOrEditFriend) other;
        return Intrinsics.areEqual(this.dataFunctionIds, addOrEditFriend.dataFunctionIds) && Intrinsics.areEqual(this.relativesFriendsRemarks, addOrEditFriend.relativesFriendsRemarks) && Intrinsics.areEqual(this.relativesFriendsUserId, addOrEditFriend.relativesFriendsUserId);
    }

    public int hashCode() {
        int hashCode = this.dataFunctionIds.hashCode() * 31;
        String str = this.relativesFriendsRemarks;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.relativesFriendsUserId.hashCode();
    }

    public String toString() {
        return "AddOrEditFriend(dataFunctionIds=" + this.dataFunctionIds + ", relativesFriendsRemarks=" + this.relativesFriendsRemarks + ", relativesFriendsUserId=" + this.relativesFriendsUserId + Separators.RPAREN;
    }

    public AddOrEditFriend(String dataFunctionIds, String str, String relativesFriendsUserId) {
        Intrinsics.checkNotNullParameter(dataFunctionIds, "dataFunctionIds");
        Intrinsics.checkNotNullParameter(relativesFriendsUserId, "relativesFriendsUserId");
        this.dataFunctionIds = dataFunctionIds;
        this.relativesFriendsRemarks = str;
        this.relativesFriendsUserId = relativesFriendsUserId;
    }

    public final String getDataFunctionIds() {
        return this.dataFunctionIds;
    }

    public final String getRelativesFriendsRemarks() {
        return this.relativesFriendsRemarks;
    }

    public final String getRelativesFriendsUserId() {
        return this.relativesFriendsUserId;
    }
}
