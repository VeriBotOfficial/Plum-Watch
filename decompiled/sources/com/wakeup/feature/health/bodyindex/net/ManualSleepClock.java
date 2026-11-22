package com.wakeup.feature.health.bodyindex.net;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* compiled from: HealthIndexRepository.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/wakeup/feature/health/bodyindex/net/ManualSleepClock;", "", "sleepHour", "", "sleepMinute", "wakeHour", "wakeMinute", "<init>", "(IIII)V", "getSleepHour", "()I", "getSleepMinute", "getWakeHour", "getWakeMinute", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ManualSleepClock {
    public static final int $stable = 0;
    private final int sleepHour;
    private final int sleepMinute;
    private final int wakeHour;
    private final int wakeMinute;

    public static /* synthetic */ ManualSleepClock copy$default(ManualSleepClock manualSleepClock, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = manualSleepClock.sleepHour;
        }
        if ((i5 & 2) != 0) {
            i2 = manualSleepClock.sleepMinute;
        }
        if ((i5 & 4) != 0) {
            i3 = manualSleepClock.wakeHour;
        }
        if ((i5 & 8) != 0) {
            i4 = manualSleepClock.wakeMinute;
        }
        return manualSleepClock.copy(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSleepHour() {
        return this.sleepHour;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSleepMinute() {
        return this.sleepMinute;
    }

    /* renamed from: component3, reason: from getter */
    public final int getWakeHour() {
        return this.wakeHour;
    }

    /* renamed from: component4, reason: from getter */
    public final int getWakeMinute() {
        return this.wakeMinute;
    }

    public final ManualSleepClock copy(int sleepHour, int sleepMinute, int wakeHour, int wakeMinute) {
        return new ManualSleepClock(sleepHour, sleepMinute, wakeHour, wakeMinute);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManualSleepClock)) {
            return false;
        }
        ManualSleepClock manualSleepClock = (ManualSleepClock) other;
        return this.sleepHour == manualSleepClock.sleepHour && this.sleepMinute == manualSleepClock.sleepMinute && this.wakeHour == manualSleepClock.wakeHour && this.wakeMinute == manualSleepClock.wakeMinute;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.sleepHour) * 31) + Integer.hashCode(this.sleepMinute)) * 31) + Integer.hashCode(this.wakeHour)) * 31) + Integer.hashCode(this.wakeMinute);
    }

    public String toString() {
        return "ManualSleepClock(sleepHour=" + this.sleepHour + ", sleepMinute=" + this.sleepMinute + ", wakeHour=" + this.wakeHour + ", wakeMinute=" + this.wakeMinute + Separators.RPAREN;
    }

    public ManualSleepClock(int i, int i2, int i3, int i4) {
        this.sleepHour = i;
        this.sleepMinute = i2;
        this.wakeHour = i3;
        this.wakeMinute = i4;
    }

    public final int getSleepHour() {
        return this.sleepHour;
    }

    public final int getSleepMinute() {
        return this.sleepMinute;
    }

    public final int getWakeHour() {
        return this.wakeHour;
    }

    public final int getWakeMinute() {
        return this.wakeMinute;
    }
}
