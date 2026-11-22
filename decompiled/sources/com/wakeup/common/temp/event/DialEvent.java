package com.wakeup.common.temp.event;

import com.wakeup.common.work.IntegralTaskBiz;

/* loaded from: classes2.dex */
public class DialEvent {
    public static final int TYPE_FAIL = -1;
    public static final int TYPE_PROGRESS = 1;
    public static final int TYPE_START = 0;
    public static final int TYPE_SUCCESS = 2;
    private int progress;
    private int type;

    public DialEvent(int type) {
        this(type, 0);
    }

    public DialEvent(int type, int progress) {
        this.type = type;
        this.progress = progress;
        if (type == 2) {
            IntegralTaskBiz.integralTaskDone(13);
        }
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getProgress() {
        return this.progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
}
