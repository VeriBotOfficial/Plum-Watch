package com.wakeup.commponent.module.health;

import kotlin.Metadata;

/* compiled from: MenstrualBean.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/wakeup/commponent/module/health/MenstrualBean;", "", "type", "", "time", "", "len", "<init>", "(IJI)V", "getType", "()I", "getTime", "()J", "getLen", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MenstrualBean {
    private final int len;
    private final long time;
    private final int type;

    public MenstrualBean(int i, long j, int i2) {
        this.type = i;
        this.time = j;
        this.len = i2;
    }

    public final int getType() {
        return this.type;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getLen() {
        return this.len;
    }
}
