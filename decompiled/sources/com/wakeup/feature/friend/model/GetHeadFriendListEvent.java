package com.wakeup.feature.friend.model;

/* loaded from: classes3.dex */
public class GetHeadFriendListEvent {
    boolean isSelectMe;

    public GetHeadFriendListEvent(boolean z) {
        this.isSelectMe = z;
    }

    public boolean isSelectMe() {
        return this.isSelectMe;
    }

    public void setSelectMe(boolean z) {
        this.isSelectMe = z;
    }
}
