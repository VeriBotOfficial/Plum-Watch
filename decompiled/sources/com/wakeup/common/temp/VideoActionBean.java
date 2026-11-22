package com.wakeup.common.temp;

/* loaded from: classes2.dex */
public class VideoActionBean {
    public String action;
    public long actionTime = System.currentTimeMillis();
    public String duration;
    public boolean isReplay;
    public String itemId;

    public VideoActionBean(String itemId, String action, String duration) {
        this.itemId = itemId;
        this.action = action;
        this.duration = duration;
    }

    public String toString() {
        return "itemId:" + this.itemId + "action:" + this.action + "duration:" + this.duration + "actionTime:" + this.actionTime + "isReplay:" + this.isReplay;
    }
}
