package com.wakeup.common.network.entity.qibla;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: QiblaBean.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017¨\u0006!"}, d2 = {"Lcom/wakeup/common/network/entity/qibla/PrayerTimeBean;", "", "id", "", "icon", "prayName", "time", "remindEnable", "", "reminding", "ringType", "timeDelay", "supportRemind", "<init>", "(IIIIZZIIZ)V", "getId", "()I", "getIcon", "getPrayName", "getTime", "getRemindEnable", "()Z", "setRemindEnable", "(Z)V", "getReminding", "setReminding", "getRingType", "setRingType", "(I)V", "getTimeDelay", "setTimeDelay", "getSupportRemind", "setSupportRemind", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PrayerTimeBean {
    private final int icon;
    private final int id;
    private final int prayName;
    private boolean remindEnable;
    private boolean reminding;
    private int ringType;
    private boolean supportRemind;
    private final int time;
    private int timeDelay;

    public PrayerTimeBean(int i, int i2, int i3, int i4, boolean z, boolean z2, int i5, int i6, boolean z3) {
        this.id = i;
        this.icon = i2;
        this.prayName = i3;
        this.time = i4;
        this.remindEnable = z;
        this.reminding = z2;
        this.ringType = i5;
        this.timeDelay = i6;
        this.supportRemind = z3;
    }

    public /* synthetic */ PrayerTimeBean(int i, int i2, int i3, int i4, boolean z, boolean z2, int i5, int i6, boolean z3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, z, (i7 & 32) != 0 ? false : z2, (i7 & 64) != 0 ? 0 : i5, (i7 & 128) != 0 ? 0 : i6, (i7 & 256) != 0 ? true : z3);
    }

    public final int getId() {
        return this.id;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getPrayName() {
        return this.prayName;
    }

    public final int getTime() {
        return this.time;
    }

    public final boolean getRemindEnable() {
        return this.remindEnable;
    }

    public final void setRemindEnable(boolean z) {
        this.remindEnable = z;
    }

    public final boolean getReminding() {
        return this.reminding;
    }

    public final void setReminding(boolean z) {
        this.reminding = z;
    }

    public final int getRingType() {
        return this.ringType;
    }

    public final void setRingType(int i) {
        this.ringType = i;
    }

    public final int getTimeDelay() {
        return this.timeDelay;
    }

    public final void setTimeDelay(int i) {
        this.timeDelay = i;
    }

    public final boolean getSupportRemind() {
        return this.supportRemind;
    }

    public final void setSupportRemind(boolean z) {
        this.supportRemind = z;
    }
}
