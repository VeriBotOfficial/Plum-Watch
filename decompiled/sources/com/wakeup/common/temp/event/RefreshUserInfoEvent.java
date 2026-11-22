package com.wakeup.common.temp.event;

/* loaded from: classes2.dex */
public class RefreshUserInfoEvent {
    public static final int TYPE_SQL = 1;
    private int type;

    public RefreshUserInfoEvent(int type) {
        this.type = type;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
