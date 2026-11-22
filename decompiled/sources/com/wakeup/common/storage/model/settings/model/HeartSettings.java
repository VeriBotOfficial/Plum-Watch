package com.wakeup.common.storage.model.settings.model;

import kotlin.Metadata;

/* compiled from: HeartSettings.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001a\u0010\u001c\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001a\u0010\u001f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"Lcom/wakeup/common/storage/model/settings/model/HeartSettings;", "", "<init>", "()V", "aerobicHeartSwitch", "", "getAerobicHeartSwitch", "()Z", "setAerobicHeartSwitch", "(Z)V", "aerobicMax", "", "getAerobicMax", "()I", "setAerobicMax", "(I)V", "staticHeartSwitch", "getStaticHeartSwitch", "setStaticHeartSwitch", "staticHeartMax", "getStaticHeartMax", "setStaticHeartMax", "staticHeartMin", "getStaticHeartMin", "setStaticHeartMin", "sleepHeartSwitch", "getSleepHeartSwitch", "setSleepHeartSwitch", "sleepHeartMax", "getSleepHeartMax", "setSleepHeartMax", "sleepHeartMin", "getSleepHeartMin", "setSleepHeartMin", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HeartSettings {
    private boolean sleepHeartSwitch;
    private boolean staticHeartSwitch;
    private boolean aerobicHeartSwitch = true;
    private int aerobicMax = 150;
    private int staticHeartMax = 150;
    private int staticHeartMin = 40;
    private int sleepHeartMax = 150;
    private int sleepHeartMin = 40;

    public final boolean getAerobicHeartSwitch() {
        return this.aerobicHeartSwitch;
    }

    public final void setAerobicHeartSwitch(boolean z) {
        this.aerobicHeartSwitch = z;
    }

    public final int getAerobicMax() {
        return this.aerobicMax;
    }

    public final void setAerobicMax(int i) {
        this.aerobicMax = i;
    }

    public final boolean getStaticHeartSwitch() {
        return this.staticHeartSwitch;
    }

    public final void setStaticHeartSwitch(boolean z) {
        this.staticHeartSwitch = z;
    }

    public final int getStaticHeartMax() {
        return this.staticHeartMax;
    }

    public final void setStaticHeartMax(int i) {
        this.staticHeartMax = i;
    }

    public final int getStaticHeartMin() {
        return this.staticHeartMin;
    }

    public final void setStaticHeartMin(int i) {
        this.staticHeartMin = i;
    }

    public final boolean getSleepHeartSwitch() {
        return this.sleepHeartSwitch;
    }

    public final void setSleepHeartSwitch(boolean z) {
        this.sleepHeartSwitch = z;
    }

    public final int getSleepHeartMax() {
        return this.sleepHeartMax;
    }

    public final void setSleepHeartMax(int i) {
        this.sleepHeartMax = i;
    }

    public final int getSleepHeartMin() {
        return this.sleepHeartMin;
    }

    public final void setSleepHeartMin(int i) {
        this.sleepHeartMin = i;
    }
}
